package com.nopcommerce.demo.pages.computer;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ConfirmOrderpage extends Utility {
    By paymentmethodfield=By.xpath("//span[contains(text(),'Credit Card')]");
    By shippingMethodFiedl=By.xpath("//span[contains(text(),'Shipping Method:')]");
    By total=By.xpath("//span[@class=\"value-summary\"]/child::strong");
   By confirm=By.xpath("//button[contains(text(),'Confirm')]");
    public String getPaymentMethodName(){
        return  getTextFromElement(paymentmethodfield);
    }public String getShippingMethodName(){
        return  getTextFromElement(shippingMethodFiedl);
    }
    public String gettinTotal(){
        return  getTextFromElement(total);
    }
    public void clickOnConfirm(){
        clickOnElement(confirm);
    }

}
