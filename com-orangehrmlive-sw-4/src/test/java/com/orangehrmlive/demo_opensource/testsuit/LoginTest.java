package com.orangehrmlive.demo_opensource.testsuit;

import com.orangehrmlive.demo_opensource.pages.HomePage;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        homePage.enterUserNameField("Admin");
        homePage.enterPasswordField("admin123");
        homePage.clickOnLogInButton();
        String expactedText="Welcome";
        String actualText = homePage.getTextFromWelcomeField().substring(0,7);
        Assert.assertEquals(actualText,expactedText,"displayed message");
    }

}
