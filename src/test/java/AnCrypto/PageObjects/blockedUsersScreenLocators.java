package AnCrypto.PageObjects;

import AnCrypto.Helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class blockedUsersScreenLocators extends BaseClass {
    public WebElement blockedUsersHeaderText(){
        WebElement blockedUsersHeaderText = driver.findElement(By.xpath("//*[@text='Blocked Users']"));
        return blockedUsersHeaderText;
    }
}
