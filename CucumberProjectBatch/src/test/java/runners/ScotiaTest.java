package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\QA\\Selenium_Workspace\\CucumberProjectBatch\\src\\test\\java\\features\\login.feature"},//the path of the feature files
		glue={"StepDefinations"}//step Defination Package Name
		)

public class ScotiaTest{
	
}

