package testscripts;

public class ExcelUtilityExecutor {

	public static void main(String[] args) throws Throwable {
		
		ExcelUtility excelUtility = new ExcelUtility();

			System.out.println("Read String Data : "+excelUtility.readStringData("mydata", 1, 5));
			System.out.println("Read Numeric Data : "+excelUtility.readNumericData("mydata", 0, 5));
			System.out.println("Sheet Row Last Index : "+excelUtility.sheetRowLimit("mydata"));
			System.out.println("Sheet Cell Last Count : "+excelUtility.sheetCellLimit("mydata", 1));
			System.out.println("Get Data From Cell : "+excelUtility.getDatafromCell("mydata", 2, 10));
			System.out.println("Cell Type : "+excelUtility.checkCellType("mydata", 1, 0));
			
	}
}
