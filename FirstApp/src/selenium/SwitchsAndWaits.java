package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SwitchsAndWaits {
	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdiy\\OneDrive\\Desktop\\selenium\\WebDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
	}
	@Test
	void testCommands() {
	    /*driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//b[contains(.,'Performance')]")).click();
	   */
	}
	@Test
	void switchAlert() {
	/*	driver.get("http://output.jsbin.com/usidix/1");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		String alertText ="";
		alertText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		System.out.println(alertText);
		*/
	}
	@Test
	void switchHandle() {
	driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	String switchHandle =driver.getWindowHandle();
	System.out.println(switchHandle);
	
	driver.findElement(By.cssSelector("[onclick='if \\(\\!window\\.__cfRLUnblockHandlers\\) return false\\; newBrwWin\\(\\)']")).click();
	Set handleSet = driver.getWindowHandles();
	System.out.println(handleSet);

	}
	@AfterClass
	void quitBrowser() throws InterruptedException {
		Thread.sleep(5000);
		//driver.quit();
	}
	

}
