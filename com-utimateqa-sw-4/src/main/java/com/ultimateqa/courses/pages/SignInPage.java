package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {
    By wlcTextField= By.xpath("//h1[@class='page__heading']");
    By userNameFiled=By.id("user[email]");
    By passWordFiled=By.id("user[password]");
    By signInButton=By.xpath("//input[@type='submit']");
    By invalidDataError=By.xpath("//li[@class='form-error__list-item' or role='alert']");




    public String gettextFromWlcField(){
        return getTextFromElement(wlcTextField);
    }
    public String getTextForInvalidDataError(){
        return getTextFromElement(invalidDataError);
    }
    public void enterUserNameField(String name){
        sendTextToElement(userNameFiled,name);
    }
    public void enterPasswordField(String password){
        sendTextToElement(passWordFiled,password);
    }
    public void clickOnSingInButton(){
        clickOnElement(signInButton);
    }
}
