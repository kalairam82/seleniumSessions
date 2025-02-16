package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {
	
          static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String browser = "edge";
            
            switch(browser.trim().toLowerCase()) {
            case "chrome":
            	driver = new ChromeDriver();
            	break;
            case "firefox":
            	driver = new FirefoxDriver();
            	break;
            case "edge":
            	driver = new EdgeDriver();
            	break;
            default:
            	System.out.println("Please pass the right browser");
                throw new RuntimeException("Invalid Browser");
                  }
           driver.quit(); 
            
          
	}

}
