package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumDev {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeOptions co =	new ChromeOptions();
		 
		 co.addArguments("--remote-allow-origins=*");
	         WebDriver driver= new ChromeDriver(co);
	         
	         driver.manage().window().maximize();
	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	         driver.get("https://www.selenium.dev/");
	         
	         Robot ro = new Robot();
	         ro.keyPress(KeyEvent.VK_CONTROL);
	         ro.keyPress(KeyEvent.VK_P);
	         
	         ro.keyRelease(KeyEvent.VK_CONTROL);
	         ro.keyRelease(KeyEvent.VK_P);
	         Thread.sleep(2000);
	         
	         ro.keyPress(KeyEvent.VK_TAB);
         ro.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
         
         ro.keyPress(KeyEvent.VK_ENTER);
        ro.keyRelease(KeyEvent.VK_ENTER);

	}

}
