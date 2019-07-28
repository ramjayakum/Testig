package org.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubClass extends Base{
	
	public  SubClass() {
		// TODO Auto-generated method stub
		
		PageFactory.initElements(driver, this);
		

	}
	
	@FindBy(id="first_name")
	private WebElement Firstname;
	
	@FindBy(id="last_name")
	private WebElement Lastname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement Cardno;
	
	@FindBy(id="cc_type")
	private WebElement CardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement ExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ExpDate;
	
	@FindBy(id="cc_cvv")
	private WebElement Cvv;
	
	@FindBy(id="book_now")
	private WebElement Book;
	
	@FindBy(id="order_no")
	private WebElement Orderno;

	public WebElement getOrderno() {
		return Orderno;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return Cardno;
	}

	public WebElement getCardType() {
		return CardType;
	}

	public WebElement getExpMonth() {
		return ExpMonth;
	}

	public WebElement getExpDate() {
		return ExpDate;
	}

	public WebElement getCvv() {
		return Cvv;
	}

	public WebElement getBook() {
		return Book;
	}
	

}
