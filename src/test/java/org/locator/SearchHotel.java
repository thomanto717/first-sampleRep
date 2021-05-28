package org.locator;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass{
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement selectLocation;
	
	public WebElement getSelectLocation() {
		return selectLocation;
	}

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getSelectRoomType() {
		return selectRoomType;
	}

	public WebElement getSelectRoomNos() {
		return selectRoomNos;
	}

	public WebElement getSelectAdultNos() {
		return selectAdultNos;
	}

	public WebElement getSelectChildNos() {
		return selectChildNos;
	}

	public WebElement getSelectCheckInDate() {
		return selectCheckInDate;
	}

	public WebElement getSelectCheckOutDate() {
		return selectCheckOutDate;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	@FindBy(id="hotels")
	private WebElement selectHotel;
	
	@FindBy(id="room_type")
	private WebElement selectRoomType;

	@FindBy(id="room_nos")
	private WebElement selectRoomNos;
	
	@FindBy(id="adult_room")
	private WebElement selectAdultNos;

	@FindBy(id="child_room")
	private WebElement selectChildNos;
	
	@FindBy(id="datepick_in")
	private WebElement selectCheckInDate;

	@FindBy(id="datepick_out")
	private WebElement selectCheckOutDate;
	
	@FindBy(id="Submit")
	private WebElement btnSubmit;
}