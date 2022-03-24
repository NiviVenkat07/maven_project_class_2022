package Base_class_for_all;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_class {
	
	public static WebDriver  driver ;     //------null driver
	
	// System.setproperty () it stored in string types
	
	public static WebDriver browser_Launch(String type) {
	
		if(type.equalsIgnoreCase("chrome")) {
		
		
		System.setProperty("webdriver.chrome.driver",
		      System.getProperty("user.dir")+ "\\Driver 1\\chromedriver.exe" );
		
		 driver = new ChromeDriver();   //-------driver = chrome
		
		}
		
		else if (type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("User.dir")+"\\Driver\\geckodriver.exe");
			
			
			   driver= new FirefoxDriver();        // --------driver= chrome
			
		}
		     driver.manage().window().maximize();        // ------driver= chrome
		  
		    
		       return driver;   }
	
	
		public static void getUrl(String url) {
			driver.get(url);                 //-----driver=chrome
			
		}
		
		public static void Click(WebElement element) {
		
			 // click on element method
			
            element.click();  
		
			
		}
		
		public static void SendKeys(WebElement element ,String data) {
			
			//sendkeys pass
			
			element.sendKeys(data);    

		}
		
		public  static void scrollupanddown(WebElement element , String string ) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			try {
					js.executeScript("arguments[0].ScrollIntoView();",element);
				}
			catch (Exception e) {
					
		} 
		
		}
		 public static void implicitWait(int Seconds , TimeUnit format) {
			
			 driver.manage().timeouts().implicitlyWait(Seconds ,format);	 
		     
		}
		
		       public static  void Actionclass(WebElement element , String type) {
			 
			Actions act= new Actions(driver);
 try {
				
	     if (type.equalsIgnoreCase("movetoelement")) {
						act.moveToElement(element).build().perform();	 
	}
		 else if (type.equalsIgnoreCase("contextclick")) {
						act.contextClick(element).build().perform();
    }
    	 else if (type.equalsIgnoreCase("doubleclick")) {
						act.doubleClick(element).build().perform();
    }
		 else if (type.equalsIgnoreCase("click")) {
						act.click(element).build().perform();
	}
	
	}  catch (Exception e) {}
		}
			 
			public static  void SelectConcept(WebElement element , String type , String value ) {
				
				Select s = new Select(element);
		try {
			if (type.equalsIgnoreCase("byValue")) {
						s.selectByValue(value);
	}	
						
			else if (type.equalsIgnoreCase("byindex")) {
						
				int i = Integer.parseInt(value);
						
				s.selectByIndex(i);
   }
			else if (type.equalsIgnoreCase("by text")) {
						
				 s.selectByVisibleText(value);
}
							
	} catch (Exception e) {}
	}					
			
                         public static  void explicitWait(WebElement element , int seconds) {
                        	 
                        	
								WebDriverWait wait = new WebDriverWait(driver,seconds);
							wait.until(ExpectedConditions.visibilityOf(element));
                }
			 
			 public static void ScreenShot(String path) throws IOException {
				 TakesScreenshot Ts = (TakesScreenshot)driver;
				 File Src = Ts.getScreenshotAs(OutputType.FILE);
                 File Des = new File("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\Screenshot\\Payment.png");
                 FileUtils.copyFile(Src, Des);
                 
			}
		
		
		public static void Clear(WebElement element) {
			element.clear();
		}
                        		
		
		public static void Close() {
			
		driver.close();
		
		}
		
		public static String value;
		
		public static String Particular_cell_data(String path , int row_index , int cell_index) throws IOException {

				
		File F = new File(path);
		
		FileInputStream  FIS = new FileInputStream(F);
		
	    Workbook wb =  new XSSFWorkbook(FIS);
		
		Sheet s = wb.getSheetAt(0);
		
		Row r = s.getRow(row_index);
			
		Cell c = r.getCell(cell_index);
		
		CellType Type = c.getCellType();
		
		if (Type.equals(CellType.STRING)) {
			
		 value = c.getStringCellValue();
			//System.out.println(value);
		}
		
		else if (Type.equals(CellType.NUMERIC)) {
			double d = c.getNumericCellValue();
			int D = (int) d;
		 value = Integer.toString(D);
			//System.out.println(D);
		}
			wb.close();
			return value;
		}


	
		
}

	
		
		
		
	
	
		
	
	

