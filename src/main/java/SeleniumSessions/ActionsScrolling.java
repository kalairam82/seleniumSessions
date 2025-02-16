package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {
   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		driver = new ChromeDriver();

//		driver.get("https://freshworks.com");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Actions act = new Actions(driver);
		//partial scrolling:
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		Thread.sleep(3000);
//        act.sendKeys(Keys.PAGE_UP).build().perform();
		
		//scroll to the footer of the page
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		
		//scroll to Element
		act.scrollToElement(driver.findElement(By.linkText("OpenCart")))
		       .pause(200)
		           .click(driver.findElement(By.linkText("OpenCart")))
		               .build()
		                  .perform();
		
	    
	}
	

}
