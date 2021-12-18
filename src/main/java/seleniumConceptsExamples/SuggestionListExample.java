package seleniumConceptsExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggestionListExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		Thread.sleep(5000);
		List<WebElement> suggestionList = driver.findElements(By.xpath("//div[@class='ac_results']//li"));
		for(WebElement e: suggestionList) {
			String text = e.getText();
			System.out.println(text);
		}
		
		
	}

}
