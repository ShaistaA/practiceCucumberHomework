package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id = "username")
		public WebElement email;
	
	@FindBy (id = "password")
		public WebElement password;
	
	@FindBy (id = "loginbtn")
		public WebElement loginBtn;
	
	@FindBy (xpath="//h2[contains(text(),' Welcome back, Shaista!')]")
		public WebElement welcomeMsg;
	
	@FindBy (xpath = "//div[contains(text(),'Invalid login, please try again')]")
		public WebElement loginErrorMsg;
	
}
