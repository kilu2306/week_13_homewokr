package com.nopcommerce.demo.pages.electronic;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    By welcomeSignInFiled=By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By registerTab=By.xpath("//a[contains(text(),'Register')]");

    public String GetTextFromWelcomeSignFeild(){
        return getTextFromElement(welcomeSignInFiled);
    }
    public void clickOnRegisterTab(){
        clickOnElement(registerTab);
    }
}
