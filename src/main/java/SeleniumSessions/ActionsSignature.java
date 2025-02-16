package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsSignature {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://signature-generator.com/draw-signature/");
		
		Thread.sleep(5000);

        WebElement canvas = driver.findElement(By.xpath("//canvas[@id='signature-pad']"));
	
	   Actions act = new Actions(driver);
	   
	   Action signature = act.click()
			                 .moveToElement(canvas, 30, 10)
				              .clickAndHold(canvas)
				              .moveToElement(canvas, -200, -50)
				              .moveByOffset(100, -50)
				              .moveByOffset(100, -50)				
				               .moveByOffset(30, 30)
				               .release()
				               .build();
	   
	   signature.perform();
	} 
	

}
