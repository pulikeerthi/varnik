package myTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={".//Features//Login.feature"},
		glue="stepdefinitions",
		//plugin= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"},
		plugin= {"pretty","html:report/myreport.html","json:report/myreport.json","junit:report/myreport.xml"},
		dryRun=false,
		monochrome=true
		
		)
public class Testrunner {

}
