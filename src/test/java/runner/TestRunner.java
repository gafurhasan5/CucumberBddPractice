package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resource/features",
		glue={"stepdefinitions","hooks"},
		publish=true,
	    plugin= {"pretty",
	    		"html:target/Cucumber/CucumberReport.html",
	    		"json:target/Cucumber/CucumberReport.json",
	    		"junit:target/Cucumber/CucumberReport.xml",
	             	
		}
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
