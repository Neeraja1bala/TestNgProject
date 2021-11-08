package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;


public class LoginTest extends Baseclass {
	@Parameters({"UserName","Password"})
	@Test
	public void Negativelogin(String UserNameval,String Passwordval) {
		
		test = report.startTest("Negative Login Test");
		LoginPage login = new LoginPage();
		login.Login(UserNameval,Passwordval);
        login.ErrorCheck();
        report.endTest(test);
	}
	
	@Parameters({"UserName","CorrectPassword"})
	@Test
	public void Positivelogin(String UserNameval,String Passwordval) {
		
		test = report.startTest("Positive Login Test");
		LoginPage login = new LoginPage();
		login.Login(UserNameval,Passwordval);
		report.endTest(test);
       
	}
	
	
	
	
}
