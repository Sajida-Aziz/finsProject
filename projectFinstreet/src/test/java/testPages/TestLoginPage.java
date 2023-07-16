package testPages;

import org.testng.annotations.Test;

import pageObject.LoginPage;
import utilities.ExcelRead;
import utilities.readConfig;
import utilities.LaunchBrowser;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TestLoginPage extends LaunchBrowser {
	WebDriver driver;
	readConfig readconfig =new readConfig();
	LoginPage loginpage;
	
  @Test()
  public void verifyTitle() {
	  System.out.println(driver.getCurrentUrl());
	  
  }
  @Test(enabled=false)
  public void invalidLogin() throws InterruptedException
  {
	  loginpage=new LoginPage(driver);
	  loginpage.phone.click();
	  Thread.sleep(2000);
	  loginpage.phoneno.sendKeys("0503194981");
	  loginpage.phonePwd.sendKeys("sddff");
	  loginpage.continueButtonPhone.click();
  }
  
  
  @Test()
  public void invalidIndiaLogin() throws InterruptedException
  {
	 loginpage=new LoginPage(driver);
	 loginpage.phone.click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//span[@class='css-gfpxou-ChevronContainer e1vujd5311']")).click();
	 loginpage.dropdownSearch.sendKeys("india");
	 loginpage.dropdownCountryIndia.click();
	 driver.findElement(By.xpath("//input[@class='css-nvk3u7-NumberInput e1vujd5312']")).sendKeys("7012484446");
//	 loginpage.phoneno.sendKeys("7012484446");
	 Thread.sleep(2000);
	 loginpage.phonePwd.sendKeys("hello");
	 Thread.sleep(2000);
	 //loginpage.continueButtonPhone.click();
	  }
  
  
  @DataProvider(name="loginData")
  public Object[][] getData() throws IOException
  {
	 ExcelRead excelread=new ExcelRead("Sheet1");
	 Object logindata[][]=new String [ExcelRead.row][ExcelRead.column];
	 for(int i=1;i<=ExcelRead.row;i++)
	 {
	for(int j=0;j<ExcelRead.column;j++) {	 
	
	logindata[i-1][j]=excelread.ReadData(i, j);
	}
	 }
	 	 return logindata;	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  launchBrowser(readconfig.getUrl(),readconfig.getBrowser());
	   this.driver=super.driver;
	 }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}
