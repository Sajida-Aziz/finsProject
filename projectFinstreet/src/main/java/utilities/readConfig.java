package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readConfig {
Properties pro;
	
	public readConfig() 
	{
		
		String path1 = System.getProperty("user.dir");
		File src=new File(path1+"\\src\\main\\resources\\config.properties");
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
			pro=new Properties();
			try {
				pro.load(fis);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		}
		}
	 
	public String getUserName()
	{
		String username=pro.getProperty("username");
		return username;

	}
	public String getPwd()
	{
		String pwd=pro.getProperty("password");
		return pwd;

	}
	public String getBrowser()
	{
		String browser=pro.getProperty("browser");
				return browser;
	}
	public String getUrl()
	{
		String url=pro.getProperty("url");
		return url;
	}


}
