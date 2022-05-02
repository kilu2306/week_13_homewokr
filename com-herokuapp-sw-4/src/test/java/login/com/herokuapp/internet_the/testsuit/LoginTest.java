package login.com.herokuapp.internet_the.testsuit;

import login.com.herokuapp.internet_the.pages.LoginPage;
import login.com.herokuapp.internet_the.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyTheUsernameErrorMessage() {
        loginPage.enterUsername("tomsmith1");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expactedResult = "Your username is invalid!";
        String actualResult = loginPage.gettingErrorMessage();
        Assert.assertEquals( actualResult,expactedResult,"error message is not displayed");
    }
    @Test
    public void verifyThePasswordErrorMessag(){
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expactedResult = "Your password is invalid!";
        String actualResult = loginPage.gettingErrorMessage();
       Assert.assertEquals(actualResult,expactedResult,"errormsg not displayed");

    }
}
