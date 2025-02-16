package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	    List<WebElement> footerList=driver.findElements(By.xpath("//footer//a"));
	    System.out.println(footerList.size());
	    for(WebElement e:footerList)
	    {
	    	System.out.println(e.getText());
	    }
	    driver.quit();

	}

}
