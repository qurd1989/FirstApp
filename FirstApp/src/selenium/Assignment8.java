package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.server.handler.SecuredRedirectHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class Assignment8 {
WebDriver driver;
	
	@BeforeClass
	void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdiy\\OneDrive\\Desktop\\selenium\\WebDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String urlString = "https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html";
		driver.get(urlString);
		
		
		}
	@Test
	void dropDown() {
		
		Select s = new Select(driver.findElement(By.cssSelector("#select-demo")));
	     s.selectByValue("Thursday");
	  // get all names on dropdowns
	     List<WebElement> elements = s.getOptions();
	     
	     int alloptions= elements.size();
	     for (int i = 0; i <alloptions; i++) {
	    	 System.out.println(elements.get(i).getText());
	    
		}
	     System.out.println();
	     
	     
		
	}
	@Test
	void multiSelect() {
		WebElement multiSelect =  driver.findElement(By.cssSelector("#multi-select"));
		Select s1 = new Select(multiSelect);
		s1.selectByVisibleText("Ohio");
		
		List<WebElement> multiList = s1.getOptions();
		
		int allOptions = multiList.size();
		
		for (int i = 0; i <allOptions; i++) {
			System.out.println(multiList.get(i).getText());
			
			
		}
		driver.findElement(By.xpath("//button[contains(@value,'Print First')]")).click();
		System.out.println(driver.findElement(By.cssSelector("div.container-fluid.text-center:nth-child(2) div.row div.col-md-6.text-left:nth-child(2) div.panel.panel-default:nth-child(5) div.panel-body > p.getall-selected:nth-child(9)")));
		
	}
	@AfterMethod
	void tearDown() {
		//driver.quit();
		}

}
