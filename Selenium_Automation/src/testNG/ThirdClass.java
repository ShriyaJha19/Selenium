package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class ThirdClass {
  @Test
  public void f() {
	  System.out.println("@Test f");
  }
  @BeforeMethod
  public void beforeTest() {
	  System.out.println("@@BeforeMethod");
  }
  @Test
  public void a() {

	  System.out.println("@Test a");
  }
  @AfterMethod
  public void afterTest() {
	  System.out.println("@@AfterMethod");
  }

}
