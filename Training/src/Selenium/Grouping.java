package Selenium;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Grouping {
	
@BeforeSuite
	@Test(priority=1,groups={"high","low"})
	public void one(){
		System.out.println("this is test one");
	}
	@Test (priority=2,groups={"high"})
	public void two(){
		System.out.println("this is test two");
	}
	@Test(priority=3,groups={"low"})
	public void three(){
		System.out.println("this is test three");

  }
	
}
