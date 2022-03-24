package Page_Object_Manager_Automation;

import org.openqa.selenium.WebDriver;

import POM_class_for_automation.Address_send;
import POM_class_for_automation.Conform_order;
import POM_class_for_automation.Homepage_Sign_in;
import POM_class_for_automation.Payment;
import POM_class_for_automation.Printed_dress;
import POM_class_for_automation.Proceed_cout;
import POM_class_for_automation.Shipping;
import POM_class_for_automation.Sign_in_Btn;
import POM_class_for_automation.Signin;
import POM_class_for_automation.Summary;

public class Page_object_manager {

        private WebDriver driver;
	
	    private Homepage_Sign_in hp ;   
	    private Sign_in_Btn Em ;   
	    private Printed_dress pd;       
	    private Proceed_cout CkOut;   
	    private Summary s;
	    private Signin Si;
	    private  Address_send As;
	    private Shipping sp ;
	    private Payment p ;      
	    private Conform_order Co;
	    
	    
		public Page_object_manager(WebDriver driver2) {
			this.driver=driver2;
		}
       
		
		public Homepage_Sign_in getHp() {
			
		if (hp==null) {							
			hp=new Homepage_Sign_in(driver);
			}
			return hp;
		}
		
		public Sign_in_Btn getEm() {
			
		if (Em==null) {					
			Em = new Sign_in_Btn(driver);
			}	
			return Em;
		}
		public Printed_dress getPd() {
				
		if (pd==null) {							
			pd = new Printed_dress(driver);
			}
			return pd;
		}
		public Proceed_cout getCkOut() {
		
		if (CkOut==null) {							
			CkOut = new Proceed_cout(driver);
			}	
			return CkOut;
		}
		public Summary getS() {
		
		if (s==null) {							
			s= new Summary(driver);
			}
			return s;
		}
		public Signin getSi() {
		
		if (Si==null) {							
			Si=new Signin(driver);
			}
			return Si;
		}
		public Address_send getAs() {
			
		if (As==null) {						
			As = new Address_send(driver);
		}	
			return As;
		}
		public Shipping getSp() {
		
			if (sp==null) {							
			sp= new Shipping(driver);
			}
			return sp;
		}
		public Payment getP() {
		
			if (p==null) {							
			p=new Payment(driver);
			}
			return p;
		}
		public Conform_order getCo() {
			
			if (Co==null) {							
			Co=new Conform_order(driver);
			}
			return Co;
		}

	
	
	
}
