package htm.index.parabank.com.parasoft.parabank.pages;

import htm.index.parabank.com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class AccountOverViewPage extends Utility {
    By accountOverViewField=By.cssSelector("[value='Log In']");
   By errorMessageField=By.xpath("//p[starts-with(text(),'An internal error')]");
   By logOut=By.xpath("//a[starts-with(text(),'Log Out')]");
    public String getTextFromAccountOverViewField(){
        return getTextFromElement(accountOverViewField);
    }
    public String gettextFromErrorMessageField(){
        return getTextFromElement(errorMessageField);
    }
    public void clickOnLogOut(){
        clickOnElement(logOut);
    }
}
