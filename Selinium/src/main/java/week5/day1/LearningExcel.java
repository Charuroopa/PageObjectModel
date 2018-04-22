package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearningExcel {

	public static void main(String[] args) throws IOException {

		//Open the workbook
		XSSFWorkbook wBook = new XSSFWorkbook("./data/TC001.xlsx");
		//Goto SpreadSheet
		XSSFSheet sheet = wBook.getSheetAt(0);
		//Find the row count
		int rowNum = sheet.getLastRowNum();
		System.out.println(rowNum);
		//Goto header
		XSSFRow hrow = sheet.getRow(0);
		//Find how may cell or column present based on header.
		short cellNum = hrow.getLastCellNum();
		System.out.println(cellNum);
		//Using loops print the row and column value

		for (int i = 1; i <= rowNum; i++) 
		{
			//From which row we need to get the values
			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < cellNum; j++) 
			{
				//This is in the particular row all the column values will get and displayed
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			}
		}	

	}

}
