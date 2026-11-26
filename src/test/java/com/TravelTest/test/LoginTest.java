package com.TravelTest.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.TravelTest.Page.LoginPage;

public class LoginTest {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		LoginPage login = new LoginPage(w);
		w.get("https://travel-test-bug.vercel.app/");
		Thread.sleep(2000);
		login.login();
		Thread.sleep(2000);
		login.enterEmail("jay@yahoo.com");
		Thread.sleep(2000);
		login.enterPassword("9876543210");
		Thread.sleep(2000);
		login.showPassword();
		Thread.sleep(2000);
		login.rememberMe();
		Thread.sleep(2000);
		login.loginButton();
	
// standard pom  --> By class and findElement method
// pageFactory --> pageFactory class And @findby Annotation.		
		
	}
}
