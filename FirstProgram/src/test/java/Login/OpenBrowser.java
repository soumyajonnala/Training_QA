package Login;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenBrowser {
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", 
				"C://Soumya//ChromeDriver//chromedriver.exe");
	}
	@Test
	public void open(){
		
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://www.krishnatraining.com/");
           /* driver.findElementByXPath("//a[contains(@class,'login')]").click();
            driver.findElementByXPath("//input[@id='login_email']").sendKeys("abc@gmail.com");
            driver.findElementByXPath("//input[@id='login_password']").sendKeys("password");
           driver.findElementByXPath("//strong[text()='Forgot Password?']").click();
            driver.findElementByXPath("//input[@id='login_submit']").click();*/
			driver.findElementByXPath("//a[contains(@class,'level1-a offeredcourses')]").click();
			driver.findElementByXPath("//div[contains(@class,'listHolder colums1')]");
           

	}

}
