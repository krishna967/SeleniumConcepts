package seleniumConceptsExamples;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownWithoutSelectClassMethod {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");
		WebElement country = driver.findElement(By.name("Country"));
		Select select = new Select(country);
		List<WebElement> listOfOptions = select.getOptions();
		for (WebElement e : listOfOptions) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals("India")) {
				e.click();
				break;
			}

		}
	}

}
