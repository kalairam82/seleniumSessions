package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertsPopUpsHandling {

	public static void main(String[] args) throws InterruptedException {
	
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		    WebElement JSAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		    JSAlert.click();
		    Alert alert = driver.switchTo().alert();
		    String text = alert.getText();
		    System.out.println(text);
		    //alert.accept();
		    alert.dismiss();
		    Thread.sleep(2000);
		
		    WebElement JSConfirm =driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		    JSConfirm.click();
            Alert alert1 = driver.switchTo().alert();
            String text1 = alert1.getText();
            		System.out.println(text1);
            alert1.accept();
            Thread.sleep(2000);
            
            WebElement JSprompt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
            JSprompt.click();
            Alert alert2 = driver.switchTo().alert();
            String Text2 = alert2.getText();
            System.out.println(Text2);
            alert2.sendKeys("Testing");
            alert.accept();
            
            
            		
	}

}
