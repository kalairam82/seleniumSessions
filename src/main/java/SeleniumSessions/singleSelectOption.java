package SeleniumSessions;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class singleSelectOption {
  static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
        ElementUtil eleUtil = new ElementUtil(driver);
        By dropdown=By.xpath("//input[@id='justAnotherInputBox']");
        //driver.findElement(dropdown).click();
        By choice = By.xpath("//h3[text()='Single Selection']/following-sibling::div//span[@class='comboTreeItemTitle']");
       // List<WebElement> choiceValue =driver.findElements(choice);
       // System.out.println(choiceValue.size());
        //eleUtil.selectMultiChoice(dropdown, choice, "choice 3");
        eleUtil.getOptionsWithoutSelectClass(dropdown, choice, "choice 3");
	}

}
