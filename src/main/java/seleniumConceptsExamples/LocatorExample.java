package seleniumConceptsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorExample {

	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		// ID locator we are locating the element and
		// one time use --
		// // create the webelement + actions (click, sendkeys, gettext, isdiplayed,
		// iseneabled)
		// 1st
		// driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		// 2nd
		// WebElement username = driver.findElement(By.id("input-email"));
		// username.sendKeys("test@gmail.com");

		// 3rd
		/*
		 * By username = By.id("input-email"); By password = By.id("input-password");
		 * WebElement emailId = driver.findElement(username);
		 * emailId.sendKeys("test@gmail.com"); WebElement pwd =
		 * driver.findElement(password); pwd.sendKeys("test@123");
		 */

		// 4th case : generic method for getElement
		/*
		 * By username = By.id("input-email"); By password = By.id("input-password");
		 * WebElement emailid = getElement(username); WebElement pwd =
		 * getElement(password); emailid.sendKeys("test"); pwd.sendKeys("test");
		 */

		/*
		 * // 5th case : by locator with generic method( getElement() and action
		 * methods) By username = By.id("input-email"); By password =
		 * By.id("input-password"); doSendKeys(username, "test@gmail.com");
		 * doSendKeys(password, "Admin@123");
		 */
		// 6th case:  ElementUtil class with generic methods
		By username = By.id("input-email");
		By password = By.id("input-password");
		ElementUtil util = new ElementUtil(driver);
		util.doSendKeys(username, "test@234");
		util.doSendKeys(password, "test123");
		// 7th case :
		
		

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}
