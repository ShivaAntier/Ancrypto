package AnCrypto;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import AnCrypto.Helpers.BaseClass;
import java.net.MalformedURLException;
import AnCrypto.Common.importWalletClass;

public class importWallet extends BaseClass {
    importWalletClass importWalletClassObject = new importWalletClass();

    @BeforeMethod
    public void testSetup() throws MalformedURLException, InterruptedException {
        importWalletClassObject.importWalletFunction();
    }

    @AfterTest
    public void testCleanup(){
        driver.quit();
    }
    @Test()
    void GotoBrowserAndWaitFor2Sec() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@text='Browser']")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 6, enabled = true)
    void GotoChatAndWaitFor2Sec() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@text='Chat']")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 7, enabled = true)
    void GotoTradeAndWaitFor2Sec() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@text='Trade']")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 8, enabled = true)
    void GotoWalletAndWaitFor2Sec() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@text='Wallet']")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 9, enabled = true)
    void GotoSendAndWaitFor2Sec() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@text='Send']")).click();
        Thread.sleep(2000);
        driver.navigate().back();
    }

    @Test(priority = 10, enabled = true)
    void GotoReceiveAndWaitFor2Sec() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@text='Receive']")).click();
        Thread.sleep(2000);
        driver.navigate().back();
    }

    @Test(priority = 11, enabled = true)
    void GotoBuyAndWaitFor2Sec() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@text=' Buy']")).click();
        Thread.sleep(2000);
        driver.navigate().back();
    }

    @Test(priority = 12, enabled = true)
    void GotoManageAndWaitFor2Sec() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@text='Manage']")).click();
        Thread.sleep(2000);
        driver.navigate().back();
    }

    @Test(priority = 13, enabled = true)
    void GotoCollectiblesAndWaitFor2Sec() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@text='Collectibles']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Wallet']")).click();
    }
}
