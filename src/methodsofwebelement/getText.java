package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeOptions co =	new ChromeOptions();
		 
		 co.addArguments("--remote-allow-origins=*");
	        WebDriver driver= new ChromeDriver(co);
	        
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.get("https://www.instagram.com/accounts/login/");
	        Thread.sleep(2000);
	        driver.switchTo().activeElement();
	        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("ddharbale");
	        Thread.sleep(2000);
	        driver.findElement(By.name("password")).sendKeys("446444");
	        Thread.sleep(2000);
	        String button = driver.findElement(By.xpath("//button[@type=\"submit\"]")).getText();
	        System.out.println(button);

	}

}
