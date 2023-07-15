package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getwindowHandle {

	public static void main(String[] args) throws InterruptedException {
	
	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   
	    ChromeOptions co = new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
	    ChromeDriver driver = new ChromeDriver(co);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.instagram.com/");
	    Thread.sleep(2000);
	    //driver.findElement(By.xpath("//span[text()='About']")).click();
	        
	    String window = driver.getWindowHandle();
	    System.out.println(window);

	}

}
