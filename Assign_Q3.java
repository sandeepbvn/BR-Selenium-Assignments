package assignment;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.automation.learn1.assignment.OrangePages;

public class Assign_Q3 extends Testbase{

		OrangePages OrangeOR;	

		@BeforeMethod
		public void loadPages() {
			OrangeOR = new OrangePages(driver);
		}

		@Test(priority=1)
		public void checkTitle() {
			String title = driver.getTitle();
			System.out.println(title);
			boolean res = title.contains("Orange");
			if(res) {

				Assert.assertTrue(true);
				Reporter.log("Title is correct", true);
			}
			else 
			{
				Assert.assertTrue(false);
				Reporter.log("Title is not correct", true);		
			}					
		}

		@Test(priority=2)
		public void getALLTextBoxAllHyperLinkAllImages() {
			List<WebElement> linkCount = OrangeOR.getAllLinks();
			int AllLinksCount = linkCount.size();
			System.out.println("Number of links in Login page are"+ AllLinksCount);

			List<WebElement> ImagesCount = OrangeOR.getAllImages();
			int AllImagesCount = ImagesCount.size();
			System.out.println("Number of Images in Login page are"+ AllImagesCount);

			List<WebElement> TextBoxesCount = OrangeOR.getAllTextBoxs();
			int AllTextBoxesCount = TextBoxesCount.size();
			System.out.println("Number of TextBoxes in Login page are"+ AllTextBoxesCount);

		}

		@Test(priority=3)
		public void Login() throws InterruptedException {


			OrangeOR.setUnameTextFieldInput(prop.getProperty("username"));
			Thread.sleep(3000);
			OrangeOR.setPwdTextFieldInput(prop.getProperty("password"));
			Thread.sleep(3000);
			OrangeOR.ClickOnSubmitButton();	        
			String title = driver.getTitle();

			boolean status = title.contains("Orange");

			Assert.assertTrue(status);        

		}
		
		@Test(priority=4)
		public void ValidatingSubMenuOnAdminMenu() throws InterruptedException {
			OrangeOR.ClickOnAdminTab();
			String Admin = OrangeOR.getTextOnAdmin();
			Assert.assertEquals("Admin", Admin);
			Reporter.log("User is in "+Admin,true);
			
			Thread.sleep(2000);
			OrangeOR.getUserManagementClick();
			String UserManagement = OrangeOR.getUserManagementDropDown();
			Assert.assertEquals("User Management", UserManagement);
			Reporter.log("User is in "+UserManagement,true);
			
			Thread.sleep(2000);
			OrangeOR.getJobClick();
			String Job = OrangeOR.getJobDropDown();
			Assert.assertEquals("Job", Job);
			Reporter.log("User is in "+Job,true);
			
			Thread.sleep(2000);
			OrangeOR.getOrganizationClick();
			String Organization = OrangeOR.getOrganizationDropDown();
	        Assert.assertEquals("Organization", Organization);
	        Reporter.log("User is in "+Organization,true);
			
			Thread.sleep(3000);
			OrangeOR.getQualificationsClick();
			String Qualifications = OrangeOR.getQualificationsDropDown();
			Assert.assertEquals("Qualifications", Qualifications);
			Reporter.log("User is in "+Qualifications,true);
		}
		

}
