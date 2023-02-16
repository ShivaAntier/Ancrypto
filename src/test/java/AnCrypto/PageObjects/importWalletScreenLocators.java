package AnCrypto.PageObjects;

import AnCrypto.Helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class importWalletScreenLocators extends BaseClass {
    public WebElement enterWalletNameTextField() {
        WebElement enterWalletNameTextField = driver.findElement(By.xpath("//*[@text='Enter wallet name']"));
        return enterWalletNameTextField;
    }

    public WebElement nextButton(){
        WebElement nextButton = driver.findElement(By.xpath("//*[@text='Next']"));
        return nextButton;
    }

    public WebElement enterRecoveryPhraseHereText(){
        WebElement enterRecoveryPhraseHereText = driver.findElement(By.xpath("//*[@text='Enter Recovery Phrase here']"));
        return enterRecoveryPhraseHereText;
    }

    public WebElement pinDigitText1(){
        WebElement pinDigitText1 = driver.findElement(By.xpath("//*[@text='1']"));
        return pinDigitText1;
    }

    public WebElement noButton(){
        WebElement noButton = driver.findElement(By.xpath("//*[@text='NO']"));
        return noButton;
    }
}
