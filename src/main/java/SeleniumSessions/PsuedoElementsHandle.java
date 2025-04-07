package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PsuedoElementsHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // ::before
				// ::after
				// ::has
				WebDriver driver = new ChromeDriver();
				driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
				
				String mandatory= "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content')";
				String color = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('color')";
				JavascriptExecutor Js = (JavascriptExecutor)driver;
				String content = Js.executeScript(mandatory).toString();
				System.out.println(content);
				if(content.contains("*"))
				{
					System.out.println("the firstname is mandatory");
				}
				
                     String colorvalue = Js.executeScript(color).toString();
                     System.out.println(colorvalue);
				


	}

}
