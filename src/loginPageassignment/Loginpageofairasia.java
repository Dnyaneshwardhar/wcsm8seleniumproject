package loginPageassignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginpageofairasia {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrivers.geckodrivers","./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	 
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
  driver.get("https://aiflyingreturns.b2clogin.com/aiflyingreturns.onmicrosoft.com/oauth2/v2.0/authorize?client_id=ac5c8be3-c829-4db6-8eb7-aa4a37c61cbc&redirect_uri=https://api-loyalty.airindia.in/v1/security/authorization/openidconnect/authorize/delegated-token&response_type=code&state=S1J1YkMwbzllcVkwV1N0bUUzeThmVlZFV21YaGhmdFRlQ0FsaWxTU1hFYjRW_en-GB_false_&nonce=S1J1YkMwbzllcVkwV1N0bUUzeThmVlZFV21YaGhmdFRlQ0FsaWxTU1hFYjRW&scope=openid%20offline_access%20profile%20phone%20email&p=B2C_1A_SIGNUP_SIGNIN&prompt=login&display=page&code_challenge_method=S256&code_challenge=IgsazaDb7VPrTtMZgfo0f6kdkv6ZKV6hrTpI3bkPGTc&ui_locales=en-GB");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("dnyaneshwar34@gmail.com");
  
  Thread.sleep(2000);
  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("446464");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//button[@id='next']")).click();
  
	}
	

}
