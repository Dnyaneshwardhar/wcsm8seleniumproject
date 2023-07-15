package loginPageassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flightbooking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
	 WebDriver driver= new ChromeDriver(co);
	 
	 driver.manage().window().maximize();
	 driver.get("https://www.easemytrip.com/flights.html");
	 Thread.sleep(2000);
	 driver.findElement(By.className("autoFlll cityinput")).click();
	driver.findElement(By.className("autoFlll cityinput")).sendKeys("DEL-Delhi");
	 
	 

	}

}
