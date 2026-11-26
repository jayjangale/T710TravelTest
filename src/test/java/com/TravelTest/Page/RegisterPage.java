package com.TravelTest.Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage<WebElement> { // object Repo.
	WebDriver w;
	public RegisterPage(WebDriver wd) {
		System.out.println(wd);
		w = wd;
	}
// locator
	By fullName = By.id("register-full-name-input");
	By email = By.name("email");
	By phoneNumber = By.cssSelector("input[data-testid=\"register-phone-input\"]");
	By gender = By.name("gender");
	By password = By.xpath("//input@id=\"register-password-input\"]");
	By confirmPassword = By.id("register-confirm-password-input");
	By termAndCondition = By.id("register-terms-checkbox");
	By registerButton = By.cssSelector("data-testid=\"register-submit-button\"]");
	By loginLink = By.cssSelector("a[data-testid=\"register-login-link\"]");
	By RegisterHomepage = By.cssSelector("a[data-testid=\"nav-register-link\"]");
	
// Actions --> methods	
	
	// homepage Register 
	public void register() {
		w.findElement(RegisterHomepage).click();
	}
	
// full name
	public void enterFullName(String fullName) {
		w.findElement(this.fullName).sendKeys(fullName);
	}
	public void clearFullName() {
		w.findElement(fullName).clear();
	}
	
// email
	public void enterEmail(String Email) {
		w.findElement(email).sendKeys(Email);
	}
	public void clearEmail() {
		w.findElement(email).clear();
	}
	
// phone number
	public void enterPhoneNumber(String PhoneNumber) {
		w.findElement(phoneNumber).sendKeys(PhoneNumber);
	}
	public void clearPhoneNumber() {
		w.findElement(phoneNumber).clear();
	}
	
// gender
	public void gender(String Gender) {
		List<org.openqa.selenium.WebElement> genders = w.findElements(gender);
		for(int i = 0 ; i < genders.size(); i++) {
			if (Gender.equalsIgnoreCase("female")) {
				((org.openqa.selenium.WebElement) genders.get(0)).click();
			}else if (Gender.equalsIgnoreCase("male")) {
				((org.openqa.selenium.WebElement) genders.get(1)).click();
			}else if (Gender.equalsIgnoreCase("Other")) {
				((org.openqa.selenium.WebElement) genders.get(2)).click();			
			}		
		}	
	}

// password

   public void enterPassword(String Password) {
	   w.findElement(password).sendKeys(Password);
   }
   public void clearPassword() {
	   w.findElement(password).clear();
   }
   
// confirm password
   
   public void enterConfirmPassword(String ConfirmPassword) {
	   w.findElement(confirmPassword).sendKeys(ConfirmPassword);
   }
   public void clearConfirmPassword() {
	   w.findElement(confirmPassword).clear();
   }
   
// Term and Condition
   
   public void termAndCondition() {
	   w.findElement(termAndCondition).click();
   }
   
// Register
   public void registerButton() {
	   w.findElement(registerButton).click();	   
   }
   
 // login link
    public void loginLink() {
    	w.findElement(loginLink).click();
    }   
})
   
