package com.nopcommerce.demo.pages.electronic;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShippingMethodPage extends Utility {
    By _2nddayshippingMehod=By.xpath("//input[@id='paymentmethod_1']");
    By continueButton=By.xpath("//div[@id=\"shipping-method-buttons-container\"]/descendant::button");
    public void clickOn2DayShippingMehod(){
        clickOnElement(_2nddayshippingMehod);
    }
    public  void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}
