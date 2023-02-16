package AnCrypto;
import AnCrypto.Helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class CreateNewWallet extends BaseClass {
    String text, userName= "test990";
    String[] textArray;

    @Test(priority = 1, enabled = true)
    public void CLickImportYourWallet() throws InterruptedException, MalformedURLException {
        super.openApp();
        //Click on Trades option on footer
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@text='Import your wallet']")).click();
        Thread.sleep(2000);
        driver.navigate().back();

    }

    @Test(priority = 2, enabled = true)
    public void clickCreateNewWallet() throws InterruptedException, MalformedURLException {

        Thread.sleep(2000);
        //Click on markets option in footer
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@text='Create New Wallet']")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 3, enabled = true)
    void enterWalletName() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Enter wallet name']")).sendKeys("Test001");
    }

    @Test(priority = 4, enabled = true)
    void ClickOnNextButton() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Next']")).click();
    }

    @Test(priority = 5, enabled = true)
    void copyMemo() throws IOException, UnsupportedFlavorException, InterruptedException {
        boolean is_loading = true;

        while (is_loading) {
            //check data
            // sleep(1000)
            try {
                WebElement a = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
                        "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                        "ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                        "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view." +
                        "ViewGroup/android.widget.ImageView"));
                a.click();
                Thread.sleep(1000);
                text = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
                is_loading = false;

                // if data loaded, is_loading = false
            } catch (Exception e) {
                Thread.sleep(500);
            }
        }
    }
    @Test(priority = 6,enabled = true)
    void IHaveSafelyStoreMemo_CheckBox(){
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
                "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup" +
                "/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup" +
                "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup" +
                "/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.ImageView")).click();
    }
    @Test(priority = 7,enabled = true)
    void clickOnNextButton_CreateNewWallet(){

        driver.findElement(By.xpath("//*[@text='Next']")).click();
    }

    @Test(priority = 8,enabled = true)
    void arrangeMnemonics() throws InterruptedException {
        textArray = text.split(" ");
        for (int i = 0 ; i < textArray.length;i++){
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@text='"+textArray[i]+"']")).click();
        }
    }
    @Test(priority = 9,enabled = true)
    void clickOnNextButton1() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@text='Next']")).click();
    }

    @Test(priority = 10,enabled = true)
    void referralCodeSkip() throws InterruptedException {
        Thread.sleep(500);
        try {
            driver.findElement(By.xpath("//*[@text='SKIP']")).click();
        }catch(Exception e){

        }
    }
        @Test(priority = 11, enabled = true)
        void EnterUserName_CreateUserName() throws InterruptedException {
    //describe history mistake must remove lift recall style have laundry fork faith
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@text='Enter user name']")).sendKeys(userName);
        }
//
    @Test(priority = 12, enabled = true)
    void clickOnConfirm_createNewUser() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@text='Confirm']")).click();
    }
    @Test(priority = 13, enabled = true)
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
    @Test(priority = 14, enabled = true)
    void GotoBrowserAndWaitFor10Sec() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@text='Browser']")).click();
        Thread.sleep(1000);
    }
    @Test(priority = 15, enabled = true)
    void GotoChatAndWaitFor10Sec() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@text='Chat']")).click();
        Thread.sleep(1000);
    }
    @Test(priority = 14, enabled = true)
    void GotoTradeAndWaitFor10Sec() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@text='Trade']Wallet")).click();
        Thread.sleep(1000);
    }
    @Test(priority = 14, enabled = true)
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
