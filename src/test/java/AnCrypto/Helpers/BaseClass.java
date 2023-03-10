package AnCrypto.Helpers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static AppiumDriver driver;
    public static DesiredCapabilities cap;
    public String key = "wide truly test valley bike accident law gentle dinosaur mind jar budget";
    public String walletName = "tester";
    String userName = "tester_001";

    //        @Test
    public void openApp() throws MalformedURLException, InterruptedException {
        BaseClass bc = new BaseClass();

        cap = new DesiredCapabilities();
        cap.setCapability("automationName", "Appium");
        cap.setCapability("VERSION", "12.0");
        cap.setCapability("deviceName", "sdk_gphone64_x86_64");
        cap.setCapability("platformName", "Android");
        cap.setCapability("adbExecTimeout", "80000");
        cap.setCapability("appPackage", "com.ancryptoWallet");
        cap.setCapability("appActivity", "com.ancrypto.MainActivity");
        cap.setCapability("noReset", "true");
        cap.setCapability("autoGrantPermissions", "true");
        cap.setCapability("autoAcceptAlerts", "true");
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);
//        System.out.println("application started");
        // END OF CODE
    }

    static AppiumServiceBuilder builder = new AppiumServiceBuilder()
            .withAppiumJS(new File("C:/Program Files/Appium Server GUI/resources/app/node_modules/appium/build/lib/main.js"))
            .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
            .withLogFile(new File(System.getProperty("user.dir") + "/appiumServerLog.txt"));
    static AppiumDriverLocalService appium = builder.build();
    //        System.out.println("Starting the Appium Server on 127.0.0.1:4723");

//    @BeforeSuite
    public void start() throws IOException, InterruptedException {
        System.out.println("Before Suite");
        Thread.sleep(5000);
//        Process p = Runtime.getRuntime().exec("cmd /c start cmd.exe /K emulator -avd Pixel4", null, new File("C:\\Users\\user\\AppData\\Local\\Android\\Sdk\\emulator"));
        appium.start();
    }

//    @AfterSuite
    public void stopServer() throws IOException, InterruptedException {
        System.out.println("After Suite");
        Thread.sleep(5000);
//        Process q = Runtime.getRuntime().exec("cmd /c start cmd.exe /K adb -s emulator-5554 emu kill", null, new File("C:\\Users\\user\\AppData\\Local\\Android\\Sdk\\emulator"));
        appium.stop();
    }
}
