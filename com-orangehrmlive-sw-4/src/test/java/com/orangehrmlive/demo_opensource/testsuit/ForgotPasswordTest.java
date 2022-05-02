package com.orangehrmlive.demo_opensource.testsuit;

import com.orangehrmlive.demo_opensource.pages.Forgotpassword;
import com.orangehrmlive.demo_opensource.pages.HomePage;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase {
    HomePage homePage= new HomePage();
    Forgotpassword forgotpassword=new Forgotpassword();
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        homePage.clickOnforgotPassword();
        String expactedTest="Forgot Your Password?";
        String actualText= forgotpassword.getTextfromForgotPassword();
        Assert.assertEquals(actualText,expactedTest,"displayed message");
    }
}
