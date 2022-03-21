package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
public static String[][] getData(String excelFilePath) throws IOException {
	// To open the Excel file
	XSSFWorkbook book = new XSSFWorkbook(excelFilePath);
	// To open a sheet from the Excel file
	XSSFSheet sheet = book.getSheetAt(0);
	// To find the number of active rows in the sheet
	int rowCount = sheet.getLastRowNum();
	System.out.println("ROW COUNT: "+rowCount);
	// To find the number of active cols in the sheet
	int colCount = sheet.getRow(0).getLastCellNum();
	System.out.println("COLUMN COUNT: "+colCount);
	
	// Create 2D array of String to store the data
	String[][] data = new String[rowCount][colCount];
	
	// Iterate the rows using for loop
	for (int i = 1; i <= rowCount; i++) {
		XSSFRow eachRow = sheet.getRow(i);
		// Iterate the cols inside the row to get the data
		for (int j = 0; j < colCount; j++) {
			XSSFCell eachCell = eachRow.getCell(j);
			String value = eachCell.getStringCellValue();
			data[i-1][j] = value;
			System.out.println(value);
		}
	}
	// Close the work book
	book.close();
	// Return 2D array
	return data;
	
}
}
