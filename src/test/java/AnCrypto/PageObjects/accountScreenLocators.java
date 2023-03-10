package AnCrypto.PageObjects;

import AnCrypto.Helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class accountScreenLocators extends BaseClass {
    public WebElement manageWalletButton() {
        WebElement manageWalletButton = driver.findElement(By.xpath("//*[@text='Manage Wallet']"));
        return manageWalletButton;
    }
    public WebElement profileButton() {
        WebElement profileButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView"));
        return profileButton;
    }
    public WebElement referralAndRewardsButton() {
        WebElement referralAndRewardsButton = driver.findElement(By.xpath("//*[@text='Referral & Rewards']"));
        return referralAndRewardsButton;
    }
    public WebElement securityButton() {
        WebElement securityButton = driver.findElement(By.xpath("//*[@text='Security']"));
        return securityButton;
    }
    public WebElement pushNotificationSwitch() {
        WebElement pushNotificationSwitch = driver.findElement(By.xpath("//*[@class='android.widget.Switch']"));
        return pushNotificationSwitch;
    }
    public WebElement changeCurrencyButton() {
        WebElement changeCurrencyButton = driver.findElement(By.xpath("//*[@text='Change Currency']"));
        return changeCurrencyButton;
    }
    public WebElement selectedCurrencyText() {
        WebElement selectedCurrencyText = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup[3]/android.widget.TextView[2]"));
        return selectedCurrencyText;
    }
    public WebElement supportCenterButton() {
        WebElement supportCenterButton = driver.findElement(By.xpath("//*[@text='Support Center']"));
        return supportCenterButton;
    }
    public WebElement supportCenterWebUrl() {
        WebElement supportCenterWebUrl = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.EditText"));
        return supportCenterWebUrl;
    }
    public WebElement contactsButton() {
        WebElement contactsButton = driver.findElement(By.xpath("//*[@text='Contacts']"));
        return contactsButton;
    }
    public WebElement blockedContactsButton() {
        WebElement blockedContactsButton = driver.findElement(By.xpath("//*[@text='Blocked Contacts']"));
        return blockedContactsButton;
    }
}
