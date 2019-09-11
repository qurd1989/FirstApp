package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Assignment7 {
WebDriver driver;
	
	@BeforeClass
	void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdiy\\OneDrive\\Desktop\\selenium\\WebDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");

		
		}
	@Test
	void radioBox() throws InterruptedException {
	 WebElement male = driver.findElement(By.cssSelector("[class] .panel-default:nth-child(4) .radio-inline:nth-child(2) [type]"));	
	 WebElement female = driver.findElement(By.cssSelector("[class] .panel-default:nth-child(4) .radio-inline:nth-child(3) [type]"));
	 male.click();
	 
	 System.out.println(male.isSelected());
	 System.out.println(female.isSelected());
	 WebElement buttonCheck = driver.findElement(By.cssSelector("#buttoncheck"));
	 buttonCheck.click();
	 System.out.println(buttonCheck.isDisplayed());
	 
	 /*if (male.isSelected() || female.isDisplayed()) {
		 System.out.println("Test Passed");
	}
	*/		
	WebElement male1 = driver.findElement(By.cssSelector("[class] .panel-body div:nth-child(2) .radio-inline:nth-child(2) [type]"));
	WebElement female1 = driver.findElement(By.cssSelector("[class] .panel-body div:nth-child(2) .radio-inline:nth-child(3) [type]"));
	
	System.out.println(male1.isSelected());
	
	female1.click();
	System.out.println(female1.isSelected());
	
	WebElement zeroTo5  = driver.findElement(By.cssSelector("[class] div:nth-child(3) .radio-inline:nth-child(2) [type]"));
	WebElement fiveTo15 = driver.findElement(By.cssSelector("[class] div:nth-child(3) .radio-inline:nth-child(3) [type]"));
	WebElement fiftenTo50 = driver.findElement(By.cssSelector("[class] .radio-inline:nth-child(4) [type]"));
	
	System.out.println(zeroTo5.isSelected());
	System.out.println(fiveTo15.isSelected());
	System.out.println(fiftenTo50.isSelected());
	fiftenTo50.click();
	
	WebElement getValuElement = driver.findElement(By.cssSelector("[onclick]"));
	getValuElement.click();
	System.out.println(driver.findElement(By.xpath("//p[contains(@class,'groupradiobutton')]")).getText());
	
	
	
	}

}
