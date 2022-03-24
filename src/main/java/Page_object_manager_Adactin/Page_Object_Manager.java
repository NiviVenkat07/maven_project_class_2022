package Page_object_manager_Adactin;

import org.openqa.selenium.WebDriver;

import POM_class_for_Adactin.Hotel_details;
import POM_class_for_Adactin.Log_out;
import POM_class_for_Adactin.Login_page;
import POM_class_for_Adactin.My_itinerary;
import POM_class_for_Adactin.Personal_details;
import POM_class_for_Adactin.Select_hotel;

public class Page_Object_Manager {

	private WebDriver driver;
											
	 private Login_page Lp;
	 private Hotel_details Hd ;    
	 private  Select_hotel Sh ;
	 private Personal_details Pd ;  
	 private My_itinerary Mi ;     
	 private  Log_out Lg ;      
	 	
	 public Page_Object_Manager(WebDriver driver2) {
		this.driver= driver2;
	}

		public Login_page getLp() {
		if (Lp==null) {					
			 Lp= new Login_page(driver);
		}	
			return Lp;
	}

		public Hotel_details getHd() {
			if (Hd==null) {
			Hd= new Hotel_details(driver);								
			}			
			return Hd;
		}
		public Select_hotel getSh() {
			if (Sh==null) {
			Sh= new Select_hotel(driver);	
			}
			return Sh;
		}
		public Personal_details getPd() {
			if (Pd==null) {
			Pd= new Personal_details(driver);	
			}			
			return Pd;
		}
		public My_itinerary getMi() {
			if (Mi==null) {
				Mi =new My_itinerary(driver);
			}			
			return Mi;
		}
		public Log_out getLg() {
			if (Lg==null) {
				Lg = new Log_out(driver);						
			}			
			return Lg;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
