package POM_class_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Address_send {

	private WebDriver driver;
	
	@FindBy(name="message")
	private WebElement Address;


	
	public Address_send(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}



	public WebElement getAddress() {
		return Address;
	}
	
}
