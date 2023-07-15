package methodsOfWebDriver;





import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class manageMethod {
	public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
 ChromeOptions co = new ChromeOptions();
 co.addArguments("--remote-allow-origins=*");
 ChromeDriver driver = new ChromeDriver(co);
 driver.manage().window().maximize();
 Dimension size = new Dimension(340,300);
 driver.manage().window().setSize(size);

		 
 

 
 
	}

}
