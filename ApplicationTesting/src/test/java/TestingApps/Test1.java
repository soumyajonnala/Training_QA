package TestingApps;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1{
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", 
				"C://Soumya//ChromeDriver//chromedriver.exe");
	}

	@Test
	public void openBrowser(){
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElementByName("firstname").sendKeys("soumya");
		driver.findElementByName("lastname").sendKeys("jonnala");
		System.out.println("Maven TestNG execution...");
	}
}
