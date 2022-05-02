package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginpage = new LoginPage();
    ProductPage productPage= new ProductPage();
    @Test
    public void  userSholdLoginSuccessfullyWithValid(){
        loginpage.enterName("standard_user");
        loginpage.enterPassword("secret_sauce");
        loginpage.clickOnLoginButton();
        String expactedtext="PRODUCTS";
        String actualText=productPage.getTextFromProductFiled();
        Assert.assertEquals(actualText,expactedtext,"displayed text");

    }
}
