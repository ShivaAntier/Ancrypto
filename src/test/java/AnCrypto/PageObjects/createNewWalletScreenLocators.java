package AnCrypto.PageObjects;

import AnCrypto.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class createNewWalletScreenLocators extends BaseClass {
    public WebElement nameYourWalletText() {
        WebElement nameYourWalletText = driver.findElement(By.xpath("//*[@text='Name your wallet']"));
        return nameYourWalletText;
    }
}
