package htm.index.parabank.com.parasoft.parabank.testsuite;

import htm.index.parabank.com.parasoft.parabank.pages.HomePage;
import htm.index.parabank.com.parasoft.parabank.pages.RegisterPage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    HomePage homePage=new HomePage();
    RegisterPage registerPage=new RegisterPage();
    @Test
    //1.verifyThatSigningUpPageDisplay
    public void signingUpPageDisplay(){
        homePage.clickOnRegisterLink();
        //verify message
        String expactedMessage="Signing up is easy!";
        String actualMessage=registerPage.getTextFromSignUpMessage();
        Assert.assertEquals(actualMessage,expactedMessage,"verify text");
    }
    @Test
    public void userSholdRegisterAccountSuccessfully() {
        homePage.clickOnRegisterLink();
        registerPage.enterFirstName("dhyani");
        registerPage.enterLastName("patel");
        registerPage.enterAdress("6 ramnager");
        registerPage.enterCity("surat");
        registerPage.enterState("south youkshire");
        registerPage.enterZipCode("2334");
        registerPage.enterphonnumber("234564892");
        registerPage.enterSsn("334");
        registerPage.enterUserName("abha");
        registerPage.enterPssword("prime123");
        registerPage.enterrepeatedPssword("prime123");
        registerPage.clickOnRegister();
        //verify message
        String expactedMessage2="Your account was created successfully. You are now logged in.";
        String actualMessage2=registerPage.getTextFromRegSuccessFullMessage();
        Assert.assertEquals(actualMessage2,expactedMessage2,"verify text");
    }


    }
