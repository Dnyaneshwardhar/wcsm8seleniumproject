package operationalmethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class getoptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");
		ChromeDriver  driver =new ChromeDriver(co);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/Html/menumultiple.html");
		 Thread.sleep(2000);
		  WebElement dropdown = driver.findElement(By.id("i1"));
		     Select sel = new Select(dropdown);
		    List<WebElement> alloptions = sel.getOptions();
		    for(int i=0;i<alloptions.size();i++)
		    {
			 String option = alloptions.get(i).getText();
		         System.out.println(option);
		    }       
		    for (WebElement op:alloptions)
		    {
		    	String options = op.getText();
		    	System.out.println(options);
		    }
	}
}
		  
		         
		  
		  
