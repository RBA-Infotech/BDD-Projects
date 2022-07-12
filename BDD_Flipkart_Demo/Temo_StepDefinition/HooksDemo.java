package stepDefinition;

import com.flipkart.pages.LoginPage;
import com.flipkart.pages.SearchPage;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemo {

	@Before
	public void setUp() {
		System.out.println("Before Tag");
	}

	@After
	public void tearDown() {
		System.out.println("After Tag");
	}

	@BeforeStep
	public void beforeStep() {
		System.out.println("Before Method");
	}

	@AfterStep
	public void afterStep() {
		System.out.println("After Method");
	}

	@Given("the use is on login page")
	public void the_use_is_on_login_page() {
		System.out.println("User is on login page");
	}

	@When("user enters {string} and {string} and clicks on login button")
	public void user_enters_username_and_password_and_clicks_on_login_button(String uName, String password) {
		System.out.println("User enters user name and password");
	}

	@Then("user clicks on logout button")
	public void user_clicks_on_logout_button() {
		System.out.println("User clicks logout button");
	}

}
