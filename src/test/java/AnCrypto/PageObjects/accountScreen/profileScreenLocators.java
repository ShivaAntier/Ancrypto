package AnCrypto.PageObjects.accountScreen;

import AnCrypto.Helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class profileScreenLocators extends BaseClass {
    public WebElement publicText(){
        WebElement publicText = driver.findElement(By.xpath("//*[@text='Public']"));
        return publicText;
    }
    public WebElement privateText(){
        WebElement privateText = driver.findElement(By.xpath("//*[@text='Private']"));
        return privateText;
    }
    public WebElement submitButton(){
        WebElement submitButton = driver.findElement(By.xpath("//*[@text='Submit']"));
        return submitButton;
    }
    public WebElement profileHeaderText(){
        WebElement profileHeaderText = driver.findElement(By.xpath("//*[@text='Profile']"));
        return profileHeaderText;
    }
}
