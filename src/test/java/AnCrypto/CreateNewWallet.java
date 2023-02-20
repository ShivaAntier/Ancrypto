package AnCrypto;
import AnCrypto.Common.createNewWalletClass;
import AnCrypto.Helpers.BaseClass;
import AnCrypto.PageObjects.createNewWalletScreenLocators;
import AnCrypto.PageObjects.onboardingScreenLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class CreateNewWallet extends BaseClass {
    createNewWalletClass createNewWalletClassObject = new createNewWalletClass();

    @Test
    void createWallet() throws IOException, InterruptedException, UnsupportedFlavorException {
        createNewWalletClassObject.createNewWalletFunction();
    }

    @Test(priority = 13, enabled = false)
    void clickOnPublicPreference_createNewUser() throws InterruptedException {
        for (int i = 1 ; i < 5; i++) {
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@text='1']")).click();
                    }
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@text='Next']")).click();
        for (int i = 1 ; i < 5; i++) {
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@text='1']")).click();
        }
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@text='No']")).click();
    }
    @Test(priority = 14, enabled = false)
    void GotoBrowserAndWaitFor10Sec() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@text='Browser']")).click();
        Thread.sleep(1000);
    }
    @Test(priority = 15, enabled = false)
    void GotoChatAndWaitFor10Sec() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@text='Chat']")).click();
        Thread.sleep(1000);
    }
    @Test(priority = 14, enabled = false)
    void GotoTradeAndWaitFor10Sec() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@text='Trade']Wallet")).click();
        Thread.sleep(1000);
    }
    @Test(priority = 14, enabled = false)
    void GotoWalletAndWaitFor10Sec() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@text='Wallet']")).click();
        Thread.sleep(1000);
    }


// this is dependencies
    @Test(priority = 15, enabled = false)
    public void click_on_deposit_home() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.quit();
    }
}
