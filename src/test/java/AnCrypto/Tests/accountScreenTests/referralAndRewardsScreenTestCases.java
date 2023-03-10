package AnCrypto.Tests.accountScreenTests;

import AnCrypto.Helpers.BaseClass;
import AnCrypto.PageObjects.accountScreenLocators;
import AnCrypto.PageObjects.rewardsScreenLocators;
import AnCrypto.PageObjects.walletScreenLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class referralAndRewardsScreenTestCases extends BaseClass {
    WebDriverWait wait;
    accountScreenLocators accountScreenLocatorsObject = new accountScreenLocators();
    walletScreenLocators walletScreenLocatorsObject = new walletScreenLocators();
    rewardsScreenLocators rewardsScreenLocatorsObject = new rewardsScreenLocators();
    @BeforeMethod
    public void testSetup() throws MalformedURLException, InterruptedException {
        super.openApp();
    }
    @AfterMethod
    public void testCleanup() {
        driver.quit();
    }
    @Test
    public void referralAndRewardsScreenTestCasesClickOnInviteFriendsAndEarnAncryptoTextAndVerifyShareMenu() throws InterruptedException {
        Thread.sleep(5000);
        wait = new WebDriverWait(driver, 5);
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.referralAndRewardsButton().click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Invite friends and earn Ancrypto tokens as rewards.']")));
        rewardsScreenLocatorsObject.inviteFriendsAndEarnText().click();
        Assert.assertTrue(rewardsScreenLocatorsObject.inviteParagraphText().getText().contains("I am inviting you to use AnCrypto"));
    }
    @Test
    public void referralAndRewardsScreenTestCasesClickOnCopyReferralCodeButton() throws InterruptedException {
        Thread.sleep(5000);
        wait = new WebDriverWait(driver, 5);
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.referralAndRewardsButton().click();
        rewardsScreenLocatorsObject.copyReferralCodeButton().click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Copied!']")));
        Assert.assertEquals(rewardsScreenLocatorsObject.copiedToastText().getText(), "Copied!");
    }
}
