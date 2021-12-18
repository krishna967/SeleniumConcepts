package seleniumConceptsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframesExample {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
		driver.get("https://allwebco-templates.com/support/S_script_IFrame.htm");
		Thread.sleep(5000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@name='Framename' and @class='framesample framesample2']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//div[@class='menuicon']//img[@alt='Search']")).click();
		
		
		
		
	}

}
