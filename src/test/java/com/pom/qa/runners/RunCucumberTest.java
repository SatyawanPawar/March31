package com.pom.qa.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/com/pom/qa/featurestests/" }, plugin = { "pretty",
		"json:target/cucumber/cucumber.json" })
public class RunCucumberTest {

}
