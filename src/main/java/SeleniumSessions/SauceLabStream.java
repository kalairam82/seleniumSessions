package SeleniumSessions;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLabStream {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		List<WebElement> prices = driver.findElements(By.cssSelector("div.inventory_item_price"));
		
		prices.stream().forEach(e -> System.out.println(e.getText()));

        List<Double> Price_dec_Order = prices
        		.stream()
        		      .map(e-> Double.parseDouble(e.getText().substring(1)))
                             .sorted(Comparator.reverseOrder())
                                       .collect(Collectors.toList());
        System.out.println(Price_dec_Order);
        System.out.println("_______________________");
        System.out.println("max price :" +Price_dec_Order.get(0));
        System.out.println("min Price :" +Price_dec_Order.get(Price_dec_Order.size()-1));
        System.out.println("__________________");
        double firstprice = prices.stream().map(e-> Double.parseDouble(e.getText().substring(1))).findFirst().get();
        System.out.println("the first price is: " +firstprice);
        System.out.println("________________________");

		double lastPrice = prices.stream().map(e -> Double.parseDouble(e.getText().substring(1))).reduce((first,second) -> second).get();
		System.out.println("the last price is: " +lastPrice);
		
		System.out.println("___________________");
		
		double maxPrice = prices.stream().map(e -> Double.parseDouble(e.getText().substring(1))).max(Double :: compareTo).get();
		System.out.println("max price : " + maxPrice);
		
		double minPrice = prices.stream().map(e -> Double.parseDouble(e.getText().substring(1))).min(Double :: compareTo).get();
		System.out.println("min price : " + minPrice);
		
		System.out.println("____________________________");
        
		driver.navigate().to("https://demo.guru99.com/test/web-table-element.php");
		
		double minstockprice = 
				driver.findElements(By.xpath("//table[@class = 'dataTable']//tr//td[4]"))
		            .stream()
		               .map(e -> Double.parseDouble(e.getText()))
		                   .min(Double :: compareTo).get();
       System.out.println("The minimun stock price is:" +minstockprice);

	}
}
