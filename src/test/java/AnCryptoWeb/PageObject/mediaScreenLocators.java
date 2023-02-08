package AnCryptoWeb.PageObject;

import AnCryptoWeb.Helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class mediaScreenLocators extends BaseClass {

    public WebElement anCryptoIn(){
        WebElement anCryptoIN=driver.findElement(By.xpath("//div[@class='et_pb_text_inner']/h1"));
        return anCryptoIN;
    }

    public WebElement News() {
        WebElement anCryptoInNews = driver.findElement(By.xpath("//div[@class='et_pb_text_inner']/h1/span"));
        return anCryptoInNews;
    }

}
