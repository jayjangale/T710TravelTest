package com.TravelTest.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.TravelTest.Page.LoginPage;

public class LoginTestWithValidAndInvalidData {
	@Test (priority = 0)
	public void loginWithValid() throws Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://travel-test-bug.vercel.app/");
		Thread.sleep(2000);
		LoginPage p = new LoginPage(w);
		p.login();
		Thread.sleep(2000);
		p.enterEmail("jay@yahoo.com");
		Thread.sleep(2000);
		p.enterPassword("9876543210");
		Thread.sleep(2000);
		p.rememberMe();
		Thread.sleep(2000);
		p.loginButton();
		Thread.sleep(2000);
		w.quit();
	}

@Test (priority =1)
public void loginWithInValid() throws Exception {
	WebDriver w = new ChromeDriver();   // pre-condition
	w.get("https://travel-test-bug.vercel.app/");       // pre-condition
	Thread.sleep(2000);
	LoginPage p = new LoginPage(w);
	p.login();
	Thread.sleep(2000);
	p.enterEmail("jay123@yahoo.com");    // test-condition
	Thread.sleep(2000);
	p.enterPassword("9876543210AA");    // test-condition
	Thread.sleep(2000);
	p.rememberMe();
	Thread.sleep(2000);
	p.loginButton();          // test-condition
	Thread.sleep(2000);
	w.quit();	          //   post condition
	Assert.assertEquals(true, false);
	}
}
		



