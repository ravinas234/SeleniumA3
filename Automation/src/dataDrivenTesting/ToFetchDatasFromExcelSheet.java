package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDatasFromExcelSheet {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	File f = new File(".\\test-data\\DWS.xlsx");  //copy first absolute path[from properties] and delete upto\\test=-data
	FileInputStream fis = new FileInputStream(f);
	Workbook workbook = WorkbookFactory.create(fis);
	//how to get inside a sheet
	Sheet sheet = workbook.getSheet("RegistrationCredentials");
	
	int rowNum = sheet.getPhysicalNumberOfRows();
	for(int i=0; i< rowNum; i++) {
		Row row = sheet.getRow(i);
		int cellNum = row.getPhysicalNumberOfCells();
		for(int j= 0; j< cellNum; j++)
		{
			Cell cell = row.getCell(j);
			String data = cell.toString();
			System.out.println(data+"\t");
		}
		System.out.println();
		}
	//Cell data = workbook.getSheet("RegistrationCredentials").getRow(1).getCell(0);
	//System.out.println(data);
	
	/*
	 * Row row = sheet.getRow(0);
	*Cell cell = row.getCell(0);
	*System.out.println(cell);
	*/
}
}
