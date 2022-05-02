package com.nopcommerce.demo.pages.electronic;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class OrderComplitedPage extends Utility {
    By thankYouMessField=By.xpath("//h1[contains(text(),'Thank you')]");
    By orderComplitedField=By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueButton=By.xpath("//button[contains(text(),'Continue')]");
    public String getTextFromThankYouField(){
        return getTextFromElement(thankYouMessField);
    } public String getTextFromOrderComplitedFiedl(){
        return getTextFromElement(orderComplitedField);
    }
    public  void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}
