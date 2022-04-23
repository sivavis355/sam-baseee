package adactinHotel;

import org.base.BassClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BassClass {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	WebElement dDnLocation;

	@FindBy(id = "hotels")
	WebElement dDnHotel;

	@FindBy(id = "room_type")
	WebElement dDnRoomType;

	@FindBy(id = "room_nos")
	WebElement dDnNoOfRoom;

	@FindBy(id = "datepick_in")
	WebElement checkInDate;

	@FindBy(id = "datepick_out")
	WebElement checkOutDate;

	@FindBy(id = "adult_room")
	WebElement dDnAdultRoom;

	@FindBy(id = "child_room")
	WebElement dDnChildRoom;

	@FindBy(id = "Submit")
	WebElement search;

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotel() {
		return dDnHotel;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnNoOfRoom() {
		return dDnNoOfRoom;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getdDnAdultRoom() {
		return dDnAdultRoom;
	}

	public WebElement getdDnChildRoom() {
		return dDnChildRoom;
	}

	public WebElement getSearch() {
		return search;
	}

}
