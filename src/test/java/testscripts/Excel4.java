package testscripts;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel4 {
	
	public static void main(String[] args) throws Throwable {
		
		Workbook workbook = WorkbookFactory.create(new FileInputStream("resources/trello.xlsx"));
		
		Sheet sheet = workbook.getSheet("mydata");
		
		int firstrowcount = sheet.getFirstRowNum();
		int lastrowcount = sheet.getLastRowNum();
		
		for (int i = firstrowcount; i <= lastrowcount; i++) {
			
			Row row = sheet.getRow(i);
			
			short firstcellindexcount = row.getFirstCellNum();
			short lastcellcount = row.getLastCellNum();
			
			System.out.println("firstcellindexcount = "+firstcellindexcount);
			System.out.println("lastcellcount = "+lastcellcount);
			
			for (short j = firstcellindexcount; j < lastcellcount; j++) {
				
				Cell cell = row.getCell(j);
				
				CellType celltype = cell.getCellType();
				
				System.out.println("celltype = "+celltype);
			}
		}
		workbook.close();
	}

}
