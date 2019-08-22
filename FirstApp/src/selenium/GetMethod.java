package selenium;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import bsh.commands.dir;

public class GetMethod {
	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdiy\\OneDrive\\Desktop\\selenium\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
	}
	@BeforeMethod
	void launchBrowser() {
		//this is a get() method and must be String
		driver.get("https://www.guru99.com/first-webdriver-script.html");
		
	}
	@Test
	void getTitle() {
		String title= driver.getTitle();
		System.out.println(title);
		assertEquals("First Selenium Webdriver Script: JAVA Code Example", title);
		
	}
	@Test
	void getPageSource() {
		String pageSource = driver.getPageSource();
		boolean textIsPresent = driver.getPageSource().contains("frameborder");
		assertTrue(textIsPresent);
	}
		@Test
		void getText() {
			WebElement myElement1 = driver.findElement(By.xpath("//*[@content='IE=edge']"));
			System.out.println(myElement1.getText());
		
			
		}
	
	@AfterMethod
	void Up() throws InterruptedException {
	
	}
	@AfterClass
	void quitBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		
	}

}
