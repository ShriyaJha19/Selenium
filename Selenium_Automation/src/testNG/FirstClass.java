package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstClass {
	@Test
	public void fblogin() {
		WebDriver driver;
		// webdriver= interface; driver=Reference name of the webdriver
		// invoke chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.name("email")).sendKeys("Shriya@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Shriya1234");
		// driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.linkText("Forgot account?")).click();
	}
}
