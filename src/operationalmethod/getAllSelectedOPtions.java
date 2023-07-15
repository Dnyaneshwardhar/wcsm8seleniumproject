package operationalmethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectedOPtions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   
		    ChromeOptions co =new ChromeOptions();
		      
		    co.addArguments("--remote-allow-origins=*");
		     ChromeDriver driver = new ChromeDriver (co);
		     
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
             driver.get("file:///C:/Users/admin/OneDrive/Desktop/Html/menumultiple.html");
             WebElement dropDown = driver.findElement(By.id("i1"));
               Select sel = new Select(dropDown);
               for(int i=0;i<=5;i++)
               {
            	   sel.selectByIndex(i);
               }
               List<WebElement> alloptions = sel.getAllSelectedOptions();
               for(WebElement op:alloptions)
               {
            	   String option = op.getText();
            	   System.out.println(option);
               }
             
             

	}

}
