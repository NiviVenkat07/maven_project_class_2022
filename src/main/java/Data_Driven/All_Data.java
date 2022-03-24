package Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class All_Data {
  
	public static  void All_cell_data() throws IOException {
		
     File f = new File ("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\Dummy Sheet.xlsx");
		
	FileInputStream Fis = new FileInputStream(f);
	
	Workbook Wb = new XSSFWorkbook(Fis);
	
	Sheet S  = Wb.getSheetAt(0);
		
	for (int i = 0; i < S.getPhysicalNumberOfRows(); i++) {
		
		Row r = S.getRow(i)	;
				
	for (int j = 0; j < r.getPhysicalNumberOfCells() ; j++) {
		
   	Cell c = r.getCell(j);
		
	 CellType Type = c.getCellType();	
	 
	 if (Type.equals(CellType.STRING)) {
		
	 String CellValue = c.getStringCellValue();
		  
	 System.out.println(CellValue);
	}
	 else if (Type.equals(CellType.NUMERIC)) {
	
		double cellValue = c.getNumericCellValue();
		 
      	int v = (int) cellValue;
		
		String s = Integer.toString(v);
				
		System.out.println(s);
}	 		
 }	 	 
} 
	
	Wb.close();
			
	}
		
	public static void main(String[] args) throws IOException {
		
		All_cell_data();
	}
	
		
	}
		
		
		
		
		
		
		
		
	


