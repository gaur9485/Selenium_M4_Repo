package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hwpf.model.FileInformationBlock;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel2 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream fis = new FileInputStream("./data/testData.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet("ipl");
		 int rowCount = sheet.getPhysicalNumberOfRows()-1;
		 System.out.println(rowCount);
		 
		 int cellCount = sheet.getRow(1).getPhysicalNumberOfCells();
		 System.out.println(cellCount);
		 
		 String[][] iplArr = new String [rowCount][cellCount];
		 
		 for(int i=1;i<=rowCount ;i++)
		 {
			 for(int j=0; j<cellCount; j++)
			 {
				 iplArr[i-1][j]=sheet.getRow(i).getCell(j).toString();
			 }
		 }
		 
		 for(String ipl []: iplArr)
		 {
			 for (String data:ipl)
			 {
				 System.out.print(data+" ");
			 }
			 System.out.println();
		 }
	}

}
