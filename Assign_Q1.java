//1- Open the above URL in Chrome browser
package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjectmodel.Homepage;
import pageobjectmodel.Loginpage;

public class Assign_Q1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
    Loginpage loginpage;
    Homepage homepage;
    
    System.setProperty("webdriver.chrome.driver", "C:\\SDET\\chromedriver1\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.manage().window().maximize();
    loginpage = new Loginpage();
    loginpage.setUserName("Admin");
    loginpage.setPassword("admin123");
    loginpage.clickOnLoginBtn();
    
    homepage = new Homepage(driver);
    homepage.moveToadminOrganizationLocations();
    
    
    
    
    
    
	}

}



