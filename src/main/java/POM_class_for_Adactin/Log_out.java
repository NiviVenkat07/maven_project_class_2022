package POM_class_for_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_out {
	
	private WebDriver driver;
	
	@FindBy(id="logout")
	private WebElement Log_out;
	
	public Log_out(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}


	public WebElement getLog_out() {
		return Log_out;
	}
	
}
