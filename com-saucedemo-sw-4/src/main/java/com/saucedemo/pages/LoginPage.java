package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userNameFiled = By.name("user-name");
    By passWordFiled=By.name("password");
    By loginButton =By.name("login-button");
    public void enterName(String name ){
    sendTextToElement(userNameFiled,name);
}
   public void enterPassword(String password){
        sendTextToElement(passWordFiled,password);
   }
   public void clickOnLoginButton(){
        clickOnElement(loginButton);
   }

}
