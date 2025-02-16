package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	      driver.get("https://www.amazon.com/Franklin-Sports-Pickleball-Paddle-Ball/dp/B07VVMR1YY?th=1");
	      Thread.sleep(6000);
		// TODO Auto-generated method stub
	      driver.manage().window().maximize();
	      Thread.sleep(6000); 
          By info= By.xpath("(//tr/th[@class='a-color-secondary a-size-base prodDetSectionEntry']//ancestor::div/child::table)[last()-1]");
          List<WebElement> productinfo=driver.findElements(info);
          System.out.println(productinfo.size());
                   
          for(WebElement e:productinfo)
          {
        	  String prodinfo = e.getText();
        	  System.out.println(prodinfo);
          }
          
	}

}
