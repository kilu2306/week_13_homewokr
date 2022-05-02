package com.nopcommerce.demo.pages.computer;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BulidMyOwnComputerPage extends Utility {
    By buildMyOwnNameField = By.linkText("Build your own computer");
    By processerDropDown = By.xpath("//select[@id='product_attribute_1']");
    By ramDropDown = By.xpath("//select[@id='product_attribute_2']");
    By hddRadioButton = By.id("product_attribute_3_7");
    By osRadioButton = By.id("product_attribute_4_8");
    By totalCommander = By.id("product_attribute_5_12");
    By priceField = By.xpath("//span[@id='price-value-1']");
    By addCartButton=By.xpath("//button[@id='add-to-cart-button-1']");
    By productAddedMessage=By.xpath("//p[@class=\"content\"]");
    By closePopupFiled=By.xpath("//p[@class=\"content\"]/following-sibling::span");
    By shoppingCart=By.xpath("//span[contains(text(),'Shopping cart')]");
   By goCartFiled=By.xpath("//button[contains(text(),'Go to cart')]");

   public String getTextFromBuildMyOwnNameField() {
        return getTextFromElement(buildMyOwnNameField);
    }

    public void selectProcesser(String name) {
        selectByVisibleTextFromDropDown(processerDropDown, name);
    }

    public void selectRam(String name) {
        selectByVisibleTextFromDropDown(ramDropDown, name);

    }

    public void clickOnHddRadioButton() {
        clickOnElement(hddRadioButton);
    }

    public void clickOsRadioButton() {
        clickOnElement(osRadioButton);
    }

    public void ClickOnTotalCommander() {
        clickOnElement(totalCommander);
    }

    public String getTextFromPriceFiled() {

        return getTextFromElement(priceField);
    }
    public  void clickOnAddCartButton(){
        clickOnElement(addCartButton);
    }
    public  String gettextFromProductAddedField(){
        return getTextFromElement(productAddedMessage);
    }
    public  void clickOnCloseButton(){
        clickOnElement(closePopupFiled);
    }
    public void mouseHoverOnShoppingCart(){
        mouseHoverToElement(shoppingCart);
    }
    public void clickOnGoCart(){
        clickOnElement(goCartFiled);
    }


}
