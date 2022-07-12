package stepDefinition;

import org.junit.Assert;

import com.flipkart.base.TestBase;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.SearchPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends TestBase {

	@Before
	public void setUp() {
		
	}
	
	@Given("the use is on login page")
	public void the_use_is_on_login_page() {
		launchBrowser();
		navigateToURL();
	}

	@When("user enters {string} and {string} and clicks on login button")
	public void user_enters_username_and_password_and_clicks_on_login_button(String uName, String password) {
		LoginPage loginPage = new LoginPage();
		boolean actResult = loginPage.validateLogin(uName, password);
		Assert.assertTrue(actResult);
	}

	@Then("user clicks on logout button")
	public void user_clicks_on_logout_button() {
		wait(2000);
		SearchPage searchPage = new SearchPage();
		searchPage.logout();
	}

}
