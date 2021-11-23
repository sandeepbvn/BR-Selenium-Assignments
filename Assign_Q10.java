package assignment;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class Assign_Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\SDET\\chromedriver1\\chromedriver.exe");
		driver = new ChromeDriver();

		
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  WebElement we = driver.findElement(By.id("txtUsername"));
		  we.sendKeys("Admin");
		  
		  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		  driver.findElement(By.id("btnLogin")).click();
		 

		Actions act = new Actions(driver);
		
		 act.moveToElement(driver.findElement(By.xpath("//*[@id='menu_dashboard_index']/b"))).build().perform();
		 String Dashboard = driver.findElement(By.xpath("//*[@id=\"Dashboard\"]/div/div[1]/h1")).getText();
		 Assert.assertEquals("Dashboard", Dashboard);
		 
		 

	}

	

}
