package com.qa.pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static junit.framework.TestCase.assertTrue;

public class SignIn_Test {
    private WebDriver driver;
    private String url;
    Signln_Page signln_page;


    @Before
    public void SetUp(){
        url="http://newtours.demoaut.com/";
        signln_page = new Signln_Page(driver);
        driver  = signln_page.chromeDriverConnection();
        signln_page.visit(url);
    }
    @Test
    public void SignIn() throws InterruptedException {
        signln_page.SingIn();
        Thread.sleep(2000);
        assertTrue(signln_page.InHomePageDisplayed());

    }
    @After
    public  void tearDown(){
        driver.quit();
    }

}
