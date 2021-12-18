package seleniumConceptsExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownWithoutSelectClass {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");
		// WebElement country = driver.findElement(By.name("Country"));

		List<WebElement> listOfOptions = driver.findElements(By.xpath("//select[@name='Country']/option"));
		for (WebElement e : listOfOptions) {
			String text = e.getText();
			if (text.contains("India")) {
				e.click();
			}
		}

	}
}
