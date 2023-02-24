package AnCrypto.Tests.walletScreenTests;

import AnCrypto.Helpers.BaseClass;
import AnCrypto.PageObjects.walletScreenLocators;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;

public class walletScreenTestCasesSend extends BaseClass {
    walletScreenLocators walletScreenLocatorsObject = new walletScreenLocators();
    @BeforeMethod
    public void testSetup() throws MalformedURLException, InterruptedException {
        super.openApp();
    }
    @AfterMethod
    public void testCleanup(){
        driver.quit();
    }
    @Test
    public void walletScreenTestsCheckAddressContactHomeButton() throws InterruptedException {
        walletScreenLocatorsObject.walletScreenSendButton().click();
        walletScreenLocatorsObject.searchCurrencyTextField().sendKeys("Polygon");
        walletScreenLocatorsObject.selectDesiredCurrency("Polygon").click();
        walletScreenLocatorsObject.contactIcon().click();
        driver.hideKeyboard();
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
    @Test
    public void walletScreenTestsCheckSendCurrencyMaxAmount(){
        walletScreenLocatorsObject.walletScreenSendButton().click();
        walletScreenLocatorsObject.searchCurrencyTextField().sendKeys("Polygon");
        walletScreenLocatorsObject.selectDesiredCurrency("Polygon").click();
        walletScreenLocatorsObject.maxOption().click();
        String maxValue = walletScreenLocatorsObject.amountTextField().getText();
        String availableValue = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[4]")).getText();
        String[] split1 = availableValue.split(":");
        String[] split2 = split1[1].split(" ");
        float availableValueConverted = Float.parseFloat(split2[1]);
        float maxValueConverted = Float.parseFloat(maxValue);

        Assert.assertEquals(String.format("%.1f", availableValueConverted), String.format("%.1f", maxValueConverted));
    }
    @Test
    public void walletScreenTestsCheckSendCurrencyClickSlowAverageFastOptions(){
        walletScreenLocatorsObject.walletScreenSendButton().click();
        walletScreenLocatorsObject.searchCurrencyTextField().sendKeys("Polygon");
        walletScreenLocatorsObject.selectDesiredCurrency("Polygon").click();
        walletScreenLocatorsObject.slowText().click();
        walletScreenLocatorsObject.averageText().click();
        walletScreenLocatorsObject.fastText().click();
    }
    @Test
    public void walletScreenTestsCheckSendCurrencyEnterInvalidAddressAndAndValidAmountClickSend(){
        walletScreenLocatorsObject.walletScreenSendButton().click();
        walletScreenLocatorsObject.searchCurrencyTextField().sendKeys("Polygon");
        walletScreenLocatorsObject.selectDesiredCurrency("Polygon").click();
        walletScreenLocatorsObject.enterAddressTextField().sendKeys("AHdjHAGDhg");
        walletScreenLocatorsObject.amountTextField().sendKeys("0.00001");
        walletScreenLocatorsObject.sendButton().click();

        Assert.assertEquals(driver.findElement(By.xpath("//*[@text='Please enter valid receiver address']")).getText(), "Please enter valid receiver address");
    }

    @Test
    public void walletScreenTestsCheckSendCurrencyEnterValidAddressAndInvalidAmountAndClickSend(){
        walletScreenLocatorsObject.walletScreenSendButton().click();
        walletScreenLocatorsObject.searchCurrencyTextField().sendKeys("Polygon");
        walletScreenLocatorsObject.selectDesiredCurrency("Polygon").click();
        walletScreenLocatorsObject.enterAddressTextField().sendKeys("0xdacF588486202258F3b3c6e8074a0fE0A8317bdB");
        walletScreenLocatorsObject.sendButton().click();

        Assert.assertEquals(driver.findElement(By.xpath("//*[@text='Please enter amount']")).getText(), "Please enter amount");
    }

    //    @Test
//    public void walletScreenTestsCheckSendCurrencyEnterValidAddressAndValidAmountAndClickSend(){
//        walletScreenLocatorsObject.walletScreenSendButton().click();
//        walletScreenLocatorsObject.searchCurrencyTextField().sendKeys("Polygon");
//        walletScreenLocatorsObject.selectDesiredCurrency("Polygon").click();
//        walletScreenLocatorsObject.enterAddressTextField().sendKeys("AHdjHAGDhg");
//        walletScreenLocatorsObject.sendButton().click();
//
//        Assert.assertEquals(driver.findElement(By.xpath("//*[@text='Please enter amount']")).getText(), "Please enter amount");
//    }
}
