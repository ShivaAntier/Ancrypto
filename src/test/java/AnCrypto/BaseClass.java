package AnCrypto;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static AppiumDriver driver;
    public static DesiredCapabilities cap;

//    @Test
    public void openApp() throws MalformedURLException, InterruptedException {
        BaseClass bc = new BaseClass();
        cap = new DesiredCapabilities();
        cap.setCapability("automationName", "Appium");
//        cap.setCapability("automationName", "Appium");
        cap.setCapability("VERSION", "12.0");
        cap.setCapability("deviceName", "realme RMX3381");//moto e(7) plus  Android SDK built for x86 N7I7UCAUOZ5T499P
        cap.setCapability("platformName", "Android");
        cap.setCapability("adbExecTimeout", "80000");
        cap.setCapability("appPackage", "com.ancryptoWallet");
        cap.setCapability("appActivity", "com.ancrypto.MainActivity");
//        cap.setCapability("appPackage","com.evoeurope");
//        cap.setCapability("appActivity","com.coincult.MainActivity");
        cap.setCapability("autoGrantPermissions", "true");
        cap.setCapability("autoAcceptAlerts", "true");

        driver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);
        System.out.println("application started");
        // END OF CODE
    }
}
