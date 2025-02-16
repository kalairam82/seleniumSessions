package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazontest {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.get("https://amazon.com");
      Thread.sleep(6000);
      By help =By.xpath("(((//div[@class = 'navFooterLinkCol navAccessibility'])[last()])//a)[last()]");
      ElementUtil er = new ElementUtil(driver);
      
      
        
      String lasttext = er.dogetText(help);
      System.out.println(lasttext);
      driver.quit();
      
	}

}
