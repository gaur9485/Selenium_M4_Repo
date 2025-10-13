package pomPackage;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtility {
	
	public void selectByVisibleText(WebElement dropdown,String country) 
	{
		Select sel = new Select(dropdown);	
		sel.selectByVisibleText(country);		
	}
	
	public String random()
	{
		Random random = new Random();
		int rn=random.nextInt(1000, 9999);
		
		String randomNo = String.valueOf(rn);		
		return randomNo;
		
	}

}
