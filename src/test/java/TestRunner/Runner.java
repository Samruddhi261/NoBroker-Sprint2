package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resource\\Features\\Buy.feature",
glue="StepDefinition",
tags="@Shortlist",
//monochrome=true,
plugin= {"pretty" , "html:target/HTMLReports/NoBrokerReport.html",
		"json:target/JSONReports/NoBrokerReport.json",
		"junit:target/JUNITReports/NoBrokerReport.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class Runner extends AbstractTestNGCucumberTests{

	
}
