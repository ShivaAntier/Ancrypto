package AnCrypto.PageObjects;

import AnCrypto.Helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class accountScreenLocators extends BaseClass {
    public WebElement manageWalletButton() {
        WebElement manageWalletButton = driver.findElement(By.xpath("//*[@text='Manage Wallet']"));
        return manageWalletButton;
    }
}
