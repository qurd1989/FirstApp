package selenium;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import javax.sound.sampled.LineListener;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;







public class MouseActions {
	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdiy\\OneDrive\\Desktop\\selenium\\WebDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}@Test
	void actionClasses() {
		/*
		 * String string = "https://www.amazon.com/";
		driver.get(string);
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.cssSelector(".icp-nav-link-inner"))).build().perform();
		
		action.moveToElement(driver.findElement(By.xpath("//input[contains(@name,'field-keywords')]"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		*/
	}
	@Test
	void mouseAction() throws InterruptedException {
		String string = "https://www.ebay.com/";
		driver.get(string);
		Actions actions = new Actions(driver);
		
		actions.moveToElement(driver.findElement(By.cssSelector("[data-hover-track] [_sp='p2481888\\.m1379\\.l3250']"))).build().perform();
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Powersports")).click();
		System.out.println(driver.getTitle());
	}

}
