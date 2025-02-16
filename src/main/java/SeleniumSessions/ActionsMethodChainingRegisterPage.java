package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChainingRegisterPage {
   static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		WebElement firstName = driver.findElement(By.id("input-firstname"));
        Actions act = new Actions(driver);
        
         Action action= act.sendKeys(firstName,"Kalai")
        		         .sendKeys(Keys.TAB)   
        		         .pause(500)
        		         .sendKeys("selvi")
        		         .sendKeys(Keys.TAB)
        		         .pause(500)
        		         .sendKeys("kalai123@gmail.com")
        		         .sendKeys(Keys.TAB)
        		         .pause(500)
        		         .sendKeys("3257573434")
        		         .sendKeys(Keys.TAB)
        		         .pause(500)
        		         .sendKeys("kalai123")
        		         .sendKeys(Keys.TAB)
        		         .pause(500)
        		         .sendKeys("kl123")
        		         .sendKeys(Keys.TAB)
        					.pause(500)
        					.sendKeys(Keys.TAB)
        					.pause(500)
        					.sendKeys(Keys.TAB)
        					.pause(500)
        					.sendKeys(Keys.SPACE)
        					.pause(500)
        					.sendKeys(Keys.TAB)
        					.pause(500)
        					.sendKeys(Keys.ENTER)
        					.build();
        			
     action.perform();

	}

}
