package Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_data {

	public static void main(String[] args) throws IOException {
		
	File f = new File("C:\\Users\\Admin\\Desktop\\Excel.xlsx");
		
	FileInputStream fis = new FileInputStream(f);
		
	Workbook wb = new XSSFWorkbook(fis);
		
	wb.createSheet("data").createRow(0).createCell(0).setCellValue("Name");
		
	wb.getSheet("data").getRow(0).createCell(1).setCellValue("Password");	
		
	wb.getSheet("data").getRow(0).createCell(2).setCellValue("Email");	
		
	wb.getSheet("data").createRow(1).createCell(0).setCellValue("nivi");	
		
	wb.getSheet("data").getRow(1).createCell(1).setCellValue("AB1234");	
		
	wb.getSheet("data").getRow(1).createCell(2).setCellValue("nivi@gmail.com");	
		
	wb.getSheet("data").createRow(2).createCell(0).setCellValue("sri");	
		
    wb.getSheet("data").getRow(2).createCell(1).setCellValue("CD5678");		
		
    wb.getSheet("data").getRow(2).createCell(2).setCellValue("sri@gmailcom");
    
    wb.getSheet("data").createRow(3).createCell(0).setCellValue("venkat");
    
    wb.getSheet("data").getRow(3).createCell(1).setCellValue("EF789");
    
    wb.getSheet("data").getRow(3).createCell(2).setCellValue("venkat@gmail.com");
    
    FileOutputStream fos = new FileOutputStream(f);
    
    wb.write(fos);
    
    wb.close();
    
    System.out.println(" program write Successfully");
    
    
    
    
    
}  
    
    
    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

