package com.nopcommerce.demo.testsuits;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopmenuTest extends TestBase {
    HomePage homePage= new HomePage();
    @Test
    public void verifyPageNavigation(){
        String expactedText="Electronics";
        String actualText=homePage.gettingTextFromElectronicField();
        Assert.assertEquals(actualText,expactedText,"verify Text");
    }
}
