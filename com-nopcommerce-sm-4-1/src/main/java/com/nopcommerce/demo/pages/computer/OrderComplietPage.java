package com.nopcommerce.demo.pages.computer;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class OrderComplietPage extends Utility {
    By thankYouFiled=By.xpath("//h1[contains(text(),'Thank you')]");
    By orderComplitMessageField=By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueButton=By.xpath("//button[contains(text(),'Continue')]");
    public  String getTextFromThankYouField(){
        return getTextFromElement(thankYouFiled);
    }public  String getTextFromOrderComplitField(){
        return getTextFromElement(orderComplitMessageField);
    }public void clickOnContinue(){
        clickOnElement(continueButton);
    }
}
