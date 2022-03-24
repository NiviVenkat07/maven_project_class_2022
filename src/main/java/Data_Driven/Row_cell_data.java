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

public class Row_cell_data {

	public static void Row_data() throws IOException {
		
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\Dummy Sheet.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
	    Sheet s = wb.getSheetAt(0);
	    
		Row r= s.getRow(2);

	for (int i = 0; i <r.getPhysicalNumberOfCells(); i++) { 
		
	          Cell c = r.getCell(i);
		 
		CellType type = c.getCellType();
	
		if (type.equals(CellType.STRING)) {
			
		String value = c.getStringCellValue();
			
			System.out.println(value);		
		}
		else if (type.equals(CellType.NUMERIC)) {
			
			double value = c.getNumericCellValue();
			
			int v =(int) value;
			 
			String S = Integer.toString(v);
			
			System.out.println(S);			
		}							
	}			
	 
	          wb.close();
	
}
	public static void main(String[] args) throws IOException {
		
		System.out.println("Get particular row data: ");
		
		Row_data();
		
	}
	
}
	
