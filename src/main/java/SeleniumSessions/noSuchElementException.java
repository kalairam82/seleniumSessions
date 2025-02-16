package SeleniumSessions;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class noSuchElementException {
            static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	    By lname=By.id("input-lastname1");
	    try
	    {
	    driver.findElement(lname);
	    }
	    catch(NoSuchElementException e)
	    {
	    System.out.println("Element not found");	
	    }
	        // NoSuchElementException: NSE
	 		// ElementNotFoundException: is not available in selenium
	}

}
