package actionclass;




import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Doubleclickmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    ChromeOptions co = new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
	   WebDriver driver = new ChromeDriver(co);
	    driver.manage().window().maximize();
	    driver.get("https://www.selenium.dev/");
	    Thread.sleep(2000);
	    driver.get("https://www.selenium.dev/");
	    WebElement element = driver.findElement(By.xpath("//a[text()='About']"));
	  Actions ac = new Actions(driver);
	  ac.doubleClick(element).perform();
	  
	  
		
		
	}

	}


