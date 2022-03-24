package POM_class_for_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_itinerary {

	private WebDriver driver;
	
	@FindBy(id="my_itinerary")
	private WebElement  ck_btn;

	public My_itinerary(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCk_btn() {
		return ck_btn;
	}
	
}
