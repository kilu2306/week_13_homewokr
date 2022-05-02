package com.nopcommerce.demo.testsuits;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.electronic.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CellPhoneTest extends TestBase {
    HomePage homePage = new HomePage();
    CellPhonPage cellPhonPage = new CellPhonPage();
    NokiaLumiaPage nokiaLumiaPage = new NokiaLumiaPage();
    ShoppingCartPage shoppingCartPage= new ShoppingCartPage();
    CheckOutPage checkOutPage=new CheckOutPage();
    CheckoutRegPage checkoutRegPage= new CheckoutRegPage();
    SuccessfulRegPage successfulRegPage=new SuccessfulRegPage();
    FinalShopingCartPage finalShopingCartPage= new FinalShopingCartPage();
    BillingAdressPage billingAdressPage= new BillingAdressPage();
    ShippingMethodPage shippingMethodPage= new ShippingMethodPage();
    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
    PayMentInfoPage payMentInfoPage= new PayMentInfoPage();
    ConfirmOrderPage confirmOrderPage= new ConfirmOrderPage();
    OrderComplitedPage orderComplitedPage= new OrderComplitedPage();
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnElectronicFiled();
        homePage.clickOnCellPhonFiled();
        //verify text
        String expactedText = "Cell phones";
        String actualtext = cellPhonPage.gettingTextFromCellPhonField();
        Assert.assertEquals(actualtext, expactedText, "verify text");
        //clickon listtab
        cellPhonPage.clickOnListTab();
        //click on nokia Lumia Field
        Thread.sleep(2000);
        cellPhonPage.clickOnNokiaLumiaField();
        //verify prodct name text
        String expactedTex = "Nokia Lumia 1020";
        String actualText = nokiaLumiaPage.gettextFromNokiaLumiaField();
        Assert.assertEquals(actualText, expactedTex, "verify text");
        //verify price#
        String expactedPrice = "$349.00";
        String actualprice = nokiaLumiaPage.gettextFromPrice();
        Assert.assertEquals(actualprice, expactedPrice, "verify Price");
        //2.8 Change quantity to 2

        WebElement element = driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']"));
        element.clear();
        element.sendKeys("2");
        Thread.sleep(3000);
        //click on add to cart feild
        nokiaLumiaPage.clickOnAddToCartField();

        //verify message added in cart field
        String expactedMEssage = "The product has been added to your shopping cart";
        String actualMessage = nokiaLumiaPage.getTextFromAddedCardFieldMessage();
        Assert.assertEquals(actualMessage, expactedMEssage, "verify text");
// click on close bar
        nokiaLumiaPage.clickOnCloseBarField();
        Thread.sleep(3000);
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        nokiaLumiaPage.mouseHoverOnShoppingCart();
        nokiaLumiaPage.clickOnGoToCartButton();
        // 2.12 Verify the message "Shopping cart"
        String expactedText1="Shopping cart";
        String actaulText1=shoppingCartPage.getMessageFromShoppingCartFiled();
        Assert.assertEquals(actaulText1,expactedText1,"verify Text");
        //click on checkbox
        shoppingCartPage.clickOnCheckBox();
      // Click on checkout
        shoppingCartPage.clickOnCheckOutField();
        //verify welcomesignText
        String expactedMessage="Welcome, Please Sign In!";
        String actualMessge=checkOutPage.GetTextFromWelcomeSignFeild();
        Assert.assertEquals(actualMessge,expactedMessage,"verify text");
        //click on register tab
        checkOutPage.clickOnRegisterTab();
        //verify text
        String expactedRegText="Register";
        String actualtRegText=checkoutRegPage.gettextFromRegisterFeidl();
        Assert.assertEquals(actualtRegText,expactedRegText,"verify text");
        // 2.20 Fill the mandatory fields
        checkoutRegPage.enterFirstName("dhyani");
        checkoutRegPage.enterLastName("patel");
        checkoutRegPage.enterEmail("prime111@gmail.com");
        checkoutRegPage.enterPassword("prime123");
        checkoutRegPage.enterConfirmPassword("prime123");
        Thread.sleep(3000);
        checkoutRegPage.clickOnregButton();
        //verify successful register text
        String excpactedMessage="Your registration completed";
        String actualMessage1=successfulRegPage.getTextFromRegisterMessageField();
        Assert.assertEquals(actualMessage1,excpactedMessage,"verify text");
       //click on continue button
        successfulRegPage.clickOnContinueButton();
        //verify text
        String expactedShopingCartText="Shopping cart";
        String actualShoppingCartText=finalShopingCartPage.gettextFromShopingCArtField();
        Assert.assertEquals(actualShoppingCartText,expactedShopingCartText,"verify text ");
       //click on check box
        finalShopingCartPage.clickOnCheckBox();
        finalShopingCartPage.clickOnContinue();
        //fill the mendotery detail
        billingAdressPage.enterFirstName("dhyani");
        billingAdressPage.enterFirstName("patel");
        billingAdressPage.enterCountry("india");
        billingAdressPage.enterCity("surat");
        billingAdressPage.enteraddress("6 london road");
        billingAdressPage.enterState("gujrat");
        billingAdressPage.enterZipCode("12344");
        billingAdressPage.enterPhonNumber("0996878636");
        billingAdressPage.clickOnContinueButton();
        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        Thread.sleep(2000);
        shippingMethodPage.clickOn2DayShippingMehod();
        shippingMethodPage.clickOnContinueButton();
        paymentMethodPage.clickOnCreditCard();
        paymentMethodPage.clickOnConinueButton();
        //sleect visa card
        payMentInfoPage.selectCard("Visa");
        payMentInfoPage.enterCardNumber("4111111111111111");
        payMentInfoPage.selectExpiryMonth("06");
        payMentInfoPage.selectExpiryYear("2025");
        payMentInfoPage.enterCode("2344");
        payMentInfoPage.clickOnContiNueButton();
       // Verify “Payment Method” is “Credit Card”
        String actualCardText=confirmOrderPage.gettextFromCardNameField();
        String expactedCardText="Credit Card";
        Assert.assertEquals(actualCardText,expactedCardText,"verify text ");
       //Verify Total is “$698.00”
        String expactedTotalPayment="$698.00";
        String actualTotalPayment=confirmOrderPage.getTextFromTotalPayment();
        Assert.assertEquals(actualTotalPayment,expactedTotalPayment,"verify Text");
       // click on confirm
        confirmOrderPage.clickOnConfirmButton();
        //Verify the Text “Thank You”
        String expactedThankYouMessage="Thank you";
        String actualThankYouMessage=orderComplitedPage.getTextFromThankYouField();
        Assert.assertEquals(actualThankYouMessage,expactedThankYouMessage,"verify text");
        //Verify the message “Your order has been successfully processed!”
        String expactedMessage2="Your order has been successfully processed!";
        String actualMessage2=orderComplitedPage.getTextFromOrderComplitedFiedl();
        Assert.assertEquals(actualMessage2,expactedMessage2,"verify text");
      orderComplitedPage.clickOnContinueButton();
      // Verify the text “Welcome to our store”
        String expactedMess="Welcome to our store";
        String actualMess=homePage.getTextFromWelcomeToStoreField();
        Assert.assertEquals(actualMess,expactedMess,"verify text");
        //click on log out
        homePage.clickOnLogOutField();
        //Verify the URL is “https://demo.nopcommerce.com/”
        String url=driver.getCurrentUrl();
        Assert.assertEquals(url,"https://demo.nopcommerce.com/","verify url");







    }
}