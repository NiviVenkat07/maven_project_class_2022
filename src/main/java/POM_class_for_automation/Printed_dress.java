package POM_class_for_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Printed_dress {
	
	private WebDriver driver;
 
	@FindBy(xpath="(//a[normalize-space()='Printed Dress'])[2]")
    private WebElement open;
	
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement Quantity_btn;
	
	@FindBy(id="group_1")
	private WebElement size_btn;
	
	@FindBy(name="Pink")
	private WebElement colour;
	
	@FindBy(name="Submit")
	private WebElement Submit_btn;
	
	
    public Printed_dress(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

    public WebElement getOpen() {
    return open;
}

	public WebElement getQuantity_btn() {
	return Quantity_btn;
}

    public WebElement getSize_btn() {
	return size_btn;
}

   public WebElement getColour() {
	return colour;
}

   public WebElement getSubmit_btn() {
	return Submit_btn;
}
}