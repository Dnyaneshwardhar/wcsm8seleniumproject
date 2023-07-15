package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SynchronizationInstagram {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co =new ChromeOptions().addArguments("--remote-allow-origins=*");
  WebDriver driver=new ChromeDriver(co);
	 
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
      driver.get("https://www.instagram.com/");
   
      driver.findElement(By.xpath("//input[@name='username']")).sendKeys("omkar");
      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("43232");
      driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
      
}
}
