package loginPageassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hotstarLoginpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.geckodrivers","./drivers/geckodriver.exe");
		
	WebDriver	driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hotstar.com/in/subscribe/sign-in?returnURL=/in/subscribe/my-account");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id=\"phoneNo\"]")).sendKeys("9021254059");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='submit-button']")).click();
	
	

	}

}
