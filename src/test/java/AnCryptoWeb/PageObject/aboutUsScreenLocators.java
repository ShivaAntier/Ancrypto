package AnCryptoWeb.PageObject;

import AnCryptoWeb.Helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class aboutUsScreenLocators extends BaseClass {
    public WebElement weBelieve(){
        WebElement weBelieve = driver.findElement(By.xpath("//div[@class='et_pb_text_inner']/h2"));
        return weBelieve;
    }
}
