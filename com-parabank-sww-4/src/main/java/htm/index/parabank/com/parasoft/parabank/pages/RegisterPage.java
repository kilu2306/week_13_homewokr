package htm.index.parabank.com.parasoft.parabank.pages;

import htm.index.parabank.com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By firstName = By.id("customer.firstName");
    By lastName = By.id("customer.lastName");
    By street = By.id("customer.address.street");
    By city = By.id("customer.address.city");
    By state = By.id("customer.address.state");
    By zipCode = By.id("customer.address.zipCode");
    By phonNumber = By.id("customer.phoneNumber");
    By snnNumber = By.id("customer.ssn");
    By userName = By.id("customer.username");
    By password = By.id("customer.password");
    By confirmPassWord = By.id("repeatedPassword");
    By registerButton = By.xpath("//input[@value='Register']");
    By regSuccessMessageField = By.xpath("//p[starts-with(text(),'Your account')]");
    By signUpMessageField=By.xpath("//h1[text()='Signing up is easy!']");
    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
    }

    public void enterLastName(String name) {
        sendTextToElement(lastName, name);
    }

    public void enterAdress(String name) {
        sendTextToElement(street, name);
    }

    public void enterCity(String name) {
        sendTextToElement(city, name);
    }

    public void enterState(String name) {
        sendTextToElement(state, name);
    }

    public void enterphonnumber(String num) {
        sendTextToElement(phonNumber, num);
    }

    public void enterZipCode(String num) {
        sendTextToElement(zipCode, num);
    }

    public void enterSsn(String num) {
        sendTextToElement(snnNumber, num);
    }

    public void enterUserName(String num) {
        sendTextToElement(userName, num);
    }

    public void enterPssword(String num) {
        sendTextToElement(password, num);
    }

    public void enterrepeatedPssword(String num) {
        sendTextToElement(confirmPassWord, num);
    }

    public void clickOnRegister() {
        clickOnElement(registerButton);
    }

    public String getTextFromRegSuccessFullMessage() {
        return getTextFromElement(regSuccessMessageField);
    }
    public String getTextFromSignUpMessage(){
        return getTextFromElement(signUpMessageField);
    }
}



