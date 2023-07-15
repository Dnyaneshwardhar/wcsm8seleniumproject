package solution5D;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
	     System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    ChromeOptions co = new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
	   ChromeDriver driver = new ChromeDriver(co);  
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("https://demowebshop.tricentis.com/");
	   driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@id='gender-male']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.id("FirstName")).sendKeys("Dnyaneshwar");
	   Thread.sleep(2000);
	   driver.findElement(By.id("LastName")).sendKeys("Dharbale");
	   Thread.sleep(2000);
	   driver.findElement(By.id("Email")).sendKeys("dnyaneshwardharbale85@gmail.com");
	   Thread.sleep(2000);
	   driver.findElement(By.id("Password")).sendKeys("Dnyanu@2002");
	   driver.findElement(By.id("ConfirmPassword")).sendKeys("Dnyanu@2002");
	   driver.findElement(By.id("register-button")).click();
	   driver.findElement(By.xpath("//a[.='Log in']")).click();
	   driver.findElement(By.id("Email")).sendKeys("dnyaneshwardharbale85@gmail.com");
	   driver.findElement(By.id("Password")).sendKeys("Dnyanu@2002");
	   driver.findElement(By.id("RememberMe")).click();
	   driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	   driver.findElement(By.id("small-searchterms")).sendKeys("blue jeans");
	   driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
	   driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();
	   driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
       driver.findElement(By.id("termsofservice")).click();
       driver.findElement(By.id("checkout")).click();
       driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("india");
       driver.findElement(By.name("BillingNewAddress.City")).sendKeys("nashik");
       driver.findElement(By.name("BillingNewAddress.Address1")).sendKeys("adgoan");
       driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("422003");
       driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("9021254059");
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//input[@class='button-1 new-address-next-step-button']/ancestor::div[@id='billing-buttons-container']")).click();
	}

}
