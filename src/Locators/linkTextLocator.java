package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class linkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("dnyaneshwardharbale85@gmail.com");
		
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("44644464");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class=\'_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\']")).click();
		

		
		
		


	}

}
