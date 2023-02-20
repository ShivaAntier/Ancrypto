package AnCrypto.Common;

import AnCrypto.Helpers.BaseClass;
import AnCrypto.PageObjects.onboardingScreenLocators;
import AnCrypto.PageObjects.importWalletScreenLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.net.MalformedURLException;

public class importWalletClass extends BaseClass {
    WebDriverWait wait;
    onboardingScreenLocators onboardingScreenLocatorsObject = new onboardingScreenLocators();
    importWalletScreenLocators importWalletScreenLocatorsObject = new importWalletScreenLocators();

    public void importWalletFunction() throws InterruptedException, MalformedURLException {
        super.openApp();
        onboardingScreenLocatorsObject.importYourWalletButton().click();
        importWalletScreenLocatorsObject.enterWalletNameTextField().sendKeys(walletName);
        importWalletScreenLocatorsObject.nextButton().click();
        importWalletScreenLocatorsObject.enterRecoveryPhraseHereText().sendKeys(key);
        importWalletScreenLocatorsObject.nextButton().click();


        for (int i = 1; i < 5; i++) {
            wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='1']")));
            importWalletScreenLocatorsObject.pinDigitText1().click();
        }
        importWalletScreenLocatorsObject.nextButton().click();
        for (int i = 1; i < 5; i++) {
            Thread.sleep(500);
            importWalletScreenLocatorsObject.pinDigitText1().click();
        }
        Thread.sleep(1000);
        importWalletScreenLocatorsObject.noButton().click();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@class = 'android.widget.TextView' and @index = '1' and @text = 'Wallet']")).getText(), "Wallet");

    }
}
