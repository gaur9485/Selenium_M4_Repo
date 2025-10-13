package pomPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	public String readPropertyData(String propPath, String key) throws IOException
	{
		FileInputStream fis =  new FileInputStream(propPath);
		Properties prop=new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
		
	}
	
	public String readExcelData(String excelPath, String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);//To specify the location of the file		
		Workbook wb = WorkbookFactory.create(fis);// To make the file ready to read
		Sheet sheet = wb.getSheet(sheetName);//To get into the sheet
		Row row = sheet.getRow(rowNo);// To get into the row
		Cell cell = row.getCell(cellNo);//To get into the cell
		String data = cell.toString();
		return data;	
	}
	
	public String readNumericData(String excelPath, String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);//To specify the location of the file		
		Workbook wb = WorkbookFactory.create(fis);// To make the file ready to read
		Sheet sheet = wb.getSheet(sheetName);//To get into the sheet
		Row row = sheet.getRow(rowNo);// To get into the row
		Cell cell = row.getCell(cellNo);//To get into the cell
		double data = cell.getNumericCellValue();
		
		long data1=(long) data;
		
		String newData = String.valueOf(data1);
		return newData;
	}
	
	
	public int rowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;
	}

}
