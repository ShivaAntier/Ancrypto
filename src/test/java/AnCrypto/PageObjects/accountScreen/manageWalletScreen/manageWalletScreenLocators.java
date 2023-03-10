package AnCrypto.PageObjects.accountScreen.manageWalletScreen;

import AnCrypto.Helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class manageWalletScreenLocators extends BaseClass {
    public WebElement plusIcon(){
        WebElement plusIcon = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.ImageView"));
        return plusIcon;
    }
    public WebElement allCoinsButton(){
        WebElement allCoinsButton = driver.findElement(By.xpath("//*[@text='All Coins']"));
        return allCoinsButton;
    }
    public WebElement stableCoinsButton(){
        WebElement stableCoinsButton = driver.findElement(By.xpath("//*[@text='Stable Coins']"));
        return stableCoinsButton;
    }
    public WebElement showHideIcon(){
        WebElement showHideIcon = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.ImageView"));
        return showHideIcon;
    }
    public List<WebElement> availableWallets(){
        List<WebElement> availableWallets = driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"));
        return availableWallets;
    }
    public List<WebElement> namesOfAvailableWallets(){
        List<WebElement> namesOfAvailableWallets = driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]"));
        return namesOfAvailableWallets;
    }
    public List<WebElement> walletInfoIcon(){
        List<WebElement> walletInfoIcon = driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView"));
        return walletInfoIcon;
    }
    public WebElement editWalletNameTextField(){
        WebElement editWalletNameTextField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText"));
        return editWalletNameTextField;
    }
    public WebElement saveChangesButton(){
        WebElement saveChangesButton =  driver.findElement(By.xpath("//*[@text='Save Changes']"));
        return saveChangesButton;
    }
    public WebElement showRecoveryPhraseButton(){
        WebElement showRecoveryPhraseButton =  driver.findElement(By.xpath("//*[@text='Show Recovery Phrase']"));
        return showRecoveryPhraseButton;
    }
    public WebElement pinDigitValueText(String value){
        WebElement pinDigitValueText = driver.findElement(By.xpath("//*[@text='"+value+"']"));
        return pinDigitValueText;
    }
    public WebElement copiedText(){
        WebElement copiedText = driver.findElement(By.xpath("//*[@text='Copied!']"));
        return copiedText;
    }
    public WebElement deleteWalletButton(){
        WebElement copiedText = driver.findElement(By.xpath("//*[@text='Delete Wallet']"));
        return copiedText;
    }
    public WebElement yesButton(){
        WebElement copiedText = driver.findElement(By.xpath("//*[@text='Yes']"));
        return copiedText;
    }
    public WebElement youCannotDeleteDefaultWalletPopupText(){
        WebElement youCannotDeleteDefaultWalletPopupText = driver.findElement(By.xpath("//*[@text='You cannot delete default wallet']"));
        return youCannotDeleteDefaultWalletPopupText;
    }

}
