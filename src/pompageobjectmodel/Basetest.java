package pompageobjectmodel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basetest extends Flib implements Iautoconstant1 {
	static WebDriver driver;
	static ChromeOptions co;

	public void setUp() throws IOException // open Browser
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH, "browser");
		String url = flib.readPropertyData(PROP_PATH, "url");

		if(browserValue.equals("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_PATH);
	          new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
			driver=new ChromeDriver(co);
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else if(browserValue.equals("Firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_PATH);
			
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else if(browserValue.equals("Edge"))
		{
			System.setProperty(EDGE_KEY,EDGE_PATH);
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

	public void tearDown()
	{
		driver.quit();
	}

	

	
	

	}


