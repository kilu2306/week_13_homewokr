package com.nopcommerce.demo.pages.electronic;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By shoppingCartMessageField=By.xpath("//h1[contains(text(),'Shopping cart')]");
    By checkBox=By.xpath("//input[@id='termsofservice']");
    By checkoutfield=By.xpath("//button[@id='checkout']");
    public String getMessageFromShoppingCartFiled(){
        return getTextFromElement(shoppingCartMessageField);
    }
    public void clickOnCheckBox(){
        clickOnElement(checkBox);
    }
    public void clickOnCheckOutField(){
        clickOnElement(checkoutfield);
    }

    }


