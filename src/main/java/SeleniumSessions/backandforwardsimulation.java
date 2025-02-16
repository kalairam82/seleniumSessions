package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class backandforwardsimulation {
         static WebDriver driver;
	public static void main(String[] args) {
	    driver = new ChromeDriver();
	    
	    driver.get("https://www.google.com");
	    System.out.println(driver.getTitle());
	    
	    driver.navigate().to("https://www.amazon.com");
	    System.out.println(driver.getTitle());
	    
	    driver.navigate().back();
	    System.out.println(driver.getTitle());
	    
	    driver.navigate().forward();
	    System.out.println(driver.getTitle());
	    
	    driver.navigate().back();
	    System.out.println(driver.getTitle());
	    
	    driver.navigate().refresh();
	    
	}

}
