package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearningImportCreatelead {

	public Object[][] learningExcel() throws IOException {
		XSSFWorkbook wBook = new XSSFWorkbook("./data/TC001.xlsx");
		
		XSSFSheet sheet = wBook.getSheetAt(0);
		
		int rowNum = sheet.getLastRowNum();
		System.out.println(rowNum);
		
		XSSFRow hrow = sheet.getRow(0);
		
		short cellNum = hrow.getLastCellNum();
		System.out.println(cellNum);
		
		Object[][] data = new Object[rowNum][cellNum];
	
		for (int i = 1; i <= rowNum; i++) {

			XSSFRow row = sheet.getRow(i);
	
			for (int j = 0; j < cellNum; j++) {
							
			XSSFCell cell = row.getCell(j);
			String stringCellValue = cell.getStringCellValue();
			data[i-1][j] = stringCellValue;
			System.out.println(stringCellValue);
		}
		}	
		return data;
	}

}
