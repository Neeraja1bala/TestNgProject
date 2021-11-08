package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	
	@BeforeTest
	public void BeforeTestMethod() {
		System.out.println("Inside Before Test");
	}
	
	@BeforeClass
	public void BeforeClassM() {
		System.out.println("Before class");
	}
	
	@BeforeMethod(alwaysRun =true)
	public void setup() {
		System.out.println("inside Before method ");
	}
	@AfterMethod(alwaysRun=true)
	public void teardown() {
		System.out.println("Inside After Method");
	}
	@AfterClass
	public void AfterClassM() {
		System.out.println("After class");
	}
	
	@AfterTest
	public void AfterTestMethod() {
		System.out.println("Inside After Test");
	}
	
	

}
