package takesScreenshotAs;

import java.io.File;
import java.io.IOException;
import java.rmi.Remote;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TakesScreenshotWay3 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions	co	=new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");
		 
		RemoteWebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.linkedin.com/feed/");
		Thread.sleep(2000);
		 File src = driver.getScreenshotAs(OutputType.FILE);
		         File dest = new File("./Screenshot/ss3.png");
		Files.copy(src, dest);
	}

}
