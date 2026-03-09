package org.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	 	
		
	}
	@FindBy(name="username")
	 WebElement userName;

	public WebElement setUserName() {
		return userName;
	}

	
	@FindBy(name = "password")
	
	WebElement password;
	
	public WebElement setpassword() {
		return password;
		
		
	}
	
	@FindBy(name = "login")
	WebElement login;
	
	public WebElement setlogin() {
		return login;
		
	}
	

}



