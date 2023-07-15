package loginPageassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Loginpage2 {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
ChromeOptions co= new ChromeOptions();

co.addArguments("--remote-allow-origins=*");
   WebDriver driver=new ChromeDriver(co);
   driver.manage().window().maximize();
   driver.get("https://itera-qa.azurewebsites.net/home/automation");
   Thread.sleep(2000);
   driver.findElement(By.id("name")).sendKeys("Dnyaneshwar");
   Thread.sleep(2000);
   driver.findElement(By.id("phone")).sendKeys("9021254059");
   Thread.sleep(2000);
   driver.findElement(By.id("email")).sendKeys("dnyaneshwardharbale85@gmail.com");
   Thread.sleep(2000);
   driver.findElement(By.id("password")).sendKeys("Dnyanu@2002");
   Thread.sleep(2000);
   driver.findElement(By.id("address")).sendKeys("madsangvi road adgoan");
   Thread.sleep(2000);
   driver.findElement(By.name("submit")).click();
   Thread.sleep(2000);
   driver.findElement(By.id("male")).click();
   Thread.sleep(2000);
   driver.findElement(By.id("monday")).click();
   Thread.sleep(2000);
   driver.findElement(By.className("custom-select")).click();
   driver.findElement(By.className("custom-select")).sendKeys("Norway");
   Thread.sleep(2000);
  
   driver.findElement(By.xpath("//input[@class='custom-control-input']")).click();
   
   
   
   
   
   
   
   
   
   
   
   



	}

}
