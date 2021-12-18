package seleniumConceptsExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleExampleforListOfLangandSuggestionList {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

		driver.findElement(By.name("q")).sendKeys("Puneeth");
		Thread.sleep(5000);
		List<WebElement> suggestionList = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(suggestionList.size());
		for (WebElement e : suggestionList) {
			String text = e.getText();
			System.out.println(text);
			/*
			 * if (!(text.equals(" "))) { System.out.println(text); }
			 */
		}

		/*
		 * List<WebElement> languagelist =
		 * driver.findElements(By.xpath("//div[@id='SIvCob']/a")); for (WebElement ele :
		 * languagelist) {
		 * 
		 * String text = ele.getText().trim(); System.out.println(text); }
		 */
	}

}
