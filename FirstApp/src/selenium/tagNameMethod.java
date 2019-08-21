package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tagNameMethod {

	WebDriver driver;
	
	@BeforeClass void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\abdiy\\OneDrive\\Desktop\\selenium\\WebDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}
		
	@BeforeMethod
	void launchingPage()  {
		
		driver.get("http://www.facebook.com");
	
	
	}
	//getting tagNAme and class
	@Test
	void testingSite() {
		//get tag name by ID
		String  tagname = driver.findElement(By.id("email")).getTagName();
		//get TagName by xpath
		String tagname1 = driver.findElement(By.linkText("Sign Up")).getTagName();
		System.out.println(tagname1);
		
		Class<? extends WebElement> className = driver.findElement(By.id("pass")).getClass();
		System.out.println(className);
		System.out.println(tagname);
		
		
		
	}
	@AfterMethod
	void quitBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
}
