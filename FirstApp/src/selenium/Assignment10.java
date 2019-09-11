package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Assignment10 {
WebDriver driver;
	
	@BeforeClass
	void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdiy\\OneDrive\\Desktop\\selenium\\WebDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String urlString = "https://www.seleniumeasy.com/test/ajax-form-submit-demo.html";
		driver.get(urlString);
		
		
		}
	@Test
	void ajaxTesting() {
		//get name
		WebElement name = driver.findElement(By.cssSelector("input[type='text']"));
		System.out.println(name.isEnabled()==true);
		name.sendKeys("Qurd Edu");
		
		//get description
		driver.findElement(By.cssSelector("textarea[rows='5']")).sendKeys("i will try to get ajax input form done!");
		
		WebDriverWait driver1 = new WebDriverWait(driver, 10);
		
		// get ajax submit button
		WebElement submitElement = driver.findElement(By.cssSelector(".btn.btn-primary"));
		submitElement.click();
		System.out.println(driver1.until(ExpectedConditions.invisibilityOf(submitElement)));
	  
		
	}

}
