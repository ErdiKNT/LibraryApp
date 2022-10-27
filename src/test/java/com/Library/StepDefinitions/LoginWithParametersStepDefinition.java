package com.Library.StepDefinitions;

import com.Library.Pages.Librarian_HomePage;
import com.Library.Pages.LogInPage;
import com.Library.Utilities.Driver;
import com.Library.Utilities.Environment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginWithParametersStepDefinition {

    LogInPage logInPage = new LogInPage();
    Librarian_HomePage librarian_homePage = new Librarian_HomePage();


    @Given("I am on the login page")
    public void I_am_on_the_login_page(){
        Driver.getDriver().get(Environment.URL);
    }

    @When("I enter username {string}")
    public void I_enter_username(String str){
           logInPage.EmailAddress.sendKeys(str);
    }

    @And ("I enter password {string}")
    public void I_enter_password(String str){
           logInPage.password.sendKeys(str);
    }
    @And("click the sign in button")
    public void click_the_sign_in_button(){
          logInPage.SignInButton.click();
    }

    @Then("number of users should be {int}")
    public void number_of_users_should_be(int userNumber){
        String actualNumber = librarian_homePage.UserNumber.getText();
        Assert.assertEquals(String.valueOf(userNumber), actualNumber);
    }




}
