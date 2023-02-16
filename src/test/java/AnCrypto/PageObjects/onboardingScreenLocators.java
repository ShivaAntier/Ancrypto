package AnCrypto.PageObjects;

import AnCrypto.Helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class onboardingScreenLocators extends BaseClass {
    public WebElement createNewWalletButton() {
        WebElement createNewWalletButton = driver.findElement(By.xpath("//*[@text='Create your wallet']"));
        return createNewWalletButton;
    }

    public WebElement importYourWalletButton() {
        WebElement importYourWalletButton = driver.findElement(By.xpath("//*[@text='Import your wallet']"));
        return importYourWalletButton;
    }
}
