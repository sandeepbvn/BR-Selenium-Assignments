package assignment;

import org.openqa.selenium.support.FindBy;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public interface OrangePages {
	@FindBy(xpath="//input[@id='txtUsername']")
	@CacheLookup
	WebElement UnameTextField;

	public void setUnameTextFieldInput(String Username);

	@FindBy(xpath="//input[@id='txtPassword']")
	@CacheLookup
	WebElement PwdTextField;

	public void setPwdTextFieldInput(String Password);

	@FindBy(xpath="//input[@id='btnLogin']")
	@CacheLookup
	WebElement SubmitButton;
	public void ClickOnSubmitButton();

	@FindBy(xpath="//b[contains(text(),'Dashboard')]")
	@CacheLookup
	WebElement Dashboard;
	public void ClickOnDashboardTab();
	
	public String getDashBoardConfirmation();

	@FindBy(xpath="//b[contains(text(),'Admin')]")
	@CacheLookup
	WebElement Admin;
	public void ClickOnAdminTab();

	public String getTextOnAdmin();

	@FindBy(xpath="//a[@id='menu_admin_viewJobTitleList']")
	@CacheLookup
	WebElement JobTitle;
	public void getJobMenu();

	@FindBy(xpath="//b[contains(text(),'Leave')]")
	@CacheLookup
	WebElement Leave;
	public void ClickOnLeaveTab();

	public String getTextOnLeave();
	
	@FindBy(xpath="//b[contains(text(),'Directory')]")
	@CacheLookup
	WebElement Directory;
	public void ClickOnDirectoryTab();

	public String getTextOnDirectory();
	
	
	@FindBy(xpath="//b[contains(text(),'Maintenance')]")
	@CacheLookup
	WebElement Maintenance;
	public void ClickOnMaintenanceTab();

	public String getTextOnMaintenance();

	@FindBy(xpath="//b[contains(text(),'PIM')]")
	@CacheLookup
	WebElement PIM;
	public void ClickOnPIMTab();

	public String getTextOnPIM();
	
	
	
	@FindBy(xpath="//input[@id='empsearch_employee_name_empName']")
	@CacheLookup
	WebElement EmployeeField;

	public void setEmployeeTextFieldInput(String Employeename);

	@FindBy(xpath="//b[contains(text(),'Time')]")
	@CacheLookup
	WebElement Time;
	public void ClickOnTimeTab();

	public String getTextOnTime();

	@FindAll(@FindBy(xpath="/a"))
	@CacheLookup
	List<WebElement> AllLinks;

	public List<WebElement> getAllLinks();

	@FindAll(@FindBy(xpath="/img"))
	@CacheLookup
	List<WebElement> AllImages;

	public List<WebElement> getAllImages();


	@FindAll(@FindBy(xpath="//input[contains(@name,'txt')]"))
	@CacheLookup
	List<WebElement> AllTextBoxs;
	public List<WebElement> getAllTextBoxs();

	@FindBy(xpath="//a[@id='menu_admin_UserManagement']")
	@CacheLookup
	WebElement UserManagement;
	public String getUserManagementDropDown();
	
	public void getUserManagementClick();
	
	@FindBy(xpath="//a[@id='menu_admin_Job']")
	@CacheLookup
	WebElement Job;
	public String getJobDropDown();
	public void getJobClick();
	
	@FindBy(xpath="//a[@id='menu_admin_Organization']")
	@CacheLookup
	WebElement Organization;
	public String getOrganizationDropDown();
	
	public void getOrganizationClick();
	
	@FindBy(xpath="//a[@id='menu_admin_Qualifications']")
	@CacheLookup
	WebElement Qualifications;
	public String getQualificationsDropDown();
	
	public void getQualificationsClick();
	




