package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearchPage {

	private WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	WebElement searchTextBox;
	@FindBy(linkText="Laptops")
	WebElement laptopText;  


public ProductSearchPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public String searchItem(String product) throws InterruptedException {
	searchTextBox.sendKeys(product);
	searchTextBox.sendKeys(Keys.ENTER);
	Thread.sleep(5000);
	String actResult = laptopText.getText();
	return actResult;
	
}

}
