package com.automation.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	String url = "https://www.OrangeHRM.com";

	@Test(priority=0)
	public void launchDriver() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\siva.mutyala\\eclipse-workspace\\com.automation\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get(url);

	}

	@Test(priority=1)
	public void enteringContactDetails() throws Exception {
		driver.findElement(By.xpath("//a[contains(text(),'Contact Sales')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("siva");
		driver.findElement(By.name("lastname")).sendKeys("mutyala");
		driver.findElement(By.name("company")).sendKeys("atmecs");
		driver.findElement(By.name("numemployees")).sendKeys("15");
		driver.findElement(By.name("phone")).sendKeys("9989233795");
		driver.findElement(By.name("email")).sendKeys("siva00310@gmail.com");
		driver.findElement(By.name("country")).sendKeys("INDIA");
		
		
		
		
	}
}
