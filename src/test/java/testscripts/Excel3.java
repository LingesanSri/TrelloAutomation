package testscripts;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel3 {

	
	public static void main(String[] args) throws Throwable {
		
		
		Workbook workbook = WorkbookFactory.create(new FileInputStream("resources/trello.xlsx"));
		
		Sheet sheet = workbook.getSheet("mydata");
		
		int firstrowindexnum = sheet.getFirstRowNum();
		
		int lastrowindexnum = sheet.getLastRowNum();
		
		Row row = sheet.getRow(firstrowindexnum);
		
		Short firstcellindexcount = row.getFirstCellNum();
		
		short lastcellcount = row.getLastCellNum();
         
		System.out.println("firstrownum = "+firstrowindexnum);
		System.out.println("lastrownum  = "+lastrowindexnum);
		System.out.println("firstcellindexcount = "+firstcellindexcount);
		System.out.println("lastcellcount = "+lastcellcount);
		

		workbook.close();
	}
}
