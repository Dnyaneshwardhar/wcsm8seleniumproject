package operationalmethod;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getfirstselectedoptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(co);
		
		
	}

}
