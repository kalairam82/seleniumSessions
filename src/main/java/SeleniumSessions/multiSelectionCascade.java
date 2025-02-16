package SeleniumSessions;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiSelectionCascade {
           static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            driver = new ChromeDriver();
            driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
            ElementUtil eleUtil = new ElementUtil(driver);
            By dropdown = By.xpath("//input[@id = 'justAnInputBox1']");
            driver.findElement(dropdown).click();
            By Choices = By.xpath("//h3[text() = 'Multi Selection With Cascade Option Select']/following-sibling::div//span[@class ='comboTreeItemTitle']");
//            List<WebElement> choiceValue =driver.findElements(Choices);
//            System.out.println(choiceValue.size());
           eleUtil.selectMultiChoice(dropdown, Choices, "choice 1", "choice 2", "choice 5");
	}

}
