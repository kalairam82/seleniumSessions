package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelector {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login/legacy");
		Thread.sleep(5000);

		// css: cascaded style sheet
		// cssSelector: is a locator

		// id
		// #id
		// tag#id
		// #input-email
		// input#input-email
		By.cssSelector("input#input-email");

		// class:
		// .classname
		// tag.classname
		// input.form-control
		// .c1.c2.c3...cn
		// tag.c1.c2.c3...cn
		// input.form-control.input-lg
		// input.input-lg.form-control
		// input.form-control.private-form__control.login-email

		// #id.class
		// .class#id
		// tag#id.class
		// tag.class#id
		// input#username.login-email
		// input.login-email#username
		// input.form-control.private-form__control.login-email#username

		By.cssSelector("input.form-control.private-form__control.login-email#username");

		// for other attributes:
		// tag[attr='value']
		// input[value='Login'] -- css
		// //input[@value='Login'] -- xpath

		// tag[attr1='value'][attr2='value']
		// input[value='Login'][type='submit'] -- css
		// input[@value='Login' and @type='submit'] - xpath

		// input[name='email'][type='text'][id='input-email'][placeholder='E-Mail Address']

		// input[id][placeholder][type]
		// a[href] --FEs
		// input[name='email']#input-email

		// text in css: no support for text in CSS

		// contains:
		// tag[attr *= 'value']
		// input[placeholder *= 'E-Mail']

		// startwith:
		// tag[attr ^= 'value']
		// input[placeholder ^= 'E-Mail']

		// endswith:
		// tag[attr $= 'value']
		// input[placeholder $= 'Address']

		// parent to child:
		// parentTag childTag --> direct + indirect child elements
		// form#hs-login div -- 24
		// div#content form input#input-email

		// parentTag > childTag --> direct child elements
		// form#hs-login > div --8

		// select#Form_getForm_Country > option -- 233
		// select#Form_getForm_Country option -- 233

		// child to parent: NA -- backward traversing is not allowed in CSS

		// sibling in css: only for following sibling is allowed
		// label[for='input-email'] + input#input-email -- immediate following sibling
		By.cssSelector("label[for='input-email'] + input#input-email");

		// option[value='Afghanistan'] ~ option -- all following option siblings

		// index in css:

		// select#Form_getForm_Country > option:nth-of-type(2) --> 2nd index
		// select#Form_getForm_Country > option:nth-of-type(n) -- all elements
		// select#Form_getForm_Country > option:first-child -- first child
		// select#Form_getForm_Country > option:last-child -- child child

		// select#Form_getForm_Country > option:nth-child(5) --5th option
		// select#Form_getForm_Country > option:nth-last-child(5) -- 5th from the last
		// select#Form_getForm_Country > option:nth-last-child(2) -- 2nd from the last
		// select#Form_getForm_Country > option:nth-last-child(n) -- all elements

		// select#Form_getForm_Country > option:nth-child(odd)
		// select#Form_getForm_Country > option:nth-child(even)

		// odd/even in xpath:
		// 10 % 2 == 0 --even
		// 9% 2 == 1 -- odd

		// select[@id='Form_getForm_Country']/option[position() mod 2 = 0] --- even
		// select[@id='Form_getForm_Country']/option[position() mod 2 = 1] -- odd

		// comma in css:
		// input#username, input#password, input#remember, button#loginBtn
		By impElements = By.cssSelector("input#username, input#password, input#remember, button#loginBtn");

		List<WebElement> impEleList = driver.findElements(impElements);

		System.out.println(impEleList.size());

		if (impEleList.size() == 4) {
			System.out.println("login form having all imp elements");
		} else {
			System.out.println("FAIL");
		}
		
		
		// not in css:
		// input.form-control:not(input[name='search'])
		// input.form-control:not(input[name='search']):not(#input-telephone)
		
		
		//                     xpath                 vs               css
		//1.syntax            complex                                 easy
		//2.performance       good                					  good
		//3.text              yes										no
		//4. sibling           yes                                     limited(only following)
		//5. child to parent   yes             							no
		//6. parent to child	yes										yes
		//7. backward traverse  yes                						no
		//8. index				yes										yes(+1)	
		//9. not                yes										yes
		//10. comma/union		yes										yes
		//11. endswith          no                             			yes
		//12. contains			yes										yes
		//13. startswith		yes										yes
		//14. space:            yes										no
		//15. SVG				yes										limited
		//16. SHADOW DOM		no										yes	
		//17. Relative Locators	yes										yes
		
		
	}

}

