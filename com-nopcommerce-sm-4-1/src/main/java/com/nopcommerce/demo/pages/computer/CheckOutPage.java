package com.nopcommerce.demo.pages.computer;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    By welcomeMessageField=By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
   By guestRegField=By.xpath("//strong[contains(text(),'Checkout as a guest or register')]");
    public  String getTextFromWelcomeField(){
       return getTextFromElement(welcomeMessageField);
   }
   public void clickOnRegisterAsGuest(){
        clickOnElement(guestRegField);
   }
}

