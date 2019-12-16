package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyMailingLists 
{
public WebDriver driver;
	
		
	@FindBy(xpath="//*[@title='My Mailing lists']/parent::*")
	public WebElement  mailing;
	
	@FindBy(xpath="//span[contains(text(),'Create new list')]")
	public WebElement  newlist;
	
	@FindBy(xpath="//input[@id='address_book_name']")
	public WebElement  malingname;
	
	@FindBy(xpath="//a[@id='create_address_book']")
	public WebElement  savemailing;
	
	@FindBy(id="ml_create_mailing_btn_close")
	public WebElement  closeml;
	
	
	@FindBy(xpath="//*[@id='ml_create_mailing_add_recp']")
	public WebElement  addreceipient;
	
	@FindBy(xpath="//input[@id='rtn_firstName']")
	public WebElement  Firstname;
	
	@FindBy(xpath="//input[@id='rtn_lastName']")
	public WebElement  Lastname;
	
	@FindBy(xpath="//input[@id='recp_add1']")
	public WebElement  Address1;
	
	@FindBy(xpath="//input[@id='recp_city']")
	public WebElement  City;
	
	@FindBy(xpath="//select[@id='recp_state']")
	public WebElement  State1;
	
	@FindBy(xpath="//span[contains(text(),'Standardize Address')]")
	public WebElement  Standardize;
	
	@FindBy(xpath="//a[@id='ml_create_mailinglist_add_close']//img")
	public WebElement  close1;
		
	@FindBy(xpath="//span[contains(text(),'Done')]")
	public WebElement  done;
	
	@FindBy(xpath="//b[contains(text(),'Total Mailing lists:')]")
	public WebElement Mailinglist;
	
	@FindBy(id="upload_list")
	public WebElement uploadlist;
	//helpdesk-contact-form-iframe
	
	@FindBy(xpath="//input[@id='importlistfile']")
	public WebElement implist;
	
	@FindBy(id="uml_upload_btn_upload")
	public WebElement uploadbtn;
		
	@FindBy(name="importlistname")
	public WebElement listname;
	
	//wait condition purpose
	@FindBy(xpath="//div[contains(text(),'Preview Address Layout')]")
	public WebElement previewpage;
		
	@FindBy(xpath="//select[@id='fnamedd']")
	public WebElement fname;
	//FIRST_NAME
	@FindBy(xpath="//select[@id='lnamedd']")
	public WebElement lname;
	//LAST_NAME
	@FindBy(xpath="//select[@id='ffnamedd']")
	public WebElement ffname;
	//COMPANY_NAME
	@FindBy(xpath="//select[@id='lfnamedd']")
	public WebElement lfname;
	//PHONE1
	@FindBy(xpath="//select[@id='add1dd']")
	public WebElement add;
	//ADDRESS
	@FindBy(xpath="//select[@id='citydd']")
	public WebElement city;
	//CITY
	@FindBy(xpath="//select[@id='statedd']")
	public WebElement state;
	//STATE
	@FindBy(xpath="//select[@id='zipdd']")
	public WebElement zip;
	//ZIP
	@FindBy(xpath="//*[@id='uml_upload_preview_btn_save']")
	public WebElement save;
	//for wait condition
	@FindBy(xpath="//h2[contains(text(),'My Mailing Lists')]")
	public WebElement mymailinglistpage;
	 	
	
	//start job
	
	@FindBy(name="mlactions")
	public WebElement actions;
	//Start New Job
	
	@FindBy(xpath="//a[@id='continue1']")
	public WebElement continue1;
	
	@FindBy(xpath="//*[@id='continue_estimate']")
	public WebElement continue2;
	
	@FindBy(xpath="(//*[text()='Save & Exit'])[2]")
	public WebElement saveexit;
		
	@FindBy(id="continueProof")
	public WebElement continueProof;
	
	//for delete
	
	@FindBy(id="mlist_search_word")
	public WebElement mlistsearch;
	
	@FindBy(id="mlist_search_btn")
	public WebElement searchbtn;
	// action - Delete
	@FindBy(xpath="//span[contains(text(),'Delete')]")
	public WebElement mldelete;
	
	@FindBy(id="dup_maillist_name_id")
	public WebElement dubmlname;
	
	@FindBy(id="ml_duplicate_btn_ok")
	public WebElement dubok;
	
	@FindBy(id="ml_duplicate_btn_success_close")
	public WebElement dupclose;
	
	
	
	
	
	
	
	//operations
	
			public MyMailingLists (WebDriver driver)
			{
				this.driver=driver;
				PageFactory.initElements(driver,this);
			}
			
			// forgot username and password
				
			
			public void mailing()
			{
				mailing.click();
			}
			public void newlist()
			{
				newlist.click();
			}
			public void malingname(String a)
			{
				malingname.sendKeys(a);
			}
			public void savemailing()
			{
				savemailing.click();
			}
			public void addreceipient()
			{
				addreceipient.click();
			}
			public void Firstname(String b)
			{
				Firstname.sendKeys(b);
			}
			public void Lastname(String c)
			{
				Lastname.sendKeys(c);
			}
			public void Address1(String d)
			{
				Address1.sendKeys(d);
			}
			public void City(String e)
			{
				City.sendKeys(e);
			}
			public void Standardize()
			{
				Standardize.click();
			}
			public void close1()
			{
				close1.click();
			}
			public void done()
			{
				done.click();
			}
			public void closeml()
			{
				closeml.click();
			}
			public void uploadlist()
			{
				uploadlist.click();
			}
			public void implist()
			{
				implist.click();
			}
			public void uploadbtn()
			{
				uploadbtn.click();
			}
			public void listname(String a)
			{
				listname.sendKeys(a);
			}
			public void save()
			{
				save.click();
			}
			public void actions()
			{
				actions.click();
			}
			public void continue1()
			{
				continue1.click();
			}
			public void continue2()
			{
				continue2.click();
			}
			public void saveexit()
			{
				saveexit.click();
			}
			public void mlistsearch(String x)
			{
				mlistsearch.sendKeys(x);
			}
			public void searchbtn()
			{
				searchbtn.click();
			}
			public void mldelete()
			{
				mldelete.click();
			}
			public void dubmlname(String y)
			{
				dubmlname.sendKeys(y);
			}
			public void dubok()
			{
				dubok.click();
			}
			public void dupclose()
			{
				dupclose.click();
			}
			
			
			
			
			
			
			
			
			
}

