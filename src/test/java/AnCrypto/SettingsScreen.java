package AnCrypto;

import AnCrypto.Helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SettingsScreen extends BaseClass {
    @Test(priority = 1)
    void OpenSettingsScreen() throws InterruptedException, MalformedURLException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
                "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup" +
                "/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup" +
                "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]" +
                "/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget." +
                "ScrollView/android.view.ViewGroup" +
                "/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 2,enabled = false)
    void OpenAllOptions() {
        for (int i = 1; i < 8; i++) {
            try {
                WebElement a = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup" +
                        "/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[" + i + "]" +
                        "/android.view.ViewGroup"));
                String b = a.getText();
                System.out.println("Value of b :"+b);
                a.click();
                Thread.sleep(2000);
                driver.navigate().back();
            } catch (Exception e) {
                Assert.assertFalse(true, "The locator is failed for " + i + " iteration");
            }
        }
    }

    @Test(priority = 3,enabled = true)
    void OpenProfileScreen(){
        driver.findElement(By.xpath("//*[@class='android.widget.ScrollView']/android.view.ViewGroup/android.view.ViewGroup[1]")).click();
    }

}
