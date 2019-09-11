package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class IFrames {
WebDriver driver;
	
	@BeforeClass
	void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdiy\\OneDrive\\Desktop\\selenium\\WebDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

}
	@Test
	void iFrames() throws InterruptedException {
		String string = "http://5elementslearning.com/iframe-practice-page.php";
		driver.get(string);
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		Thread.sleep(3000);
	    //driver.switchTo().frame("0");
	    Thread.sleep(5000);
	    
	    
		//driver.findElement(By.xpath("//div[@class='phone-menu-left-side'][contains(.,'Menu')]")).click();
		
	}
}

