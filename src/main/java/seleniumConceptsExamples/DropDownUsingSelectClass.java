package seleniumConceptsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownUsingSelectClass {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// driver.get("http://automationpractice.com/index.php");
		driver.get("https://www.orangehrm.com/contact-sales/");
		/*
		 * WebElement country = driver.findElement(By.id("Form_submitForm_Country"));
		 * Select select = new Select(country); select.selectByIndex(1);
		 * Thread.sleep(2000); select.selectByValue("American Samoa");
		 * Thread.sleep(2000); select.selectByVisibleText("India");
		 */

		By country = By.id("Form_submitForm_Country");
		doSelectDropDownByIndex(country, 5);
		Thread.sleep(2000);
		doSelectDropDownByValue(country, "Cuba");
		Thread.sleep(2000);
		doSelectDropDownByVisibletext(country, "India");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public static void doSelectDropDownByVisibletext(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}
}
