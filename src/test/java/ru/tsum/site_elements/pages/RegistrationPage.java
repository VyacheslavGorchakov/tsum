package ru.tsum.site_elements.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.tsum.ru/registration/?backurl=%2F")
public class RegistrationPage extends PageObject {

    private By emailInput = By.xpath("//auth-register//input[@type='email']");
    private By passwordInput = By.xpath("//auth-register//input[@formcontrolname='password']");
    private By submitButton = By.xpath("//auth-register//button[@type='submit']");

    public void setEmail(String email){
        find(emailInput).clear();
        find(emailInput).sendKeys(email);
    }

    public void setPassword(String password){
        find(passwordInput).clear();
        find(passwordInput).sendKeys(password);
    }

    public void submit(){
        find(submitButton).click();
    }
}
