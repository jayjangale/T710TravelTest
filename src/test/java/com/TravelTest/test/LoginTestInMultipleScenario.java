package com.TravelTest.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.TravelTest.Page.LoginPage;
public class LoginTestInMultipleScenario {
	WebDriver w;  // declaration --> In this we only create an variable and datatype so it will know which type of data it is going to store in future.
	LoginPage lp; 
	@BeforeMethod
	public void precondition() {
		w = new ChromeDriver();   // w init.
		w.get("https://travel-test-bug.vercel.app/");
		lp = new LoginPage(w);
	}
	@Test (priority = 0)
	public void checkLoginLink() throws Exception {
		Thread.sleep(2000);
		lp.login();
//    hard assertion
		Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/login");
	}
	@Test (priority = 1)
	public void loginWithValidData() throws Exception {
		Thread.sleep(2000);
		SoftAssert soft = new SoftAssert();   // soft assert
		lp.login();
		soft.assertEquals(w.getTitle(), "Login");    
		Thread.sleep(2000);
		lp.enterEmail("jay@yahoo.com");
		Thread.sleep(2000);
		lp.enterPassword("9876543210");
		Thread.sleep(2000);
		lp.rememberMe();
		Thread.sleep(2000);
		lp.loginButton();
		soft.assertEquals(w.getTitle(), "TravelTest");
		Thread.sleep(5000);		
		soft.assertAll();
	}
	
	@Test (priority = 2,enabled = false)
	public void loginWithInValidData() throws Exception {
		Thread.sleep(2000);
		lp.login();
		Thread.sleep(2000);
		lp.enterEmail("jay123@yahoo.com");
		Thread.sleep(2000);
		lp.enterPassword("9876543210AA");
		Thread.sleep(2000);
		lp.rememberMe();
		Thread.sleep(2000);
		lp.loginButton();
		Thread.sleep(5000);	
	}
	
	@Test (priority = 3)
	public void forgetPasswordLink() throws Exception {
		Thread.sleep(2000);
		lp.login();
		Thread.sleep(2000);
		lp.forgetPassword();
	}
	
	@Test (priority = 4)
	public void createAnAccountLink() throws Exception {
		Thread.sleep(2000);
		lp.login();
		Thread.sleep(2000);
		lp.createAnAccount();	
	}
	
	@AfterMethod
	public void closeAnBrowser() throws Exception {
		Thread.sleep(2000);
		w.quit();
	}
}
	


