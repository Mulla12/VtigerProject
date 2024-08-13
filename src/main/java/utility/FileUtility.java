package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
		public static String getData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\sumai\\Downloads\\DWSExcel.xlsx");
			Workbook w= WorkbookFactory.create(fis);
			Sheet s = w.getSheet(sheetName);
			return s.getRow(row).getCell(cell).toString();
		}

	}
	


