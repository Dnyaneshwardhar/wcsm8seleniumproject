package loginPageassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPageofSnapchat {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
ChromeOptions	co	=new ChromeOptions();

co.addArguments("--remote-allow-origins=*");
 
WebDriver driver=new ChromeDriver(co);
driver.manage().window().maximize();
driver.get("https://demoqa.com/login");
Thread.sleep(2000);
driver.switchTo().activeElement();
driver.findElement(By.id("userName")).sendKeys("dnyanu");
Thread.sleep(2000);
driver.findElement(By.id("password")).sendKeys("Dnyanu@2002");
Thread.sleep(2000);



	}

}
