package ru.tsum.site_elements.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.tsum.ru/login/?backurl=%2F")
public class LoginPage extends PageObject {

    private By emailInput = By.className("login-input");
    private By passwordInput = By.className("pwd-input");
    private By submitButton = By.xpath("//button[@type='submit']");

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
