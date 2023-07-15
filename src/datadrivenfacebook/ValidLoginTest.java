package datadrivenfacebook;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dataDrivenPackage.Flib;

public class ValidLoginTest {

    public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {


			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions	co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
			WebDriver driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.facebook.com/");
			
			// to read the data from external files create the obj of flib 
			
			   Flib flib = new Flib();

			   driver.findElement(By.id("email")).sendKeys( flib.readExcelData("./data/TestData2.xlsx","validcredential",1, 0));
			   Thread.sleep(2000);
			   
			   driver.findElement(By.id("pass")).sendKeys(flib.readExcelData("./data/TestData2.xlsx","validcredential",1, 1));
			   
			   driver.findElement(By.id("u_0_9_DN")).click();
			   Thread.sleep(2000);
		}
	}
	

