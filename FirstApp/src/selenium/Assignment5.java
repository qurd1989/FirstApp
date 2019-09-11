package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assignment5 {
WebDriver driver;
	
	@BeforeClass
	void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdiy\\OneDrive\\Desktop\\selenium\\WebDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String urlString = "https://www.seleniumeasy.com/test/basic-first-form-demo.html";
		driver.get(urlString);
		
		}
	
	@Test
	void seleniumeasy() throws InterruptedException {
		WebElement entermsg = driver.findElement(By.cssSelector("input[placeholder='Please enter your Message']"));
		entermsg.sendKeys("Committed");
		
		driver.findElement(By.cssSelector("[class] .panel-default:nth-child(4) .btn-default")).click();
		//get message output
		System.out.println(driver.findElement(By.xpath("//label[contains(.,'Your Message')]")).getText());
		Thread.sleep(5000);
		
	}
	@Test
	void aPlusB() throws InterruptedException {
		Thread.sleep(5000);
		WebElement a = driver.findElement(By.xpath("//input[contains(@id,'sum1')]"));
		a.sendKeys("10");
		WebElement b = driver.findElement(By.xpath("//input[contains(@id,'sum2')]"));
		b.sendKeys("20");
		WebElement totalofAandB= driver.findElement(By.xpath("//button[@type='button'][contains(.,'Get Total')]"));
		totalofAandB.click();
		
		System.out.println(driver.findElement(By.cssSelector("[class] .panel-default:nth-child(5) .btn-default")).getText());
		
	}
	@AfterMethod
	void tearDown() throws InterruptedException {
		//driver.quit();
		Thread.sleep(10000);
	}

}
