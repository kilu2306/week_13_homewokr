package htm.index.parabank.com.parasoft.parabank.testsuite;

import htm.index.parabank.com.parasoft.parabank.pages.AccountOverViewPage;
import htm.index.parabank.com.parasoft.parabank.pages.HomePage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends TestBase {
    HomePage homePage = new HomePage();
    AccountOverViewPage accountOverViewPage = new AccountOverViewPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        homePage.enterUserName("abha");
        homePage.enterPassword("12345");
        homePage.clickOnLogInButton();
        //verify message
        String actualtext=accountOverViewPage.getTextFromAccountOverViewField();
        String expactedText="Accounts Overview";
        Assert.assertEquals(actualtext,expactedText,"verify text");

    }
}