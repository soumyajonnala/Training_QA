package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG {
	
	@Test(priority=6)
	public void closeBrowser(){
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}

}
