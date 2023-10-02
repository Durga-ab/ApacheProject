package excelSheetHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization 
{
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		String path ="D:\\ExcelSheet\\ExcelSpreadsheet.xlsx";
		for(int i=0;i<3;i++)//1 //2
		{
			for(int j=0;j<3;j++)//1 1 1 2 1 3
			{
				FileInputStream file = new FileInputStream(path);
				String value = WorkbookFactory.create(file).getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print(" " +value);
			 }
			    System.out.println();
		}
	}

}
