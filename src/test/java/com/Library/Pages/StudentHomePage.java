package com.Library.Pages;

import com.Library.Utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentHomePage {

    public StudentHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//h3[.='Book Management']")
    public WebElement studentHomePage;


}
