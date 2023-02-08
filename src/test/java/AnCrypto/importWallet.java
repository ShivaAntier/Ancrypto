package AnCrypto;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class importWallet extends BaseClass {
    String key = "search mesh kangaroo song rubber gravity video rifle farm pelican burst stick", walletName = "tester", userName = "tester_001";

    @Test(priority = 1, enabled = true)
    public void CLickImportYourWallet() throws InterruptedException, MalformedURLException {
        super.openApp();
        //Click on Trades option on footer
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@text='Import your wallet']")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 2, enabled = true)
    public void NameYourWallet() throws InterruptedException, MalformedURLException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Enter wallet name']")).sendKeys(walletName);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Next']")).click();
    }

    @Test(priority = 3, enabled = true)
    public void EnterSecretCode() throws InterruptedException, MalformedURLException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Enter Recovery Phrase here']")).sendKeys(key);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Next']")).click();

    }

    @Test(priority = 4, enabled = true)
    void SetPinAndConfirmPin() throws InterruptedException {
        boolean a = true;
        int b = 1;
        while (a) {
            try {
                System.out.println("Entered in try block for "+b+"time........");
                for (int i = 1; i < 5; i++) {
                    System.out.println("Ehtered in try for loop for "+b+"times.");
                    Thread.sleep(500);
                    driver.findElement(By.xpath("//*[@text='1']")).click();
                    System.out.println("Try method running successfully!!!!!!!!!!!!!!!!");
                }
                Thread.sleep(500);
                driver.findElement(By.xpath("//*[@text='Next']")).click();
                for (int i = 1; i < 5; i++) {
                    Thread.sleep(500);
                    driver.findElement(By.xpath("//*[@text='1']")).click();
                }
                Thread.sleep(500);
                a = false;
            } catch (Exception e) {
                Thread.sleep(1000);
                System.out.println("Loop running for :: " + b + " times.");
                if (b>5){
                    Assert.assertFalse(true,"The loader is stuck at this point for long time.");
                }
                b++;
            }
        }
        driver.findElement(By.xpath("//*[@text='NO']")).click();

    }

    @Test(priority = 5, enabled = false)
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
