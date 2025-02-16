package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityWaitConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//selenium 3.X;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//selenium 4.X
		//1. global wait
				//2. this is only for webelements
				//3. once its applied, then it will be applied for all the upcoming webelements
				//4. it can not be applied for a specific element, explicitly wait can not be aplied for a webelement
				//5. it can not be applied for non webelements: title, url, alerts, window
				
		//webelement
				//reg page: 10 secs:
				driver.findElement(By.id("input-firstname")).sendKeys("testing");
				//e2
				//e3
				//e4(for all e2,e3,e4 the 10 seconds wait will be applied in case of implicitly wait

				//home page: 5 secs:
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				//e5 e6 e7

				//reg page: 10 secs
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//e2 e3 e4
				//forgot pwd page: 0 sec: nullify of imp wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
				
				//implicitly wait is attached with the driver and applied for each element in the entire page. not used in selenium framework 
				//implicity cannot be used for non webelements such as  title url and alerts
				
				//for alerts: wont work
				driver.get("https://the-internet.herokuapp.com/javascript_alerts");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.switchTo().alert();

	}

}
