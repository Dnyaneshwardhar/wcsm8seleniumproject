package datadrivenframework;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

public String readExcelData(String excelPath,String sheetName,int rowCount,int cellcount) throws EncryptedDocumentException, IOException
{
	 FileInputStream fis = new FileInputStream(sheetName);
     Workbook wb = WorkbookFactory.create(fis);
     Sheet sheet = wb.getSheet(sheetName);
     Row row = sheet.getRow(rowCount);
     Cell cell = row.getCell(cellcount);
     String data = cell.getStringCellValue();
     return data;
		
	}

  public int rowCount(String excelPath,String Sheetname) throws EncryptedDocumentException, IOException
  {
	 FileInputStream fis = new FileInputStream(excelPath);
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sheet = wb.getSheet(Sheetname);
	 int rc = sheet.getLastRowNum();
	 return rc;
	 
  }

}
