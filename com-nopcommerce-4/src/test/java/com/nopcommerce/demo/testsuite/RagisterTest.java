package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RagisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RagisterTest extends TestBase {
    HomePage homePage = new HomePage();
    RagisterPage ragisterPage = new RagisterPage();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        homePage.clickOnRegisterLink();
        String expactedText = "Register";
        String actualtext = ragisterPage.getTextFromRegister();
        Assert.assertEquals(actualtext, expactedText, "invalid dislpayed msg");
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        homePage.clickOnRegisterLink();
        ragisterPage.clickOnFemaleGender();
        ragisterPage.enterInFirstNameField("dhyani");
        ragisterPage.enterLastNameField("patel");
        ragisterPage.selectDateOfBirth("10");
        ragisterPage.selectDateOfMonth("May");
        ragisterPage.selectYear("1988");
        ragisterPage.enterEmail("dhyani222@gmail.com");
        ragisterPage.enterPassword("prime1234");
        ragisterPage.enterConfirmPassword("prime1234");
        ragisterPage.clickOnregisterButton();
        String expactedText="Your registration completed";
        String actualText= ragisterPage.getRegistrationMessage();


        Assert.assertEquals(actualText,expactedText,"displayed invalid message");
    }
}


