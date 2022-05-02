package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class Forgotpassword extends Utility {
    By forgotPasswordMessage =By.xpath("//h1[contains(text(),'Forgot Your Password?')]");
     public String getTextfromForgotPassword(){
         return getTextFromElement(forgotPasswordMessage);
     }
}
