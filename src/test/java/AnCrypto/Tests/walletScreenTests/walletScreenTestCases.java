package AnCrypto.Tests.walletScreenTests;

import AnCrypto.Helpers.BaseClass;
import AnCrypto.PageObjects.walletScreenLocators;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;

public class walletScreenTestCases extends BaseClass {
    walletScreenLocators walletScreenLocatorsObject = new walletScreenLocators();
    @BeforeTest
    public void testSetup() throws MalformedURLException, InterruptedException {
        super.openApp();
    }
    @AfterTest
    public void testCleanup(){
        driver.quit();
    }
    @Test
    public void walletScreenTestsCheckAddressContactHomeButton() {
        walletScreenLocatorsObject.walletScreenSendButton().click();
        walletScreenLocatorsObject.searchCurrencyTextField().sendKeys("Polygon");
        walletScreenLocatorsObject.selectDesiredCurrency("Polygon").click();
        walletScreenLocatorsObject.contactIcon().click();
        driver.navigate().back();
        walletScreenLocatorsObject.homeIcon().click();

        Assert.assertEquals(driver.findElement(By.xpath("//*[@class = 'android.widget.TextView' and @index = '1' and @text = 'Wallet']")).getText(), "Wallet");
    }
    @Test
    public void walletScreenTestsCheckSendCurrencyAdvancedOptionsSubmitEmpty(){
        walletScreenLocatorsObject.walletScreenSendButton().click();
        walletScreenLocatorsObject.searchCurrencyTextField().sendKeys("Polygon");
        walletScreenLocatorsObject.selectDesiredCurrency("Polygon").click();
        walletScreenLocatorsObject.advancedOptions().click();
        walletScreenLocatorsObject.submitButton().click();

        Assert.assertEquals(driver.findElement(By.xpath("//*[@text='Please enter Gas Limit']")).getText(), "Please enter Gas Limit");
    }
}
