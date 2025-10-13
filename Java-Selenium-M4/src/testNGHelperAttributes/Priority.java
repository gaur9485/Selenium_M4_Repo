package testNGHelperAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test(priority = 1)
  public void register() {
	  Reporter.log("This is register method", true);
  }
  
  @Test(priority = 2)
  public void login() {
	  Reporter.log("This is login method", true);
  }
  
  @Test(priority = 3)
  public void addProductToCart() {
	  Reporter.log("This is add product to cart method", true);
  }
  
  
}
