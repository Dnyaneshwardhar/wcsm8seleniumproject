package loginPageassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginpageAirIndia {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		   ChromeOptions co=new ChromeOptions();
		   co.addArguments("--remote-allow-origins=*");
		   
		   WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("https://aiflyingreturns.b2clogin.com/aiflyingreturns.onmicrosoft.com/B2C_1A_signup_signin/api/CombinedSigninAndSignup/unified?local=signup&csrf_token=akZOL0VrVUdYNWI0TFFZWE5yTXVRa2NlcWdQMjRBZXBZWVdVR0FpWitGMU5kalJBWTBlNHNIc084aDZZdEJGV3lLOUVYODAvOTNQRzFZZU5jUU9OZEE9PTsyMDIzLTA0LTA5VDE3OjI1OjU2LjM2MzUwNFo7aG8xcG5QRkNZMzZ2SCtnakVjVGpkUT09O3siT3JjaGVzdHJhdGlvblN0ZXAiOjF9&tx=StateProperties=eyJUSUQiOiI2NzU1MTJjZi05NWJjLTQ5ZDgtYTIzYS1kODk3ZjJmYjRmODAifQ&p=B2C_1A_signup_signin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dnyaneshwardharbale85@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='sendButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='newPassword']")).sendKeys("121212");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='reenterPassword']")).sendKeys("121212");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Given Name']")).sendKeys("dnyaneshwar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='surname']")).sendKeys("dharbale");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class='day']")).click();
		driver.findElement(By.xpath("//select[@class='day']")).sendKeys("7");
		Thread.sleep(2000);
	
		        

	}

}
