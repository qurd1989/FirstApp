package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigateExmples {
	WebDriver driver;

	@BeforeClass
	void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdiy\\OneDrive\\Desktop\\selenium\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		

}
	@BeforeMethod
	void navigateTo() {
		// navigateTo method 
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		/*String url  = " driver.navigate().to("https://opensource-demo.orangehrmlive.com/");"
		 * driver.navigate().to(url);
		 * */
		 
		
	}
	@Test
	void navigateMethod() throws InterruptedException {
		WebElement element= driver.findElement(By.id("txtUsername"));
		element.sendKeys("Admin");
		WebElement element2 = driver.findElement(By.id("txtPassword"));
		element2.sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//navigate().back().
		Thread.sleep(3000);
		driver.navigate().back();
		
		//navigate().forward().
		Thread.sleep(3000);
		driver.navigate().forward();
		
		//navigate().refresh().
		driver.navigate().refresh();
		driver.navigate().back();
		//another way to refresh browser
		Thread.sleep(3000);
		  Actions actions = new Actions(driver);
		  actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
	    
	      
	      
		
		
	}
	@AfterClass
	void quitBrowser() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
}
