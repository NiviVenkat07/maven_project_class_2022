package POM_class_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_cout {

  private	WebDriver driver;
	
	@FindBy(xpath="//span[normalize-space()='Proceed to checkout']")
	private WebElement proceed_to;

	public Proceed_cout(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}
		
	public WebElement getProceed_to() {
		return proceed_to;
	}
	
	
}
