package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSample {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.get("https://ttdsevaonline.com/#/registration");
		driver.navigate().to("https://www.mail.com/");
		driver.manage().window().maximize();
		
		//to right click on element. will use action commonds
		Actions act = new  Actions(driver);
		
		//act.contextClick(driver.findElement(By.id("signup-button"))).build().perform();

		
		act.doubleClick(driver.findElement(By.id("signup-button"))).build().perform();
		
		
		
	}
}
