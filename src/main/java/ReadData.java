import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData {

	public void tc() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/ServiceLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail&passive=1209600&sacu=1&ignoreShadow=0&hl=en&acui=0&flowName=GlifWebSignIn&flowEntry=AddSession");
		//driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
		ArrayList<String> username = readExcelData(0);
		ArrayList<String> password = readExcelData(1);
		for(int i=0; i<username.size();i++) {
			
			driver.findElement(By.id("identifierId")).clear();
			driver.findElement(By.id("identifierId")).sendKeys(username.get(i));
			//driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys
				
		}
	}
	
	public ArrayList<String> readExcelData(int colNo) throws IOException {
		FileInputStream fis = new FileInputStream("/Users/akhilkatoch/Desktop/learnJava//teatdata.xls");
				HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet s = wb.getSheet("testcasessheet1");
		Iterator<Row> rowIterator = s.iterator();
		rowIterator.next();
		ArrayList<String> list = new ArrayList<String>();
		
		while(rowIterator.hasNext()) {
			list.add(rowIterator.next().getCell(colNo).getStringCellValue());
			
		}
		System.out.println("List :::::"+list);
		return list;
	}
	public static void main(String[] args) throws IOException {
		ReadData data = new ReadData();
		data.tc();
	}
	
	
	

}
