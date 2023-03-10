package AnCrypto.PageObjects;

import AnCrypto.Helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class currencyPreferenceLocators extends BaseClass {
    public WebElement selectCurrencyElement(String currency){
        WebElement selectCurrencyElement = driver.findElement(By.xpath("//*[contains(@text,'"+currency+"')]"));
        return selectCurrencyElement;
    }
    public WebElement currencyPreferenceHeaderText(){
        WebElement currencyPreferenceHeaderText = driver.findElement(By.xpath("//*[@text='Currency Preference']"));
        return currencyPreferenceHeaderText;
    }
    public WebElement yesButton(){
        WebElement yesButton = driver.findElement(By.xpath("//*[@text='YES']"));
        return yesButton;
    }
}
