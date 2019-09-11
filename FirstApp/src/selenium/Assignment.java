package selenium;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assignment {
	
	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdiy\\OneDrive\\Desktop\\selenium\\WebDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
	}
	@Test
	void checkBox() {
		
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());
		
		WebElement element = driver.findElement(By.id("checkBoxOption1"));
		element.click();
		System.out.println(element.isSelected());
		
	
		
	}

}
