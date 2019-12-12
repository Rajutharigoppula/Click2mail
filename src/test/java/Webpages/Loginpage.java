package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	
	public WebDriver driver;
	
	// customer creation
	
	@FindBy (xpath="//*[text()='New Customer']")
	public WebElement newcust;
	
	@FindBy(id="personal_acc_type")
	public WebElement person;
	
	@FindBy(id="bussiness_acc_type")
	public WebElement business;
	
	@FindBy (name="email")
	public WebElement emailid;
	
	@FindBy (name="username")
	public WebElement userid;
	
	@FindBy (name="password")
	public WebElement pwd;
	
	@FindBy (name="confirmation")
	public WebElement cnfpwd;
	
	@FindBy (name="hintQuestion")
	public WebElement hintq;
	
	@FindBy (name="hintAnswer")
	public WebElement ans;
	
	@FindBy (name="confirmHintAnswer")
	public WebElement cnfans;
	
	@FindBy (xpath="//*[text()='Continue']")
	public WebElement cntebtn;
	
	@FindBy (name="company_reg")
	public WebElement companyname;
	
	@FindBy(name="industryType")
	public WebElement industryType;
	
	@FindBy(xpath="//*[text()='Continue']")
	public WebElement continuebutton;
	
	@FindBy(name="prefix")
	public WebElement prefix;
	
	@FindBy(name="firstname_reg")
	public WebElement firstname;
	
	@FindBy(name="lastname_reg")
	public WebElement lastname;
	
	@FindBy(name="country_id")
	public WebElement country;
	
	@FindBy(xpath="//*[@name='address1']")
	public WebElement address1;
	
	@FindBy(xpath="//*[@id='city']")
	public WebElement city;
	
	@FindBy(xpath="//*[@id='region_id']")
	public WebElement region;
	
	@FindBy(xpath="//*[@name='postcode']")
	public WebElement postcode;
	
	@FindBy(xpath="//*[@name='ustelephone']")
	public WebElement ustelephone;
	
	@FindBy(id="register2")
	public WebElement register;
	
	@FindBy(xpath="//*[@class='recaptcha-checkbox-checkmark']")
	public WebElement captcha;
	
	@FindBy(xpath="//*[contains(text(), 'Thank you for registering')]")
	public WebElement Thankyou;
		
	//Customer Account Details

	@FindBy(xpath="//ul[@class='inner myaccount']//li[2]")
	public WebElement  account;
	
	@FindBy(xpath="//a[contains(text(),'Edit')]")
	public WebElement  edit;
	
	@FindBy(xpath="//input[@id='fName']")
	public WebElement  Fname;
	
	@FindBy(xpath="//input[@id='lName']")
	public WebElement  Lname;
	
	@FindBy(xpath="(//input[@id='email'])[1]")
	public WebElement  Email;
	
	@FindBy(xpath="//input[@id='phone']")
	public WebElement  phone;
	
	@FindBy(xpath="//input[@id='contact_firstname1']")
	public WebElement  firstname1;
	
	@FindBy(xpath="//input[@id='contact_lastname1']")
	public WebElement  lastname1;
	
	@FindBy(xpath="//input[@id='contact_company']")
	public WebElement  company;
	
	@FindBy(xpath="//input[@id='contact_street_1']")
	public WebElement  add1;
	
	@FindBy(xpath="//input[@id='contact_city']")
	public WebElement  city1;
	
	@FindBy(xpath="//select[@id='contact_country_id']")
	public WebElement  country1;
	
	@FindBy(xpath="//select[@id='contact_region_id']")
	public WebElement  State;
	
	@FindBy(xpath="//input[@id='contact_postcode']")
	public WebElement  Zip;
	
	@FindBy(xpath="//button[@class='action save primary']")
	public WebElement  save1;
	
	@FindBy(xpath="//*[text()='The account information has been saved.']")
	public WebElement  successmsg;
	
	
	
	// for my mailing list
	
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
	
	@FindBy(xpath="//input[@id='importlistfile']")
	public WebElement implist;
	
	@FindBy(id="uml_upload_btn_upload")
	public WebElement uploadbtn;
	
	
	
	
	// operations
	
	
	public Loginpage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		public void person()
		{
			person.click();
		}
	
		public void business()
		{
			business.click();
		}
	
		public void newcust()
		{
			newcust.click();
		}
		public void emailid(String x)
		{
			emailid.sendKeys(x);
		}
		public void userid(String y)
		{
			userid.sendKeys(y);
		}
		public void pwd(String z)
		{
			pwd.sendKeys(z);
		}
		public void cnfpwd(String z1)
		{
			cnfpwd.sendKeys(z1);
		}
		public void ans(String a)
		{
			ans.sendKeys(a);
		}
		public void cnfans(String b)
		{
			cnfans.sendKeys(b);
		}
		public void cntebtn()
		{
			cntebtn.click();
		}
		public void companyname(String c1)
		{
			companyname.sendKeys(c1);
		}
		public void continuebutton()
		{
			continuebutton.click();
		}
		public void prefix()
		{
			prefix.click();
		}
		public void firstname(String name)
		{
			firstname.sendKeys(name);
		}	
		public void lastname(String lname)
		{
			lastname.sendKeys(lname);
		}
		public void country()
		{
			country.click();
		}
		public void address(String addresss1)
		{
			address1.sendKeys(addresss1);
		}
		public void city(String cty)
		{
			city.sendKeys(cty);
		}
		public void region(String regionname)
		{
			region.sendKeys(regionname);
		}
		public void ustelephone(String phnumber)
		{
			ustelephone.sendKeys(phnumber);	
		}
		public void postcode(String post)
		{
			postcode.sendKeys(post);
		}
		public void captcha()
		{
			captcha.click();
		}
		public void register()
		{
			register.click();
		}

//	
		public void account()
		{
			account.click();
		}
		public void edit()
		{
			edit.click();
		}
		public void Fname(String x)
		{
			Fname.sendKeys(x);
		}
		public void Lname(String y)
		{
			Lname.sendKeys(y);
		}
		public void Email(String z)
		{
			Email.sendKeys(z);
		}
		public void phone(String a)
		{
			phone.sendKeys(a);
		}
		public void firstname1(String b)
		{
			firstname1.sendKeys(b);
		}
		public void lastname1(String c)
		{
			lastname1.sendKeys(c);
		}
		public void company(String d)
		{
			company.sendKeys(d);
		}
		public void add1(String e)
		{
			add1.sendKeys(e);
		}
		public void city1(String f)
		{
			city1.sendKeys(f);
		}
		public void Zip(String g)
		{
			Zip.sendKeys(g);
		}
		public void save1()
		{
			save1.click();
		}
		public void country1()
		{
			country1.click();
		}
		public void State()
		{
			State.click();
		}
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
		
		
		
	}
	


	
	
	
	
	
	
	
