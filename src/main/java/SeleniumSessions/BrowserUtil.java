package SeleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	
	  WebDriver driver;
		// TODO Auto-generated method stub
                public WebDriver initDriver(String browsername)
                {
                	System.out.println("browser name is: " +browsername);
                	
                	switch (browsername.trim().toLowerCase()) {
					case "chrome":
						driver = new ChromeDriver();
						break;
					case "firefox":
						driver = new FirefoxDriver();
						break;
					case "edge":
						driver = new EdgeDriver();
						break;
					case "safari":
						driver = new SafariDriver();
						break;
						default:
							System.out.println("please pass the right browser");
							throw new RuntimeException("Invalid browser");
						
					}
                	return driver;                
                }
                
                public void launchUrl(String url)
                {
                	if (url == null)
                	{
                		System.out.println("The url cannot be null");
                	}
                	if (url.length()== 0)
                	{
                		System.out.println("The url cannot be empty");
                	}
                	if(url.indexOf("http") == 0)
                	{
                	driver.get(url);
                	}
                }
                
                public void launchUrl(URL url) {
            		if (url == null) {
            			throw new RuntimeException("===url can not be null===");
            		}
            		if (String.valueOf(url).indexOf("http") == 0) {
            			driver.navigate().to(url);
            		} else {
            			throw new RuntimeException("===invalid url: http/s missing in the url===");
            		}
            	}
                public String getTitle()
                {
                	String title = driver.getTitle();
                	System.out.println("The title is: " +title);
                	return title;
                	
                }
                
                public String getPageUrl()
                {
                	String currenturl = driver.getCurrentUrl();
                	System.out.println("the current url is: " +currenturl);
                	return currenturl;
                	
                }
                
                public void closeBrowser()
                {
                	driver.close();
                	System.out.println("The browser is closed");
                }
                
                public void quit()
                {
                	driver.quit();
                	System.out.println("the browser is quit");
                }
	}


