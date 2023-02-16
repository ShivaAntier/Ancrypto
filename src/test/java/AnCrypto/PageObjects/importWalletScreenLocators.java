package AnCrypto.PageObjects;

import AnCrypto.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class importWalletScreenLocators extends BaseClass {
    public WebElement nameYourWalletText() {
        WebElement nameYourWalletText = driver.findElement(By.xpath("//*[@text='Name your wallet']"));
        return nameYourWalletText;
    }

    public WebElement enterWalletNameTextField() {
        WebElement enterWalletNameTextField = driver.findElement(By.xpath("//*[@text='Enter wallet name']"));
        return enterWalletNameTextField;
    }

    public WebElement nextButton(){
        WebElement nextButton = driver.findElement(By.xpath("//*[@text='Next']"));
        return nextButton;
    }

    public WebElement importWalletUsingMnemonicsText(){
        WebElement importWalletUsingMnemonicsText = driver.findElement(By.xpath("//*[@text='Import Wallet using Mnemonics']"));
        return importWalletUsingMnemonicsText;
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
