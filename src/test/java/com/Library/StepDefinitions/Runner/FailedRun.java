package com.Library.StepDefinitions.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "com/Library/StepDefinitions",
        features = "@target/rerun.txt"




)




public class FailedRun {





}
