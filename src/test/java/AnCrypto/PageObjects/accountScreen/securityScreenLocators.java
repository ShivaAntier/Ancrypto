package AnCrypto.PageObjects.accountScreen;

import AnCrypto.Helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class securityScreenLocators extends BaseClass {
    public WebElement securityHeaderText(){
        WebElement securityHeaderText = driver.findElement(By.xpath("//*[@text='Security']"));
        return securityHeaderText;
    }
    public WebElement appLockSwitch(){
        WebElement appLockSwitch = driver.findElement(By.xpath("//*[@class='android.widget.Switch']"));
        return appLockSwitch;
    }
    public WebElement pinDigitValueText(String value){
        WebElement pinDigitValueText = driver.findElement(By.xpath("//*[@text='"+value+"']"));
        return pinDigitValueText;
    }
    public WebElement changePasscodeButton(){
        WebElement changePasscodeButton = driver.findElement(By.xpath("//*[@text='Change Passcode']"));
        return changePasscodeButton;
    }
    public WebElement nextButton(){
        WebElement nextButton = driver.findElement(By.xpath("//*[@text='Next']"));
        return nextButton;
    }
    public WebElement okButton(){
        WebElement okButton = driver.findElement(By.xpath("//*[@text='Ok']"));
        return okButton;
    }
}
