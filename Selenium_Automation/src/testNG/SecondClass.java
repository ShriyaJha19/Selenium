package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class SecondClass {
  @Test
  public void f() {
	  System.out.println("@Test f");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass");
  }
  @Test
  public void a() {
	  System.out.println("@Test a");
	  
  }
  @Test
  public void f1() {
	  System.out.println("@Test f1");
  }
}
