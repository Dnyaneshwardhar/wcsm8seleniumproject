package loginPageassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Loginpage4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions 	co=new ChromeOptions();
	
	co.addArguments("--remote-allow-origins=*");
WebDriver	driver=new ChromeDriver(co);
driver.manage().window().maximize();
 driver.get("http://elementalselenium.com/");
 Thread.sleep(2000);
 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("dhshsgaah@gmail.com");
 Thread.sleep(2000);
 driver.findElement(By.className("language")).click();
 driver.findElement(By.className("language")).sendKeys("java");
 Thread.sleep(2000);
 driver.findElement(By.id("submit")).click();
 
 
 

	}

}
