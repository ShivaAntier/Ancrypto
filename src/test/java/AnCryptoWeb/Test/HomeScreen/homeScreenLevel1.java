package AnCryptoWeb.Test.HomeScreen;

import AnCryptoWeb.PageObject.aboutUsScreenLocators;
import AnCryptoWeb.PageObject.blogScreenLocators;
import AnCryptoWeb.PageObject.homeScreenLocators;
import AnCryptoWeb.PageObject.mediaScreenLocators;
import AnCryptoWeb.Helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class homeScreenLevel1 extends BaseClass {
    homeScreenLocators hs = new homeScreenLocators();
    mediaScreenLocators ms = new mediaScreenLocators();
    blogScreenLocators bs = new blogScreenLocators();
    aboutUsScreenLocators as = new aboutUsScreenLocators();
    @BeforeMethod
    void testSetup(){
        OpenBrowser();
    }
    @AfterMethod
    void testCleanup() {
        quitBrowser();
    }
    @Test
    void getCompleteScreenImages() throws Exception {
        Thread.sleep(2000);
        for (int i = 1; i <= 41; i++) {
            takeSnapShot(driver, "src/test/java/AnCryptoWeb/Images/HomeScreen/HomeScreen" + i + ".jpg");
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)");
        }
    }

    @Test
    void checkIfMediaScreenIsOpeningSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        hs.media().click();
        String a = ms.anCryptoIn().getText();
        Assert.assertEquals(a, "AnCrypto in NEWS");
    }
    @Test
    void checkIfBlogScreenIsOpeningSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        hs.blog().click();
        String a = bs.anCryptoBlog().getText();
        Assert.assertEquals(a, "AnCrypto BLOGS");
    }

    @Test
    void checkIfAboutUsScreenIsOpeningSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        hs.aboutUs().click();
        WebDriverWait wait = new WebDriverWait(driver,20);
        String b = "We Believe";
        wait.until(ExpectedConditions.textToBePresentInElement(as.weBelieve(),b));
        String a = as.weBelieve().getText();
        Assert.assertEquals(a, b);
    }

    @Test
    void checkIfDownloadButtonIsWorkingOnTopList() throws InterruptedException {
        Thread.sleep(2000);
        hs.download().click();
        ArrayList<String> arr = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(arr.get(1));
        String a = driver.getCurrentUrl();
        Assert.assertEquals(a,"https://play.google.com/store/apps/details?id=com.ancryptoWallet");
        String b = driver.findElement(By.xpath("//span[text()='AnCrypto Wallet']")).getText();
        Assert.assertEquals(b, "AnCrypto Wallet");
    }
    @Test
    void firstTextOfHomeScreen(){
        String a = hs.topFirstText().getText();
        Assert.assertEquals(a,"Experience the Power of Multi-Chain Crypto Wallet");
    }
    @Test
    void secondTextOfHomeScreen(){
        String a = hs.topSecondText().getText();
        Assert.assertEquals(a,"Send & Receive, Buy & Sell, Trade & Invest in 1000+ cryptocurrencies across a range of DeFi Protocols");
    }

    @Test
    void playStoreButtonOnTopScreenPart(){
        hs.firstPlayStoreButton().click();
        ArrayList<String> arr = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(arr.get(1));
        String a = driver.getCurrentUrl();
        Assert.assertEquals(a,"https://play.google.com/store/apps/details?id=com.ancryptoWallet");
        String b = driver.findElement(By.xpath("//span[text()='AnCrypto Wallet']")).getText();
        Assert.assertEquals(b, "AnCrypto Wallet");
    }
    @Test
    void appStoreButtonOnTopScreenPart(){
        hs.firstAppStoreButton().click();
        String a = hs.appStorePopUpText().getText();
        Assert.assertEquals(a,"App is Coming Soon!");
    }
    @Test
    void secondPlayStoreButton() throws Exception {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,600)");
        Thread.sleep(1000);
        takeSnapShot(driver, "src/test/java/AnCryptoWeb/Images/HomeScreen/HomeScreen1.jpg");
        hs.secondPlayStoreButton().click();
        ArrayList<String> arr = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(arr.get(1));
        String a = driver.getCurrentUrl();
        Assert.assertEquals(a,"https://play.google.com/store/apps/details?id=com.ancryptoWallet");
        String b = driver.findElement(By.xpath("//span[text()='AnCrypto Wallet']")).getText();
        Assert.assertEquals(b, "AnCrypto Wallet");
    }
    @Test
    void secondAppStoreButton() throws Exception {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,700)");
        Thread.sleep(1000);
        takeSnapShot(driver, "src/test/java/AnCryptoWeb/Images/HomeScreen/HomeScreen1.jpg");
        hs.secondAppStoreButton().click();
        String a = hs.appStorePopUpText().getText();
        Assert.assertEquals(a,"App is Coming Soon!");
    }

    @Test
    void thirdPlayStoreButton() throws Exception {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1400)");
        Thread.sleep(1000);
        takeSnapShot(driver, "src/test/java/AnCryptoWeb/Images/HomeScreen/HomeScreen1.jpg");
        hs.thirdPlayStoreButton().click();
        ArrayList<String> arr = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(arr.get(1));
        String a = driver.getCurrentUrl();
        Assert.assertEquals(a, "https://play.google.com/store/apps/details?id=com.ancryptoWallet");
        String b = driver.findElement(By.xpath("//span[text()='AnCrypto Wallet']")).getText();
        Assert.assertEquals(b, "AnCrypto Wallet");
    }

    @Test
    void thirdAppStoreButton() throws Exception {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1400)");
        Thread.sleep(1000);
        takeSnapShot(driver, "src/test/java/AnCryptoWeb/Images/HomeScreen/HomeScreen1.jpg");
        hs.thirdAppStoreButton().click();
        String a = hs.appStorePopUpText().getText();
        Assert.assertEquals(a, "App is Coming Soon!");
    }

    @Test
    void forthPlayStoreButton() throws Exception {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2100)");
        Thread.sleep(1000);
        takeSnapShot(driver, "src/test/java/AnCryptoWeb/Images/HomeScreen/HomeScreen1.jpg");
        hs.forthPlayStoreButton().click();
        ArrayList<String> arr = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(arr.get(1));
        String a = driver.getCurrentUrl();
        Assert.assertEquals(a, "https://play.google.com/store/apps/details?id=com.ancryptoWallet");
        String b = driver.findElement(By.xpath("//span[text()='AnCrypto Wallet']")).getText();
        Assert.assertEquals(b, "AnCrypto Wallet");
    }

    @Test
    void forthAppStoreButton() throws Exception {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,4100)");
        Thread.sleep(1000);
        hs.forthAppStoreButton().click();
        String a = hs.appStorePopUpText().getText();
        takeSnapShot(driver, "src/test/java/AnCryptoWeb/Images/HomeScreen/HomeScreen1.jpg");
        Assert.assertEquals(a, "App is Coming Soon!");
    }

    @Test
    void fifthPlayStoreButton() throws Exception {
        Thread.sleep(1000);
        hs.fifthPlayStoreButton().click();
        ArrayList<String> arr = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(arr.get(1));
        String a = driver.getCurrentUrl();
        Assert.assertEquals(a, "https://play.google.com/store/apps/details?id=com.ancryptoWallet");
        String b = driver.findElement(By.xpath("//span[text()='AnCrypto Wallet']")).getText();
        takeSnapShot(driver, "src/test/java/AnCryptoWeb/Images/HomeScreen/HomeScreen1.jpg");
        Assert.assertEquals(b, "AnCrypto Wallet");
    }

    @Test
    void fifthAppStoreButton() throws Exception {
        Thread.sleep(1000);
        hs.fifthAppStoreButton().click();
        String a = hs.appStorePopUpText().getText();
        takeSnapShot(driver, "src/test/java/AnCryptoWeb/Images/HomeScreen/HomeScreen1.jpg");
        Assert.assertEquals(a, "App is Coming Soon!");
    }
    @Test void checkSecondHalfFirstText(){
        String a = hs.secondHalfFirstText().getText(), b= "Send Crypto Money While You Chat";
        Assert.assertEquals(a,b);
    }
    @Test
    void CheckSecondHalfLeftSubText(){
        for (int i = 1;i<=3;i++) {
            hs.SecondHalfLeftSubText(i).getText();
        }
    }

}
