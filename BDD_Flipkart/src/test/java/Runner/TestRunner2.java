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
		glue={"StepDefinitions"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/HTMLReports.html",
				  "json:target/JSONReports/json_report.json",
				  "junit:target/JUnitReports/junit_report.xml"
				  },
		tags="@SmokeTest" 
		)


public class TestRunner2 {
	
//	private TestNGCucumberRunner testNGCucubmerRunner; 
	
@BeforeClass
public void setUp() {
//	testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	System.out.println("TestNG - Starting");
}

@AfterClass
public void tearDown() {
	System.out.println("TestNG - Ending");
}

@Test
public void executeTest() {
	System.out.println("Executing Test Method");
}
}
