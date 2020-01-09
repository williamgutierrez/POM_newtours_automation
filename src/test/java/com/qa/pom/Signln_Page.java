package com.qa.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Signln_Page extends Base {

    By linkSignOn= By.linkText("SIGN-ON");
    By inputUserName= By.name("userName");
    By inputPassw = By.name("password");
    By buttonSubmit= By.name("login");
    By imgSingON = By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']");
   // By imgNoValidaSingON = By.xpath("//img[@src='/images/masts/mast_signon.gif']");

    public Signln_Page(WebDriver driver){
        super(driver);
    }

    public void SingIn(){
        if (isDisplayed(linkSignOn)){
            type("wallas50",inputUserName);
            type("123456",inputPassw);
            click(buttonSubmit);
        }else{
            System.out.println("User name textbox was not found");
        }
    }
    public boolean InHomePageDisplayed(){
        return isDisplayed(imgSingON);
    }
}
