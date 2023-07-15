package keyworddriven;

	import java.io.IOException;
	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class BaseTest extends Flib1 {

      static WebDriver driver;

		public void openBrowser() throws IOException
		{
			Flib1 flib = new Flib1();
			String browserValue = flib.readPropertyData("./data/config.properties","browser");
			String url = flib.readPropertyData("./data/config.properties","url");

			if(browserValue.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
				driver=new ChromeDriver(co);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get(url);
			}
			else if(browserValue.equals("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
				
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get(url);
			}
			else if(browserValue.equals("Edge"))
			{
				System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
				driver=new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get(url);
			}
			else
			{
				System.out.println("Invalid BrowserValue!!!");
			}

		}

		public void closeBrowser()
		{
			driver.quit();

}
	}
