package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class classNamelocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(co);

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("ross geller",Keys.ENTER);
		driver.findElement(By.className("lNPNe")).click();


	}

}
