package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitForAlert {
static WebDriver driver;
	public static void main(String[] args) {
		  driver = new ChromeDriver();
		  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		  WebElement JSAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		  JSAlert.click();
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		  
		  String text = alert.getText();
		  System.out.println(text);
		  alert.accept();
		  
		 }
	public static Alert waitforAlert(long timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	public static String getAlertText(long timeOut)
	{
		return waitforAlert(timeOut).getText();
	 }
	public static void acceptAlert(long timeOut)
	{
		 waitforAlert(timeOut).accept();
	}
	public static void dismissAlert(long timeOut)
	{
		 waitforAlert(timeOut).dismiss();
	}
	public static void alertSendKeys(String text, long timeOut)
	{
		 waitforAlert(timeOut).sendKeys(text);
	}
}
