package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static String userDir = System.getProperty("user.dir");
	FileInputStream fis;
	
	public String launchBrowser() {
		prop = new Properties();
		try {
			fis = new FileInputStream(userDir + "\\src\\main\\resources\\config\\config.properties");
			prop.load(fis);
		}catch(IOException e) {
			System.out.println("File path or File name is not correct");
		}
	
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", userDir + "\\src\\test\\resources\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", userDir + "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("URL"));
		String title = driver.getTitle();
		return title;
	}
	
	public String navigateToURL() {
		driver.get(prop.getProperty("URL"));
		String title = driver.getTitle();
		return title;
	}
	
}
