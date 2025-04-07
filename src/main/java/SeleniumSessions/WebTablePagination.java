package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTablePagination {
   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement table = driver.findElement(By.xpath("//div[@class='elementor-shortcode']"));
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(3000);
//		act.scrollToElement(table)
//		       .build()
//		            .perform();
//		Thread.sleep(5000);
        
		//Multiple Selection
		while(true)
	        {
	        	if(driver.findElements(By.xpath("//td[text()='India']")).size()>0)
	        	{
	        		selectMultipleCountry("India");
	        	}
	        	     //Pagination Logic :Click next icon
	            		WebElement next = driver.findElement(By.cssSelector("button.next"));
	            		if(next.getDomAttribute("class").contains("disabled"))
	            		{
	            			System.out.println("Pagination is over");
	            			break;
	            		}
	            		next.click();
	            	
	         }
		//Single Selection
//		while(true)
//        {
//        	if(driver.findElements(By.xpath("//td[text()='United States']")).size()>0)
//        	{
//        		selectCountry("United States");
//        		break;
//        	}
//        		
//        	else
//        	{
//        		WebElement next = driver.findElement(By.cssSelector("button.next"));
//        		if(next.getDomAttribute("class").contains("disabled"))
//        		{
//        			System.out.println("Pagination is over");
//        			break;
//        		}
//        		next.click();
//        	}
//        }
	}
	
	public static void selectMultipleCountry(String countryName)
	{
		driver.findElements(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']"))
		    .stream()
		        .forEach(e -> e.click());
	}
	
	public static void selectCountry(String countryName)
	{
		driver.findElement(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
}
