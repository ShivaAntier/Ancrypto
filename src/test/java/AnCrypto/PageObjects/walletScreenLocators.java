package AnCrypto.PageObjects;

import AnCrypto.Helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class walletScreenLocators extends BaseClass {
    public WebElement walletScreenSendButton() {
        WebElement walletScreenSendButton = driver.findElement(By.xpath("//*[@text='Send']"));
        return walletScreenSendButton;
    }
    public WebElement walletScreenReceiveButton() {
        WebElement walletScreenReceiveButton = driver.findElement(By.xpath("//*[@text='Receive']"));
        return walletScreenReceiveButton;
    }
    public WebElement walletScreenBuyButton(){
        WebElement walletScreenBuyButton =  driver.findElement(By.xpath("//*[@text='Buy']"));
        return walletScreenBuyButton;
    }
    public WebElement searchCurrencyTextField() {
        WebElement searchCurrencyTextField = driver.findElement(By.xpath("//*[@text='Search Currency']"));
        return searchCurrencyTextField;
    }
    public WebElement selectDesiredCurrency(String currency) {
        WebElement selectDesiredCurrency = driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @text='"+currency+" ']"));
        return selectDesiredCurrency;
    }
    public WebElement contactIcon() {
        WebElement contactIcon = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView"));
        return contactIcon;
    }
    public WebElement homeIcon() {
        WebElement homeIcon = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView"));
        return homeIcon;
    }
    public WebElement advancedOptions() {
        WebElement advancedOptions = driver.findElement(By.xpath("//*[@text='Advanced Options']"));
        return advancedOptions;
    }
    public WebElement submitButton() {
        WebElement submitButton = driver.findElement(By.xpath("//*[@text='Submit']"));
        return submitButton;
    }
    public WebElement okButton() {
        WebElement okButton = driver.findElement(By.xpath("//*[@text='Ok']"));
        return okButton;
    }
    public WebElement maxOption() {
        WebElement maxOption = driver.findElement(By.xpath("//*[@text='Max']"));
        return maxOption;
    }
    public WebElement amountTextField(){
        WebElement amountTextField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText"));
        return  amountTextField;
    }
    public WebElement slowText(){
        WebElement slowText = driver.findElement(By.xpath("//*[@text='Slow']"));
        return  slowText;
    }
    public WebElement averageText(){
        WebElement averageText = driver.findElement(By.xpath("//*[@text='Average']"));
        return  averageText;
    }
    public WebElement fastText(){
        WebElement fastText = driver.findElement(By.xpath("//*[@text='Fast']"));
        return  fastText;
    }
    public WebElement enterAddressTextField(){
        WebElement enterAddressTextField =  driver.findElement(By.xpath("//*[@text='Enter Address']"));
        return enterAddressTextField;
    }
    public WebElement sendButton(){
        WebElement sendButton =  driver.findElement(By.xpath("//*[@text='Send']"));
        return sendButton;
    }
    public WebElement publicAddress(){
        WebElement publicAddress =  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[2]"));
        return publicAddress;
    }
    public WebElement copyButton(){
        WebElement copyButton =  driver.findElement(By.xpath("//*[@text='Copy']"));
        return copyButton;
    }
    public WebElement powerByOnmetaText(){
        WebElement powerByOnmetaText =  driver.findElement(By.xpath("//*[@text='onmeta logo']"));
        return powerByOnmetaText;
    }
    public WebElement accountIcon(){
        WebElement accountIcon =  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView"));
        return accountIcon;
    }
    public List<WebElement> assetsCategoryList(){
        List<WebElement> assetsCategoryList= driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));
        return assetsCategoryList;
    }
    public List<WebElement> assetsCurrencyList(){
        List<WebElement> assetsCurrencyList = driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]"));
        return assetsCurrencyList;
    }

    public WebElement  currencyReceiveButton(){
        WebElement currencyReceiveButton = driver.findElement(By.xpath("//*[@index='1' and @class = 'android.view.ViewGroup']/android.view.ViewGroup[5]//*[@class='android.widget.TextView' and @text='Receive']"));
        return currencyReceiveButton;
    }
}
