package com.nopcommerce.demo.testsuits;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.computer.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class ComputerTest extends TestBase {
    HomePage homePage=new HomePage();
    DeskTopFPage deskTopFPage= new DeskTopFPage();
    BulidMyOwnComputerPage bulidMyOwnComputerPage= new BulidMyOwnComputerPage();
    CartPage cartPage= new CartPage();
    CheckOutPage checkOutPage= new CheckOutPage();
    BillingAdressPage billingAdressPage= new BillingAdressPage();
    ShippingMethodPage shippingMethodPage= new ShippingMethodPage();
    PaymentMethodPage paymentMethodPage= new PaymentMethodPage();
    PaymentInfoPage paymentInfoPage= new PaymentInfoPage();
    ConfirmOrderpage confirmOrderpage= new ConfirmOrderpage();
    OrderComplietPage orderComplietPage= new OrderComplietPage();
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.mouseHoverOnComputer();
        homePage.clickOnDesktop();

        deskTopFPage.mouseHovertoBuildComputerImage();
        deskTopFPage.clickOnAddCart();
      // Verify the Text "Build your own computer"
        String expactedText="Build your own computer";
        String actualText= bulidMyOwnComputerPage.getTextFromBuildMyOwnNameField();
        Assert.assertEquals(actualText,expactedText,"verify text");
       // Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
       bulidMyOwnComputerPage.selectProcesser("2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]");
     //Select "8GB [+$60.00]" using Select class.
        bulidMyOwnComputerPage.selectRam("8GB [+$60.00]");
        //Select HDD radio "400 GB [+$100.00]"
        bulidMyOwnComputerPage.clickOnHddRadioButton();
        //Select OS radio "Vista Premium [+$60.00]"
        bulidMyOwnComputerPage.clickOsRadioButton();
        // Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        bulidMyOwnComputerPage.ClickOnTotalCommander();
        //verify price
        Thread.sleep(2000);
        String expactedPrice="$1,480.00";
        String actualPrice=bulidMyOwnComputerPage.getTextFromPriceFiled();
        Assert.assertEquals(actualPrice,expactedPrice,"verify text");
        //Click on "ADD TO CARD" Button.
        bulidMyOwnComputerPage.clickOnAddCartButton();
        //verify message
        String expactedmessage= "The product has been added to your shopping cart";
        String actualMessage=bulidMyOwnComputerPage.gettextFromProductAddedField();
        Assert.assertEquals(actualMessage,expactedmessage,"verify Text");
        //close popup
        bulidMyOwnComputerPage.clickOnCloseButton();
        bulidMyOwnComputerPage.mouseHoverOnShoppingCart();
        bulidMyOwnComputerPage.clickOnGoCart();
        Thread.sleep(2000);
        //	Verify the message "Shopping cart"
        String expactedtext1="Shopping cart";
        String actualText1=cartPage.gettextFromShoppingCartFeild();
        Assert.assertEquals(actualText1,expactedtext1,"verify text");
        //Change the Qty to "2" and Click on "Update shopping cart"
        Thread.sleep(5000);
        WebElement quantity = driver.findElement(By.xpath("//td[@class=\"quantity\"]/child::input"));
        quantity.clear();
        quantity.sendKeys("2");
        cartPage.clickOnUpdateCartButton();
        // Verify the Total"$2,950.00"
        String expactedTotal="$2,960.00";
        String actualTotal=cartPage.gettextfromTotalPriceField();
        Assert.assertEquals(actualTotal,expactedTotal,"verify total");
        // click on checkbox “I agree with the terms of service”
        cartPage.clickOnCheckBox();
        // Click on “CHECKOUT”
        cartPage.clickOnCheckOut();
        //verify msg
        String expactedWMessage="Welcome, Please Sign In!";
        String actualWMessage=checkOutPage.getTextFromWelcomeField();
        Assert.assertEquals(actualWMessage,expactedWMessage,"verify text ");
        //Click on “CHECKOUT AS GUEST” Tab
        Thread.sleep(3000);
        checkOutPage.clickOnRegisterAsGuest();
       // Fill the all mandatory field
      billingAdressPage.enterfirstName("dhyani");
      billingAdressPage.enterLastName("patel");
      billingAdressPage.enterEmail("dhyani888@gmail.com");
      billingAdressPage.selectCountry("India");
      billingAdressPage.selectState("Alabama");
      billingAdressPage.enterCity("gujrat");
      billingAdressPage.enterAddress("34 ramnagar");
      billingAdressPage.enterCode("2345");
      billingAdressPage.enterPhonnumber("3456784356");
      Thread.sleep(2000);
      billingAdressPage.clickOnContinue();
      //selecting shipping method for next day
        shippingMethodPage.clickOnNextDayButton();
        shippingMethodPage.clickOnContinue();
      //Select Radio Button “Credit Card”
        paymentMethodPage.clickOnCreditCard();
        //paymnet info
        paymentInfoPage.selectCardType("MasterCard");
        paymentInfoPage.enterName("kinjal");
        paymentInfoPage.enterCardNumber("555555576879556");
        paymentInfoPage.selectenterExpiryMonth("10");
        paymentInfoPage.selectenterExpiryYear("2067");
        paymentInfoPage.enterCode("678");
        //verify payment method
        String actualMethod=confirmOrderpage.getPaymentMethodName();
        String ecpactedMethod="Payment Method: Credit Card";
        Assert.assertEquals(actualMethod,ecpactedMethod,"verify text ");
        //verify shipping method
        String actualShiping =confirmOrderpage.getShippingMethodName();
         String expactedShipping =   "Shipping Method:Next Day Air" ;
        Assert.assertEquals(actualShiping,expactedShipping,"verify text");
        //Verify Total is “$2,950.00”
        String expactedTotal1="$2,950.00";
        String actualTotal1= confirmOrderpage.gettinTotal();
        Assert.assertEquals(actualTotal1,expactedTotal1,"verify total");
        confirmOrderpage.clickOnConfirm();
        //verify thank you text
        String actualThankYouText=orderComplietPage.getTextFromThankYouField();
        String expactedThankYouText="Thank you";
        Assert.assertEquals(actualThankYouText,expactedThankYouText,"verify text");
        //
        String actualText3=orderComplietPage.getTextFromOrderComplitField();
        String expactedtext3="Your order has been successfully processed!";
        Assert.assertEquals(actualText3,expactedtext3,"verify text");
        //click on continue
        orderComplietPage.clickOnContinue();
        //very fy welcome to the store
        String actualWelcomeMessage=homePage.getTextFromWelcomeToStoreField();
        String expactedWelcomeMessage="Welcome to our store";
        Assert.assertEquals(actualWelcomeMessage,expactedWelcomeMessage,"verify text");
    }
    @Test
    public void verifyFilterLowToHigh() throws InterruptedException {
        homePage.mouseHoverOnComputer();
        homePage.clickOnDesktop();
        //get the list before filtering price low to high
        List<Double> expectedProductPriceList = deskTopFPage.getTheListOfProductPrice();
        Collections.sort(expectedProductPriceList);
        //2.3 click on low to high
        deskTopFPage.selectDropDownMenu("Price: Low to High");
        Thread.sleep(3000);
        List<Double> actualProductPriceList = deskTopFPage.getTheListOfProductPrice();
        Assert.assertEquals(expectedProductPriceList,actualProductPriceList);



    }

    }
