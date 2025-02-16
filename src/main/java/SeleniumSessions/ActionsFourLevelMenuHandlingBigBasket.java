package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsFourLevelMenuHandlingBigBasket {
         static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");
        driver.manage().window().maximize();
		Thread.sleep(4000);
		
		By level1Menu = By.xpath("(//span[text()='Shop by'])[2]");
		By level2Menu = By.linkText("Beverages");
		By level3Menu = By.linkText("Tea");
		By level4Menu = By.linkText("Tea Bags");
//		WebElement level1 =driver.findElement(Level1Menu);
//		Actions act = new Actions(driver);
//	    level1.click();
		level4MenuSubMenuHandling(level1Menu,level2Menu,level3Menu,level4Menu);
	}
	
	public static WebElement getElement(By locator)
    {
    	return driver.findElement(locator);
    }
       public static void level4MenuSubMenuHandling(By Level1Menu,By Level2Menu,By Level3Menu,By Level4Menu ) throws InterruptedException
       {
    	   getElement(Level1Menu).click();
    	   Actions act = new Actions(driver);
    	   Thread.sleep(1000);
    	   act.moveToElement(getElement(Level2Menu)).build().perform();
    	   Thread.sleep(1000);
    	   act.moveToElement(getElement(Level3Menu)).build().perform();
    	   Thread.sleep(1000);
    	   getElement(Level4Menu).click();
    	   
    	   
       }
}
