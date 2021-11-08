package testNG;

import org.testng.annotations.Test;

public class TestCase1 extends Baseclass{
	
	
	
	@Test(priority=2,description="This test case is to test the home loan functionality")
	public void HomeLoneTest() {
		System.out.println("Inside Home Loan");
	}
	@Test(priority=1,description="This test case is to test the home loan functionality")
	public void HomeLoneTest1() {
		System.out.println("Inside Home Loan1");
	}
	@Test(priority=0,groups= {"sanity"}, description="This test case is to test the car loan functionality")
	public void CarLoanTest() {
		System.out.println("Inside Car Loan");
	}
	
	
	

}
