package com.nopcommerce.demo.testbase;

import com.nopcommerce.demo.driverfactory.ManageDriver;
import com.nopcommerce.demo.propertyreader.PropertyReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends ManageDriver {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp() {
        selectBrowser(browser);
    }


    @AfterMethod
    public void tearDown() {
        closeBrowser();

    }
}
