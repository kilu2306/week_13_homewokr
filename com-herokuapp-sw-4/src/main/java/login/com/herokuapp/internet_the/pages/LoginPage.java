package login.com.herokuapp.internet_the.pages;

import login.com.herokuapp.internet_the.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

By userNameField = By.id("username");
By passWordField= By.id("password");
By loginButtonField =By.xpath("//i[@class='fa fa-2x fa-sign-in']");
By errorMessageField = By.xpath("//div[@id='flash']");


public void enterUsername(String username){
    sendTextToElement(userNameField, username);

}
public void enterPassword(String password){
    sendTextToElement(passWordField ,password);
}
public void clickOnLoginButton(){
    clickOnElement(loginButtonField);
}
public String gettingErrorMessage(){
    return getTextFromElement(errorMessageField);
}
}
