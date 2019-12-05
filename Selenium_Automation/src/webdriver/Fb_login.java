package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Fb_login {

	public static void main(String[] args) {
		// creat webdriver object 
		WebDriver driver;
		//webdriver= interface; driver=Reference name of the webdriver 
		//invoke chrome browser
		//System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		//driver = new ChromeDriver();
		//System.setProperty("webdriver.ie.driver", ".\\BrowserDrivers\\IEDriverServer.exe");
		//driver = new InternetExplorerDriver();
		System.setProperty("webdriver.gecko.driver", ".\\BrowserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("Shriya@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Shriya1234");
		//driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.linkText("Forgot account?")).click();
	}

}
