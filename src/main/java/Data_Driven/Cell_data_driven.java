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

public class Cell_data_driven {
	
	public static void Particular_cell_data() throws IOException {

			
	File F = new File("C:\\Users\\Admin\\eclipse-workspace\\Project_class_2022\\Dummy Sheet.xlsx");
	
	FileInputStream  FIS = new FileInputStream(F);
	
    Workbook wb =  new XSSFWorkbook(FIS);
	
	Sheet s = wb.getSheetAt(0);
	
	Row r = s.getRow(2);
		
	Cell c = r.getCell(2);
	
	CellType Type = c.getCellType();
	
	if (Type.equals(CellType.STRING)) {
		
		String value = c.getStringCellValue();
		//System.out.println(value);
	}
	
	else if (Type.equals(CellType.NUMERIC)) {
		double d = c.getNumericCellValue();
		int D = (int) d;
		//System.out.println(D);
	}
		wb.close();
	}

	public static void main(String[] args) throws IOException {
		
		Particular_cell_data();
		
	}
}