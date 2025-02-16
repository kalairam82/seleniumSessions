package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementIsDisplayed {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	    By lname=By.id("input-lastname");
	    boolean flag= driver.findElement(By.id("input-lastname")).isDisplayed();
	    System.out.println(flag);
	    
	    if(doElementIsDisplayed(lname))
	    {
	    	getElement(lname).sendKeys("vinu");
	    }
	    else
	    {
	    	System.out.println("Element is not displayed");
	    }
	 
	}

	 public static WebElement getElement(By locator)
	    {
	    	return driver.findElement(locator);
	     }
    
	 public static boolean doElementIsDisplayed(By locator)
	 {
		 return getElement(locator).isDisplayed();
	 }
}
