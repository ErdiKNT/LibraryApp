package com.Library.Pages;

import com.Library.Utilities.ConfigurationReader;
import com.Library.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    public LogInPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@placeholder='Email address']")
    public WebElement EmailAddress; // This is an object of this page. In order to call this use this keyword.!!!

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement SignInButton;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement errorMessage;

    public  void LogIn(String Email, String Password) {

       // Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        EmailAddress.sendKeys(Email);
        password.sendKeys(Password);
        SignInButton.click();

    }

    public void LogIn(String userName, String Password, String n1){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        EmailAddress.sendKeys(userName);
        password.sendKeys(Password);
        SignInButton.click();
    }

}
