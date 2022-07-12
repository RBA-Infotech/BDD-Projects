package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\src\\main\\resources\\Features", 
		glue = "stepDefinition", 
		dryRun = false,
		monochrome = true,
		plugin = { "pretty",
		"html:target/HTMLReports.html", 
		"json:target/JSONReports/json_report.json",
		"junit:target/JUnitReports/junit_report.xml" }
		)
public class TestRunner {

}
