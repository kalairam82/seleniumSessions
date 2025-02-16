package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchLinksHrefValues {
       static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
             driver = new ChromeDriver();
             driver.get("https://flipkart.com");
             Thread.sleep(6000);
             driver.manage().window().maximize();
             List<WebElement> allLinks= driver.findElements(By.tagName("a"));
            List<WebElement> allImages = driver.findElements(By.tagName("img"));
            
            //fetching these values are called Webscraping
             for(WebElement e: allLinks)
             {
              String hrefVal= e.getDomAttribute("href");
              System.out.println(hrefVal);
	      }
             for(WebElement e: allImages)
             {
            	String src = e.getDomAttribute("src");
            	System.out.println(src);
            	
             }

}
}