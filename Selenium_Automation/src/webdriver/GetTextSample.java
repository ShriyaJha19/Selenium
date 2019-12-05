package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.timeanddate.com/date/duration.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("m1")).sendKeys("03-Mar");
		driver.findElement(By.id("d1")).sendKeys("18");
		driver.findElement(By.id("y1")).sendKeys("1984");
		// *[@onclick='return settoday(2)']
		driver.findElement(By.xpath("(//*[text()='Today'])[2]")).click();
		driver.findElement(By.id("subbut2")).click();
		String Result = driver.findElement(By.xpath("//*[@class='bx-result']/div/div/h2")).getText();
		System.out.println(Result);
	}

}
