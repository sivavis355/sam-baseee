package adactinHotel;


import org.base.BassClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BassClass {

	public Login() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement User;

	@FindBy(id = "password")
	private WebElement Pass;

	@FindBy(id = "login")
	private WebElement Login;

	public WebElement getUser() {
		return User;
	}

	public WebElement getPass() {
		return Pass;
	}

	public WebElement getLogin() {
		return Login;
	}

}
