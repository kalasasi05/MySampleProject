package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSearchPage {
	
	WebDriver driver;
	
	public HotelSearchPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
			
		
	}
	
	@FindBy(name = "location")
	WebElement location;
	
	public WebElement setlocation(){
		return location;
		
		
	}
	
	@FindBy(name = "hotels")
	WebElement hotels;
	
	public WebElement sethotels() {
		return hotels;
		
	}
	
	
	@FindBy(xpath = "//select[@name='room_type']")
	WebElement Roomtype;
	public WebElement setroomtype() {
		return Roomtype;
		
		
	}
	
	@FindBy(name = "room_nos")
	WebElement roomno;
	public WebElement setroomnos() {
		return roomno;
		
		
	}
	
	@FindBy(name = "datepick_in")
	WebElement datepickin;
	
	public WebElement datepickin() {
		return datepickin;
		
		
	}
	
	@FindBy(name = "datepick_out")
	WebElement datepickout;
	public WebElement datepickout() {
		return datepickout;
		
	}
	
	@FindBy(name= "adult_room")
	WebElement adult;
	public WebElement adult() {
		return adult;
		
	}
	
	@FindBy(name = "child_room")
	WebElement childroom;
	public WebElement childroom() {
		return childroom;
		
	}
	
	@FindBy(name = "Submit")
	WebElement Submit;
	public WebElement Submit() {
		return Submit;
		
	}
	
	
	
	
	
}
