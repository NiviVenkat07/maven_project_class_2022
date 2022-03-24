package POM_class_for_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	private WebDriver driver;
	
	@FindBy(id="username")
	private WebElement User_name;
	
	@FindBy(id="password")
	private WebElement pass_word;
	
	@FindBy(id="login")
	private WebElement log_in;
	

	public Login_page(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUser_name() {
		return User_name;
	}
	public WebElement getPass_word() {
		return pass_word;
	}
	

	public WebElement getLog_in() {
		return log_in;
	}
	
	
	
}
