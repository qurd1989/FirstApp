package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.server.handler.SecuredRedirectHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Assignment4 {
	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdiy\\OneDrive\\Desktop\\selenium\\WebDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	@Test
	void assignment4() throws InterruptedException {
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		WebElement optioElement=driver.findElement(By.cssSelector("#checkBoxOption1"));
		optioElement.click();
		System.out.println(optioElement.getTagName());
		
		Thread.sleep(5000);
		Select s = new Select(driver.findElement(By.cssSelector("#dropdown-class-example")));
		
		s.selectByVisibleText("Option1");

		WebElement alertBox= driver.findElement(By.cssSelector("#name"));
		alertBox.sendKeys("Option1");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#alertbtn")).click();
		String textString = driver.switchTo().alert().getText();
		Thread.sleep(2000);
		if (textString.contains("Option1")) {
			System.out.println("Passed");
			
		}else {
			System.out.println("Failed");
		}
		//driver.findElement(By.cssSelector("#confirmbtn")).click();
	}

}
