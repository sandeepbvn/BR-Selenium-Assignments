package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\SDET\\chromedriver1\\chromedriver.exe");
	        WebDriver driver1 = new ChromeDriver();
	       
			driver1.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	        driver1.manage().window().maximize();
	        WebElement we =driver1.findElement(By.id("txtUsername"));
	        we.sendKeys("Admin");
	        
	        WebElement we1 =driver1.findElement(By.id("txtPassword"));
	        we1.sendKeys("admin123");
	        
	        driver1.findElement(By.id("btnLogin")).click();
		
	        List<WebElement> links = driver1.findElements(By.tagName("a"));
	        for(WebElement link:links) {
		   
			System.out.println(link.getText());
		 
		 } 


	}

}
