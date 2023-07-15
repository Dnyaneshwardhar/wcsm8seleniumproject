package datadrivenframework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ValidLoginTestCase extends Flib {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  ChromeOptions co = new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		   ChromeDriver driver = new ChromeDriver(co);
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		   driver.get("https://www.instagram.com/");
		   //driver. switchTo().activeElement();
		    Flib flib = new Flib();
	        driver.findElement(By.tagName("input")).sendKeys(flib.readExcelData("./data/ActitimeTestData.xlsx","validcreds",1, 0));
	        Thread.sleep(2000);
		   driver.findElement(By.id("password")).sendKeys(flib.readExcelData("./data/ActitimeTestData.xlsx","validcreds",1, 1));
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
		   Thread.sleep(2000);
		   driver.quit();
		   
		   
		   
		    

	}

}
