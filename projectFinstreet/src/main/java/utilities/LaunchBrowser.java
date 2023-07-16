package utilities;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchBrowser {

	public WebDriver driver;
	
	
	public void launchBrowser(String url,String browser)
	{		
		if (browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(options);
			this.driver=driver;
			driver.manage().window().maximize();
			driver.get(url);
			}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
					driver=new FirefoxDriver();
	
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
	
				driver=new EdgeDriver();
	
		}
		//driver.manage().window().maximize();
		//driver.get(url);			

	}
	
	
	
	

	public void closeBrowser(WebDriver driver)
	{
		driver.quit();
	}
	 

	
}
