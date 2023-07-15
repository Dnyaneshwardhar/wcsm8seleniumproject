package javaScriptExecutor;


import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class scrollDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	 
	  co.addArguments("--remote-allow-origins=*");
	 ChromeDriver driver = new ChromeDriver(co);
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.get("https://www.instagram.com");
       Thread.sleep(4000);
       JavascriptExecutor jse = (JavascriptExecutor)driver;
       Thread.sleep(2000);
       jse.executeScript("window.scrollBy(0,350)");
       Thread.sleep(2000);
       jse.executeScript("window.scrollBy(0,-350)");
	}

}
