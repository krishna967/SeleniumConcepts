package seleniumConceptsExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassExampleByFacebook {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// implicit wait condition --  apply each and every web element in our script
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		// WebElement day =
		// driver.findElement(By.xpath("//div[@class='_8ien']//select[@id='day']"));
		driver.findElement(By.xpath("//div[@class='_8ien']//input[@name='firstname']")).sendKeys("Krishna");

		By monthLocator = By.id("month");
		selectDropDownByVisibleText(monthLocator, "May");

		By dayLocator = By.id("day");
		selectDropDownByVisibleText(dayLocator, "19");

		By yearLocator = By.name("birthday_year");
		selectDropDownByVisibleText(yearLocator, "1994");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void selectDropDownByVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);

	}
	public static void selectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);;

	}
	public static void selectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
}
