package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utillity;
import org.openqa.selenium.By;

public class RagisterPage extends Utillity {
    By registerLink = By.linkText("Register");
    By radioButton = By.id("gender-female");
    By firstNameFiled = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By birthDayFiled = By.name("DateOfBirthDay");
    By birthMonthFiled = By.name("DateOfBirthMonth");
    By birthYear = By.name("DateOfBirthYear");
    By passwordfield = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerationButton = By.id("register-button");
    By emailField= By.id("Email");
    By registerMessage=By.xpath("//div[@class='result']");

    public void clickOnFemaleGender() {
        clickOnElement(radioButton);
    }

    public void enterInFirstNameField(String firstname) {
        sendTextToElement(firstNameFiled, firstname);
    }

    public void enterLastNameField(String lastname) {
        sendTextToElement(lastNameField, lastname);
    }

    public void selectDateOfBirth(String date) {
        selectByVisibleTextFromDropDown(birthDayFiled, date);
    }

    public void selectDateOfMonth(String month) {
        selectByVisibleTextFromDropDown(birthMonthFiled, month);
    }

    public void selectYear(String year) {
        selectByVisibleTextFromDropDown(birthYear, year);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordfield, password);
    }

    public void enterConfirmPassword(String confirmPass) {
        sendTextToElement(confirmPassword, confirmPass);
    }

    public String getTextFromRegister() {
        return getTextFromElement(registerLink);
    }
    public void enterEmail(String email){
        sendTextToElement(emailField,email);
    }
    public void clickOnregisterButton(){
        clickOnElement(registerationButton);
    }
    public String getRegistrationMessage(){
        return getTextFromElement(registerMessage);
    }
}
