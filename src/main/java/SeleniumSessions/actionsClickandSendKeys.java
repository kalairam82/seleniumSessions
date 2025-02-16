package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsClickandSendKeys {
    static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                    driver = new ChromeDriver();
                    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
                    driver.manage().window().maximize();
                    By fname = By.id("input-firstname");
                    By agree = By.name("agree");
//                    WebElement firstname = driver.findElement(fname);
//                    WebElement agreebox = driver.findElement(agree);
//                    
//                    Actions act = new Actions(driver);
//                    act.sendKeys(firstname, "kalai").build().perform();
//                    act.click(agreebox).build().perform();
                    
                      doActionsSendKeys(fname, "Kalai");
                      doActionsClick(agree);
                    
	}
	   public static WebElement getElement(By locator)
	   {
		   return driver.findElement(locator);

	   }
	   
	   public static void doActionsSendKeys(By locator, CharSequence... value)
	   {
		   Actions act = new Actions(driver);
		   act.sendKeys(getElement(locator),value).build().perform(); 
		   
	   }
	   public static void doActionsClick(By locator)
	   {
		  Actions act = new Actions(driver);
		  act.click(getElement(locator)).build().perform();;
	   }

}
