package AnCrypto.PageObjects;

import AnCrypto.Helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class createNewWalletScreenLocators extends BaseClass {
    public WebElement enterWalletNameTextField() {
        WebElement enterWalletNameTextField = driver.findElement(By.xpath("//*[@text='Enter wallet name']"));
        return enterWalletNameTextField;
    }

    public WebElement nextButton(){
        WebElement nextButton = driver.findElement(By.xpath("//*[@text='Next']"));
        return nextButton;
    }

    public WebElement copyButton(){
        WebElement copyButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
                "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view." +
                "ViewGroup/android.widget.ImageView"));
        return copyButton;
    }

    public WebElement iHaveSafelyStoredMyMnemonicsCheckbox(){
        WebElement iHaveSafelyStoredMyMnemonicsCheckbox = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
                "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup" +
                "/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup" +
                "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup" +
                "/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.ImageView"));
        return iHaveSafelyStoredMyMnemonicsCheckbox;
    }

    public WebElement arrangeMnemonics(String s) {
        WebElement arrangeMnemonics = driver.findElement(By.xpath("//*[@text='"+s+"']"));
        return arrangeMnemonics;
    }

    public WebElement enterUserNameTextField(){
        WebElement enterUserNameTextField = driver.findElement(By.xpath("//*[@text='Enter user name']"));
        return enterUserNameTextField;
    }

    public WebElement confirmButton(){
        WebElement confirmButton = driver.findElement(By.xpath("//*[@text='Confirm']"));
        return confirmButton;
    }

    public WebElement pinDigitText1(){
        WebElement pinDigitText1 = driver.findElement(By.xpath("//*[@text='1']"));
        return pinDigitText1;
    }

    public WebElement noButton(){
        WebElement noButton = driver.findElement(By.xpath("//*[@text='NO']"));
        return noButton;
    }

    public WebElement availableText(){
        WebElement availableText = driver.findElement(By.xpath("//*[@text='available']"));
        return availableText;
    }

    public WebElement unavailableText(){
        WebElement unavailableText = driver.findElement(By.xpath("//*[@text='Unavailable']"));
        return unavailableText;
    }
}
