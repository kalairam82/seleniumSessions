package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listGroupItem {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        List<WebElement> listgroupitems =driver.findElements(By.xpath("//aside/div/a[@class = 'list-group-item']"));
        System.out.println(listgroupitems.size());
        
        for(WebElement e:listgroupitems)
        {
        	System.out.println(e.getText());
        }
	}

}
