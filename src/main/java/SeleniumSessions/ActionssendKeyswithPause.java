package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionssendKeyswithPause {
static WebDriver driver;
	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
		By firstName = By.id("input-firstname");
		String name = "My name is Selenium";
		
//		Actions act = new Actions(driver);
//		WebElement fname = driver.findElement(firstName);
//                    char ch[] =name.toCharArray();
//                    
//                    for(char e:ch)
//                    {
//                    	act.sendKeys(fname, String.valueOf(e))
//                    	    .pause(200)
//                    	    .build()
//                    	    .perform();
//                    }
		doSendKeysWithPause(firstName, name, 200);
		
	}
	
	public static WebElement getElement(By locator) 
	{
		return driver.findElement(locator);
	}
	
	public static void doSendKeysWithPause(By locator, String value, long pauseTime) 
	{
		Actions act = new Actions(driver);
				char ch[]=value.toCharArray();
		    for(char e:ch)
		    {
		    	act.sendKeys(getElement(locator), String.valueOf(e))
		    	.pause(pauseTime)
		    	.build()
		    	.perform();
		    
		    }
	}

}
