package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSpicejettwoLevel {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
        Thread.sleep(2000);

//		WebElement addons = driver.findElement(By.xpath("//div[text()='Add-ons']"));
//		
//		WebElement visaServices = driver.findElement(By.xpath("//div[text()='Visa Services']"));
//		
//		
//		//a1.build.perform: correct
//		//a1.build: will not work
//		//a1.perform: correct
//		//a1: will not work
//		Actions act = new Actions(driver);
//		act.moveToElement(addons).build().perform();
//		
//		Thread.sleep(2000);
//		visaServices.click();
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
		By addonsLoc = By.xpath("//div[text()='Add-ons']");
		By visaServicesLoc = By.xpath("//div[text()='Visa Services']");
		handleTwoLevelMenuSubMenuHandling(addonsLoc, visaServicesLoc);


	}

	
	public static WebElement getElement(By locator)
    {
    	return driver.findElement(locator);
    }
	public static void handleTwoLevelMenuSubMenuHandling(By parentMenuLocator, By childMenuLocator) throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenuLocator)).build().perform();
		Thread.sleep(2000);
		getElement(childMenuLocator).click();
	}
}
