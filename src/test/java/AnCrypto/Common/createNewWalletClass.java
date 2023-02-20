package AnCrypto.Common;

import AnCrypto.Helpers.BaseClass;
import AnCrypto.PageObjects.createNewWalletScreenLocators;
import AnCrypto.PageObjects.onboardingScreenLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Random;

public class createNewWalletClass extends BaseClass {
    WebDriverWait wait;
    String text;
    String userName;
    String[] textArray;
    onboardingScreenLocators onboardingScreenLocatorsObject = new onboardingScreenLocators();
    createNewWalletScreenLocators createNewWalletScreenLocatorsObject = new createNewWalletScreenLocators();

    public String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 7) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        userName = salt.toString();
        return userName;

    }
    public void createNewWalletFunction() throws IOException, InterruptedException, UnsupportedFlavorException {
        super.openApp();
//        Thread.sleep(5000);
        onboardingScreenLocatorsObject.createNewWalletButton().click();
        getSaltString();
        createNewWalletScreenLocatorsObject.enterWalletNameTextField().sendKeys(userName);
        createNewWalletScreenLocatorsObject.nextButton().click();
        wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
                "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view." +
                "ViewGroup/android.widget.ImageView")));
        createNewWalletScreenLocatorsObject.copyButton().click();
        createNewWalletScreenLocatorsObject.iHaveSafelyStoredMyMnemonicsCheckbox().click();
        createNewWalletScreenLocatorsObject.nextButton().click();
        text = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        textArray = text.split(" ");
        for (int i = 0 ; i < textArray.length;i++){
            Thread.sleep(500);
            createNewWalletScreenLocatorsObject.arrangeMnemonics(textArray[i]).click();
        }
        createNewWalletScreenLocatorsObject.nextButton().click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Enter user name']")));
        createNewWalletScreenLocatorsObject.enterUserNameTextField().sendKeys(userName);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]")));
//        String availableOrNotString = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]")).getText();
//        String unavailable = "unavailable";
//        boolean a = true;
//        while(a){
//            System.out.println(availableOrNotString);
//            if(availableOrNotString.equals(unavailable)){
//                getSaltString();
//            }
//            else{
//                a=false;
//            }
//        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='available']")));

        createNewWalletScreenLocatorsObject.confirmButton().click();
        for (int i = 1; i < 5; i++) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='1']")));
            createNewWalletScreenLocatorsObject.pinDigitText1().click();
        }
        createNewWalletScreenLocatorsObject.nextButton().click();
        for (int i = 1; i < 5; i++) {
            Thread.sleep(500);
            createNewWalletScreenLocatorsObject.pinDigitText1().click();
        }
        Thread.sleep(1000);
        createNewWalletScreenLocatorsObject.noButton().click();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@class = 'android.widget.TextView' and @index = '1' and @text = 'Wallet']")).getText(), "Wallet");
    }
}
