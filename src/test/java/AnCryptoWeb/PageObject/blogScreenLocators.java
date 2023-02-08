package AnCryptoWeb.PageObject;

import AnCryptoWeb.Helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class blogScreenLocators extends BaseClass  {
    public WebElement anCryptoBlog(){
        WebElement anCryptoBlog = driver.findElement(By.xpath("//div[@class='et_pb_text_inner']/h1"));
        return anCryptoBlog;
    }
}
