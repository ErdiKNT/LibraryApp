package com.Library.StepDefinitions;

import com.Library.Pages.LogInPage;
import com.Library.Utilities.Driver;
import com.Library.Utilities.Environment;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class loginStepDefinition {
    LogInPage logInPage = new LogInPage();

    @Given("librarian is on the loginPage")
    public void librarian_is_on_the_login_page() {
        Driver.getDriver().get(Environment.URL);
    }

    @Then("verify that the title is {string}")
    public void verify_that_the_title_is(String expectedTitle) {
        String ActualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, ActualTitle);
    }

    @When("librarian enters valid email address and password and clicks login button")
    public void librarian_enters_valid_email_address_and_password_and_clicks_login_button() {
        logInPage.LogIn(Environment.Librarian1_Email, Environment.Librarian1_password);
        Driver.closeDriver();
    }


    @Given("student is on the loginPage")
    public void student_is_on_the_login_page() {
        Driver.getDriver().get(Environment.URL);
    }

    @Then("verify that the URL is {string}")
    public void verify_that_the_url_is(String expctdURL) {
        String ActualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expctdURL, ActualURL);

    }

    @When("student enters valid email address and password and clicks login button")
    public void student_enters_valid_email_address_and_password_and_clicks_login_button() {
        logInPage.LogIn(Environment.Student1_Email, Environment.Student1_password);
        Driver.closeDriver();
    }


    @When("user enters invalid email address or password and clicks login button")
    public void user_enters_invalid_email_address_or_password_and_clicks_login_button() {
        String WrongEmail = "librarian1@library1";
        String WrongPass = "rs4BNN9G1";
        logInPage.LogIn(WrongEmail, WrongPass);
    }

    @Then("verify the error message {string}")
    public void verify_the_error_message(String expectedMessage) {
         String ActualMessage = logInPage.errorMessage.getText();
         Assert.assertEquals(expectedMessage, ActualMessage);
        System.out.println("exptedMes = " + expectedMessage);
        System.out.println("ActualMes = " + ActualMessage);
        Driver.closeDriver();
    }


//    @Then("verify that there are {int} models on the page")
//    public void verify_that_there_are_models_on_the_page(int int1) {
//
//        List<String> getElements = BrowserUtilities.getElementsText(By.xpath("//span[@class='title']"));
//       int ActualSize = getElements.size();
//        Assert.assertEquals(int1, ActualSize );
//
//    }
}
