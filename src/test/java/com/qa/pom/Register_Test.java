package com.qa.pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static junit.framework.TestCase.assertEquals;

public class Register_Test {
    private WebDriver driver;
    private String url;
    Register_Page register_page;

    @Before
    public void SetUp(){
        url="http://newtours.demoaut.com/";
        register_page = new Register_Page(driver);
        driver  = register_page.chromeDriverConnection();
        register_page.visit(url);
    }
    @Test
    public void testRegisterPOM() throws InterruptedException {
        register_page.regiterUser();
        assertEquals("Note: Your user name is Wallas50.",register_page.registerMessage());
    }
    @After
    public void tearDown(){
        driver.quit();
    }


}
