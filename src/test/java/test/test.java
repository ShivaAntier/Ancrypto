package test;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class test {
    AppiumDriver driver;
    DesiredCapabilities cap;

    @Test
    void OpenApp() throws InterruptedException, MalformedURLException {
        cap = new DesiredCapabilities();
        cap.setCapability("automationName", "Appium");
        cap.setCapability("VERSION", "12.0");
        cap.setCapability("deviceName", "vivo Y15s");
        cap.setCapability("platformName", "Android");
        cap.setCapability("adbExecTimeout", "80000");
        cap.setCapability("appPackage", "com.ancryptoWallet");
        cap.setCapability("appActivity", "com.ancrypto.MainActivity");
        cap.setCapability("autoGrantPermissions", "true");
        cap.setCapability("autoAcceptAlerts", "true");

        driver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), cap);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Thread.sleep(2000);

        System.out.println("app is started !");
    }
}

