package com.trello.genericutility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String readStringData(String sheetname, int firstrowindexcount, int firstcellindexcount) throws Exception {

		// This is for viewing String data from excel Sheet

		Workbook workbook = WorkbookFactory.create(new FileInputStream("src/main/resources/trello.xlsx"));

		String stringdata = workbook.getSheet(sheetname).getRow(firstrowindexcount).getCell(firstcellindexcount)
				.getStringCellValue();

		workbook.close();

		return stringdata;

	}

	public double readNumericData(String sheetname, int firstrowindexcount, int firstcellindexcount) throws Throwable {

		// This is for viewing Numeric data from excel Sheet

		Workbook workbook = WorkbookFactory.create(new FileInputStream("src/main/resources/trello.xlsx"));

		double numericdata = workbook.getSheet(sheetname).getRow(firstrowindexcount).getCell(firstcellindexcount)
				.getNumericCellValue();

		workbook.close();

		return numericdata;

	}

	public CellType checkCellType(String sheetname, int firstrowindexcount, int firstcellindexcount) throws Throwable {

		// This is for viewing celltype of values from excel Sheet

		Workbook workbook = WorkbookFactory.create(new FileInputStream("src/main/resources/trello.xlsx"));

		CellType celltype = workbook.getSheet(sheetname).getRow(firstrowindexcount).getCell(firstcellindexcount)
				.getCellType();

		workbook.close();

		return celltype;

	}

	public int sheetRowLimit(String sheetname) throws Throwable {

		// This is for viewing particular sheet row limit of excel Sheet

		Workbook workbook = WorkbookFactory.create(new FileInputStream("src/main/resources/trello.xlsx"));

		int rowlimit = workbook.getSheet(sheetname).getLastRowNum();

		workbook.close();

		return rowlimit;

	}

	public short sheetCellLimit(String sheetname, int firstrowindexcount) throws Throwable {

		// This is for viewing particular row cell limit of excel Sheet

		Workbook workbook = WorkbookFactory.create(new FileInputStream("src/main/resources/trello.xlsx"));

		short celllimit = workbook.getSheet(sheetname).getRow(firstrowindexcount).getLastCellNum();

		workbook.close();

		return celllimit;
	}

	public String getDatafromCell(String sheetname, int firstrowindexcount, int firstcellindexcount) throws Throwable {

		// This is for viewing cell data of excel Sheet

		Workbook workbook = WorkbookFactory.create(new FileInputStream("src/main/resources/trello.xlsx"));

		Cell cell = workbook.getSheet(sheetname).getRow(firstrowindexcount).getCell(firstcellindexcount);

		String cellType = String.valueOf(cell.getCellType());

		String celldata = null;

		if (cellType.equalsIgnoreCase("numeric")) {

			celldata = String.valueOf((int) cell.getNumericCellValue());

		} else if (cellType.equalsIgnoreCase("string")) {

			celldata = cell.getStringCellValue();
		}

		workbook.close();

		return celldata;

	}

}
