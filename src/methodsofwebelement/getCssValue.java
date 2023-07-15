package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getCssValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(co);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		  WebElement button = driver.findElement(By.xpath("//a[text()='Login']"));
		 String colou = button.getCssValue("color");
		 System.out.println(colou);
		
		

	}

}
