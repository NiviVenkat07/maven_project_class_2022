package Base_class_particular_cell;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Cell_data {
	
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
		System.out.println(value);
	}
	
	else if (Type.equals(CellType.NUMERIC)) {
		double d = c.getNumericCellValue();
		int D = (int) d;
	 value = Integer.toString(D);
		System.out.println(D);
	}
		wb.close();
		return value;
	}

	
		
	}
