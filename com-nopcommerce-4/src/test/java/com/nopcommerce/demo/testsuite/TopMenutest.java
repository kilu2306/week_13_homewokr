package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenutest extends TestBase {
    HomePage homePage= new HomePage();
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        homePage.clickOnComputer();
        String expactedText ="Computers";
        String actualText=homePage.getTextForComputer();
        Assert.assertEquals(actualText,expactedText,"displayed message");
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        homePage.clickOnElectronic();
        String expactedText="Electronics";
        String actualText =homePage.getTextFromElectronic();
        Assert.assertEquals(actualText,expactedText,"verify text ");

    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        homePage.clickOnAppearl();
        String expactedText="Apparel";
        String actualText=homePage.gettextFromAppearl();
        Assert.assertEquals(actualText,expactedText,"displayed message");
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        homePage.clickOnDigitalDownLoad();
        String expactedText="Digital downloads";
        String actualText=homePage.getTextFromDigitalDownload();
        Assert.assertEquals(actualText,expactedText,"displayed message");
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        homePage.clickOnBooks();
        String expactedText="Books";
        String actualText=homePage.getTextFromBook();
        Assert.assertEquals(actualText,expactedText,"displayed message");
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        homePage.clickOnJewelry();
        String expactedText="Jewelry";
        String actualtext=homePage.getTextFromjewelry();
        Assert.assertEquals(actualtext,expactedText,"displayed message" );
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        homePage.clickOnGiftCard();
        String expactedText="Gift Cards";
        String actualText= homePage.getTextFromGiftCard();
        Assert.assertEquals(actualText,expactedText,"displayed message");
    }




    }
