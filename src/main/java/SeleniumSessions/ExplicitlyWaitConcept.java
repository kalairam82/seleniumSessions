package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitConcept
{
static WebDriver driver;
	public static void main(String[] args)
	{
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	     
		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");

//		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement FirstNameELe = wait.until(ExpectedConditions.presenceOfElementLocated(firstname));
//		FirstNameELe.sendKeys("Hi");
//		
//		driver.findElement(lastname).sendKeys("Bye");
		
		waitForElementPresence(firstname, 5).sendKeys("Hi");
		driver.findElement(lastname).sendKeys("Bye");  
		//page: 25 elements:
				//1st: 10 secs: WebDriverWait
				//2nd to 10th: no waits
				//11th to 15th: 5 secs: WebDriverWait
				//16th to 25th: no waits
	}		   
	
	public static WebElement waitForElementPresence(By locator, long timeout)
      {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
      }
     
	
  

}
