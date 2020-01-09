package com.qa.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Register_Page extends Base {
    By registerLinkLocator = By.linkText("REGISTER");
    By registerPageLocator=By.xpath("//img[@src='/images/masts/mast_register.gif']");
    By usernameLocator=By.id("email") ;
    By passwordLocator=By.name("password");
    By confirmPasswordLocator= By.cssSelector("input[name='confirmPassword']");//By.name("confirmPassword");//input[name='confirmPassword']
    By registerBtnLocator=By.name("register");
    By fontLocator = By.tagName("font");

    public Register_Page(WebDriver driver){
        super(driver);

    }

    public void regiterUser() throws InterruptedException {
        click(registerLinkLocator);
        Thread.sleep(2000);
        if(isDisplayed(registerPageLocator) ){
            type("Wallas50",usernameLocator);
            type("123456",passwordLocator);
            type("123456",confirmPasswordLocator);
            click(registerBtnLocator);
        }else{
            System.out.println("Register Page was not Found");
        }
    }

    public String registerMessage(){
        List<WebElement> fonts = findElements(fontLocator);
        return getText(fonts.get(5));
    }

}
