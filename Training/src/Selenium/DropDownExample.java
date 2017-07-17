package Selenium;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample{

	public static void main(String[] args) {
	 
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement a=driver.findElementById("month");
		
		Select drop= new Select(a);
		
		//drop.selectByIndex(9);
		//drop.selectByValue("12");
		//drop.selectByVisibleText("Oct");
		
		List<WebElement> b=drop.getOptions();
		System.out.println(b.size());
		
		
		for (int i=0; i<b.size();i++){
			System.out.println(b.get(i).getText());
			
		}
		
}
}
