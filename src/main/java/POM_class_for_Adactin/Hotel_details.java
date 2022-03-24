package POM_class_for_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_details {

	private WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement room_type;
	
	@FindBy(id="room_nos")
	private WebElement room_nos;
	
	@FindBy(id="datepick_in")
	private WebElement pick_in;
	
	@FindBy(id="datepick_out")
	private WebElement pick_out;
	
	@FindBy(id="adult_room")
	private WebElement Adult;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement submit;
	

	public Hotel_details(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);

	}
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getPick_in() {
		return pick_in;
	}

	public WebElement getPick_out() {
		return pick_out;
	}

	public WebElement getAdult() {
		return Adult;
	}

	public WebElement getChild() {
		return child;
	}
	

	public WebElement getSubmit() {
		return submit;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
