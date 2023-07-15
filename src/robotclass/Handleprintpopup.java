package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handleprintpopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    ChromeOptions co = new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
	   WebDriver driver = new ChromeDriver(co);
	    driver.manage().window().maximize();
	    driver.get("https://www.selenium.dev/");
	    Thread.sleep(2000);
	       Robot ro = new Robot();
	       
	      Thread.sleep(2000);
	      ro.keyPress(KeyEvent.VK_CONTROL);
	      ro.keyPress(KeyEvent.VK_P);
	      Thread.sleep(2000);
	      
	      ro.keyRelease(KeyEvent.VK_CONTROL);
	      ro.keyRelease(KeyEvent.VK_P);
	      Thread.sleep(2000);
	      
	      
	     ro.keyPress(KeyEvent.VK_TAB);
	     ro.keyRelease(KeyEvent.VK_TAB);
	     Thread.sleep(2000);
	     
	     ro.keyPress(KeyEvent.VK_ENTER);
	     ro.keyRelease(KeyEvent.VK_ENTER);
	     Thread.sleep(2000);
	      
	      
	       
	      
	    
	   
	}

}
