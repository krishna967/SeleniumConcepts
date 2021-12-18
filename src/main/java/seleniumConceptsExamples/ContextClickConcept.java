package seleniumConceptsExamples;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClickConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(rightClickMe).perform();
		List<WebElement> listOfOptions = driver.findElements(By.xpath(
				"//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]/span"));

		for (WebElement e : listOfOptions) {
			String text = e.getText();
			System.out.println(text);
			e.click();
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			System.out.println(alertText);
			alert.accept();
			act.contextClick(rightClickMe).perform();
		}
	}

}
