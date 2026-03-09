 package org.step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.pom.BookingPage;
import org.pom.HotelSearchPage;
import org.pom.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BookingHotel {
	
	
	WebDriver driver;
	HotelSearchPage hotelSearchPage;
	
	@Given("is on Adactin login page")
	public void is_on_Adactin_login_page() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
	  
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName().sendKeys("Kalasasi14");
		loginPage.setpassword().sendKeys("Kalasasi@142356");
		
		
		
	    
	}

	@Then("ser clicks login button")
	public void ser_clicks_login_button() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setlogin().click();
	   
	}
	
	public void selectOption(WebElement dropDownName, String visibleText) {
		Select select = new Select(dropDownName);
		select.selectByVisibleText(visibleText);
	}

	@And("User should navigate to search hotel page")
	public void user_should_navigate_to_search_hotel_page() {
		hotelSearchPage = new HotelSearchPage(driver);
		selectOption(hotelSearchPage.setlocation(), "Melbourne");
		
		
		selectOption(hotelSearchPage.sethotels(), "Hotel Sunshine");
		selectOption(hotelSearchPage.setroomtype(), "Double");
		selectOption(hotelSearchPage.setroomnos(), "3 - Three");
				
		
		hotelSearchPage.datepickin().clear();
		hotelSearchPage.datepickin().sendKeys("14/02/2026");
		
		hotelSearchPage.datepickout().clear();
		hotelSearchPage.datepickout().sendKeys("20/04/2026");
		
		selectOption(hotelSearchPage.adult(), "2 - Two");
		selectOption(hotelSearchPage.childroom(), "1 - One");
		
		

		
		hotelSearchPage.Submit().click();
		
		BookingPage bookingPage = new BookingPage(driver);
		bookingPage.radiobutton().click();
		
		bookingPage.continueBtn().click();
		
		
	    
	}
	
	
	

}
