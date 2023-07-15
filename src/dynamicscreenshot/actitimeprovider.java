package dynamicscreenshot;



import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.BeforeTest;

public class actitimeprovider {
 @BeforeTest
 public void property(){
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  ChromeDriver driver = new ChromeDriver(co);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("");
	  
 }
	 
 }