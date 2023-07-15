package methodsOfWebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchToMethodAndNavigateMethod {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote--allow-origin=*");
		ChromeDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}
}





