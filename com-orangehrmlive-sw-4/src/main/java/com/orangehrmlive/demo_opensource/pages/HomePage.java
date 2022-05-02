package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By userNameField = By.name("txtUsername");
    By passWordField = By.name("txtPassword");
    By loginButton = By.id("btnLogin");
    By welcomeTextField = By.id("welcome");
    By forgotPassword= By.linkText("Forgot your password?");

    public void enterUserNameField(String username) {
        sendTextToElement(userNameField, username);
    }

    public void enterPasswordField(String password) {
        sendTextToElement(passWordField, password);
    }

    public void clickOnLogInButton() {
        clickOnElement(loginButton);
    }

    public String getTextFromWelcomeField() {
        return getTextFromElement(welcomeTextField);
    }
    public void clickOnforgotPassword(){
        clickOnElement(forgotPassword);
    }
}
