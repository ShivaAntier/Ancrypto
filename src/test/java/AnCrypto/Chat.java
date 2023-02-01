package AnCrypto;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Chat extends BaseClass {
    @Test
    void openChatScreen() throws InterruptedException {
        driver.findElement(By.xpath("//*[@text='Chat']")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 1)
    void ClickOnSearchField() throws InterruptedException {
        driver.findElement(By.xpath("//*[@text='Search']")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    void openOneUser() throws InterruptedException {
        driver.findElement(By.xpath("//*[@text='Shivamahajan']")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    void Type_a_message() throws InterruptedException {
        driver.findElement(By.xpath("//*[@text='Type a message']")).sendKeys("Hi This is shiva Here.");
        Thread.sleep(6000);
    }

    @Test(priority = 4)
    void ClickOnSendButton() throws InterruptedException {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
                "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup" +
                "/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup" +
                "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup" +
                "/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    void GetSendReceiveOptionsInChatScreen() throws InterruptedException {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
                "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup" +
                "/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup" +
                "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]" +
                "/android.view.ViewGroup/android.widget.ImageView")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 6)
    void ClickOnRequestCrypto() throws InterruptedException {
        driver.findElement(By.xpath("//*[@text='Request Crypto']")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 7)
    void SearchAnyCurrency() throws InterruptedException {
        driver.findElement(By.xpath("//*[@text='Search Currency']")).sendKeys("bit");
        Thread.sleep(2000);
    }

    @Test(priority = 8)
    void SelectThatCurrency() throws InterruptedException {
        driver.findElement(By.xpath("//*[@text='Bitcoin ']")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 9)
    void EnterAmountToRequest() throws InterruptedException {
        driver.findElement(By.xpath("//*[@text='0.0']")).sendKeys("0.01");
        Thread.sleep(2000);
    }

    @Test(priority = 10)
    void ClickOnRequestForSelectedCrypto() throws InterruptedException {
        driver.findElement(By.xpath("//*[@text='Request BTC']")).click();
        Thread.sleep(2000);
        driver.navigate().back();driver.navigate().back();
    }

}
