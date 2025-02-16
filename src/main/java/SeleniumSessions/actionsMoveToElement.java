package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsMoveToElement {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
           driver = new ChromeDriver();
           driver.get("https://www.spicejet.com");
           driver.manage().window().maximize();
           Thread.sleep(3000);
           By Addons = By.xpath("//div[text()='Add-ons']");
          // By Addons = By.linkText("Add-ons");
         // By extraseat = By.xpath("//div[text()='Extra Seat']");
          //By extra = By.linkText("Extra Seat");
           WebElement Add = driver.findElement(Addons);
          // WebElement extraWeb = driver.findElement(extraseat);
           List<WebElement> choice = driver.findElements(By.xpath("(//div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj r-e65kyq r-1t2hasf']//div)[1]//a"));
           Actions act = new Actions(driver);
           act.moveToElement(Add).build().perform();
           System.out.println(choice.size());
           Thread.sleep(3000);
           for(WebElement e:choice)
           {
        	   String text = e.getText();
        	   System.out.println(text);
        	   if(text.equals("Extra Seat"))
        	   {
        		   e.click();
        		   break;
        	   }
        	   }
           Thread.sleep(3000);
           //extraWeb.click();
     }
	

}
