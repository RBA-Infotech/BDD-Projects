package Pages;

import org.openqa.selenium.By;

import Base.TestBase;

public class LoginPage extends TestBase {

	By userNameLoc = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	By pwdLoc = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	By loginButtonLoc = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span");

	public String validateLogin(String userName, String password) {
		driver.findElement(userNameLoc).sendKeys(userName);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(pwdLoc).sendKeys(password);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(loginButtonLoc).click();

		String actResult = driver.findElement(By.xpath("//*[text()='Cart']")).getText();
		// Boolean loginResult = actResult.equalsIgnoreCase("Cart");
		return actResult;
	}
}
