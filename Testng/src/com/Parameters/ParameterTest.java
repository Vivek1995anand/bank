package com.Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;
	
	@Test
	@Parameters({"env","browser","url","emailId"})
	public void yahooLoginTest(String env,String browser, String url,String emailId)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\chrome driver\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
		}
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\chrome driver\\chromedriver_win32\\chromedriver.exe");
        //driver = new ChromeDriver();
		
        driver.get(url);
        
        driver.findElement(By.id("email")).sendKeys(emailId);
        //driver.findElement(By.id("pass"));
        //password.sendKeys("vivek@2022");
        //WebElement login=driver.findElement(By.name("login"));
       // login.click();
	}
	
}
