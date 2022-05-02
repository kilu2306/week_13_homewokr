package com.nopcommerce.demo.pages.computer;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DeskTopFPage  extends Utility {
    By dropDownField=By.xpath("//select[@id='products-orderby']");
    By buildOwnComputerImage=By.xpath("//div[@class=\"picture\"]/descendant::img[@alt='Picture of Build your own computer']");
    By addCartField=By.xpath("//div[@class=\"buttons\"]/child::button");
    By deskTopProductPricelist=By.xpath("//div[@class='item-box']/child::div/descendant::span");
    By productDropDownMenu=By.xpath("//select[@id='products-orderby']");
    public void selectFilter(String fname){
        selectByVisibleTextFromDropDown(dropDownField,fname);
    }
    public void mouseHovertoBuildComputerImage(){
        mouseHoverToElement(buildOwnComputerImage);
    }
    public  void clickOnAddCart(){
        clickOnElement(addCartField);
    }
    public List<Double> getTheListOfProductPrice(){
        List<WebElement> beforepricelists = driver.findElements(deskTopProductPricelist);
        //create the list object
        List<String> beforFilterprodcutprice = new ArrayList<>();
        //remove $ sign and add the shortpricelist
        //add all web element value to list object
        for (WebElement value : beforepricelists) {
            beforFilterprodcutprice.add(String.valueOf(value.getText().replace("$", "")));
        }
        //converting in double for price
        List<Double> beforFilterprodcutprice1 = new ArrayList<>();
        //removing$ from price and storing in double datatype
        for (String value : beforFilterprodcutprice ) {
            beforFilterprodcutprice1.add(Double.valueOf(value.replace(",", "")));
        }
        return beforFilterprodcutprice1;
    }
public void selectDropDownMenu(String name){
        selectByVisibleTextFromDropDown(productDropDownMenu,name);
}

}
