package AnCrypto.PageObjects.accountScreen;

import AnCrypto.Helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class contactsScreenLocators extends BaseClass {
    public WebElement contactsHeaderText(){
        WebElement contactsHeaderText = driver.findElement(By.xpath("//*[@text='Contacts']"));
        return contactsHeaderText;
    }
}
