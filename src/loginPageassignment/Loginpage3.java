package loginPageassignment;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Loginpage3 {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co= new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");
		   WebDriver driver=new ChromeDriver(co);
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/signup");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dnyaneshwar");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dharbale");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("dnyaneshwardharbale85@gmail.com");
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("dnyaneshwardharbale85@gmail.com");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("dnyanu@2002");
		   Thread.sleep(2000);
		   //driver.findElement(By.xpath("//select[@class='_9407 _5dba _9hk6 _8esg']")).click();
		  // driver.findElement(By.xpath("//select[@class='_9407 _5dba _9hk6 _8esg']")).sendKeys("9");
		  // Thread.sleep(2000);
		 Select  selectDate= new Select(driver.findElement(By.id("day"))); //click());
		 Thread.sleep(1000);
		 selectDate.selectByVisibleText("9");
		 
	Select	 s1 = new Select(driver.findElement(By.id("month")));
		   Thread.sleep(1000);
		   s1.selectByValue("6");
		   
		  Select s2= new Select(driver.findElement(By.id("year")));
		  Thread.sleep(1000);
		  s2.selectByValue("2002");
		
		  
		  
		  driver.findElement(By.xpath("//input[@value='2']")).click();

		  driver.findElement(By.name("websubmit")).click();
		  
		  
		  
		 
		    
		   
		   
		   
		   


	}

}
