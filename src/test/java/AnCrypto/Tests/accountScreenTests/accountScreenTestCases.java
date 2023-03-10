package AnCrypto.Tests.accountScreenTests;

import AnCrypto.Helpers.BaseClass;
import AnCrypto.PageObjects.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class accountScreenTestCases extends BaseClass {
    WebDriverWait wait;
    accountScreenLocators accountScreenLocatorsObject = new accountScreenLocators();
    walletScreenLocators walletScreenLocatorsObject = new walletScreenLocators();
    profileScreenLocators profileScreenLocatorsObject = new profileScreenLocators();
    rewardsScreenLocators rewardsScreenLocatorsObject = new rewardsScreenLocators();
    securityScreenLocators securityScreenLocatorsObject = new securityScreenLocators();
    currencyPreferenceLocators currencyPreferenceLocatorsObject = new currencyPreferenceLocators();
    manageWalletScreenLocators manageWalletScreenLocatorsObject = new manageWalletScreenLocators();
    contactsScreenLocators contactsScreenLocatorsObject = new contactsScreenLocators();
    blockedUsersScreenLocators blockedUsersScreenLocatorsObject = new blockedUsersScreenLocators();
    @BeforeMethod
    public void testSetup() throws MalformedURLException, InterruptedException {
        super.openApp();
    }
    @AfterMethod
    public void testCleanup() {
        driver.quit();
    }
    @Test
    public void accountScreenTestCasesClickOnProfile() {
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.profileButton().click();
        Assert.assertEquals(profileScreenLocatorsObject.profileHeaderText().getText(), "Profile");
    }
    @Test
    public void accountScreenTestCasesClickOnReferralAndRewards() {
        wait = new WebDriverWait(driver, 5);
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.referralAndRewardsButton().click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Rewards']")));
        Assert.assertEquals(rewardsScreenLocatorsObject.rewardsHeaderText().getText(), "Rewards");
    }
    @Test
    public void accountScreenTestCasesClickOnSecurity() {
        wait = new WebDriverWait(driver, 5);
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.securityButton().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Security']")));
        Assert.assertEquals(securityScreenLocatorsObject.securityHeaderText().getText(), "Security");
    }
    @Test
    public void accountScreenTestCasesClickOnManageWallet(){
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.manageWalletButton().click();
        Assert.assertEquals(manageWalletScreenLocatorsObject.allCoinsButton().getText(), "All Coins");
    }
    @Test
    public void accountScreenTestCasesClickOnContacts() {
        wait = new WebDriverWait(driver, 5);
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.contactsButton().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Contacts']")));
        Assert.assertEquals(contactsScreenLocatorsObject.contactsHeaderText().getText(), "Contacts");
    }
    @Test
    public void accountScreenTestCasesClickOnBlockedContacts() {
        wait = new WebDriverWait(driver, 5);
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.blockedContactsButton().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Blocked Users']")));
        Assert.assertEquals(blockedUsersScreenLocatorsObject.blockedUsersHeaderText().getText(), "Blocked Users");
    }
    @Test
    public void accountScreenTestCasesEnableOrDisablePushNotifications() throws InterruptedException {
        wait = new WebDriverWait(driver, 5);
        walletScreenLocatorsObject.accountIcon().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='android.widget.Switch']")));
        accountScreenLocatorsObject.pushNotificationSwitch().click();
        Thread.sleep(2000);
    }
    @Test
    public void accountScreenTestCasesClickOnChangeCurrency() {
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.changeCurrencyButton().click();
        Assert.assertEquals(currencyPreferenceLocatorsObject.currencyPreferenceHeaderText().getText(), "Currency Preference");
    }
    @Test
    public void accountScreenTestCasesChangeCurrency() {
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.changeCurrencyButton().click();
        currencyPreferenceLocatorsObject.selectCurrencyElement("CAD").click();
        currencyPreferenceLocatorsObject.yesButton().click();
        Assert.assertEquals(accountScreenLocatorsObject.selectedCurrencyText().getText(), "CAD");
    }
    @Test
    public void accountScreenTestCasesClickOnSupportCenter() {
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.supportCenterButton().click();
        Assert.assertTrue(accountScreenLocatorsObject.supportCenterWebUrl().getText().contains("ancrypto.io"));
    }
}
