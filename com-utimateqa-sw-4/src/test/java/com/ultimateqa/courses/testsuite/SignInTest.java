package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.SignInPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends TestBase {
    HomePage homePage= new HomePage();
    SignInPage signInPage= new SignInPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        homePage.clickOnSignInLink();
        String expactedText="Welcome Back!";
        String actualText= signInPage.gettextFromWlcField();
        Assert.assertEquals(actualText,expactedText,"veryfytext");
    }
    @Test
    public void verifyTheErrorMessage(){
        homePage.clickOnSignInLink();
        signInPage.enterUserNameField("kinju111@gmail.com");
        signInPage.enterPasswordField("12345");
        signInPage.clickOnSingInButton();
        String expactedText="Invalid email or password.";
        String actualText=signInPage.getTextForInvalidDataError();
        Assert.assertEquals(actualText,expactedText,"veridy text");

    }
}
