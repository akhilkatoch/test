package automationFramework;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;


public class DataProvideExample {
	
	WebDriver driver = new ChromeDriver();
	  
	@BeforeTest
	  public void setup() {
		  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://google.com");
		  
		  }

	
  @Test(dataProvider = "SearchProvider")
  public void testMethod(String author, String searchKey) throws InterruptedException {
  {
	  WebElement searchText = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
	  
	  searchText.sendKeys(searchKey);
	  System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
	  Thread.sleep(3000);
	  String testValue = searchText.getAttribute("Value");
	  System.out.println(testValue +":::"+searchKey);
	  searchText.clear();
	  
	  Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
  }  
  }
  @DataProvider(name="SearchProvider")
  public Object[][] getDataFromDataprovider() {
    return new Object[][] 
   {
    	
    	{"Guru99", "India"},
    	{"Krishna", "UK"},
    	{"Bhupesh", "USA"},
    	
    };
  
  }

  

}
