import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;


public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("/Users/akhilkatoch/Desktop/learnJava//teatdata.xls");
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet s = wb.getSheet("testcasessheet1");
		Iterator<Row> rowit = s.iterator();
		while(rowit.hasNext()) {
			
			System.out.println(rowit.next().getCell(0).getStringCellValue());
		}

	}

}
