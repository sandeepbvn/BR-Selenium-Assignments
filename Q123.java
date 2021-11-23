package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q123 {
	public static WebDriver driver;
	public static FileInputStream fileLoc;
	public static Properties prop;
	OrangePages OrangeOR;
	
	 @Parameters({"Browser","Url"})
	 @BeforeSuite 
	public void setUp(String Browser, String Url) {
		
			try {
			fileLoc = new FileInputStream("C:\\SoujanyaJammu\\selenium_assigment.git\\OrangeHRMApplication.Selenium\\Configuration\\config.properties");
			prop = new Properties();
			prop.load(fileLoc);
		}catch(Exception e) {
			e.printStackTrace();
		}
				
		
		if(Browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if(Browser.equalsIgnoreCase("firefox")) {
        	 System.setProperty("webdriver.geckodriver.driver","c:\\eclipse\\geckodriver.exe");
        	 driver = new FirefoxDriver();
        } else if(Browser.equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        } 
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		OrangeOR = new OrangePages(driver);
		driver.get(Url);
		
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
	
	public void captureScreenshot(WebDriver Driver, String tname) throws IOException {
		
		
		TakesScreenshot ts = (TakesScreenshot) Driver;
		File Src= ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+"/Screenshots/" + tname + ".png");
		FileUtils.copyFile(Src, dest);
		System.out.println("Screen shot is captured");
		
		
	}

}
