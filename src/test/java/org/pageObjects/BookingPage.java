package org.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {
	
	WebDriver driver;
	
	public BookingPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	@FindBy(name = "radiobutton_0")
	WebElement radiobutton;

	public WebElement radiobutton() {
		return radiobutton;
		
		
	}
	
	@FindBy(name = "continue")
	WebElement continueBtn;
	
	public  WebElement continueBtn() {
		
		return continueBtn;
	}
}
