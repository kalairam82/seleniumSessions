package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {
     static WebDriver driver;
     
	public static void main(String[] args) {
	     
		  driver = new ChromeDriver();
		  driver.get("https://www.google.com");
		  driver.findElement(By.name("q")).sendKeys("selenium");
		  

	} 

}
