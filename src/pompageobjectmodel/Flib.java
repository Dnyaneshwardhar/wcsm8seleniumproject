package pompageobjectmodel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readExcelData(String excelPath,String sheetName,int rowCount ) throws EncryptedDocumentException, IOException
	{
		FileInputStream Fis = new FileInputStream(excelPath);
		 Workbook Wf = WorkbookFactory.create(Fis);
		Sheet sheet = Wf.getSheet(sheetName);
		 Row row = sheet.getRow(rowCount);
		 Cell cell = row.getCell(rowCount);
		   String data = cell.getStringCellValue();
		   return data;
	 }
	public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook WF = WorkbookFactory.create(fis);
		  Sheet sheet  =WF.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;
		
	}
	public void WriteExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook WF = WorkbookFactory.create(fis);
		Sheet sheet = WF.getSheet(sheetName);
		    Row row = sheet.getRow(cellCount);
	    Cell cell = row.createCell(cellCount);
	    cell.setCellValue(data);
	    OutputStream fos = new FileOutputStream(excelPath);
	    WF.write(fos);
	}
	public String readPropertyData(String propPath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		
		String data = prop.getProperty(key);
		return data;
	}
	public short cellCount(String excelPath,String sheetName,int rowCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
	  Sheet   sheet = wb.getSheet(sheetName);
	  Row row = sheet.getRow(rowCount);
	  short cc = row.getLastCellNum();
	  return cc;
	  
	}
	
	

}
