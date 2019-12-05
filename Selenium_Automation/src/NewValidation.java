import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewValidation {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ttdsevaonline.com/#/registration");
		driver.manage().window().maximize();

		// Validate Individual button is selected

		if (driver.findElement(By.name("donor")).isSelected()) {
			System.out.println("individual radio button is selected");
		} else {
			System.out.println("individual radio button is not selected");
		}
		if (driver.findElement(By.xpath("//*[text()='Account Type']")).isDisplayed()) {
			System.out.println("account type is displayed");
		} else {
			System.out.println("account type is not displayed");
		}

		driver.findElement(By.name("fName")).sendKeys("Shriya");
		driver.findElement(By.name("lName")).sendKeys("Behera");
		driver.findElement(By.name("mobNo")).sendKeys("12345678");
		driver.findElement(By.xpath("(//*[@name='gender'])[2]")).click();
		driver.findElement(By.name("address1")).sendKeys("123 House");
		driver.findElement(By.name("address2")).sendKeys("my street");
		driver.findElement(By.name("cityS")).sendKeys("My City");
		driver.findElement(By.name("zipCode")).sendKeys("55566");
		
		
		driver.findElement(By.id("regdob")).click();
		//dropdown: check the tagname of element, it should be 'select'
		new Select(driver.findElement(By.xpath("//select[@title='Change the month']"))).selectByVisibleText("March");
		new Select(driver.findElement(By.xpath("//select[@title='Change the year']"))).selectByVisibleText("1984");
		driver.findElement(By.linkText("18")).click();
		//driver.findElement(By.linkText("Terms and Conditions")).click();
		new Select(driver.findElement(By.name("countryS"))).selectByVisibleText("India");
		new Select(driver.findElement(By.name("stateS"))).selectByVisibleText("Chhattisgarh");
		new Select(driver.findElement(By.name("proofS"))).selectByVisibleText("Aadhaar Card ");
		driver.findElement(By.name("proofId")).sendKeys("121445466");
		driver.findElement(By.name("emailId")).sendKeys("shriya@hotmail.com");
		driver.findElement(By.name("password")).sendKeys("shriya123");
		driver.findElement(By.name("repassword")).sendKeys("shriya123");
		driver.findElement(By.id("regi_continue")).click();
	
		
		
		
		
		
		//driver.quit();
	}

}
