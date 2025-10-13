package testNGHelperAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
  @Test(priority = 1, invocationCount = 5)
  public void login() {
	  Reporter.log("This is login method", true);
  }
  
  @Test(invocationCount = 0)
  public void register() {
	  Reporter.log("This is Register method", true);
  }
  
  @Test(priority = 2,invocationCount = 3)
  
  public void addToCart() {
	  Reporter.log("This is Add To Cart method", true);
  }
}
//invocation count by default is 1
//invocation count is 0 means method will not execute
//enable by default is true
//to disable put enable = false