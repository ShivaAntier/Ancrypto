package AnCrypto.Tests.accountScreenTests;

import AnCrypto.Helpers.BaseClass;
import AnCrypto.PageObjects.accountScreenLocators;
import AnCrypto.PageObjects.securityScreenLocators;
import AnCrypto.PageObjects.walletScreenLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class securityScreenTestCases extends BaseClass {
    WebDriverWait wait;
    securityScreenLocators securityScreenLocatorsObject = new securityScreenLocators();
    walletScreenLocators walletScreenLocatorsObject = new walletScreenLocators();
    accountScreenLocators accountScreenLocatorsObject = new accountScreenLocators();
    @BeforeMethod
    public void testSetup() throws MalformedURLException, InterruptedException {
        super.openApp();
    }
    @AfterMethod
    public void testCleanup() {
        driver.quit();
    }
    @Test
    public void securityScreenTestCasesTurnOnAndOffAppLock() throws InterruptedException {
        wait = new WebDriverWait(driver, 5);
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.securityButton().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='android.widget.Switch']")));
        securityScreenLocatorsObject.appLockSwitch().click();
        for (int i = 1; i < 5; i++) {
            securityScreenLocatorsObject.pinDigitValueText("1").click();
        }
        //code to again unlock the device, so it restores the device into its initial unlocked security state
        accountScreenLocatorsObject.securityButton().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='android.widget.Switch']")));
        securityScreenLocatorsObject.appLockSwitch().click();
        for (int i = 1; i < 5; i++) {
            securityScreenLocatorsObject.pinDigitValueText("1").click();
        }
        Thread.sleep(2000);
    }
    @Test
    public void securityScreenTestCasesChangePasscode() throws InterruptedException {
        wait = new WebDriverWait(driver, 5);
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.securityButton().click();
        securityScreenLocatorsObject.changePasscodeButton().click();
        for (int i = 1; i < 5; i++) {
            securityScreenLocatorsObject.pinDigitValueText("1").click();
        }
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='1']")));
        for (int i = 1; i < 5; i++) {
            securityScreenLocatorsObject.pinDigitValueText("1").click();
        }
        securityScreenLocatorsObject.nextButton().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='1']")));
        for (int i = 1; i < 5; i++) {
            securityScreenLocatorsObject.pinDigitValueText("1").click();
        }
        securityScreenLocatorsObject.okButton().click();
        Thread.sleep(2000);
    }
}
