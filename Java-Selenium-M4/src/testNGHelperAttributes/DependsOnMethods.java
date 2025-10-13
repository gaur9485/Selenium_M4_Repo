package testNGHelperAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
  @Test(priority = 1)
  public void register() {
	  
	  Reporter.log("This is register method", true); 
	  System.out.println(10/0);
	  }
  
  @Test(priority = 2, dependsOnMethods = "register")
  public void login() {
	  
	  Reporter.log("This is login method", true); 
	  }
  
  @Test(priority = 3, dependsOnMethods = {"register", "login"})
  public void addToCart() {
	  
	  Reporter.log("This is add to cart method", true); 
	  }
  
  @Test(priority = 4, dependsOnMethods = "addToCart")
  public void removeFromCart() {
	  
	  Reporter.log("This is remove from cart method", true); 
	  }
  
  
}
