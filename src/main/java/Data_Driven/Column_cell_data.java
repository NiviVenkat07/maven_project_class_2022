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

public class Column_cell_data {

	public static  void Column_data() throws IOException {
		
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\Dummy Sheet.xlsx");
		
		FileInputStream Fis = new FileInputStream(f);
		
		Workbook Wb = new XSSFWorkbook(Fis);
		
		Sheet S  = Wb.getSheetAt(0);
			
		for (int i = 0; i < S.getPhysicalNumberOfRows(); i++) {
			
			Row r = S.getRow(i)	;
		
			Cell c  = r.getCell(2);
			
			CellType type = c.getCellType();
	
	if (type.equals(CellType.STRING)) {				
				String value = c.getStringCellValue();
				System.out.println(value);
				
			}
			
	else if (type.equals(CellType.NUMERIC)) {
		  double value = c.getNumericCellValue();
				  int v = (int) value;
			 String s = Integer.toString(v);
				  System.out.println(s);
			}
		}		
			
		Wb.close();
		
	}			
		
			
		public static void main(String[] args) throws IOException {
			
		System.out.println("Get particular column data:");	
			    Column_data();
			
			
		}	
			
			
			
			
			
		
			
	      	
		
		
		
		
		
		
	
	
	
	
	
		
	
}
