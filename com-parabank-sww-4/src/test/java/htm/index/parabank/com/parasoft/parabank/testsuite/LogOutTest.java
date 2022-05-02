package htm.index.parabank.com.parasoft.parabank.testsuite;

import htm.index.parabank.com.parasoft.parabank.pages.AccountOverViewPage;
import htm.index.parabank.com.parasoft.parabank.pages.HomePage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogOutTest extends TestBase {
    HomePage homePage = new HomePage();
    AccountOverViewPage accountOverViewPage = new AccountOverViewPage();

    @Test
    public void userShouldLogOutSuccessfully() {
        //Enter valid username
        homePage.enterUserName("abha");
        homePage.enterPassword("12345");
        homePage.clickOnLogInButton();
        accountOverViewPage.clickOnLogOut();
        //verify customerlogin
        String expactedMessage1="Customer Login";
        String actualMessage1=homePage.getTextFromCustomerLoginField();
        Assert.assertEquals(actualMessage1,expactedMessage1,"verify text");
    }
}