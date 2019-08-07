//this codes for educational purposes only!
//Any correction Welcomed
package selenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Text;


public class FirstApp {

	public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdiy\\OneDrive\\Desktop\\selenium\\WebDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.demo.guru99.com/v4/");
	driver.findElement(By.name("uid")).sendKeys("yourID");
	driver.findElement(By.name("password")).sendKeys("YourPassword");
    WebElement login= driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
    login.click();
    
    String urlString = login.getText();
    
    
    if (login.isEnabled() && urlString.contains(" Login compeleted Successfully")) {
    	System.out.println("Successfully Logined!");
    	
		
	}else {
		System.out.println("Please enter all details");
	}
    


}
}
