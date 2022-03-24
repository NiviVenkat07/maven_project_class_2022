package POM_class_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {

	private WebDriver driver;
	
	@FindBy(xpath="(//span[normalize-space()='Proceed to checkout'])[2]")
	private WebElement sign_in;


	public Signin(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}


	public WebElement getSign_in() {
		return sign_in;
	}
}
