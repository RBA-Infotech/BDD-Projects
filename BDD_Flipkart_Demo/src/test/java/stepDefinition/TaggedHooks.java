package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHooks {

	@Before
	public void setUp() {
		System.out.println("Before Tag");
	}

	@After
	public void tearDown() {
		System.out.println("After Tag");
	}

	@Before("@SmokeTest")
	public void beforeSmokeTest() {
		System.out.println("Before Smoke Test");
	}

	@After("@SmokeTest")
	public void afterSmokeTest() {
		System.out.println("After Smoke Test");
	}

	@Before("@RegressionTest")
	public void beforeRegressionTest() {
		System.out.println("Before Regression Test");
	}

	@After("@RegressionTest")
	public void afterRegressionTest() {
		System.out.println("After Regression Test");
	}

	@Given("user is on amazon login page")
	public void user_is_on_amazon_login_page() {
		System.out.println("Amazon Login Page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Entering user name and password");
	}

	@Then("user clicks logout button")
	public void user_clicks_logout_button() {
		System.out.println("Clicking logout button");
	}

	@Given("user is on easemytrip home page")
	public void user_is_on_easemytrip_home_page() {
		System.out.println("Easemytrip home page");
	}

	@When("user enters from, to, date and click on search button")
	public void user_enters_from_to_date_and_click_on_search_button() {
		System.out.println("Entering from, to, date");
	}

	@Then("search results for buses are displayed")
	public void search_results_for_buses_are_displayed() {
		System.out.println("Bus Results are displayed");
	}

}
