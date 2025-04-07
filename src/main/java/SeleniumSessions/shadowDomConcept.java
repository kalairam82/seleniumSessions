package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowDomConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
         
        Thread.sleep(10000);
		
		//browser-->Page DOM-->shadow dom(open) -->shadow dom (open) --> input#pizza
		
		//using JS Path: 
        String JSPath = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement pizza = (WebElement)js.executeScript(JSPath);
        pizza.sendKeys("testing");
        
      //driver.findElement(By.id("pizza")).sendKeys("veg pizza");//NSE
		
      		//shadow dom:
      		//xpath: is not supported
      		//css: only css is supported
//is shadow-root is written with closed then it cannot be automated
	}

}
