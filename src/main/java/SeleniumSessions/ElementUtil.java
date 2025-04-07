package SeleniumSessions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * Element Utilities
 */

public class ElementUtil {
	
    private WebDriver driver;
    
    public ElementUtil(WebDriver driver)
    {
    	this.driver = driver;
    	
    }
    private void nullCheck(CharSequence... value)
   {   
	if(value == null)
	{
		throw new RuntimeException("value/attribute/Property cannot be null");
	}
   } 

    
    public void doClick(By locator)
    {
    	getElement(locator).click();
    }
    public void doClick(String locatortype,String locatorvalue)
	 {
		 getElement(getStringLocator(locatortype,locatorvalue)).click();
	 }
	 
    public String dogetText(By locator)
    {
    	return getElement(locator).getText();
    	
    }
    public String dogetText(String locatortype,String locatorvalue)
    {
    	return getElement(getStringLocator(locatortype,locatorvalue)).getText();
    	
    }
    public void doSendKeys(By locator,CharSequence... value)
    {
    	nullCheck(value);
    	getElement(locator).sendKeys(value);
    }
    public void doSendKeys(String locatortype,String locatorvalue, CharSequence...value)
	   {
    	   nullCheck(value);
		   getElement(getStringLocator(locatortype,locatorvalue)).sendKeys(value);
	   }
    public  String dogetDomAttributes(By locator, String attrName)
	{
    	nullCheck(attrName); 
       return getElement(locator).getDomAttribute(attrName);
     }
	
	public String dogetDomProperty(By locator, String propName)
	{
       nullCheck(propName);		
       return getElement(locator).getDomProperty(propName);
     }
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public  boolean isElementDisplayed(By locator) {
		if (getElements(locator).size() == 1) {
			System.out.println("element is available on the page one time");
			return true;
		} else {
			System.out.println("element is not available on the page");
			return false;
		}
	}

	public boolean isElementDisplayed(By locator, int elementCount) {
		if (getElements(locator).size() == elementCount) {
			System.out.println("element is available on the page " + elementCount + " times");
			return true;
		} else {
			System.out.println("element is not available on the page");
			return false;
		}
	}

	public boolean doIsElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("element is not displayed");
			return false;
		}
	}
    
    public WebElement getElement(By locator)
    {
    	return driver.findElement(locator);
    }
    
    
   
	 public By getStringLocator(String locatortype, String locatorvalue)
  {
	By locator = null;
	
	switch (locatortype.toLowerCase().trim()) {
	case "id":
		locator = By.id(locatorvalue);
		break;
	case "name":
		locator = By.name(locatorvalue);
		break;
	case "classname":
		locator = By.className(locatorvalue);
		break;	
	case "xpath":
		locator = By.xpath(locatorvalue);
		break;
	case "css":
		locator = By.cssSelector(locatorvalue);
		break;
	case "linktext":
		locator = By.linkText(locatorvalue);
		break;	
	case "partiallinktext":
		locator = By.partialLinkText(locatorvalue);
		break;	
	case "tagname":	
		locator =By.tagName(locatorvalue);
		break;
		default:
			System.out.println("This is not a valid locator");
		break;
	} 
return locator;	
}
	 /**
	  * Streams
	  * @param locator
	  * @return
	  */
	 public List<String> fetchElementsText(By locator) 
	 {
	 
		 List<String> eleTextList = new ArrayList<String>();
		  
		 getElements(locator)
		         .stream()
		             .filter(e -> !e.getText().isEmpty())
		                 .forEach(e -> eleTextList.add(e.getText()));
		             
		  return eleTextList;           
	 }
	 
	 public void printElementText(By locator) 
	 {
			getElements(locator)
					.stream()
						.filter(e -> !e.getText().isEmpty())
							.forEach(e -> System.out.println(e.getText()));
	 }

	 
	/** select drop down Utils
	 *  
	 * @param locator
	 * @param index
	 */
	 
	 public  void doSelectDropDownbyIndex(By locator, int index)
		{
			Select select = new Select(getElement(locator));
			select.selectByIndex(index);
		}
		public  void doSelectDropDownbyValue(By locator, String value)
		{
			Select select = new Select(getElement(locator));
			select.selectByValue(value);
		}
		public  void doSelectDropDownbyVisibleText(By locator, String text)
		{
			Select select = new Select(getElement(locator));
			select.selectByVisibleText(text);
			}
		
		 public void doselectByContainsVisibleText(By locator, String visibletext)
		   {
			   Select select = new Select(getElement(locator));
			   select.selectByContainsVisibleText(visibletext);
		   }
		 
		 public void dodeselectByVisibleText(By locator, String text)
			{
			
				 Select select = new Select(getElement(locator));
				 select.deselectByVisibleText(text);
			}
		 public void dodeselectByIndex(By locator, int number)
			{
			
				 Select select = new Select(getElement(locator));
				 select.deselectByIndex(number);
			}
		 public void dodeSelectDropDownbyValue(By locator, String value)
			{
				Select select = new Select(getElement(locator));
				select.deselectByValue(value);
			}
		 public void dodeselectByContainsVisibleText(By locator, String value)
		   {
			   Select select = new Select(getElement(locator));
			   select.deSelectByContainsVisibleText(value);
		   }

		public void getDropDownOptionsText(By locator)
		{
			Select select = new Select(getElement(locator));
			List<WebElement> OptionsSize = select.getOptions();
			
			for(WebElement e:OptionsSize)
			{
	           String text = e.getText();
	           System.out.println(text);
			}
						
			
		}
		
		public  List<String> getDropDownOptionsTextList(By locator)
		{
			Select select = new Select(getElement(locator));
			List<WebElement> OptionsSize = select.getOptions();
			System.out.println("Options size: " + OptionsSize.size());
			List<String> OptionsValueList = new ArrayList<String>();
			for(WebElement e: OptionsSize)
			{
				String text = e.getText();
				OptionsValueList.add(text);
						
			}
			return OptionsValueList;
		}
		
		
		
		public int getDropDownOptionsCount(By locator)
		{
			Select select = new Select(getElement(locator));
			List<WebElement> OptionsSize = select.getOptions();
			System.out.println("Options size: " + OptionsSize.size());
			return OptionsSize.size();
		}
		
		public void selectValuefromDropDown(By locator, String value)
		{
			
			Select select = new Select(getElement(locator));
			List<WebElement> optionsList = select.getOptions();
			boolean flag = false;
			
			for(WebElement e:optionsList)
			{
				String text = e.getText();
				System.out.println(text);
				if(text.contains(value))
				{
					e.click();
					flag = true;
					break;
				
				}
				
			}
			
			if(flag) {
				System.out.println(value + " is available and selected");
			}
			else {
				System.out.println(value + " is not available");
			}

		}
		
		public void getOptionsWithoutSelectClass(By locator, String value)
		{
			 List<WebElement> Options = getElements(locator);
			System.out.println(Options.size());
			boolean flag = false;
	        for(WebElement e: Options)
	        {
	        	String text = e.getText();
	        	System.out.println(text);
	        	        	
	        	if(text.contains(value))
	            {
		              e.click();
		              flag = true;
		              break;
	              }
	           }
	        if(flag)
	        {
	        	System.out.println(value + " is selected");
	        }
	        else
	        {
	        	System.out.println("The value is not selected");
	        }
		}
		public void getOptionsWithoutSelectClass(By dropdown,By locator, String value)
		{
			 doClick(dropdown);
			List<WebElement> Options = getElements(locator);
			System.out.println(Options.size());
			boolean flag = false;
	        for(WebElement e: Options)
	        {
	        	String text = e.getText();
	        	System.out.println(text);
	        	        	
	        	if(text.contains(value))
	            {
		              e.click();
		              flag = true;
		              break;
	              }
	           }
	        if(flag)
	        {
	        	System.out.println(value + " is selected");
	        }
	        else
	        {
	        	System.out.println("The value is not selected");
	        }
		}

		/**
		 * 
		 * @param searchField
		 * @param suggestions
		 * @param searchKey
		 * @param actualValue
		 * @throws InterruptedException
		 */
		public void doSearch(By searchField, By suggestions, String searchKey, String actualValue)
				throws InterruptedException {

			doSendKeys(searchField, searchKey);
			Thread.sleep(2000);

			List<WebElement> suggList = getElements(suggestions);
			System.out.println(suggList.size());
			boolean flag = false;

			for (WebElement e : suggList) {
				String text = e.getText();
				System.out.println(text);
				if (text.contains(actualValue)) {
					e.click();
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println(actualValue + " is available and clicked");
			} else {
				System.out.println(actualValue + " is not available");
			}

		}

		public void selectMultiChoice(By dropdown,By choices , String... choicevalue)
		{
			doClick(dropdown);
			List<WebElement> choice = getElements(choices);
			System.out.println(choice.size());
			if(choicevalue[0].equalsIgnoreCase("all"))
			{
				// select all the choice one by one:
				for(WebElement e:choice)
				{
				e.click();
				}
			}
			else
			for(WebElement e:choice)
			  {
				String text = e.getText();
				System.out.println(text);
				
				for(String ch:choicevalue)
				  {
					if(text.equals(ch))
					{
						e.click();
					}
					
				  }
			   }
		 }
		//Actions Methods
		/**
		 * 
		 * @param locator
		 * @param value
		 */
		 public void doActionsSendKeys(By locator, CharSequence... value)
		   {
			   Actions act = new Actions(driver);
			   act.sendKeys(getElement(locator),value).build().perform(); 
			   
		   }
		   public void doActionsClick(By locator)
		   {
			  Actions act = new Actions(driver);
			  act.click(getElement(locator)).build().perform();;
		   }
		   public void handleTwoLevelMenuSubMenuHandling(By parentMenuLocator, By childMenuLocator) throws InterruptedException
			{
				Actions act = new Actions(driver);
				act.moveToElement(getElement(parentMenuLocator)).build().perform();
				Thread.sleep(2000);
				getElement(childMenuLocator).click();
			}
		   public void level4MenuSubMenuHandling(By Level1Menu,By Level2Menu,By Level3Menu,By Level4Menu ) throws InterruptedException
	       {
	    	   getElement(Level1Menu).click();
	    	   Actions act = new Actions(driver);
	    	   Thread.sleep(1000);
	    	   act.moveToElement(getElement(Level2Menu)).build().perform();
	    	   Thread.sleep(1000);
	    	   act.moveToElement(getElement(Level3Menu)).build().perform();
	    	   Thread.sleep(1000);
	    	   getElement(Level4Menu).click();
	    	   
	    	   
	       }
		   public void doSendKeysWithPause(By locator, String value, long pauseTime) 
			{
				Actions act = new Actions(driver);
						char ch[]=value.toCharArray();
				    for(char e:ch)
				    {
				    	act.sendKeys(getElement(locator), String.valueOf(e))
				    	.pause(pauseTime)
				    	.build()
				    	.perform();
				    
				    }
			}
	

}
			
		

	
    
      
    


