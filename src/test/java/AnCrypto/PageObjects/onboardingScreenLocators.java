package AnCrypto.PageObjects;

import AnCrypto.Helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class onboardingScreenLocators extends BaseClass {
    public WebElement createNewWalletButton() {
        WebElement createNewWalletButton = driver.findElement(By.xpath("//*[@text='Create New Wallet']"));
        return createNewWalletButton;
    }

    public WebElement importYourWalletButton() {
        WebElement importYourWalletButton = driver.findElement(By.xpath("//*[@text='Import your wallet']"));
        return importYourWalletButton;
    }
    public WebElement onboardingScreenOneHeaderUpperText(){
        WebElement onboardingScreenOneHeaderUpperText = driver.findElement(By.xpath("//*[@text='Trusted & Secure']"));
        return onboardingScreenOneHeaderUpperText;
    }
    public WebElement onboardingScreenOneHeaderLowerText(){
        WebElement onboardingScreenOneHeaderLowerText = driver.findElement(By.xpath("//*[@text='Crypto Wallet']"));
        return onboardingScreenOneHeaderLowerText;
    }
    public WebElement onboardingScreenOneSubUpperText(){
        WebElement onboardingScreenOneSubUpperText = driver.findElement(By.xpath("//*[@text='Experience the Power of DeFi Crypto Wallet']"));
        return onboardingScreenOneSubUpperText;
    }
    public WebElement onboardingScreenOneSubLowerText(){
        WebElement onboardingScreenOneSubLowerText = driver.findElement(By.xpath("//*[@text='like never before']"));
        return onboardingScreenOneSubLowerText;
    }
    public WebElement onboardingScreenTwoHeaderUpperText(){
        WebElement onboardingScreenTwoHeaderUpperText = driver.findElement(By.xpath("//*[@text='Send Crypto']"));
        return onboardingScreenTwoHeaderUpperText;
    }
    public WebElement onboardingScreenTwoHeaderLowerText(){
        WebElement onboardingScreenTwoHeaderLowerText = driver.findElement(By.xpath("//*[@text='while you chat']"));
        return onboardingScreenTwoHeaderLowerText;
    }
    public WebElement onboardingScreenTwoSubUpperText(){
        WebElement onboardingScreenTwoSubUpperText = driver.findElement(By.xpath("//*[@text='Add friends easily with their usernames']"));
        return onboardingScreenTwoSubUpperText;
    }
    public WebElement onboardingScreenTwoSubLowerText(){
        WebElement onboardingScreenTwoSubLowerText = driver.findElement(By.xpath("//*[@text='& do instant transfers']"));
        return onboardingScreenTwoSubLowerText;
    }
    public WebElement onboardingScreenThreeHeaderUpperText(){
        WebElement onboardingScreenThreeHeaderUpperText = driver.findElement(By.xpath("//*[@text='Swap Crypto']"));
        return onboardingScreenThreeHeaderUpperText;
    }
    public WebElement onboardingScreenThreeHeaderLowerText(){
        WebElement onboardingScreenThreeHeaderLowerText = driver.findElement(By.xpath("//*[@text='Instantly']"));
        return onboardingScreenThreeHeaderLowerText;
    }
    public WebElement onboardingScreenThreeSubUpperText(){
        WebElement onboardingScreenThreeSubUpperText = driver.findElement(By.xpath("//*[@text='Transfer crypto-assets in & out of']"));
        return onboardingScreenThreeSubUpperText;
    }
    public WebElement onboardingScreenThreeSubLowerText(){
        WebElement onboardingScreenThreeSubLowerText = driver.findElement(By.xpath("//*[@text=' different blockchains in a few taps']"));
        return onboardingScreenThreeSubLowerText;
    }
    public WebElement onboardingScreenFourthHeaderUpperText(){
        WebElement onboardingScreenFourthHeaderUpperText = driver.findElement(By.xpath("//*[@text='Buy ']"));
        return onboardingScreenFourthHeaderUpperText;
    }
    public WebElement onboardingScreenFourthHeaderLowerText(){
        WebElement onboardingScreenFourthHeaderLowerText = driver.findElement(By.xpath("//*[@text='Crypto easily']"));
        return onboardingScreenFourthHeaderLowerText;
    }
    public WebElement onboardingScreenFourthSubUpperText(){
        WebElement onboardingScreenFourthSubUpperText = driver.findElement(By.xpath("//*[@text='Buy crypto directly from ']"));
        return onboardingScreenFourthSubUpperText;
    }
    public WebElement onboardingScreenFourthSubLowerText(){
        WebElement onboardingScreenFourthSubLowerText = driver.findElement(By.xpath("//*[@text='your credit card']"));
        return onboardingScreenFourthSubLowerText;
    }
}
