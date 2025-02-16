package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassAssignment {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
             driver = new ChromeDriver();
             driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
            WebElement componenttab = driver.findElement(By.xpath("//a[text()='Components']"));
            WebElement Printer = driver.findElement(By.xpath("//a[text()='Monitors (2)']"));

            Actions act1 = new Actions(driver);
            act1.moveToElement(componenttab)
                        .build()
                           .perform();
            Thread.sleep(1000);
            Printer.click();
             
                             
             driver.manage().window().maximize();
             WebElement laptoptab = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
             WebElement windows = driver.findElement(By.xpath("//a[text()='Windows (0)']"));
                        
             act1.moveToElement(laptoptab)
                        .build()
                            .perform();
             Thread.sleep(1000);
             windows.click();
             
             WebElement desktoptab = driver.findElement(By.xpath("//a[text()='Desktops']"));
             WebElement mac = driver.findElement(By.xpath("//a[text()='Mac (1)']"));
            
          
             act1.moveToElement(desktoptab)
                        .build()
                            .perform();
             Thread.sleep(1000);
             mac.click();
	} 

}
