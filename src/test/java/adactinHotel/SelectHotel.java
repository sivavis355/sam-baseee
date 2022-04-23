package adactinHotel;

import org.base.BassClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BassClass {

	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement clickRadioButton;

	@FindBy(id = "continue")
	private WebElement clickContinueButton;

	public WebElement getClickRadioButton() {
		return clickRadioButton;
	}

	public WebElement getClickContinueButton() {
		return clickContinueButton;
	}

}
