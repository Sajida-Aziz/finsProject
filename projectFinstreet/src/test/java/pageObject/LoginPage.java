package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//button[@class='css-19258jd-Button e1bkth5b9']")
	public WebElement Email;
	
	@FindBy(xpath="//button[@class='css-1xf4372-Button e1bkth5b9']")
	public WebElement phone;
	
	@FindBy(xpath="//input[@name='emailAddress']")
	public WebElement emailIdField;

	@FindBy(xpath="//input[@name='password']")
	public WebElement emailPwd;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement continueButton;
	
	@FindBy(xpath="")
	public WebElement EmailPwdErrorMsg;
	
	@FindBy (xpath="//button[@class='css-1xf4372-Button e1bkth5b9']")
	public WebElement phoneno;
	
	
	@FindBy(xpath="//div[@class='css-1angkji-Item e1vujd535']/following-sibling::div/child::div[1]/child::div[2]")
	public WebElement dropdownCountryIndia;
	
	@FindBy (xpath="//input[@class='css-nvk3u7-NumberInput e1vujd5312']")
	public WebElement phoneNo;
	
	@FindBy (xpath="//input[@name='password']")
	public WebElement phonePwd;
	
	@FindBy (xpath="//button[@type='submit']")
	public WebElement continueButtonPhone;
	
	@FindBy (xpath="//span[@class='css-gfpxou-ChevronContainer e1vujd5311']")
	public WebElement dropdown;
	
	@FindBy (xpath="//input[@class='css-1v329wj-SearchInput e1vujd537']")
	public WebElement dropdownSearch;
	
	
	
	
	


	
	
	
	


	
	
	

	
}
