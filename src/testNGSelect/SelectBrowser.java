package testNGSelect;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class SelectBrowser {
	 @Test
    @Parameters({"browser","url"})
 
  public void method1(String browserValue,String url) {
  if(browserValue.equals("chrome"))
  {
	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  WebDriver driver = new ChromeDriver(co);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get(url);
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  
	  
  }
  else if(browserValue.equals("Firefox"))
  {
	    System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get(url);
		  driver.findElement(By.name("username")).sendKeys("admin");
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  driver.findElement(By.id("loginButton")).click();
		  
  }
  else
  {
	 System.out.println("invalid browser");
  }
}
}
