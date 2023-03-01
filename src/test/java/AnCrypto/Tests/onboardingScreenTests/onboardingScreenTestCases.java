package AnCrypto.Tests.onboardingScreenTests;

import AnCrypto.Helpers.BaseClass;
import AnCrypto.PageObjects.accountScreenLocators;
import AnCrypto.PageObjects.manageWalletScreenLocators;
import AnCrypto.PageObjects.onboardingScreenLocators;
import AnCrypto.PageObjects.walletScreenLocators;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

public class onboardingScreenTestCases extends BaseClass {
    walletScreenLocators walletScreenLocatorsObject = new walletScreenLocators();
    accountScreenLocators accountScreenLocatorsObject = new accountScreenLocators();
    manageWalletScreenLocators manageWalletScreenLocatorsObject = new manageWalletScreenLocators();
    onboardingScreenLocators onboardingScreenLocatorsObject = new onboardingScreenLocators();
    @BeforeMethod
    public void testSetup() throws MalformedURLException, InterruptedException {
        super.openApp();
    }
    @AfterMethod
    public void testCleanup(){
        driver.quit();
    }
    @Test
    public void onboardingScreenTestCasesVerifyFirstOnboardingScreenText(){
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.manageWalletButton().click();
        manageWalletScreenLocatorsObject.plusIcon().click();
        String headerText = onboardingScreenLocatorsObject.onboardingScreenOneHeaderUpperText().getText() + " " + onboardingScreenLocatorsObject.onboardingScreenOneHeaderLowerText().getText();
        String subText = onboardingScreenLocatorsObject.onboardingScreenOneSubUpperText().getText() + " " + onboardingScreenLocatorsObject.onboardingScreenOneSubLowerText().getText();
        Assert.assertEquals(headerText, "Trusted & Secure Crypto Wallet");
        Assert.assertEquals(subText, "Experience the Power of DeFi Crypto Wallet like never before");
    }
    @Test
    public void onboardingScreenTestCasesVerifySecondOnboardingScreenText() throws InterruptedException {
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.manageWalletButton().click();
        manageWalletScreenLocatorsObject.plusIcon().click();
        Thread.sleep(500);
        TouchAction swipeRight = new TouchAction(driver).press(PointOption.point(900, 900)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(200, 900)).release();
        swipeRight.perform();
        String headerText = onboardingScreenLocatorsObject.onboardingScreenTwoHeaderUpperText().getText() + " " + onboardingScreenLocatorsObject.onboardingScreenTwoHeaderLowerText().getText();
        String subText = onboardingScreenLocatorsObject.onboardingScreenTwoSubUpperText().getText() + " " + onboardingScreenLocatorsObject.onboardingScreenTwoSubLowerText().getText();
        Assert.assertEquals(headerText, "Send Crypto while you chat");
        Assert.assertEquals(subText, "Add friends easily with their usernames & do instant transfers");
    }
    @Test
    public void onboardingScreenTestCasesVerifyThirdOnboardingScreenText() throws InterruptedException {
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.manageWalletButton().click();
        manageWalletScreenLocatorsObject.plusIcon().click();
        Thread.sleep(500);
        TouchAction swipeRightFirst = new TouchAction(driver).press(PointOption.point(900, 900)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(200, 900)).release();
        swipeRightFirst.perform();
        TouchAction swipeRightSecond = new TouchAction(driver).press(PointOption.point(900, 900)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(200, 900)).release();
        swipeRightSecond.perform();
        String headerText = onboardingScreenLocatorsObject.onboardingScreenThreeHeaderUpperText().getText() + " " + onboardingScreenLocatorsObject.onboardingScreenThreeHeaderLowerText().getText();
        String subText = onboardingScreenLocatorsObject.onboardingScreenThreeSubUpperText().getText() + " " + onboardingScreenLocatorsObject.onboardingScreenThreeSubLowerText().getText();
        Assert.assertEquals(headerText, "Swap Crypto Instantly");
        Assert.assertEquals(subText, "Transfer crypto-assets in & out of  different blockchains in a few taps");
    }
    @Test
    public void onboardingScreenTestCasesVerifyFourthOnboardingScreenText() throws InterruptedException {
        walletScreenLocatorsObject.accountIcon().click();
        accountScreenLocatorsObject.manageWalletButton().click();
        manageWalletScreenLocatorsObject.plusIcon().click();
        Thread.sleep(500);
        TouchAction swipeRightFirst = new TouchAction(driver).press(PointOption.point(900, 900)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(200, 900)).release();
        swipeRightFirst.perform();
        TouchAction swipeRightSecond = new TouchAction(driver).press(PointOption.point(900, 900)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(200, 900)).release();
        swipeRightSecond.perform();
        TouchAction swipeRightThird = new TouchAction(driver).press(PointOption.point(900, 900)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(200, 900)).release();
        swipeRightThird.perform();
        String headerText = onboardingScreenLocatorsObject.onboardingScreenFourthHeaderUpperText().getText() + " " + onboardingScreenLocatorsObject.onboardingScreenFourthHeaderLowerText().getText();
        String subText = onboardingScreenLocatorsObject.onboardingScreenFourthSubUpperText().getText() + " " + onboardingScreenLocatorsObject.onboardingScreenFourthSubLowerText().getText();
        Assert.assertEquals(headerText, "Buy  Crypto easily");
        Assert.assertEquals(subText, "Buy crypto directly from  your credit card");
    }
}
