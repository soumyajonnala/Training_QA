package Selenium;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	@BeforeSuite
	public void suite(){
		System.out.println("this is suite method");
	}
	
	@Test
	public static void add(){
		System.out.println("this is add");
	}

	public static void main(String[] args) {

SuiteExample.add();

	}

}
