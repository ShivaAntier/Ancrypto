package AnCrypto.Tests.accountScreenTests.manageWalletScreenTests;

import AnCrypto.Helpers.BaseClass;
import AnCrypto.PageObjects.*;
import AnCrypto.PageObjects.accountScreen.accountScreenLocators;
import AnCrypto.PageObjects.accountScreen.manageWalletScreen.createNewWalletScreenLocators;
import AnCrypto.PageObjects.accountScreen.manageWalletScreen.manageWalletScreenLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.Random;

public class manageWalletScreenTestCases extends BaseClass {
    WebDriverWait wait;
    accountScreenLocators accountScreenLocatorsObject = new accountScreenLocators();
    walletScreenLocators walletScreenLocatorsObject = new walletScreenLocators();
    createNewWalletScreenLocators createNewWalletScreenLocatorsObject = new createNewWalletScreenLocators();
    manageWalletScreenLocators manageWalletScreenLocatorsObject = new manageWalletScreenLocators();
    String walletName;
    public String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 7) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        walletName = salt.toString();
        return walletName;

    }
    @BeforeMethod
    public void testSetup() throws MalformedURLException, InterruptedException {
        super.openApp();
    }
    @AfterMethod
    public void testCleanup() {
        driver.quit();
    }
    @Test
    public void manageWalletScreenTestCasesClickOnStableCoinsAndThenClickOnAllCoins(){
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.manageWalletButton().click();
        manageWalletScreenLocatorsObject.stableCoinsButton().click();
        manageWalletScreenLocatorsObject.allCoinsButton().click();
    }
    @Test
    public void manageWalletScreenTestCasesClickOnHideOrShowTotalBalance() throws InterruptedException {
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.manageWalletButton().click();
        manageWalletScreenLocatorsObject.showHideIcon().click();
        Thread.sleep(2000);
        manageWalletScreenLocatorsObject.showHideIcon().click();
        Thread.sleep(2000);
    }
    @Test
    public void manageWalletScreenTestCasesClickOnEveryWalletAvailableOnManageWalletScreen() {
        String activeWalletName = walletScreenLocatorsObject.activeWalletName().getText();
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.manageWalletButton().click();
        for(int i=0; i<manageWalletScreenLocatorsObject.namesOfAvailableWallets().size(); i++){
            if(manageWalletScreenLocatorsObject.namesOfAvailableWallets().get(i).getText().equalsIgnoreCase(activeWalletName)){
                manageWalletScreenLocatorsObject.namesOfAvailableWallets().get(i).click();
            }
            else{
                String clickedWalletName = manageWalletScreenLocatorsObject.namesOfAvailableWallets().get(i).getText();
                manageWalletScreenLocatorsObject.namesOfAvailableWallets().get(i).click();
                Assert.assertEquals(clickedWalletName, walletScreenLocatorsObject.activeWalletName().getText());
                walletScreenLocatorsObject.accountIcon().click();
                accountScreenLocatorsObject.manageWalletButton().click();
            }
        }
    }
    @Test
    public void manageWalletScreenTestCasesManageWalletSettingsEditWalletName() throws InterruptedException {
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.manageWalletButton().click();
        manageWalletScreenLocatorsObject.walletInfoIcon().click();
        getSaltString();
        manageWalletScreenLocatorsObject.editWalletNameTextField().sendKeys(walletName);
        manageWalletScreenLocatorsObject.saveChangesButton().click();
        Assert.assertTrue(manageWalletScreenLocatorsObject.namesOfAvailableWallets().get(0).getText().equalsIgnoreCase(walletName));
    }
    @Test
    public void manageWalletScreenTestCasesManageWalletSettingsClickOnShowRecoveryPhaseAndCopyMnemonics() throws InterruptedException {
        wait = new WebDriverWait(driver, 5);
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.manageWalletButton().click();
        manageWalletScreenLocatorsObject.walletInfoIcon().click();
        manageWalletScreenLocatorsObject.showRecoveryPhraseButton().click();
        for (int i = 1; i < 5; i++) {
            manageWalletScreenLocatorsObject.pinDigitValueText("1").click();
        }
        createNewWalletScreenLocatorsObject.copyButton().click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Copied!']")));
        Assert.assertEquals(manageWalletScreenLocatorsObject.copiedText().getText(), "Copied!");
    }
}
