package readExcelData;


	

		import java.io.FileInputStream;
		import java.io.IOException;

		import org.apache.poi.EncryptedDocumentException;
		import org.apache.poi.ss.usermodel.Cell;
		import org.apache.poi.ss.usermodel.Row;
		import org.apache.poi.ss.usermodel.Sheet;
		import org.apache.poi.ss.usermodel.Workbook;
		import org.apache.poi.ss.usermodel.WorkbookFactory;

		public class ReadExceldatausingloop {

			

			public static void main(String[] args) throws EncryptedDocumentException, IOException {
				for(int i=1;i<=10;i++)
				{
					
				FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
				Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("IPL");
			Row row = sheet.getRow(i);
			       Row row1 = sheet.getRow(i);
			Cell cell = row.getCell(0);
		Cell cell1 = row1.getCell(1);
			
			
			
			String data = cell.getStringCellValue();
		String	data1=cell1.getStringCellValue();
			
			System.out.println(data);
			System.out.println(data1);
			
			}
			
				

			}

		}

