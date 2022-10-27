package com.Library.StepDefinitions.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

            features = {
                        "src/test/resources/features/SmokeTest"
            },

            glue = "com/Library/StepDefinitions", 
            plugin = {
                        "html:target/cucumber-report.html",
                        "rerun:target/rerun.txt",
                        "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                        "json:target/cucumber.json"
            }

)

public class SmokeRunner {

}
