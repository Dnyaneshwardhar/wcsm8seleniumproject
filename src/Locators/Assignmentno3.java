package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignmentno3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stu
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
	 WebDriver driver= new ChromeDriver(co);
	 
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
	 
}
}
