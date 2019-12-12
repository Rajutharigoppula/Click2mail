package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProjects {

public WebDriver driver;
	
	// New project
	
	@FindBy(xpath="//a[contains(text(),'My Projects')]")
	public WebElement  MyProject;
		
	@FindBy(xpath="//button[@id='myproj_create_new']")
	public WebElement  newproject;
		
	@FindBy(xpath="//input[@id='projectname']")
	public WebElement  projectname;
		
	@FindBy(xpath="//*[@id='new_project_ok']")
	public WebElement  ok;
			
	//for deletion project
		
	@FindBy(xpath="//input[@id='main_search']")
	public WebElement  searchbox;
		
	@FindBy(xpath="//button[@id='search_btn']")
	public WebElement  searchbtn;
			
	@FindBy(xpath="//select[@id='projectaction']")
	public WebElement  action;
	
	//Delete Project
	@FindBy(xpath="(//*[text()='Delete'])[2]/parent::*")
	public WebElement  delete;
	
	@FindBy(xpath="//td[@class='ui-header']")
	public WebElement  status;
	
	@FindBy(xpath="//*[@id='search_btn_top']")
	public WebElement  searchbtntop;

	// my project creation
	
	@FindBy(xpath="//*[@id='new_project_ok']")
	public WebElement okbutton;
		
	// my project deletion
	
	@FindBy(xpath="(//span[contains(text(),'Ok')]/parent::*)[3]")
	public WebElement accept;


	//operations
	
	public MyProjects (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
									
	public void MyProject()
	{
		MyProject.click();
	}
	public void ok()
	{
		ok.click();
	}
	public void searchbox(String x)
	{
		searchbox.sendKeys(x);
	}
	public void searchbtn()
	{
		searchbtn.click();
	}
	public void action()
	{
		action.click();
	}
	public void delete()
	{
		delete.click();
	}
	public void newproject()
	{
		newproject.click();
	}
	public void projectname(String pname)
	{
		projectname.sendKeys(pname);
	}
	public void okbutton()
	{
		okbutton.click();
	}
	public void accept()
	{
		accept.click();
	}
				
					
			
				
				
				
}
