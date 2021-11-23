package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assign_Q6 {
	public class LaunchBrowserBeforesuite 
	{@Test
	    public void beforeSuiteTesting()
		{
		System.out.println("before Suite execution");
		}
		@BeforeSuite
		public void before_suite() throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver", "C:\\SDET\\chromedriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.close();
		}

	}
}
