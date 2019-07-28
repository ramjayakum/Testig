package org.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBox extends Base {
	
	public SearchBox() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement  Location;

	@FindBy(id="hotels")
	private WebElement Hotels;
	
	@FindBy(id="room_type")
	private WebElement RoomType;
	
	@FindBy(id="room_nos")
	private WebElement NoofRooms;
	
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement CheckinDate;
	
	@FindBy(id="datepick_out")
	private WebElement CheckoutDate;
	
	@FindBy(id="adult_room")
	private WebElement Adults;
	
	@FindBy(id="child_room")
	private WebElement ChidRoom;
	
	@FindBy(id="Submit")
	private WebElement Submit;
	
	@FindBy(id="radiobutton_0")
	private WebElement Selectradio;
	
	@FindBy(id="continue")
	private WebElement Continue;

	
	public WebElement getSelectradio() {
		return Selectradio;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getNoofRooms() {
		return NoofRooms;
	}

	public WebElement getCheckinDate() {
		return CheckinDate;
	}

	public WebElement getCheckoutDate() {
		return CheckoutDate;
	}

	public WebElement getAdults() {
		return Adults;
	}

	public WebElement getChidRoom() {
		return ChidRoom;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	
}
