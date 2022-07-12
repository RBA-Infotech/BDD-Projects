package stepDefinition;

import org.junit.Assert;

import com.flipkart.base.TestBase;
import com.flipkart.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrder extends TestBase {


	@Given("the user is on login page")
	public void the_user_is_on_login_page() { // login()
		System.out.println("In Login Page");
		launchBrowser();
		navigateToURL();
	}

	@When("user enters username and password and clicks login button")
	public void user_enters_username_and_password_and_clicks_login_button() {
		System.out.println("Entering username and password");
		LoginPage loginPage = new LoginPage();
		boolean actResult = loginPage.validateLogin("9094018902", "Asdf@1234");
		Assert.assertTrue(actResult);
	}

	@Then("user search for laptop")
	public void user_search_for_laptop() {
		System.out.println("Searching Laptop");
	}

	@Then("user select first laptop")
	public void user_select_first_laptop() {
		System.out.println("Selecting first laptop");
	}

	@Then("user click add to cart button")
	public void user_click_add_to_cart_button() {
		System.out.println("Add to cart button");
	}

	@And("user click logout button")
	public void user_click_logout_button() {
		System.out.println("Logout page");
	}

}
