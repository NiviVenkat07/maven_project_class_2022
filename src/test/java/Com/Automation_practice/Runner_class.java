package Com.Automation_practice;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import Base_class_for_all.Base_class;
import Page_Object_Manager_Automation.Page_object_manager;

public class Runner_class extends Base_class  {
	   
          public static WebDriver driver=browser_Launch("chrome");        	
          public static Page_object_manager pom = new Page_object_manager(driver); 
          
        static  Logger log = Logger.getLogger(Runner_class.class);
          
          public static void main(String[] args) throws Throwable  {
	     	       
        	  PropertyConfigurator.configure("log4j.properties");
        	  
	             getUrl("http://automationpractice.com/index.php");	          
	                   implicitWait(10, TimeUnit.SECONDS);	
	                   
	                    log.info("url launched successfully");    
	             
		                    Click(pom.getHp().getSg());                
	                     scrollupanddown (pom.getHp().getSg(),"400"); 	  
     //mail id      
	                     
	 String Email = Particular_cell_data("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\Test cases for Automation.xlsx",2,5);  
	                     
	                     SendKeys(pom.getEm().getEm(),Email);	                                   
	 //password	        
	               
     String pass = Particular_cell_data("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\Test cases for Automation.xlsx", 8,5) ;        
	                     
	                    SendKeys(pom.getEm().getPs(),pass);	                   
	 //sign in  
	                           Click(pom.getEm().getS())  ; 
	                           
	                         log.info("Signin successfully");    
	 //click logo	                                                         	   		           	                         
	                            Click(pom.getEm().getCk());	   		                       
	   		               scrollupanddown(pom.getEm().getCk(),"1000"); 	     		               
	   		               
	   		               log.info("Logo clicked successfully");
	   		               
	//printed dress              	   		               
	                         Click(pom.getPd().getOpen()); 	   	   	                      
	   	            scrollupanddown(pom.getPd().getOpen(),"500");	   	                       
	   	                   implicitWait(10,TimeUnit.SECONDS); 
    //Quantity    	            	   	                         	   	               
	   	                     Click(pom.getPd().getQuantity_btn());	   	                            
    //size  	                             	   	   	      	   	                     	   	           
	   	                     
	   	                     SelectConcept(pom.getPd().getSize_btn(),"by text","L");	   	      
    //colour	  
	   	                       Click(pom.getPd().getColour());   
	   	                       
	   	                       log.info(" successfully clicked Quantity,Size,colour");
	   	                       	   	                       
	   	                       implicitWait(10,TimeUnit.SECONDS); 	
	   	                          	                       	   	                       	   	                       
   //submit	   		   	    	   	                       	   	                       
	   	                    Click(pom.getPd().getSubmit_btn());            		   		                
   //Proceed to check out  	         	     	            	   		                     	   		                     
	   	                    explicitWait(pom.getCkOut().getProceed_to(),20);
   //summary   		                       	   			       
	   		                  Click(pom.getCkOut().getProceed_to() );		        	   		  
                           scrollupanddown(pom.getCkOut().getProceed_to(),"800");                                    
    //signin                                                                                           
                              Click(pom.getSi().getSign_in());                                        
                         scrollupanddown(pom.getSi().getSign_in(),"800");     
                                                   
   //shipping                                     	                         
                                   Click(pom.getSp().getShipping());	
                                   
                                   log.info("shipping conformed");
                                   
	                      scrollupanddown(pom.getSp().getShipping(),"800");
	                      	                     	                      	                      
   //terms of serivce                              
	                              Click(pom.getSp().getClick());
  //payment	  	   		                         	   		    	                                                      
	   		                      Click(pom.getP().getPay());	   		    		
	   		                scrollupanddown(pom.getP().getPay(),"400");                           
   // ScreenShot   
                      ScreenShot("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\Screenshot\\payment.png");   
   //pay by cheque                        
                                 scrollupanddown(pom.getP().getPay(),"400");                                                              
                                  Click(pom.getP().getPayby());
                                  
                               log.info("clicked payment method");
                                  
                               scrollupanddown(pom.getP().getPayby(),"400");;                      
   // i conform my order                                                                                                                  
                                    Click(pom.getCo().getOrder());   
                                    
                                log.info("order conformed");  
                                    
                               scrollupanddown(pom.getCo().getOrder(),"400");;                                    
      //screenshot                         
                      ScreenShot("C:\\Users\\Admin\\eclipse-workspace\\Project_Class\\Screenshot/orderconform.png");                                           
     //sign out                                                                           
                      Click(pom.getCo().getSignOut());      
                      
                      log.info("Sign out successfully");
                      
                                          Close();                                                           
  
    }

		
		}

		
			
		

		
  
  
  
  

