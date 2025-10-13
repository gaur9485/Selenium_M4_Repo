package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToUnderstandFlowOfAnnotations {
  @Test
  public void test1() {
	  Reporter.log("This is Test Case 1", true);
  }
  
  @AfterSuite
  public void afterSuiteMethod() {
	  Reporter.log("This is After suite Method", true);
  }
  
  @BeforeSuite
  public void beforeSuiteMethod() {
	  Reporter.log("This is Before suite Method", true);
  }
  
  @AfterTest
  public void afterTestMethod() {
	  
	  Reporter.log("This is After Test Method", true);
	  
  }
  
  @BeforeTest
  public void beforeTestMethod() {
	  Reporter.log("This is Before Test Method", true);
	  
  }
  
  @AfterClass
  public void afterClassMethod() {
	  Reporter.log("This is After Class Method", true);
  }
  
  @BeforeClass
  public void beforeClassMethod() {
	  Reporter.log("This is Before Class Method", true);
  }
  
  @AfterMethod
  public void afterMethod() {
	  Reporter.log("This is After Method Method", true);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("This is Before Method Method", true);
  }
  
  @Test
  public void test3() {
	  Reporter.log("This is Test Case 3", true);
  }
  
  @Test
  public void test2() {
	  Reporter.log("This is Test Case 2", true);
  }
  
}
