//2- Print the title of this application
package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_Q2 {
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\SDET\\chromedriver1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        
        
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        String title = driver.getTitle();
        
    
        System.out.println(title);
       

 

        driver.close();
    }

 

}
