package htm.index.parabank.com.parasoft.parabank.testsuite;

import htm.index.parabank.com.parasoft.parabank.pages.AccountOverViewPage;
import htm.index.parabank.com.parasoft.parabank.pages.HomePage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorMessageTest extends TestBase {
    HomePage homePage = new HomePage();
    AccountOverViewPage accountOverViewPage = new AccountOverViewPage();

    @Test
    public void verifyTheErrorMessage() {
        //enter invalid user name and password
        homePage.enterUserName("abha");
        homePage.enterPassword("12345");
        homePage.clickOnLogInButton();
        //verifye error message
        String expactedMessage="The username and password could not be verified.";
        String actualMessage=accountOverViewPage.gettextFromErrorMessageField();
        Assert.assertEquals(actualMessage,expactedMessage,"verify Text");
    }
}