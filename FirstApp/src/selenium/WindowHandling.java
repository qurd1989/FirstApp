package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WindowHandling {
	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdiy\\OneDrive\\Desktop\\selenium\\WebDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	@Test
	void windowHandlingCase1() {
		/*
		String string = "https://the-internet.herokuapp.com/windows";
		driver.get(string);
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(.,'Click Here')]")).click();
		
		Set<String> idSet = driver.getWindowHandles();
		Iterator<String> iterator = idSet.iterator();
		String parentString = iterator.next();
		String childString = iterator.next();
		driver.switchTo().window(childString);
		System.out.println(driver.getTitle());
		//switch back to parent window
		driver.switchTo().window(parentString);
		System.out.println(driver.getTitle());
		*/
	}
	@Test 
	void windowHandlingCase2() {
		String string = "https://www.naukri.com/";
		driver.get(string);
		System.out.println(driver.getTitle());
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("(//img[contains(@border,'0')])[2]")).click();
		
		Set<String> strings = driver.getWindowHandles();
		Iterator<String> iterator = strings.iterator();
		String parentString = iterator.next();
		String childString = iterator.next();
		
		driver.switchTo().window(childString);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[contains(.,'Client Sucess')])[2]")).click();
		
	}
	@AfterMethod
	void tearDown() throws InterruptedException {
		//Thread.sleep(50000);
		//driver.quit();
	}
}
