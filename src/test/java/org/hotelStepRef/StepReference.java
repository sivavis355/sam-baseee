package org.hotelStepRef;

import org.base.BassClass;
import org.openqa.selenium.WebDriver;
import adactinHotel.BookHotel;
import adactinHotel.Login;
import adactinHotel.SearchHotelPage;
import adactinHotel.SelectHotel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepReference extends BassClass {
	public static WebDriver driver;
	Login login;
	SearchHotelPage search;
	SelectHotel selectHotel;
	BookHotel book;

	@Given("^user is open Adactin Page$")
	public void user_is_open_Adactin_Page() throws Exception {
		getDriver("chrome");
		loadUrl("https://adactinhotelapp.com/");
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Exception {
		login = new Login();
		type(login.getUser(), arg1);
		type(login.getPass(), arg2);

	}

	@When("^user should click the login button$")
	public void user_should_click_the_login_button() throws Exception {
		click(login.getLogin());

	}

	@Then("^user should verify the login$")
	public void user_should_verify_the_login() throws Exception {

	}

	@Then("^user select \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_select_and_and_and_and_and(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Exception  {
		search = new SearchHotelPage();
		selectByText(search.getdDnLocation(), arg1);
		selectByText(search.getdDnHotel(), arg2);
		selectByText(search.getdDnRoomType(), arg3);
		selectByText(search.getdDnNoOfRoom(), arg4);
		// type(search.getCheckInDate(), arg5);
		// type(search.getCheckOutDate(), arg6);
		selectByText(search.getdDnAdultRoom(), arg5);
		selectByText(search.getdDnChildRoom(), arg6);
		click(search.getSearch());

	}

	@Then("^click Search$")
	public void click_Search() throws Exception {

	}

	@Then("^click the radiobutton and continue button$")
	public void click_the_radiobutton_and_continue_button() throws Exception {
		selectHotel = new SelectHotel();
		click(selectHotel.getClickRadioButton());
		click(selectHotel.getClickContinueButton());

	}

	@Then("^user verify the continue$")
	public void user_verify_the_continue() throws Exception {

	}

	@Then("^user select \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and click Search$")
	public void user_select_and_and_and_and_and_and_and_and_click_Search(String arg1, String arg2, String arg3,
			String arg4, String arg5, String arg6, String arg7, String arg8) throws Exception {

		book = new BookHotel();
		type(book.getFirstName(), arg1);
		type(book.getLastName(), arg2);
		type(book.getAddress(), arg3);
		type(book.getCardNumber(), arg4);
		selectByText(book.getCardType(), arg5);
		selectByText(book.getMonth(), arg6);
		selectByText(book.getYear(), arg7);
		type(book.getCvvNumber(), arg8);

	}

	@Then("^click the BookNow button$")
	public void click_the_BookNow_button() throws Exception {
		click(book.getBook());
	    
		
		
		
		
	}

	@Then("^user check get order id or not$")
	public void user_check_get_order_id_or_not() throws Exception {
		Thread.sleep(5000);
		String attribute = getAttribute(book.getOrderNum());
		System.out.println("Order ID is:\t"+attribute);
	}

}
