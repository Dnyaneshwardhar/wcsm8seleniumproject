package pompageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Stale {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(co);
	driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("http://127.0.0.1/login.do;jsessionid=1tc5hercqmej4");
	 Thread.sleep(2000);
	 WebElement usernameTB = driver.findElement(By.name("username"));
	 usernameTB.sendKeys("admin");
	 Thread.sleep(2000);
	 WebElement passwordTB = driver.findElement(By.name("pwd"));
	 passwordTB.sendKeys("manager");
	
	
	 WebElement button = driver.findElement(By.id("loginButton"));
	 button.click();
	// driver.navigate().refresh();

	 
	}

}
