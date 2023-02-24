package AnCrypto.Tests.walletScreenTests;

import AnCrypto.Helpers.BaseClass;
import AnCrypto.PageObjects.walletScreenLocators;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class walletScreenTestCasesBuy extends BaseClass {
    walletScreenLocators walletScreenLocatorsObject = new walletScreenLocators();
    @BeforeMethod
    public void testSetup() throws MalformedURLException, InterruptedException {
        super.openApp();
    }
    @AfterMethod
    public void testCleanup(){
        driver.quit();
    }
    @Test
    public void walletScreenTestsBuyCheckPoweredByONMETA(){
        walletScreenLocatorsObject.walletScreenBuyButton().click();

        Assert.assertEquals(walletScreenLocatorsObject.powerByOnmetaText().getText(), "onmeta logo");
    }

}
