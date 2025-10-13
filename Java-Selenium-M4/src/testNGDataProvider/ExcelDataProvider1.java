package testNGDataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider1 {
	
	@DataProvider(name = "invalidlogincreds")
	public String[][] excelInvalidData() throws EncryptedDocumentException, IOException 
	{
	   FileInputStream fis = new FileInputStream("./data/testData.xlsx");
	   
	   Workbook wb = WorkbookFactory.create(fis);
	   Sheet sheet = wb.getSheet("invalidcreds");
	   int rowCount = sheet.getPhysicalNumberOfRows();
	   int cellCount=sheet.getRow(1).getPhysicalNumberOfCells();
	   
	   String[][] data = new String [rowCount-1] [cellCount];
	   
	   for(int i=1;i<rowCount;i++)
	   {
		   for(int j=0;j<cellCount;j++)
		   {
			   data[i-1][j]=sheet.getRow(i).getCell(j).toString();
		   }
	   }
	   return data;
	   
	   
	}

}
