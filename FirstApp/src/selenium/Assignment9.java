package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assignment9 {
WebDriver driver;
	
	@BeforeClass
	void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdiy\\OneDrive\\Desktop\\selenium\\WebDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String urlString = "https://www.seleniumeasy.com/test/input-form-demo.html";
		driver.get(urlString);
		
		
		}
	@Test
	void inputFormSubmit() {
		//first name
		driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Qurd");
		//last name 
		driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("edu");
		//email
		System.out.println(driver.findElement(By.cssSelector("input[name='email']")).isEnabled());
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("QurdEdu@gmail.com");
		//phone number
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9293636565");
		//address
		driver.findElement(By.name("address")).sendKeys("1763 6th street ");
		//city
		driver.findElement(By.name("city")).sendKeys("Brooklyn");
		//State
		WebElement state = driver.findElement(By.cssSelector("select[name='state']"));
		Select select = new Select(state);
		select.selectByVisibleText("New York");
		//get all teh state options
		List<WebElement> alList = select.getOptions();
		
		int allStates = alList.size();
		for (int i = 0; i <allStates; i++) {
			System.out.println(alList.get(i).getText());
			
		}
		// zip Code
		driver.findElement(By.name("zip")).sendKeys("12345");
		// Website name
		driver.findElement(By.name("website")).sendKeys("https://www.w3schools.in/java-program/");
		//radioButton
		
		WebElement radioBoxElement = driver.findElement(By.cssSelector("input[value='no']"));
		radioBoxElement.click();
		System.out.println(radioBoxElement.isSelected()==true);
		//description
		driver.findElement(By.cssSelector("textarea[name='comment']")).sendKeys("I m Ready for Selenium! ");
		//submit send button
		WebElement sendButton = driver.findElement(By.cssSelector(".btn.btn-default"));
		System.out.println(sendButton.isEnabled()==true);
		sendButton.click();
	}
			

}
