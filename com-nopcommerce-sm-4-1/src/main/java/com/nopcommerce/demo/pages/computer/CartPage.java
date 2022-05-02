package com.nopcommerce.demo.pages.computer;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CartPage extends Utility {
    By shoppingCartField = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By updatecartButton = By.xpath("//button[@id='updatecart']");
    By totalPriceField = By.xpath("//tr[@class=\"order-total\"]/child::td//following::td/child::span");
    By checkBox=By.xpath("//input[@id=\"termsofservice\"]");
   By checkOut=By.xpath("//button[@id='checkout']");
    public String gettextFromShoppingCartFeild() {
        return getTextFromElement(shoppingCartField);
    }

    public void clickOnUpdateCartButton() {
        clickOnElement(updatecartButton);
    }
    public String gettextfromTotalPriceField(){
        return getTextFromElement(totalPriceField);
    }
    public void clickOnCheckBox(){
        clickOnElement(checkBox);
    }
    public void clickOnCheckOut(){
        clickOnElement(checkOut);
    }

}
