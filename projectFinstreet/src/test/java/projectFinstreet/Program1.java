package projectFinstreet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.stage.dashboard.thefinstreet.co.uk/");
		driver.findElement(By.xpath("//button[@class='css-19258jd-Button e1bkth5b9']"));
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sajia.saj@gmail.com");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("qwertyui1A;");
		
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(1000);
		
			System.out.println( driver.findElement(By.xpath("//div[@class='css-gtxdqb-Main e1r7yq4j0']")).getText());
	
driver.findElement(By.xpath("//button[@class='css-1xf4372-Button e1bkth5b9']")).click();
 Thread.sleep(3000);

 driver.findElement(By.xpath("//input[@class='css-nvk3u7-NumberInput e1vujd5312']")).sendKeys("0503194981");
 Thread.sleep(3000);
 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("dddd");
 Thread.sleep(3000);
 driver.findElement(By.xpath("//button[@type='submit']")).click();
 Thread.sleep(3000);
System.out.println(driver.findElement(By.xpath("//div[@class='css-gtxdqb-Main e1r7yq4j0']")).getText());
Thread.sleep(3000);
driver.navigate().refresh();
 
			driver.findElement(By.xpath("//button[@class='css-19258jd-Button e1bkth5b9']"));
			driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sajida.saj@gmail.com");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("qwertyui1A;");
			 driver.findElement(By.xpath("//button[@type='submit']")).click();
			 Thread.sleep(5000);
			 //driver.switchTo().alert();
			 System.out.println(driver.findElement(By.xpath("//div[@class='css-1fh00r2-Modal e1stk8t44']")).isDisplayed());
		driver.quit();
  
		
	}

}

