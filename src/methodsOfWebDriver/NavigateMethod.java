package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.navigate().to("https://www.instagram.com/");
      driver.navigate().back();
      Thread.sleep(2000);
	}
}
      
      
