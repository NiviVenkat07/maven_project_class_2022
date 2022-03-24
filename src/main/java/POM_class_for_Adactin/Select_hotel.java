package POM_class_for_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {

	private WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement radio_btn;
	
	@FindBy(id="continue")
	private WebElement cont;

	public Select_hotel(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadio_btn() {
		return radio_btn;
	}

	public WebElement getCont() {
		return cont;
	}
	
	
	
	
	
	
	
	
	
	
	
}
