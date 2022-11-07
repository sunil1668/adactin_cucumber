package org.app.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\rajit\\eclipse-workspace\\adactin_cucumber"
		+ "\\src\\test\\java\\featureFile\\LoginPage.feature", glue ="org.app.StepDefinition", 
		dryRun = false, monochrome = true)
public class Runner
{

}
