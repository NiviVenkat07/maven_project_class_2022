package Com.Adactin_practice;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import Base_class_for_all.Base_class;
import Page_object_manager_Adactin.Page_Object_Manager;

public class Runner_class extends Base_class{
	
	 public static WebDriver driver= browser_Launch("chrome");             
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
     static Logger log = Logger.getLogger(Runner_class.class);
	 
 public static void main(String[] args) throws Throwable {
	
	       PropertyConfigurator.configure("log4j.properties");
        
           getUrl("https://adactinhotelapp.com/");
           
           log.info("url launched");
		
     //username       
           
           String name = Particular_cell_data("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\TestCase Adactin.xlsx",13, 5);          
		             SendKeys(pom.getLp().getUser_name(),name);
	//password		
		   
		  String Pass = Particular_cell_data("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\TestCase Adactin.xlsx",14, 5);           		             
		             SendKeys(pom.getLp().getPass_word(), Pass);
	//login 	          
                     Click(pom.getLp().getLog_in());    
                     
                     log.info("Login successfully");
    //Location        
                     
         String Location = Particular_cell_data("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\TestCase Adactin.xlsx",16,5);            
                     SendKeys(pom.getHd().getLocation(), Location);
	// Hotel	                                 
                     SelectConcept(pom.getHd().getHotel(),"by text","Hotel Sunshine");
	// Roomtype	      
	      
	     String Roomtype = Particular_cell_data("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\TestCase Adactin.xlsx", 18, 5);	                 
	                 SendKeys(pom.getHd().getRoom_type(), Roomtype);
  // no of rooms	  
	                 
	     String Rooms = Particular_cell_data("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\TestCase Adactin.xlsx", 19, 5);
	                 SendKeys(pom.getHd().getRoom_nos(), Rooms);
  // check in date	             
	                 SendKeys(pom.getHd().getPick_in(), "19/03/2022");
 //check out date	                   
	                 SendKeys(pom.getHd().getPick_out(), "20/03/2022");
// adult per room                      	                 	                 

         String Adult = Particular_cell_data("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\TestCase Adactin.xlsx",22,5);
	                 SendKeys(pom.getHd().getAdult(),Adult);
// Child per room	
	                 
	     String Child = Particular_cell_data("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\TestCase Adactin.xlsx", 23, 5);            
	                 SendKeys(pom.getHd().getChild(), Child);
	                 
	                 log.info("entered hotel details");
	                 
  // Search                 
	                  Click(pom.getHd().getSubmit());
	                  
	                  
//select	                     	         
                      Click(pom.getSh().getRadio_btn());
//continue	                       	    
	                   Click(pom.getSh().getCont());	 
	               scrollupanddown(pom.getSh().getCont(),"600");	 
	               
	               log.info("Select hotel");
	               
 // First name	    
	               
	     String Firstname = Particular_cell_data("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\TestCase Adactin.xlsx", 27, 5);
	                 SendKeys(pom.getPd().getFist_name(), Firstname);
 //Last name 	                    
	                 
	     String Lastname = Particular_cell_data("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\TestCase Adactin.xlsx", 28, 5);
	          	     SendKeys(pom.getPd().getLast_name(), Lastname);
//address           
	          	     
	   	String Address = Particular_cell_data("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\TestCase Adactin.xlsx",29,5);     
	                 SendKeys(pom.getPd().getAddress(), Address);
//Credit card no 	
	                 
	    String CCno = Particular_cell_data("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\TestCase Adactin.xlsx", 30, 5);
	                 SendKeys(pom.getPd().getCredit_no(), CCno);
//credit card type 	  
	                 
	     
	                    SelectConcept(pom.getPd().getCredit_type(),"by text","VISA");
//Expiry month 	   
	                
	     String Expirymonth = Particular_cell_data("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\TestCase Adactin.xlsx", 32,5);      
	                SendKeys(pom.getPd().getExp_month(), Expirymonth);
//Expiry Year 	    
	                
	     String Expiryear = Particular_cell_data("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\TestCase Adactin.xlsx", 33,5);      
	                SendKeys(pom.getPd().getExp_year(), Expiryear);
// CCV No	 
	     String CCVno = Particular_cell_data("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\TestCase Adactin.xlsx", 34,5);           
	                SendKeys(pom.getPd().getCcv_n(), CCVno);
 //book now 	                        
	                Click(pom.getPd().getBk_now());	   
	                
	                log.info("entered personal details");
	                
	                implicitWait(10,TimeUnit.SECONDS);	              
	                scrollupanddown(pom.getPd().getBk_now(),"600");	           
 //my ltinerary	 	      	                  	           
	                Click(pom.getMi().getCk_btn()); 

	                log.info("Booking conformed");

 // ScreenShot	                   	               
	              ScreenShot("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\Screenshot\\hotel.png");
 //logout	               	             	              
	                Click(pom.getLg().getLog_out());	 	
	                
	                log.info("Logout successfully");
	                
	                    Close();
	 
	 
	 
	 
	 
	 
	 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 }
	
	
}
	
	
	
	
	

