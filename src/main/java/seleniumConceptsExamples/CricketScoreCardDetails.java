package seleniumConceptsExamples;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreCardDetails {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2021-22-1267897/australia-vs-pakistan-2nd-semi-final-1273755/full-scorecard");
		driver.findElement(By.xpath("//table[@class='table bowler']//td/a[text()='Adam Zampa']"));
		System.out.println(getBowlerDetails("Adam Zampa"));
	}

	public static List<String> getBowlerDetails(String playerName) {

		String xpath = "//a[text()='" + playerName + "']//parent::td/following-sibling::td";
		List<WebElement> bowlerList = driver.findElements(By.xpath(xpath));
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < bowlerList.size(); i++) {
			String text = bowlerList.get(i).getText();
			list.add(text);
		}
		return list;

	}

}
