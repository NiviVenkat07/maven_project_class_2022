package POM_class_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_Sign_in {

     private WebDriver driver;
	
	
	@FindBy(xpath="//a[normalize-space()='Sign in']")
    private WebElement sg;


	public Homepage_Sign_in(WebDriver driver2) {
		this.driver = driver2;       //driver represent = current class       // driver2 represents = runner class

	 PageFactory.initElements(driver, this);
	}

	public WebElement getSg() {
		return sg;
	}

	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

