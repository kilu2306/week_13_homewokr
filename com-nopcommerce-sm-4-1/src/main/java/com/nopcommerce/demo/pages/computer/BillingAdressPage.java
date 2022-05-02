package com.nopcommerce.demo.pages.computer;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BillingAdressPage extends Utility {
    By fristName= By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName= By.xpath("//input[@id='BillingNewAddress_LastName']");
    By email=By.xpath("//input[@id='BillingNewAddress_Email']");
    By countrydropDown=By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By stateDropDown=By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
    By city=By.xpath("//input[@id='BillingNewAddress_City']");
    By address=By.xpath("//input[@id='BillingNewAddress_Address1']");
    By code=By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phonnumber=By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton=By.xpath("//button[@onclick=\"Billing.save()\"]");
    public void enterfirstName(String name){
       sendTextToElement(fristName,name);
   }public void enterLastName(String name){
       sendTextToElement(lastName,name);
   }
   public void enterEmail(String name){
       sendTextToElement(email,name);
   }
   public void selectCountry(String name){
        selectByVisibleTextFromDropDown(countrydropDown,name);
   }
   public void selectState(String name){
        selectByVisibleTextFromDropDown(stateDropDown,name);
   }
   public void enterCity(String name){
        sendTextToElement(city,name);

   }
   public void enterAddress(String name){
        sendTextToElement(address,name);
   }
   public void enterCode(String num ){
        sendTextToElement(code,num);
   }
   public void enterPhonnumber(String num){
        sendTextToElement(phonnumber,num);
   }
  public void clickOnContinue(){
        clickOnElement(continueButton);
  }
}
