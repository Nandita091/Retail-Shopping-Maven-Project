package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAPITest {
	
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	
	//constructor
	public ExcelAPITest(String excelPath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void main(String args[]) {
		getRowCount();
		System.out.println(getUsername(1, 0));
		System.out.println(getPassword(1, 1));
	}
	
	public int getRowCount() {
		int rowCount=0;
		
		try {
			
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows count: " +rowCount);
			
//			int columnCount = sheet.get
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.getStackTrace();			
		}
		return rowCount;
	}
	
	public String getUsername(int rowNum, int colNum) {
		
		String username = "";
		try {
			
			username = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			
//			System.out.println(username);
//			System.out.println(password);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.getStackTrace();
		}
		return username;
	}
	
	public String getPassword(int rowNum, int colNum) {
		String password = "";
		
		try {
			password = sheet.getRow(rowNum).getCell(colNum+1).getStringCellValue();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.getStackTrace();
		}
		return password;
	}

}
