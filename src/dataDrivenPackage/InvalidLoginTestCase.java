package dataDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InvalidLoginTestCase extends Flib {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions	co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
			WebDriver driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://127.0.0.1/login.do;jsessionid=j7utljtipfd1");
			
	
		 Flib flib = new Flib();
		 int rc = flib.rowCount("./data/ActitimeTestData.xlsx","invalidcreds");
		 for(int i=1;i<=rc;i++)
		 {

		  String invalidusername = flib.readExcelData("./data/ActitimeTestData.xlsx","invalidcreds", i, 0);
		  String invalidpassword = flib.readExcelData("./data/ActitimeTestData.xlsx","invalidcreds",i, 1);
		  driver.findElement(By.name("username")).sendKeys(invalidusername);
		  driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
		  driver.findElement(By.id("loginButton")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.name("username")).clear();
	   }
	}
}


