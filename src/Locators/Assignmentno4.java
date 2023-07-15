package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignmentno4 {

	public static void main(String[] args) throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
	 WebDriver driver= new ChromeDriver(co);
	 
	 driver.manage().window().maximize();
	driver.get("https://loginslink.com/login");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("dnyaneshwardharbale85@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("444444");
	Thread.sleep(2000);
	driver.findElement(By.id("login")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("search-box")).sendKeys("CanvasCcsdStudentLogin");
	
	

	
		

	}

}
