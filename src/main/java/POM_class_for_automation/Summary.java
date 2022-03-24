package POM_class_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {
  private WebDriver driver;
	
	@FindBy(xpath="//span[normalize-space()='Proceed to checkout']")
	private WebElement Proceed_to;

	public Summary(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getProceed_to() {
		return Proceed_to;
	}
	
}
