package testNG;

import org.testng.annotations.Test;

public class TestCase2 extends Baseclass{

	@Test(groups= {"sanity"})
	public void CreditCardTest() {
		System.out.println("Inside Credit Card");
	}
		

}
