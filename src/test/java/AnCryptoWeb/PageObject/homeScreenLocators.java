package AnCryptoWeb.PageObject;

import AnCryptoWeb.Helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class homeScreenLocators extends BaseClass {

    public WebElement media() {
        WebElement media = driver.findElement(By.xpath("//ul [@id='top-menu']/li[2]/a"));
        return media;
    }

    public WebElement blog() {
        WebElement blog = driver.findElement(By.xpath("//ul [@id='top-menu']/li[3]/a"));
        return blog;
    }

    public WebElement aboutUs() {
        WebElement aboutUs = driver.findElement(By.xpath("//ul [@id='top-menu']/li[4]/a"));
        return aboutUs;
    }

    public WebElement download() {
        WebElement aboutUs = driver.findElement(By.xpath("//ul [@id='top-menu']/li[8]/a"));
        return aboutUs;
    }

    public WebElement firstPlayStoreButton() {
        WebElement topFirstPlayStoreButton = driver.findElement(By.xpath("//div[@class='et_pb_button_module_wrapper et_pb_button_0_wrapper et_pb_button_alignment_center et_pb_module ']/a"));
        return topFirstPlayStoreButton;
    }

    public WebElement firstAppStoreButton() {
        WebElement topFirstPlayStoreButton = driver.findElement(By.xpath("//div[@class='et_pb_button_module_wrapper et_pb_button_1_wrapper et_pb_button_alignment_center et_pb_module ']/a"));
        return topFirstPlayStoreButton;
    }

    public WebElement topFirstText() {
        WebElement topFirstText = driver.findElement(By.xpath("//div[@class='et_pb_text_inner']/h1"));
        return topFirstText;
    }

    public WebElement topSecondText() {
        WebElement topSecondText = driver.findElement(By.xpath("//p[text()='Send & Receive, Buy & Sell, Trade & Invest in 1000+ cryptocurrencies across a range of DeFi Protocols']"));
        return topSecondText;
    }

    public WebElement appStorePopUpText() {
        WebElement appStorePopUp = driver.findElement(By.xpath("//h2[text()='App is Coming Soon!']"));
        return appStorePopUp;
    }

    public WebElement secondPlayStoreButton() {
        WebElement secondPlayStoreButton = driver.findElement(By.xpath("//a[@class='et_pb_button et_pb_button_2 btn_new1 et_pb_bg_layout_light']"));
        return secondPlayStoreButton;
    }

    public WebElement secondAppStoreButton() {
        WebElement secondAppStoreButton = driver.findElement(By.xpath("//a[@class='et_pb_button et_pb_button_3 btn_new1 et_pb_bg_layout_light']"));
        return secondAppStoreButton;
    }

    public WebElement thirdPlayStoreButton() {
        WebElement thirdPlayStoreButton = driver.findElement(By.xpath("//a[@class='et_pb_button et_pb_button_5 btn_new1 et_pb_bg_layout_light']"));
        return thirdPlayStoreButton;
    }

    public WebElement thirdAppStoreButton() {
        WebElement thirdAppStoreButton = driver.findElement(By.xpath("//a[@class='et_pb_button et_pb_button_6 btn_new1 et_pb_bg_layout_light']"));
        return thirdAppStoreButton;
    }

    public WebElement forthPlayStoreButton() {
        WebElement forthPlayStoreButton = driver.findElement(By.xpath("//a[@class='et_pb_button et_pb_button_7 btn_new1 et_pb_bg_layout_light']"));
        return forthPlayStoreButton;
    }

    public WebElement forthAppStoreButton() {
        WebElement forthAppStoreButton = driver.findElement(By.xpath("//a[@class='et_pb_button et_pb_button_8 btn_new1 et_pb_bg_layout_light']"));
        return forthAppStoreButton;
    }

    public WebElement fifthPlayStoreButton() {
        WebElement fifthPlayStoreButton = driver.findElement(By.xpath("//a[@class='et_pb_button et_pb_button_9 btn_new1 et_pb_bg_layout_light']"));
        return fifthPlayStoreButton;
    }

    public WebElement fifthAppStoreButton() {
        WebElement fifthAppStoreButton = driver.findElement(By.xpath("//a[@class='et_pb_button et_pb_button_10 btn_new1 et_pb_bg_layout_light']"));
        return fifthAppStoreButton;
    }

    public WebElement secondHalfFirstText() {
        WebElement a = driver.findElement(By.xpath("//h3[text()='Send Crypto Money While You Chat']"));
        return a;
    }

    public WebElement secondHalfLeftSubText(int i) {
        WebElement a = driver.findElement(By.xpath("//ul[@class='crypto-list']/li[" + i + "]"));
        return a;
    }

    public WebElement secondHalfRightAnimationChatText() {
        WebElement a = driver.findElement(By.xpath("//h5[@class='et_pb_toggle_title' and text()='Chat']"));
        return a;
    }

    public WebElement secondHalfRightAnimationQRCodeText() {
        WebElement a = driver.findElement(By.xpath("//h5[@class='et_pb_toggle_title' and text()='QR-Code']"));
        return a;
    }

    public WebElement secondHalfRightAnimationWalletAddressText() {
        WebElement a = driver.findElement(By.xpath("//h5[@class='et_pb_toggle_title' and text()='Wallet Address']"));
        return a;
    }

    public WebElement secondHalfRightAnimationChatSubTextHeading() {
        WebElement a = driver.findElement(By.xpath("//p[text()='Send Crypto Money While You Chat']"));
        return a;
    }

    public WebElement secondHalfRightAnimationChatSubText(int i) {
        WebElement a = driver.findElement(By.xpath("//p[text()='Send Crypto Money While You Chat']/following-sibling::ul/li[" + i + "]"));
        return a;
    }

    public WebElement secondHalfRightAnimationQRCodeSubTextHeading() {
        WebElement a = driver.findElement(By.xpath("//p[text()='Scan the QR-code and send money']"));
        return a;
    }

    public WebElement secondHalfRightAnimationQRCodeSubText(int i) {
        WebElement a = driver.findElement(By.xpath("//p[text()='Scan the QR-code and send money']/following-sibling::ul/li[" + i + "]"));
        return a;
    }

    public  List<WebElement> secondHalfRightAnimationQRCodeSubTextList() {
        List<WebElement> a = driver.findElement(By.xpath("//p[text()='Scan the QR-code and send money']/following-sibling::ul"));
        return a;
    }

    public WebElement secondHalfRightAnimationWalletAddressSubTextHeading() {
        WebElement a = driver.findElement(By.xpath("//p[text()='Send Crypto using wallet address']"));
        return a;
    }

    public WebElement secondHalfRightAnimationWalletAddressSubText(int i) {
        WebElement a = driver.findElement(By.xpath("//p[text()='Send Crypto using wallet address']/following-sibling::ul/li[" + i + "]"));
        return a;
    }

    public WebElement secondHalfRightAnimationWalletAddressSubTextList(int i) {
        WebElement a = driver.findElement(By.xpath("//p[text()='Send Crypto using wallet address']/following-sibling::ul"));
        return a;
    }
    public WebElement secondHalfBannerHeadingText(){
        WebElement a = driver.findElement(By.xpath("//h3[text()='Swap Crypto']"));
        return a;
    }
}
