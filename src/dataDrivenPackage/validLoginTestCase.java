package dataDrivenPackage;



	import java.io.IOException;
	import java.time.Duration;

	import org.apache.poi.EncryptedDocumentException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

	public class validLoginTestCase extends Flib {

		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {


			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions	co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
			WebDriver driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://127.0.0.1/login.do;jsessionid=j7utljtipfd1");
			
			// to read the data from external files create the obj of flib 
			
			   Flib flib = new Flib();

			   driver.findElement(By.name("username")).sendKeys( flib.readExcelData("./data/ActitimeTestData.xlsx","validcreds",1, 0));
			   Thread.sleep(2000);
			   
			   driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActitimeTestData.xlsx","validcreds",1, 1));
			   
			   driver.findElement(By.id("loginButton")).click();
			   Thread.sleep(2000);
		}
	}
	
			   /*driver.findElement(By.xpath("//a[@class='content tasks']")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
			   driver.findElement(By.xpath("//input[@onclick='addCustomer(this.form)']")).click();
			   driver.findElement(By.xpath("//input[@name='name']")).sendKeys("abcdefg");
			   driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
			   driver.findElement(By.xpath("//input[@onclick='addProject(this.form)']")).click();
			   WebElement dropdown = driver.findElement(By.name("customerId"));
			 Select sel = new Select(dropdown);
			 sel.selectByValue("15");*/
			 
			 
			   
			
			

	


