package StepDefinitions1;



import org.testng.Assert;

import Base.TestBase;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PlaceOrder extends TestBase {

	LoginPage loginPage;
	
	
	@Before
	public void setUp() {
		launchBrowser();
		navigateToURL();		
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		loginPage = new LoginPage();
		String actResult = loginPage.validateLogin("9094018902", "Asdf@1234");
		
		Assert.assertEquals(actResult, "Cart");
	}

	@When("user enters username and password and click on login button")
	public void user_enters_username_and_password_and_click_on_login_button() {
		System.out.println("Username and password is entered");
	}

	@Then("user search for laptop")
	public void user_search_for_laptop() {
		System.out.println("in search for laptop method");	}

	@Then("user select the first laptop")
	public void user_select_the_first_laptop() {
		System.out.println("in first laptop method");
	}

	@Then("user clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() {
		System.out.println("in add to cart method");
	}

	@Then("user clicks logout button")
	public void user_clicks_logout_button() {
		System.out.println("in logout method");
	}
	
	@After
	public void teadDown() {
		System.out.println("After last method");
	}

}
