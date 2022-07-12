package Runner;

//import org.junit.AfterClass;
//import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".\\src\\main\\resources\\Features",
		glue={"StepDefinitions1"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/HTMLReports.html",
				  "json:target/JSONReports/json_report.json",
				  "junit:target/JUnitReports/junit_report.xml"
				  } 
		)


public class TestRunner {
	
	
}
