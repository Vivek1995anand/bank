package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {

		/*System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\chrome driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru="); */
        
        Xls_Reader reader =new Xls_Reader("C:\\Users\\danvi\\eclipse-workspace\\Testng\\src\\com\\testdata\\HalfEbayTestData.xlsx");
        reader.getCellData("RegTestData", "firstname", 2);
	}

}
