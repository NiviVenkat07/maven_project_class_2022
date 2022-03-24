package POM_class_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_in_Btn {

	private WebDriver driver;
	

	 @FindBy(id="email")	
	 private WebElement Em;

	 @FindBy(id="passwd")	
     private WebElement Ps;

	 @FindBy(xpath="//span[normalize-space()='Sign in']")	  
     private WebElement S;
	
	 @FindBy(id="header_logo")
		private WebElement Ck;
		
	 
	 
	public Sign_in_Btn(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}	


	public WebElement getEm() {
		return Em;
	}
	public WebElement getPs() {
		return Ps;
	}
	public WebElement getS() {
		return S;
	}

	public WebElement getCk() {
		return Ck;
	}	
}
	
	
	
	
	

