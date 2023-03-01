package AnCrypto.Tests.walletScreenTests;

import AnCrypto.Helpers.BaseClass;
import AnCrypto.PageObjects.walletScreenLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class walletScreenTestCasesReceive extends BaseClass {
    WebDriverWait wait;
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
    public void walletScreenTestsReceiveCheckHomeButton() throws InterruptedException {
        wait = new WebDriverWait(driver, 10);
        walletScreenLocatorsObject.walletScreenReceiveButton().click();
        walletScreenLocatorsObject.searchCurrencyTextField().sendKeys("Polygon");
        walletScreenLocatorsObject.selectDesiredCurrency("Polygon").click();
        Thread.sleep(500);
        walletScreenLocatorsObject.homeIcon().click();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@class = 'android.widget.TextView' and @index = '1' and @text = 'Wallet']")).getText(), "Wallet");
    }
    @Test
    public void walletScreenTestsReceiveCheckCopiedPublicAddress() throws IOException, UnsupportedFlavorException, InterruptedException {
        walletScreenLocatorsObject.walletScreenReceiveButton().click();
        walletScreenLocatorsObject.searchCurrencyTextField().sendKeys("Polygon");
        walletScreenLocatorsObject.selectDesiredCurrency("Polygon").click();
        String expectedAddress = walletScreenLocatorsObject.publicAddress().getText();
        walletScreenLocatorsObject.copyButton().click();
        Thread.sleep(2000);
        String actualAddress = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        Assert.assertEquals(actualAddress, expectedAddress);
    }
}
