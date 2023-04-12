package step_definition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.DataReader;
import utils.Driver;

public class UserManagementSteps {
	
	LoginPage page = new LoginPage();

//	@Given("As a user, I am on login page")
//	public void as_a_user_i_am_on_login_page() {
//		Driver.getDriver().get(DataReader.getProperty("appUrl"));
//	}
//	@When("I enter a valid email and a valid password")
//	public void i_enter_a_valid_email_and_a_valid_password() {
//		page.email.sendKeys(DataReader.getProperty("username"));
//		page.password.sendKeys(DataReader.getProperty("password"));
//	}
//	@When("click on login in button")
//	public void click_on_login_in_button() {
//		page.loginBtn.click();
//	}
//	@Then("I am direct to the homepage")
//	public void i_am_direct_to_the_homepage() {
//		Assert.assertTrue(page.nameOfUser.isDisplayed());
//
//	}


	@Given("As a user, I am on login page")
	public void as_a_user_i_am_on_login_page() {
		Driver.getDriver().get(DataReader.getProperty("appUrl"));
	}
	
	@When("I enter invalid username and valid password")
	public void i_enter_invalid_username_and_valid_password() {
		page.email.sendKeys(DataReader.getProperty("invalidUsername"));
		page.password.sendKeys(DataReader.getProperty("password"));
	}
	
	@When("click on login in button")
	public void click_on_login_in_button() {
		page.loginBtn.click();
	}
	
	@Then("I am given an error message and not directed to the homepage")
	public void i_am_given_an_error_message_and_not_directed_to_the_homepage() {
		Assert.assertTrue(page.loginErrorMsg.isDisplayed());
	}
	
	
}
