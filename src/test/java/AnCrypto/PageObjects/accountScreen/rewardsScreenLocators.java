package AnCrypto.PageObjects.accountScreen;

import AnCrypto.Helpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class rewardsScreenLocators extends BaseClass {
    public WebElement rewardsHeaderText(){
        WebElement rewardsHeaderText = driver.findElement(By.xpath("//*[@text='Rewards']"));
        return  rewardsHeaderText;
    }
    public WebElement inviteParagraphText(){
        WebElement inviteParagraphText = driver.findElement(By.xpath("//*[starts-with(@text,'I am')]"));
        return inviteParagraphText;
    }
    public WebElement inviteFriendsAndEarnText(){
        WebElement inviteFriendsAndEarnText = driver.findElement(By.xpath("//*[@text='Invite friends and earn Ancrypto tokens as rewards.']"));
        return inviteFriendsAndEarnText;
    }
    public WebElement copiedToastText(){
        WebElement copiedToastText = driver.findElement(By.xpath("//*[@text='Copied!']"));
        return copiedToastText;
    }
    public WebElement copyReferralCodeButton(){
        WebElement copyReferralCodeButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView"));
        return copyReferralCodeButton;
    }
}
