package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {
    By prodcutTextFiled=By.xpath("//span[@class='title']");
    By productListField=(By.className("inventory_item_name"));
    public String getTextFromProductFiled(){
        return getTextFromElement(prodcutTextFiled);
    }
    public int getListFromProductListField(){
         return listProdcutNumber(productListField);
    }

}
