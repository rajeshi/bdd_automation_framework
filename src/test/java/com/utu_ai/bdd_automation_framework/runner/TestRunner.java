package com.utu_ai.bdd_automation_framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/utu_features",
        glue = {"com.utu_ai.bdd_automation_framework.tests"},
        tags = "@for_testing_1")
public class TestRunner {

}
