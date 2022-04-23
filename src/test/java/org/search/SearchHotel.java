package org.search;

import org.base.BassClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BassClass {
	
	public SearchHotel() {
	PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement selectLocation;

	@FindBy(id = "datepick_in")
	private WebElement checkInDate;

	@FindBy(id = "datepick_out")
	private WebElement checkOutDate;
	
	public WebElement getSelectLocation() {
		return selectLocation;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getSearch() {
		return search;
	}

	@FindBy(id = "Submit")
	WebElement search;
	
}
