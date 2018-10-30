
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {
	
	
	
	public static void main(String[] args) {
		
		
		
		 WebDriver driver = new ChromeDriver();
		 
	
		 
		 driver.get("https://www.facebook.com/");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.id("u_0_c")).sendKeys("akhil");
		 driver.findElement(By.id("u_0_e")).sendKeys("katoch");
		 driver.findElement(By.id("u_0_h")).sendKeys("6474610900");
		 driver.findElement(By.id("u_0_o")).sendKeys("katoch.akhil@gmail.com");
		 
		 Select months = new Select(driver.findElement(By.id("month")));
		 months.selectByVisibleText("Oct");
		 Select days = new Select(driver.findElement(By.id("day")));
		 days.selectByIndex(2);
		 Select years = new Select(driver.findElement(By.id("year")));
		 years.selectByIndex(8);
		  
		 
		 
		//WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"u_0_p\"]/span[1]/label"));
		 //radio1.click(); 
		 driver.findElement(By.id("u_0_a")).click();
		 driver.findElement(By.xpath("//*[@id=\"u_0_u\"]")).click();
		 //driver.close();
		
		 
		 	
				
	}

}
