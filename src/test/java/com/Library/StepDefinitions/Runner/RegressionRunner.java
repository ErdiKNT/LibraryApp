package com.Library.StepDefinitions.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {
                "src/test/resources/features/RegressionTest"
        },

        glue = "com/Library/StepDefinitions",
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json"
        },
        tags = "@regression"
)

public class RegressionRunner {


}
