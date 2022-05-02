package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utillity;
import org.openqa.selenium.By;

public class HomePage extends Utillity {
    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
    By computerField = By.linkText("Computers");
    By electronicField = By.linkText("Electronics");
    By apparelField = By.linkText("Apparel");
    By digitaDownload = By.linkText("Digital downloads");
    By books = By.linkText("Books");
    By jewelry = By.linkText("Jewelry");
    By giftCard = By.linkText("Gift Cards");

    public void clickOnComputer() {
        clickOnElement(computerField);
    }

    public String getTextForComputer() {
        return getTextFromElement(computerField);
    }

    public void clickOnElectronic() {
        clickOnElement(electronicField);
    }

    public String getTextFromElectronic() {
        return getTextFromElement(electronicField);
    }

    public void clickOnAppearl() {
        clickOnElement(apparelField);
    }

    public String gettextFromAppearl() {
        return getTextFromElement(apparelField);
    }

    public void clickOnDigitalDownLoad() {
        clickOnElement(digitaDownload);
    }

    public String getTextFromDigitalDownload() {
        return getTextFromElement(digitaDownload);
    }

    public void clickOnBooks() {
        clickOnElement(books);
    }
    public String getTextFromBook(){
        return getTextFromElement(books);
    }
    public void clickOnJewelry(){
        clickOnElement(jewelry);
    }
    public String getTextFromjewelry(){
        return getTextFromElement(jewelry);
    }
    public void clickOnGiftCard(){
        clickOnElement(giftCard);
    }
    public String getTextFromGiftCard(){
        return getTextFromElement(giftCard);
    }
}

