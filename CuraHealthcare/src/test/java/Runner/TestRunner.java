package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/Features/HomePage.feature",
		glue= {"StepDefinitions","Hooks"},
		plugin= {"pretty","html:target/html-reports.html"},
		monochrome = true
		)
public class TestRunner extends AbstractTestNGCucumberTests{
}