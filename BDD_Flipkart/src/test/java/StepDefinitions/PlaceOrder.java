package StepDefinitions;


import org.junit.Assert;

import Base.TestBase;
import Pages.LoginPage_Old;
import Pages.ProductSearchPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrder extends TestBase{

	LoginPage_Old loginPage;
	ProductSearchPage productSearchPage;
	
	@Before
	public void setUp() {
		System.out.println("Starting the test");
		
	}
	
	@After
	public void teadDown() {
		System.out.println("Ending the test");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
	
	@BeforeStep
	public void beforeMethos() {
		System.out.println("Before Method");
	}
	
	@AfterStep
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {  //user_is_on_login_page()  launchHomePage()
	String expTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle,"
			+ " Books & More. Best Offers!";
	String actTitle = launchBrowser();
//	System.out.println("Actual Result: " + actTitle + "\nExpected Result: " + expTitle);
	Assert.assertEquals(actTitle, expTitle);
	}
	

	@When("user enters username and password and click on login button")
	public void validateLogin() throws InterruptedException {  //user_enters_username_and_password_and_click_on_login_button()
	   loginPage = new LoginPage_Old(driver);
	   String expMsg = "Senthil";
	   String actMsg = loginPage.checkLogin("9094018902", "Asdf@1234");
	   //System.out.println("Exp: "+ expMsg + "\nAct: " + actMsg);
	   Assert.assertEquals(actMsg, expMsg);
	  }

	@Then("user search for laptop")
	public void searchProduct() throws InterruptedException {  //user_search_for_laptop
	   productSearchPage = new ProductSearchPage(driver);
	   String actResult = productSearchPage.searchItem("laptop");
	   String expResult = "Laptops";
	   Assert.assertEquals(actResult, expResult);
		}

	@Then("user select the first laptop")
	public void selectFirstProduct() {  //user_select_the_first_laptop
	   
		//System.out.println("inside in user select the first laptop");
	  }
	

	@Then("user clicks on add to cart button")
	public void addToCart() {   //user_clicks_on_add_to_cart
	   
		//System.out.println("inside in user clicks on add to cart button");
	  }
	

	@Then("user clicks logout button")
	public void validateLogout() {  //user_clicks_logout_button
	   
		//System.out.println("inside in user clicks logout button");
	  }

	
}
