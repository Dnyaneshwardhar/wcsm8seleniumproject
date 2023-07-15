package assingment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class assignmentno4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
       co.addArguments("--remote-allow-origins=*");
       ChromeDriver driver = new ChromeDriver(co);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("https://www.flipkart.com/");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[.='✕']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.name("q")).sendKeys("gallaxy f13");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F13 (Waterfall Blue, 64 GB)']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//div[@class='_2C41yO'])[3]")).click();

	}

}
