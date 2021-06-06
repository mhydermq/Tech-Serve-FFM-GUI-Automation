package com.ffm.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src\\test\\java\\com\\ffm\\features"},//The path of your features files
		glue={"com\\ffm\\stepDefinitions"}, //The path of your step definitions
		monochrome= true, //readable format in the console
		strict= true, //strictly follow the steps
		dryRun= false,
		plugin= {"pretty","json:SimpleReporting/cucumber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)




public class TestRunner extends AbstractTestNGCucumberTests {

}
