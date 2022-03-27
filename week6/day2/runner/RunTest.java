package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions
(features = "src/test/java/features", 
				 glue = {"steps"}, 
				 monochrome = true,
				 publish = true,
				// tags = "@smoke" //to execute all the smoke testcases only
				// tags = "@smoke or @functional" //execute the scenarios having either @smoke or @functional
				// tags = "@regression and @functional" //execute the scenario having both @regression and @functional
				 tags = "not @smoke"
		)
public class RunTest extends BaseClass{

}