package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class ReTesting {
	@Test(dataProvider = "facebooklogin")
	public void f(String username, String password) throws Exception {
		WebDriver driver;
		// webdriver= interface; driver=Reference name of the webdriver
		// invoke chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	    driver.findElement(By.id("loginbutton")).click();
	    Thread.sleep(5000);
	    driver.get("https://www.facebook.com/");
	}

	@DataProvider
	public Object[][] facebooklogin() {
		return new Object[][] { 
			new Object[] { "Shriya@gmail.com", "abc123" }, 
			new Object[] { "abc@gmail.com", "xyz123" }, 
			new Object[] { "xyz@gmail.com", "def123" },
			};
	}
}
