package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Findelementsmethod {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		     ChromeOptions co  =new ChromeOptions();
		     
		      co.addArguments("--remote-allow-origins=*");
		   WebDriver driver=new ChromeDriver(co);
		   driver.manage().window().maximize();
		   driver.get("https://www.google.com/");
		   
		    driver.switchTo().activeElement().sendKeys("iphone");
		    Thread.sleep(5000);
	   List<WebElement> Options =driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	    Thread.sleep(5000);
	    for(int i=0;i<Options.size();i++)
	    {
	     WebElement opt=Options.get(i);
	    String	iphones =opt.getText();	
	    System.out.println(iphones);
	    Thread.sleep(5000);
	    
	    }
		    
	}

}
