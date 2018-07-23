package Test.AutomationTest.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Created by Harpreet Tatla on 20/07/18
 * This is to run your feature file and generate the output cucumber report
 */
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = {"src/test/resources/features"}, //Path to where your features reside
			glue={"Test/AutomationTest/StepDefinitions"}, //Path to where the step definitions reside
			plugin={"pretty", "html:test-output", "json:target/json_output/cucumber.json", "junit:target/junit_xml/cucumber.xml"},	
			monochrome = true, 	//display the console output in a proper readable format		
			strict = true,		//it will check if any step is not defined in the step def file    	
			dryRun = false, 	//to check the mapping is proper between feature file and step def file		
			tags = {"@Regression"}	//executes on the feature scenarios with this tag
			)	
	
public class TestRunner {

}
