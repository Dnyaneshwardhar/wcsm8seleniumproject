package takesScreenshotAs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class takesScreenshotway4 {


		public static void main(String[] args) throws InterruptedException, IOException {
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions	co	=new ChromeOptions();

	co.addArguments("--remote-allow-origins=*");
	 
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.instagram.com/");
	Thread.sleep(4000);
	 EventFiringWebDriver efm = new EventFiringWebDriver(driver);
	 File src = efm.getScreenshotAs(OutputType.FILE);
	 File dest = new File("./Screenshot/ss2.png");
	 Files.copy(src, dest);
	

	}

}
