package org.step;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pageObjects.BookingPage;
import org.pageObjects.FinalPage;
import org.pageObjects.HotelSearchPage;
import org.pageObjects.LoginPage;

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

	@Then("User clicks login button")
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

		FinalPage finalPage = new FinalPage(driver);
		finalPage.firstname().sendKeys("Sasikala");

		finalPage.lastname().sendKeys("Jayachandran");
		finalPage.streat().sendKeys("2/172,chittankattu Thottam, Dhasarapalayam, Pongalur");
		finalPage.Card().sendKeys("1234567890987654");
		selectOption(finalPage.cardtype(), "VISA");
		selectOption(finalPage.cardexpmonth(), "February");
		selectOption(finalPage.cardexpyear(), "2030");
		finalPage.CCNumber().sendKeys("016");
		finalPage.BookNow().click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(finalPage.order()));
		String text = finalPage.order().getAttribute("value");

		System.out.println(text);
	}

}
