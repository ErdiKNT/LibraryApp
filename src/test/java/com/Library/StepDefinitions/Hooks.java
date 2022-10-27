package com.Library.StepDefinitions;


import com.Library.Utilities.DBUtils;
import com.Library.Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before("DB_ID")
    public void setupDB() {
        System.out.println("creating database connection");
        DBUtils.createConnection();
    }

    @After("@DB_ID")
    public void destroyDB() {
        System.out.println("closing database connection");
        DBUtils.destroy();;
    }

    //  @Before("@ui")
    public void setUp() {
        // we put a logic that should apply to every scenario
        System.out.println("Setting up webdriver");
        Driver.getDriver();

    }


    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) { // If scenario fails, it will take screenshot. We can use isFailed method where is in the Scenario class

            // We downCase our Driver to TakeScreenshot interface, just we did before for the javascript-executor
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
            // We can see the image in html-report
        }

        Driver.closeDriver();
    }


}
