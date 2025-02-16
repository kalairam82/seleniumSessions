package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver =new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        String title =driver.getTitle();
        System.out.println("title: " +title);
        String url =  driver.getCurrentUrl();
        System.out.println(url);
        String pagesource = driver.getPageSource();
        //System.out.println(pagesource);
        
        if(pagesource.contains("Account Login"))
        {
        	System.out.println("Pass");
        }
        driver.quit();
        
        
	}

}
