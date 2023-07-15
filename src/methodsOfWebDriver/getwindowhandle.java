package methodsOfWebDriver;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getwindowhandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
       co.addArguments("--remote-allow-origins=*");
       ChromeDriver driver = new ChromeDriver(co);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("http://omayo.blogspot.com/");
	   
	   Thread.sleep(2000);
	   WebElement scroll=driver.findElement(By.xpath("//a[text()='Open a popup window']"));
	   Point down = scroll.getLocation();
	   int xaxis = down.getX();
	    int yaxis = down.getY();
	   JavascriptExecutor jse = ( JavascriptExecutor)driver;
	   jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
	  String allHandle = driver.getWindowHandle();
	  Thread.sleep(2000);
		  driver.switchTo().window(allHandle).close();
		   
	
	  }
	 
	
	
	  }


