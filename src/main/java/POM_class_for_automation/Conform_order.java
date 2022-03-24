package POM_class_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Conform_order {

	private WebDriver driver;
		
	@FindBy(xpath="//span[normalize-space()='I confirm my order']")
	private WebElement order;
	
	@FindBy(xpath="(//a[normalize-space()='Sign out'])[1]")
	private WebElement signOut;

	public Conform_order(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrder() {
		return order;
	}
	public WebElement getSignOut() {
		return signOut;
	}
	
}
