package seleniumConceptsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsExample {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--incognito");
		driver = new ChromeDriver(ops);
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		String currentPageTitle = driver.getTitle();
		System.out.println(currentPageTitle);

		doSendKeys("name", "firstname", "Mohan krishna");

		/*
		 * driver.findElement(By.name("firstname")).sendKeys("Mohan");
		 * driver.findElement(By.name("lastname")).sendKeys("Krishna");
		 * driver.findElement(By.xpath("//input[@name='email']")).sendKeys(
		 * "test@gmail.com");
		 */
	}

	public static By getBy(String locatorName, String locatorValue) {
		By value = null;
		switch (locatorName) {
		case "id":
			value = By.id(locatorValue);
			break;
		case "name":
			value = By.name(locatorValue);
			break;
		case "className":
			value = By.className(locatorValue);
			break;
		case "xpath":
			value = By.xpath(locatorValue);
			break;
		default:
			System.out.println("please pass valid locator name ..." + locatorName);
			break;
		}
		return value;
	}

	public static WebElement getElement(String locator, String locatorvalue) {
		return driver.findElement(getBy(locator, locatorvalue));
	}

	public static void doSendKeys(String locator, String locatorvalue, String value) {

		getElement(locator, locatorvalue).sendKeys(value);

	}

}
