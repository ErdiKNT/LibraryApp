package com.Library.Pages;

import com.Library.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Librarian_HomePage {
    public Librarian_HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (xpath = "//span[.='Dashboard']")
    public WebElement LibrarianDashboard;

    @FindBy (xpath = "//h2[.='173']")
    public WebElement UserNumber;


}
