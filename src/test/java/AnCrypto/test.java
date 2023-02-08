package AnCrypto;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class test {
    public static AppiumDriver driver;

    //Preconditions to write appium is we have to know the DS of the devices
    //The apk package name, activity name
    @Test
    void test() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        //Provide the Device details
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","11.0");

        caps.setCapability("appPackage","com.ancryptoWallet");
//        caps.setCapability("appPackage","io.appium.android.apis");
        caps.setCapability("appActivity","com.ancrypto.MainActivity");
//        caps.setCapability("appActivity","io.appium.android.apis.ApiDemos");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),caps);

        System.out.println("App is getting started!!");

    }
}
