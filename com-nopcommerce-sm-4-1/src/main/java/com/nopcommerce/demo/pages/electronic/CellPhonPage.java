package com.nopcommerce.demo.pages.electronic;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CellPhonPage extends Utility {
    By cellPhonFiled=By.xpath("//h1[contains(text(),'Cell phones')]");
    By listTab=By.xpath("//a[contains(text(),'List')]");
    By nokiaLumiaFiled=By.xpath("//a[contains(text(),'Nokia Lumia 1020')]");
    public String gettingTextFromCellPhonField(){
        return getTextFromElement(cellPhonFiled);
    }
    public void clickOnListTab(){
        clickOnElement(listTab);
    }
    public void clickOnNokiaLumiaField(){
        clickOnElement(nokiaLumiaFiled);
    }
}
