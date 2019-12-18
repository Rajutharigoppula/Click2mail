package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {

	
	public WebDriver driver;
//Manage CC Payment Information

	@FindBy(xpath="//a[@class='cur_paymentinfo']")
	public WebElement Managecc;
	
	@FindBy(xpath="//input[@id='firstname']")
	public WebElement Fname;
	
	@FindBy(xpath="//input[@id='lastname']")
	public WebElement Lname;
	
	@FindBy(xpath="//input[@id='telephone']")
	public WebElement teleph;
	
	@FindBy(xpath="//input[@id='street']")
	public WebElement street;
	
	@FindBy(xpath="//input[@id='city']")
	public WebElement city;
	
	@FindBy(xpath="//select[@id='region-id']")
	public WebElement region;
	//California
	@FindBy(xpath="//input[@id='zip']")
	public WebElement zip;
	
	@FindBy(xpath="//select[@id='country']")
	public WebElement country;
	//United States
	@FindBy(xpath="//select[@id='authnetcim-cc-type']")
	public WebElement cctype;
	
	@FindBy(xpath="//input[@id='authnetcim-cc-number']")
	public WebElement ccnumb;
	
	@FindBy(xpath="//select[@id='authnetcim-cc-exp-month']")
	public WebElement ccmonth;
	
	@FindBy(xpath="//select[@id='authnetcim-cc-exp-year']")
	public WebElement ccyear;
	
	@FindBy(xpath="//input[@id='authnetcim-cc-cid']")
	public WebElement cvv;
	
	@FindBy(xpath="//button[@class='action save primary']")
	public WebElement submit;
	
	@FindBy(xpath="//div[contains(text(),'Payment data saved successfully.')]")
	public WebElement successmsg;

//Manage E-Check Payment Information

	@FindBy(xpath="//a[@class='cur_authnetcim_ach']")
	public WebElement echeck;

	@FindBy(id="firstname")
	public WebElement firstname;

	@FindBy(id="lastname")
	public WebElement lastname;

	@FindBy(id="telephone")
	public WebElement telephone;

	@FindBy(id="street")
	public WebElement street1;
	
	@FindBy(id="city")
	public WebElement city1;
	
	@FindBy(id="region-id")
	public WebElement region1;
	
	@FindBy(id="authnetcim_ach_postcode")
	public WebElement postcode;
	
	@FindBy(id="authnetcim_ach-echeck-account-name")
	public WebElement actname;
	
	@FindBy(id="authnetcim_ach-echeck-bank-name")
	public WebElement bankname;
	
	@FindBy(id="authnetcim_ach-echeck-routing-number")
	public WebElement routingnumb;
	
	@FindBy(id="authnetcim_ach-echeck-account-number")
	public WebElement actnumb;
	


	
	
	
	
	
	
	//operations
	
	
			public MyAccount (WebDriver driver)
			{
				this.driver=driver;
				PageFactory.initElements(driver,this);
			}
			
	public void Managecc()
	{
		Managecc.click();
	}
	
	public void Fname(String x)
	{
		Fname.sendKeys(x);
	}
	public void Lname(String y)
	{
		Lname.sendKeys(y);
	}
	public void teleph(String z)
	{
		teleph.sendKeys(z);
	}
	public void street(String s)
	{
		street.sendKeys(s);
	}
	public void city(String c)
	{
		city.sendKeys(c);
	}
	public void zip(String zi)
	{
		zip.sendKeys(zi);
	}
	public void cctype(String ct)
	{
		cctype.sendKeys(ct);
	}
	public void ccnumb(String cn)
	{
		ccnumb.sendKeys(cn);
	}
	public void ccmonth(String cm)
	{
		ccmonth.sendKeys(cm);
	}
	public void ccyear(String cy)
	{
		ccyear.sendKeys(cy);
	}
	public void cvv(String cv)
	{
		cvv.sendKeys(cv);
	}
	public void submit()
	{
		submit.click();
	}
	public void postcode(String x)
	{
		postcode.sendKeys(x);
	}
	public void actname(String x)
	{
		actname.sendKeys(x);
	}
	public void bankname(String x)
	{
		bankname.sendKeys(x);
	}
	
	public void routingnumb(String x)
	{
		routingnumb.sendKeys(x);
	}
	public void actnumb(String x)
	{
		actnumb.sendKeys(x);
	}
	public void echeck()
	{
		echeck.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
