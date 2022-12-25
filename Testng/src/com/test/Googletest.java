package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Googletest {
	
	WebDriver driver;
	
	//1 //4 //7
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\chrome driver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
		
	}
	//2
	@Test(priority=1,groups="Title")
	public void googleTitleTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	//8
	@Test(priority=3,groups="logo")
	public void googlelogoTest()
	{
		boolean b =driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
	}
	
	@Test(priority=2,groups="Link Test")
	public void maillinkTest()
	{
		boolean b =driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	//5
	@Test(priority=4,groups="Test")
	public void test1()
	{
		System.out.println("test1");;
	}
	
	@Test(priority=5,groups="Test")
	public void test2()
	{
		System.out.println("test2");;
	}
	
	@Test(priority=6,groups="Test")
	public void test3()
	{
		System.out.println("test3");;
	}
	
	//3 //6 //9
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
