package adactinHotel;

import org.base.BassClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BassClass {

	public BookHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	WebElement firstName;

	@FindBy(id = "last_name")
	WebElement lastName;

	@FindBy(id = "address")
	WebElement address;

	@FindBy(id = "cc_num")
	WebElement cardNumber;

	@FindBy(id = "cc_type")
	WebElement cardType;

	@FindBy(id = "cc_exp_month")
	WebElement month;

	@FindBy(id = "cc_exp_year")
	WebElement year;

	@FindBy(id = "cc_cvv")
	WebElement cvvNumber;

	@FindBy(id = "book_now")
	WebElement book;

	@FindBy(id = "order_no")
	WebElement orderNum;
	

	public WebElement getOrderNum() {
		return orderNum;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBook() {
		return book;
	}

}
