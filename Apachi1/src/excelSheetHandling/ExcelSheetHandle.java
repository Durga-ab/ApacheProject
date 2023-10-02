package excelSheetHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheetHandle 
{
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		String excelPath = "D:\\ExcelSheet\\ExcelSpreadsheet.xlsx";
		
		  FileInputStream s = new FileInputStream(excelPath);
				String value = WorkbookFactory.create(s).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
				System.out.println("Test Data is = "+ value);
		//double value1 = WorkbookFactory.create(s).getSheet("Sheet2").getRow(0).getCell(0).getNumericCellValue();
		//System.out.println("Test Data is = "+ value1);
			//CellType value2 = WorkbookFactory.create(s).getSheet("Sheet2").getRow(0).getCell(0).getCellType();
			//	System.out.println("Row and Column Type is = "+ value);
	}

	}


