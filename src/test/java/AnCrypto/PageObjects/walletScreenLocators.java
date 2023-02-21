package AnCrypto.PageObjects;

import AnCrypto.Helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class walletScreenLocators extends BaseClass {
    public WebElement walletScreenSendButton() {
        WebElement walletScreenSendButton = driver.findElement(By.xpath("//*[@text='Send']"));
        return walletScreenSendButton;
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

}
