package loginPageassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class nopcommercewebsite {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
ChromeOptions	co =new ChromeOptions();

co.addArguments("--remote-allow-origins=*");
  WebDriver  driver=new ChromeDriver(co);
  driver.manage().window().maximize();
  driver.get("https://www.nopcommerce.com/en/register");
  Thread.sleep(2000);
  driver.findElement(By.id("FirstName")).sendKeys("Dnyaneshwar");
  Thread.sleep(2000);
  driver.findElement(By.id("LastName")).sendKeys("Dharbale");
  Thread.sleep(2000);
  driver.findElement(By.name("Email")).sendKeys("dnyaneshwardharbale85@gmail.com");
  Thread.sleep(2000);
  driver.findElement(By.name("ConfirmEmail")).sendKeys("dnyaneshwardharbale85@gmail.com");
  Thread.sleep(2000);
  driver.findElement(By.name("Username")).sendKeys("ddharbale");
  Thread.sleep(2000);
  driver.findElement(By.id("check-availability-button")).click();
  Thread.sleep(2000);
  driver.findElement(By.id("CountryId")).click();
  driver.findElement(By.id("CountryId")).sendKeys("india");
  Thread.sleep(2000);
  driver.findElement(By.id("TimeZoneId")).click();
  driver.findElement(By.id("TimeZoneId")).sendKeys("Pacific Standard Time (Mexico)");
  Thread.sleep(2000);
  driver.findElement(By.id("Password")).sendKeys("Dnyanu2002");
  Thread.sleep(2000);
  driver.findElement(By.id("ConfirmPassword")).sendKeys("Dnyanu2002");
  Thread.sleep(2000);
  driver.findElement(By.id("Details_CompanyIndustryId")).click();
  driver.findElement(By.id("Details_CompanyIndustryId")).sendKeys("Develops nopCommerce extensions");
  Thread.sleep(2000);
  driver.findElement(By.id("Details_CompanyRoleId")).click();
  driver.findElement(By.id("Details_CompanyRoleId")).sendKeys("Technical developer");
  Thread.sleep(2000);
  driver.findElement(By.id("Details_ExtensionsDevelopmentPeriodId")).click();
  driver.findElement(By.id("Details_ExtensionsDevelopmentPeriodId")).sendKeys("Over 6 years");
  Thread.sleep(2000);
//  driver.findElement(By.className("custom-control-input")).click();
  driver.findElement(By.id("is-nop-commerce-srores-true")).click();
  Thread.sleep(2000);
  driver.findElement(By.id("Details_CompanySizeId")).click();
  driver.findElement(By.id("Details_CompanySizeId")).sendKeys("6–15");
  Thread.sleep(2000);
  driver.findElement(By.id("Details_CompanyWebsiteUrl")).sendKeys("no suggestion");
  
  
  

  
  
  

	}

}
