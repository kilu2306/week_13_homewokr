package htm.index.parabank.com.parasoft.parabank.pages;

import htm.index.parabank.com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By userNameField = By.name("username");
    By passwordField = By.name("password");
    By logInButton = By.cssSelector("[value='Log In']");
    By customerLogInfield=By.xpath("//h2[contains(text(),'Customer Login')]");
    By registerLink=By.xpath("//a[contains(text(),'Register')]");
    public void enterUserName(String name) {
        sendTextToElement(userNameField,name);

    }
    public void enterPassword(String name){
        sendTextToElement(passwordField,name);
    }
    public void clickOnLogInButton(){
        clickOnElement(logInButton);
    }
    public String getTextFromCustomerLoginField(){
        return getTextFromElement(customerLogInfield);
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
}