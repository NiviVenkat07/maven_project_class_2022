package POM_class_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {

	private WebDriver driver;
	
	@FindBy(xpath="(//span[normalize-space()='Proceed to checkout'])[2]")
	private WebElement Pay;
	
	@FindBy(xpath="//a[@class='cheque']")
	private WebElement payby;
	
	
	public Payment(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);

	}

	public WebElement getPay() {
		return Pay;
	}
	

	public WebElement getPayby() {
		return payby;
	}
	
	
}
