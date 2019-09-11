package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assignment2 {
	WebDriver driver;

	@BeforeClass
	void setUp() {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\abdiy\\OneDrive\\Desktop\\selenium\\WebDriver\\chromedriver.exe");
		// driver= new ChromeDriver();
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\abdiy\\OneDrive\\Desktop\\selenium\\WebDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		String string = "https://www.cleartrip.com/";
		driver.get(string);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	void clearTrip() throws InterruptedException {

		System.out.println(driver.findElement(By.cssSelector("input[class='tripType']")).getSize());

		driver.findElement(By.id("OneWay")).click();

		WebElement e = driver.findElement(By.cssSelector("#FromTag"));
		e.sendKeys("ist");
		Thread.sleep(5000);
		e.sendKeys(Keys.ENTER);

		Thread.sleep(5000);
		WebElement e1 = driver.findElement(By.cssSelector("#ToTag"));
		e1.sendKeys("Baku");
		Thread.sleep(3000);
		e1.sendKeys(Keys.ENTER);

		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		// driver.findElement(By.xpath("//input[@title='Return Date']
		// //a[contains(@class,'ui-state-default ui-state-highlight
		// ui-state-active')]")).click();
		Thread.sleep(5000);
		Select s = new Select(driver.findElement(By.cssSelector("#Adults")));
		s.selectByValue("4");

		Thread.sleep(5000);
		System.out.println(driver.findElement(By.cssSelector("#Childrens")).getText());
		Select s1 = new Select(driver.findElement(By.cssSelector("#Childrens")));
		s1.selectByValue("2");

		Select s2 = new Select(driver.findElement(By.cssSelector("#Infants")));
		s2.selectByValue("1");

		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#SearchBtn")).click();

	}

	@AfterMethod
	void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
