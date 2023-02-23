package AnCrypto.Tests.walletScreenTests;

import AnCrypto.Helpers.BaseClass;
import AnCrypto.PageObjects.walletScreenLocators;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class walletScreenTestCasesBuy extends BaseClass {
    walletScreenLocators walletScreenLocatorsObject = new walletScreenLocators();
    @BeforeMethod
    public void testSetup() throws MalformedURLException, InterruptedException {
        super.openApp();
    }
//    @AfterMethod
    public void testCleanup(){
        driver.quit();
    }
    @Test
    public void walletScreenTestsBuyCheckPoweredByONMETA(){
        walletScreenLocatorsObject.walletScreenBuyButton().click();

        Assert.assertEquals(walletScreenLocatorsObject.powerByOnmetaText().getText(), "onmeta logo");
    }

    @Test
    public void scrollTest() throws InterruptedException {
//    Thread.sleep(3000);
//        driver.fi
        MobileElement a = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))." +
                "scrollIntoView(new UiSelector().textContains(\"Ethereum\"))"));
//        MobileElement a = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"WebView\").instance(0))");
//        Thread.sleep(2000);
//        a.click();
    }

    @Test
    public void swipeTest() throws InterruptedException {
        Thread.sleep(3000);
//        TouchAction ta = new TouchAction(driver);
        TouchAction t1 = new TouchAction(driver).press(PointOption.point(900, 900)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(200, 900)).release();
        t1.perform();
        Thread.sleep(2000);

    }
    @Test
    public void swipeTestUsingNavigationDots() throws InterruptedException {
        Thread.sleep(3000);
        WebElement firstDot = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]"));
        WebElement secondDot = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]"));
        WebElement thirdDot = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]"));
        WebElement fourthDot = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]"));
//        Thread.sleep(2000);
        secondDot.click();
        Thread.sleep(2000);
        thirdDot.click();
        Thread.sleep(2000);
        fourthDot.click();
        Thread.sleep(2000);
        firstDot.click();


    }

}
