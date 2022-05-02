package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductListTest extends TestBase {
    LoginPage loginPage= new LoginPage();
    ProductPage productPage= new ProductPage();
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        loginPage.enterName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        productPage.getListFromProductListField();
        int expactedText=6;
        int actualText=productPage.getListFromProductListField();
        Assert.assertEquals(actualText,expactedText,"verify product");

    }
}
