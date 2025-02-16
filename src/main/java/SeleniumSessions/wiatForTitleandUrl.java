package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wiatForTitleandUrl {
   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
//		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String  url = waitForURLToBe("https://naveenautomationlabs.com/opencart/index.php?route=account/registe", 5);
		System.out.println(url);
//		By privacy = By.linkText("Privacy Policy.");
//		//Thread.sleep(2000);
//		driver.findElement(privacy).click();
//		
//		String url = waitForURLContains("OrangeHRM-Privacy-Policy.pdf", 5);
//		System.out.println(url);
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		if (wait.until(ExpectedConditions.titleContains("Register")))
//		{
//			System.out.println(driver.getTitle());
//		}
//		String title = waitForTitleContains("Register", 5);
//		System.out.println(title);
//		String title1 = waitForTitleIs("Register Account", 5 );
//		System.out.println(title1);
	}
	
	public static String waitForTitleContains(String fractionTitle, long timeOut)
	{
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try
		{
		if (wait.until(ExpectedConditions.titleContains(fractionTitle)))
		{
			return driver.getTitle();
			
		}
		}
		catch(TimeoutException e)
		{
			System.out.println("title is not fount after: " + timeOut + " seconds");
		}
		
		return null;
	}
	
	public static String waitForTitleIs(String title, long timeOut)
	{
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try
		{
		if (wait.until(ExpectedConditions.titleIs(title)))
		{
			return driver.getTitle();
			
		}
		}
		catch(TimeoutException e)
		{
			System.out.println("title is not fount after: " + timeOut + " seconds");
			
		}
		
		return null;
	}
	
	public static String waitForURLContains(String fractionURL, long timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		try
		{
			
		if(wait.until(ExpectedConditions.urlContains(fractionURL)));
		{
			return driver.getCurrentUrl();
		}
		}
		catch(TimeoutException e)
		{
			System.out.println("The url is not found after: " + timeOut +"seconds");
		}
		return null;
	}

	public static String waitForURLToBe(String URL, long timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		try
		{
			
		if(wait.until(ExpectedConditions.urlToBe(URL)));
		{
			return driver.getCurrentUrl();
		}
		}
		catch(TimeoutException e)
		{
			System.out.println("The url is not found after: " + timeOut +"seconds");
		}
		return null;
	}
	
}
