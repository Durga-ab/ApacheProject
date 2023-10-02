package excelSheetHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization1 
{
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		String path ="D:\\ExcelSheet\\ExcelSpreadsheet.xlsx";
		
		for(int a=0;a<3;a++)
		{
			for(int b=0;b<3;b++)
			{
				FileInputStream file = new FileInputStream(path);
				String value = WorkbookFactory.create(file).getSheet("sheet1").getRow(a).getCell(b).getStringCellValue();
				System.out.println(""+value);
			}
			     
		}
	}

}
