package com.automation.testscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoLogin 
{
	@Test
public void login() throws Exception
{
	FileInputStream fis=new FileInputStream("C:\\Users\\siva.mutyala\\eclipse-workspace\\com.automation\\Resources\\Data\\expecteddata.properties");
	Properties p=new Properties();
	p.load(fis);
	String nurl=p.getProperty("url");
	String nemail=p.getProperty("mailid");
	String npwd=p.getProperty("pwd");
	String nmyacct=p.getProperty("myacct");
	String nusername=p.getProperty("username");
	String npassword=p.getProperty("password");
	String nlogin=p.getProperty("login");
	String nlogout=p.getProperty("logout");
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\siva.mutyala\\eclipse-workspace\\com.automation\\lib\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get(nurl);
	driver.findElement(By.linkText(nmyacct)).click();
	driver.findElement(By.id(nusername)).sendKeys(nemail);
	driver.findElement(By.id(npassword)).sendKeys(npwd);
	driver.findElement(By.id(nlogin)).click();
	driver.findElement(By.linkText(nlogout)).click();;


}
}
