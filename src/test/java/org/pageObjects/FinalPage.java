package org.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalPage {

	WebDriver driver;

	public FinalPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "first_name")
	WebElement firstname;

	public WebElement firstname() {
		return firstname;
	}

	@FindBy(name = "last_name")
	WebElement lastname;

	public WebElement lastname() {
		return lastname;
	}

	@FindBy(name = "address")
	WebElement address;

	public WebElement streat() {
		return address;
	}

	@FindBy(name = "cc_num")
	WebElement Card;

	public WebElement Card() {
		return Card;
	}

	@FindBy(name = "cc_type")

	WebElement cardtype;

	public WebElement cardtype() {
		return cardtype;
	}

	@FindBy(name = "cc_exp_month")
	WebElement cardexpmonth;

	public WebElement cardexpmonth() {
		return cardexpmonth;
	}

	@FindBy(name = "cc_exp_year")
	WebElement cardexpyear;

	public WebElement cardexpyear() {
		return cardexpyear;
	}

	@FindBy(name = "cc_cvv")
	WebElement CCNumber;

	public WebElement CCNumber() {
		return CCNumber;
	}

	@FindBy(name = "book_now")
	WebElement BookNow;

	public WebElement BookNow() {
		return BookNow;
	}

	@FindBy(id = "order_no")
	WebElement order;

	public WebElement order() {
		return order;
	}
}
