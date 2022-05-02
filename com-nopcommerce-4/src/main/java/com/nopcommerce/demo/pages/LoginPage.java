package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utillity;
import org.openqa.selenium.By;

public class LoginPage extends Utillity {
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By emailField = By.id("Email");
    By passwordField = By.name("Password");
    By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");
    By logOut = By.linkText("Log out");
    By invalidDataErrorMessage= By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]");

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);

    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }
    public String getTextFromLogOutField() {
        return getTextFromElement(logOut);
    }
    public String getErrorMessageByInvalidData(){
        return  getTextFromElement(invalidDataErrorMessage);
    }

}
