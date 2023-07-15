package loginPageassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(co);

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
				
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("lenovo laptop");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Processor']"));
		driver.findElement(By.xpath("//div[@title='Core i5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		driver.findElement(By.xpath(("//div[@class='_3879cV' and(text()='Lenovo')]"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='GST Invoice Available']")).click();
		driver.findElement(By.xpath("//div[.='GST Invoice Available' and (@ class='_3879cV')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Screen Size']")).click();
		driver.findElement(By.xpath("//div[text()='13 inch - 13.9 inch' and(@class='_3879cV')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		driver.findElement(By.xpath("//div[text()='Windows 10' and (@class='_3879cV')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Dedicated Graphics Memory']")).click();
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Integrated Graphics Card')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and(text()='Type')]")).click();
		driver.findElement(By.xpath("//div[@class='_3879cV' and(text()='Thin and Light Laptop')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Processor Brand']")).click();
		driver.findElement(By.xpath("//div[text()='Intel' and(@class='_3879cV')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Discount' and(@class='_2gmUFU _3V8rao')]")).click();
		driver.findElement(By.xpath("//div[text()='50% or more' and(@class='_3879cV')]")).click();
		Thread.sleep(2000);
         driver.findElement(By.xpath("//div[text()='Graphic Processor Name' and(@class='_2gmUFU _3V8rao')]")).click();
	     driver.findElement(By.xpath("//div[text()='Intel Integrated' and(@class='_3879cV')]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[text()='Touch Screen' and(@class='_2gmUFU _3V8rao')]")).click();
         driver.findElement(By.xpath("//div[text()='No' and(@class='_3879cV')]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[text()='Ram Type' and(@class='_2gmUFU _3V8rao')]")).click();
         driver.findElement(By.xpath("//div[text()='DDR4' and(@class='_3879cV')]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[text()='Customer Ratings']"));
	     driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[text()='RAM Capacity' and(@class='_2gmUFU _3V8rao')]")).click();
	     driver.findElement(By.xpath("//div[text()='8 GB' and(@class='_3879cV')]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[text()='LifeStyle' and(@class='_2gmUFU _3V8rao')]")).click();
	     driver.findElement(By.xpath("//div[text()='Processing & Multitasking' and(@class='_3879cV')]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[text()='Graphic Processor Series' and(@class='_2gmUFU _3V8rao')]")).click();
	     driver.findElement(By.xpath("//div[text()='Iris Xe' and(@class='_3879cV')]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[text()='Processor Generation']")).click();
         driver.findElement(By.xpath("//div[text()='11th Gen']")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[text()='Weight']")).click();
         driver.findElement(By.xpath("//div[text()='1.9 KG to 2.1 KG']")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[text()='Features']")).click();
         driver.findElement(By.xpath("//div[text()='MS Office' and(@class='_3879cV')]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[text()='Storage Type' ]")).click();
         driver.findElement(By.xpath("//div[text()='SSD' ]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[text()='SSD Capacity' ]")).click();
         driver.findElement(By.xpath("//div[text()='512 GB' and(@class='_3879cV')]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[text()='Usage' ]"));
         driver.findElement(By.xpath("//div[text()='High Performance' ]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[text()='Offers' ]"));
         driver.findElement(By.xpath("//div[text()='No Cost EMI' and(@class='_3879cV')]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[text()='Availability']")).click();
         driver.findElement(By.xpath("//div[text()='Include Out of Stock']")).click();
         
        
}
}
