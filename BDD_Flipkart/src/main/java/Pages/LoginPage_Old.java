package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Old {
	
	private WebDriver driver;

	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement mobileNo;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	WebElement password;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
	WebElement loginButton;
	
	public LoginPage_Old(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String checkLogin(String mobNo, String pwd) throws InterruptedException{
		Thread.sleep(2000);
		mobileNo.sendKeys(mobNo);
		Thread.sleep(2000);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		loginButton.click();
		Thread.sleep(3000);
		String actMsg = driver.findElement(By.xpath("//div[contains(text(),'Senthil')]")).getText();
		return actMsg;
	}

}
