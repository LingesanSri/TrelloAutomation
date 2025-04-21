package testscripts;

import java.io.FileInputStream;
//import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 {

	public static void main(String[] args) throws Throwable {
		
		
		
/*		FileInputStream fis1 = new FileInputStream("resources/trellodata.txt");
		
		Properties p = new Properties();
		
		p.load(fis1);
	
		System.out.println(p.getProperty("URL")); */
		
		FileInputStream fis = new FileInputStream("resources/trello.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet("mydata");
		
		Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(2);
		
		String celldata = cell.getStringCellValue();
		
		System.out.println(celldata);
		
		workbook.close();

	}

}
