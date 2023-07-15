package loginPageassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PumaLoginpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
	 WebDriver driver= new ChromeDriver(co);
	 
	 driver.manage().window().maximize();
	 driver.get("https://in.puma.com");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[@data-link-name='Men']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[@data-link-name='Sneakers']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//h3[@class='w-full mobile:text-sm mobile:pr-0 font-bold text-base pr-5 line-clamp-2'])[4]")).click();
     Thread.sleep(2000);
     
      
      
      
     

	}

}
