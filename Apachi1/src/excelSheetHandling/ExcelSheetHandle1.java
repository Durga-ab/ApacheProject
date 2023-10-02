package excelSheetHandling;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetHandle1 
{
	public static void main(String[]args) throws IOException
	{
	// For Column 0th -
		int[] Serial_No = new int[10];
		for (int i=0; i<Serial_No.length; i++)
		{
			Serial_No[i]=i+1;
		}

	// For Column 1st -
	String[] name = new String[10];
	name[0] = "Student A";
	name[1] = "Student B";
	name[2] = "Student C";
	name[3] = "Student D";
	name[4] = "Student E";
	name[5] = "Student F";
	name[6] = "Student G";
	name[7] = "Student H";
	name[8] = "Student I";
	name[9] = "Student J";

	// For Column 2nd -
	String[] result = new String[10];
	result[0] = "Pass";
	result[1] = "Pass";
	result[2] = "Pass";
	result[3] = "Fail";
	result[4] = "Fail";
	result[5] = "Pass";
	result[6] = "Pass";
	result[7] = "Pass";
	result[8] = "Fail";
	result[9] = "Pass";

	// 1. Creating a Workbook or Excel
	XSSFWorkbook wb = new XSSFWorkbook();

	// 2. Creating sheet in workbook
	XSSFSheet sheet = wb.createSheet("Test_Data_Sheet");

	XSSFRow row;

	for(int i=0; i<10; i++)
	{
	row = sheet.createRow(i+1);
	for(int j =0; j<3; j++)
	{
	XSSFCell cell = row.createCell(j);

	if(cell.getColumnIndex()==0)
	{
	cell.setCellValue(Serial_No[i]);
	}

	if(cell.getColumnIndex()==1)
	{
	cell.setCellValue(name[i]);
	}

	if(cell.getColumnIndex()==2)
	{
	cell.setCellValue(result[i]);
	}
	}
	}
	// 3. Path of Workbook
	String path = "D:\\ExcelSheet\\Book1.xlsx";

	// 4. Creating  Workbook & storing in given path
	FileOutputStream out = new FileOutputStream(path);

	// 5. Write data into sheet
	wb.write(out);

	System.out.println("File Generated Successfully");
	}
	

}
