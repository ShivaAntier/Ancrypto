package AnCrypto.Tests.accountScreenTests;

import AnCrypto.Helpers.BaseClass;
import AnCrypto.PageObjects.accountScreenLocators;
import AnCrypto.PageObjects.profileScreenLocators;
import AnCrypto.PageObjects.walletScreenLocators;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class profileScreenTestCases extends BaseClass {
    WebDriverWait wait;
    accountScreenLocators accountScreenLocatorsObject = new accountScreenLocators();
    walletScreenLocators walletScreenLocatorsObject = new walletScreenLocators();
    profileScreenLocators profileScreenLocatorsObject = new profileScreenLocators();
    @BeforeMethod
    public void testSetup() throws MalformedURLException, InterruptedException {
        super.openApp();
    }
    @AfterMethod
    public void testCleanup() {
        driver.quit();
    }
    @Test
    public void profileScreenTestCasesClickOnProfileSelectPublicClickOnSave() throws InterruptedException {
        Thread.sleep(5000);
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.profileButton().click();
        profileScreenLocatorsObject.publicText().click();
        profileScreenLocatorsObject.submitButton().click();
    }
    @Test
    public void profileScreenTestCasesClickOnProfileSelectPrivateClickOnSave() throws InterruptedException {
        Thread.sleep(5000);
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.profileButton().click();
        profileScreenLocatorsObject.privateText().click();
        profileScreenLocatorsObject.submitButton().click();
    }

}
