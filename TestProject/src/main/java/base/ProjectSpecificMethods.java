package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;



public class ProjectSpecificMethods {

	public ChromeDriver driver;

	
	
	@BeforeMethod
	
		public void startApplication() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}


	
	@AfterMethod
	public void closeBrowser() {
		
		  driver.close();
		 	}
		
	}
	
