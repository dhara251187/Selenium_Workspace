package Runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\QA\\Selenium_Workspace\\FreeCRMBDDFramework\\src\\main\\java\\Features\\dealmap.feature"
		,glue= {"stepDefinitions"},
		dryRun = false

		
		)

public class TestRunner {

}
