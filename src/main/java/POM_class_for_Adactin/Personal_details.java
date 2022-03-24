package POM_class_for_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personal_details {

	private WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement fist_name;
	
	@FindBy(id="last_name")
	private WebElement last_name;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement credit_no;
	
	@FindBy(id="cc_type")
	private WebElement credit_type;
	
	@FindBy(id="cc_exp_month")
	private WebElement exp_month;
	
	@FindBy(id="cc_exp_year")
	private WebElement exp_year;
	
	@FindBy(id="cc_cvv")
	private WebElement Ccv_n;
	
	@FindBy(id="book_now")
	private WebElement Bk_now;

	public Personal_details(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFist_name() {
		return fist_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCredit_no() {
		return credit_no;
	}

	public WebElement getCredit_type() {
		return credit_type;
	}

	public WebElement getExp_month() {
		return exp_month;
	}

	public WebElement getExp_year() {
		return exp_year;
	}

	public WebElement getCcv_n() {
		return Ccv_n;
	}

	public WebElement getBk_now() {
		return Bk_now;
	}
	
	
	
	
	
	
	
	
}
