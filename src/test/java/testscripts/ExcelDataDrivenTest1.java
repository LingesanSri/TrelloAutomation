package testscripts;


import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataDrivenTest1 {

	
	public static void main(String[] args) throws Exception{
		
		Workbook workbook = WorkbookFactory.create(new FileInputStream("resources/trello.xlsx"));
		
	    Sheet sheet = workbook.getSheet("mydata");
	    
	    int firstrowindexcont = sheet.getFirstRowNum();
	    int lastrowindexcount = sheet.getLastRowNum();
	    
	    for (int i = firstrowindexcont; i <= lastrowindexcount; i++) {
			
	    	Row row = sheet.getRow(i);
	    	
	    	short firstcellindexcount = row.getFirstCellNum();
	    	short lastcellcount = row.getLastCellNum();
	    	
	    	//System.out.println("RowIndex = "+i);
	    	System.out.println("RowIndex = "+row.getRowNum());
	    	System.out.println("firstcellindexcount = "+firstcellindexcount);
    		System.out.println("lastcellcount = "+lastcellcount);
    		
	    	for (int j = firstcellindexcount; j < lastcellcount; j++) {
				
	    		Cell cell = row.getCell(j);
	    		
	    		CellType celltype = cell.getCellType();
	    		
	    		

	    		if (String.valueOf(celltype).equals("STRING")) {
	    			
	    			String stringdata = (String) row.getCell(j).getStringCellValue();
	    			System.out.println("stringdata = "+stringdata);
	    		}
	    			else if (String.valueOf(celltype).equalsIgnoreCase("numeric")) {
						
	    			int numberdata = (int) row.getCell(j).getNumericCellValue();
	    			System.out.println("numberdata = "+numberdata);	
				}
			}
		}
	}
}
