package testNGPack2;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void f() {
  
  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
  ChromeOptions co = new ChromeOptions();   
  co.addArguments("--remote-allow-origins=*");
 ChromeDriver driver = new ChromeDriver(co);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.google.com/");
driver.switchTo().activeElement().sendKeys("sql",Keys.ENTER);
  }
  
}
