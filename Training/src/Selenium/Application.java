package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.Test;

public class Application {
	@AfterSuite
	@Test(priority=4)
	public  void openBrowser(){
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElementByName("firstname").sendKeys("soumya");
		driver.findElementByName("lastname").sendKeys("jonnala");
		

	}

}
