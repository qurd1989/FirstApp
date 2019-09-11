package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.sound.sampled.LineListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.w3c.dom.ls.LSException;



public class Assignment6 {
WebDriver driver;
	
	@BeforeClass
	void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdiy\\OneDrive\\Desktop\\selenium\\WebDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

		
		}
	@Test
	void singleCheckBox() {
		
		WebElement singlecheckBox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
		singlecheckBox.click();
		System.out.println(singlecheckBox.isSelected());
		
		System.out.println(driver.findElement(By.xpath("//div[@id='txtAge']")).getText());
		
			
		}
	@Test
	void multipleCheckBox() {
	 List<WebElement> list = driver.findElements(By.cssSelector(".checkbox"));
	 System.out.println(list.size());
	 
	 for (WebElement element : list) {
		 if(!element.isSelected()) {
			 element.click();
		 }
	 }
	 }
		 @AfterMethod
		 void tearDown() {
			 
		 }
		
	}
	    
	    			
			
		
	


