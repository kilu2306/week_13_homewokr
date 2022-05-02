package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homepage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateLoginPageSuccessfully() {
        homepage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        String actualtext= loginPage.getWelcomeText();
        Assert.assertEquals(actualtext,expectedText,"invalid display welcome  message ");

    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        homepage.clickOnLoginLink();
        loginPage.enterEmailId("dhyani222@gmail.com");
        loginPage.enterPassword("prime1234");
        loginPage.clickOnLoginButton();
        String expactedText="Log out";
        String actualText=loginPage.getTextFromLogOutField();
        Assert.assertEquals(actualText,expactedText,"displayed invalid messsage");

    }
    @Test
    public void verifyTheErrorMessage(){
        homepage.clickOnLoginLink();
        loginPage.enterEmailId("dhyani67@gmail.com");
        loginPage.enterPassword("prime1234");
        loginPage.clickOnLoginButton();

        String expactedtext="Login was unsuccessful. Please correct the errors and try again.\n" + "No customer account found";
        String actualtext= loginPage.getErrorMessageByInvalidData();
        Assert.assertEquals(actualtext,expactedtext,"error message not displayed");
    }

    }
