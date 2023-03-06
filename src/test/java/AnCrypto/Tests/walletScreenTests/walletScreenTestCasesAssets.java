package AnCrypto.Tests.walletScreenTests;

import AnCrypto.Helpers.BaseClass;
import AnCrypto.PageObjects.walletScreenLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;

public class walletScreenTestCasesAssets extends BaseClass {
    WebDriverWait wait;
    walletScreenLocators walletScreenLocatorsObject = new walletScreenLocators();

    @BeforeMethod
    public void testSetup() throws MalformedURLException, InterruptedException {
        super.openApp();
    }

    @AfterMethod
    public void testCleanup() {
        driver.quit();
    }

//    @Test
    public void walletScreenTestCasesAssetsClickOnAvailableCurrencies() throws InterruptedException {
        for (int i = 0; i < walletScreenLocatorsObject.assetsCategoryList().size(); i++) {
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@text='" + walletScreenLocatorsObject.assetsCategoryList().get(i).getText() + "']")).click();
            Thread.sleep(1000);
            for (int j = 0; j < walletScreenLocatorsObject.assetsCurrencyList().size(); j++) {
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@text='" + walletScreenLocatorsObject.assetsCurrencyList().get(j).getText() + "']")).click();
                Thread.sleep(1000);
                walletScreenLocatorsObject.walletScreenSendButton().click();
                Thread.sleep(1000);
                driver.navigate().back();
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@text='" + walletScreenLocatorsObject.assetsCurrencyList().get(j).getText() + "']")).click();
                Thread.sleep(1000);
                if(walletScreenLocatorsObject.currencyReceiveButton().size()>1){
                    walletScreenLocatorsObject.currencyReceiveButton().get(1).click();
                }
                else {
                    walletScreenLocatorsObject.currencyReceiveButton().get(0).click();
                }
                Thread.sleep(1000);
                driver.navigate().back();
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@text='" + walletScreenLocatorsObject.assetsCurrencyList().get(j).getText() + "']")).click();
                Thread.sleep(1000);
                try {
                    walletScreenLocatorsObject.walletScreenBuyButton().click();
                    Thread.sleep(1000);
                    driver.navigate().back();
                } catch (Exception e) {
                    e.printStackTrace();
                    e.getCause();
                    e.getMessage();
                    Thread.sleep(1000);
                    driver.navigate().back();
                }
            }
        }
    }
}
