package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(features = "src/test/java/features", 
				 glue = {"package1","package2"}, 
				 monochrome = true)
public class RunTest 
extends AbstractTestNGCucumberTests{

}
