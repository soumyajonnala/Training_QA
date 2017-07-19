package First.program;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample2 {
	@Parameters("browser")
	@Test
	public void FbApp(String browser) throws MalformedURLException, InterruptedException{
		System.out.println(browser);
		
		DesiredCapabilities cap=null;
		if(browser.equals("firefox")){
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.ANY);
		
		}else if(browser.equals("chrome")){
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:8090/wd/hub"),cap);
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		String a=driver.getTitle();
		System.out.println(a);
		driver.quit();

}
}
