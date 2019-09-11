package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LimitingWebDriver {
	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdiy\\OneDrive\\Desktop\\selenium\\WebDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	@Test
	void limitingWebDriver() throws InterruptedException {
		driver.get("https://javatutoring.com/java-program-calculate-average-marks/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		//getting tagnames in footer sections
		WebElement footerElement = driver.findElement(By.cssSelector("#theme-footer"));
		
		System.out.println(footerElement.findElements(By.tagName("footer[class='fade-in animated4")).size());
		
		WebElement coloumDriverElement = footerElement.findElement(By.xpath("/html[1]/body[1]/div[2]/footer[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]"));
		System.out.println(coloumDriverElement.findElements(By.tagName("a")).size());
		
		for (int i = 1; i < coloumDriverElement.findElements(By.tagName("a")).size(); i++) {
			
			String riightClickString = Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumDriverElement.findElements(By.tagName("a")).get(i).sendKeys(riightClickString);;
			
			Thread.sleep(5000);
		}
			
			Set<String> windowSet = driver.getWindowHandles();
			Iterator<String> iterator= windowSet.iterator();
			
			while (iterator.hasNext()) {
				
				driver.switchTo().window(iterator.next());
				System.out.println(driver.getTitle());
				
				
			}
		}
		
	

}
