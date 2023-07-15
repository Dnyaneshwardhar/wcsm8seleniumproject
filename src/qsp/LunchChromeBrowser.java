package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LunchChromeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drivers","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		new ChromeDriver(co);
	}

}
