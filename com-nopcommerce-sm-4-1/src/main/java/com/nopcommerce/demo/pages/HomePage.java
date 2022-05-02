package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By electronicFiled=By.linkText("Electronics");
    By computerFiled=By.linkText("Computers");
    By desktopFiled=By.linkText("Desktops");
    By cellPhoneField=By.xpath("//ul[@class=\"top-menu notmobile\"]/li[2]/child::ul//child::li[2]//child::a");
    By welcomeMessageField=By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By logOutField=By.xpath("//a[@class=\"ico-logout\"]");
    public String gettingTextFromElectronicField(){
        return  getTextFromElement(electronicFiled);
    }
    public void mouseHoverOnElectronicFiled(){
        mouseHoverToElement(electronicFiled);
    }
    public void clickOnCellPhonFiled(){
        clickOnElement(cellPhoneField);
    }
    public String getTextFromWelcomeToStoreField(){
        return getTextFromElement(welcomeMessageField);
    }
    public void clickOnLogOutField(){
        clickOnElement(logOutField);
    }
    //--------------computer---------
    public void mouseHoverOnComputer(){
        mouseHoverToElement(computerFiled);
    }
    public  void clickOnDesktop(){
        clickOnElement(desktopFiled);
    }

}
