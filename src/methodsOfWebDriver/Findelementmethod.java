package methodsOfWebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Findelementmethod {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 ChromeOptions co = new ChromeOptions();
	   
      co.addArguments("--remote-allow-origins=*");
        WebDriver   driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/admin/OneDrive/Desktop/Html/Checkbox.html");
             WebElement   automationcheckbox=driver.findElement(By.id("i3"));
             System.out.println(automationcheckbox);
             automationcheckbox.click();
             Thread.sleep(6000);
             automationcheckbox.click();
             Thread.sleep(6000);
             driver.navigate().to("http://127.0.0.1/login.do;jsessionid=7wgecbc4ytmw");
             driver.manage().window().maximize();
            WebElement usn=driver.findElement(By.name("username"));
             usn.sendKeys("admin");
              WebElement   ps =driver.findElement(By.name("pwd"));
              ps.sendKeys("manager");
              driver.findElement(By.id("loginButton")).click();
             
              
                  
                  
             
             
             
             
	}

}
