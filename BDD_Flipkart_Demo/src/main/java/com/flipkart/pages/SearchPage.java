package com.flipkart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.flipkart.base.TestBase;

public class SearchPage extends TestBase {

	
	By userNameLoc = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div");
	By logoutLoc = By.xpath("//div[text()='Logout']");
	
	WebElement userName = driver.findElement(userNameLoc);
	//WebElement logout = driver.findElement(logoutLoc);
	
	public void logout() {
		
		Actions acts = new Actions(driver);
		acts.moveToElement(userName)
		.pause(Duration.ofSeconds(3))
		.perform();
		
		driver.findElement(logoutLoc).click();
		System.out.println("Logging out");
	
	}
}
