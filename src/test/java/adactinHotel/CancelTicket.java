package adactinHotel;


import org.base.BassClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelTicket extends BassClass {

	public CancelTicket() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_id_text")
	WebElement selectOrder;

	@FindBy(id = "search_hotel_id")
	WebElement searchOrder;

	@FindBy(id = "btn_id_546043")
	WebElement cancelOrder;

	@FindBy(id = "search_result_error")
	WebElement ouputText;

	public WebElement getOuputText() {
		return ouputText;
	}

	public WebElement getSelectOrder() {
		return selectOrder;
	}

	public WebElement getSearchOrder() {
		return searchOrder;
	}

	public WebElement getCancelOrder() {
		return cancelOrder;
	}

	public void fifth(String Orderdata) {
		type(getSelectOrder(), Orderdata);
		click(getSearchOrder());
		click(getCancelOrder());
		alertAccept(getOuputText());
		String text = getText(getOuputText());
		System.out.println(text);

	}

}
