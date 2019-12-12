package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard 
{
	
	public WebDriver driver;

	@FindBy(xpath="(//*[contains(text(),'My Account')])[1]")
	public WebElement  Myaccount; 
	
	@FindBy(xpath="//a[@id='openBuyCreditLink']")
	public WebElement  buycredit; 
	
	@FindBy(xpath="//input[@name='creditamount']")
	public WebElement  creditamount;
	
	@FindBy(xpath="//select[@id='authnetcim-card-id']")
	public WebElement  Payment;
	
	//Add new card
	@FindBy(xpath="//select[@id='authnetcim-cc-type']")
	public WebElement  cardtype;

	//Visa
	@FindBy(name="payment[cc_number]")
	public WebElement  cardnumber; 
	
	@FindBy(xpath="//select[@id='authnetcim-cc-exp-month']")
	public WebElement exp;
	
	//10 - October
	@FindBy(xpath="//select[@name='payment[cc_exp_year]']")
	public WebElement  year;
	
	//2022
	@FindBy(xpath="//input[@id='authnetcim-cc-cid']")
	public WebElement  cvv;
	
	@FindBy(xpath="//input[@id='authnetcim_save']")
	public WebElement  save;
	
	@FindBy(xpath="//select[@id='uc_state']")
	public WebElement  state;
	
	//New York
	//buy credit
	
	@FindBy(xpath="//button[@id='buycredit']")
	public WebElement  Buy;
	
	@FindBy(xpath="//div[@class='ui-dialog-buttonset']//button[@type='button']")
	public WebElement  ok;
	
	@FindBy(xpath="//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front confirm_dialog_class ui-dialog-buttons ui-draggable']//p[1]")
	public WebElement  creditbalance;
	
	//addresses
	
	@FindBy(xpath="(//*[text()='Delete Address'])[1]")
	public WebElement deleteadd;
	
	@FindBy(xpath="//*[text()='Delete']")
	public WebElement del;
	
	@FindBy(xpath="//*[text()='Addresses']")
	public WebElement  addresses;
	
	@FindBy(xpath="(//*[text()='Add New Address']/parent::*)[1]")
	public WebElement  addnewaddress;
		
	@FindBy(xpath="//input[@id='description']")
	public WebElement  nickname ;
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	public WebElement  continuebtn ;
	
	@FindBy(xpath="//input[@id='address1']")
	public WebElement  address1;
	
	@FindBy(xpath="//input[@id='address2']")
	public WebElement  address2;
	
	@FindBy(xpath="//input[@id='city']")
	public WebElement  city;
	
	@FindBy(xpath="//select[@id='region_id']")
	public WebElement  state1;
	//New York
	
	@FindBy(xpath="//input[@id='postcode']")
	public WebElement  zipcode;
	
	@FindBy(xpath="//span[contains(text(),'Save Address')]")
	public WebElement  saveaddress;
	
	@FindBy(xpath="//input[@id='phone']")
	public WebElement  ph;
	
	//business add
	
	@FindBy(xpath="//input[@id='reply_city']")
	public WebElement  city2;
	
	@FindBy(xpath="//select[@id='reply_region_id']")
	public WebElement  state2;
	//New York
	
	@FindBy(xpath="//input[@id='permit_number']")
	public WebElement  permit;
	
	//address types
	@FindBy(xpath="//label[@for='return']")
	public WebElement returnadd;
	
	@FindBy(xpath="//input[@id='billing']")
	public WebElement billingadd;
	
	@FindBy(xpath="//input[@id='cartshipping']")
	public WebElement shippingadd;
	
	@FindBy(xpath="//input[@id='eddmmailer']")
	public WebElement eddmadd;
	
	@FindBy(xpath="//input[@id='businessreply']")
	public WebElement businessadd;
	
	@FindBy(xpath="//input[@id='courtesyreply']")
	public WebElement courtesyadd;
	
	@FindBy(xpath="//*[@id='company_business']")
	public WebElement companyname;

	//manage cc payment
		
	@FindBy(xpath="//a[contains(text(),'Manage CC Payment Information')]")
	public WebElement managecc;
	
	@FindBy(xpath="//a[contains(text(),'Manage E-Check Payment Information')]")
	public WebElement manageecheck;
	
	@FindBy(xpath="//input[@id='authnetcim_fn']")
	public WebElement fn;
	
	@FindBy(xpath="//input[@id='authnetcim_ln']")
	public WebElement ln;
	
	@FindBy(xpath="//input[@id='authnetcim_street']")
	public WebElement street;
	
	@FindBy(xpath="//input[@id='authnetcim_city']")
	public WebElement cityn;
	
	@FindBy(xpath="//select[@id='region_id']")
	public WebElement staten;
	
	@FindBy(xpath="//input[@id='authnetcim_postcode']")
	public WebElement zip;
	
	@FindBy(xpath="//select[@id='country']")
	public WebElement country;
	
	@FindBy(xpath="//input[@id='telephone']")
	public WebElement tele;
	
	@FindBy(xpath="//select[@id='authnetcim_cc_type']")
	public WebElement cct;
	@FindBy(xpath="//input[@id='authnetcim_cc_number']")
	public WebElement ccn;
	
	@FindBy(xpath="//select[@id='authnetcim_cc_exp_month']")
	public WebElement ed;
	
	@FindBy(xpath="//select[@id='authnetcim_cc_exp_year']")
	public WebElement yy;
	
	@FindBy(xpath="//input[@id='authnetcim_cc_cid']")
	public WebElement cvn;
	
	@FindBy(xpath="//button[@id='btn-submit']")
	public WebElement submit;
	
	
	// job templates
	
	@FindBy(xpath="//h3[@id='4']")
	public WebElement  mol;
	
	@FindBy(xpath="//button[@id='createtemplate']")
	public WebElement  createtemp;
	
	@FindBy(xpath="//input[@name='template_name']")
	public WebElement  tempname;
	
	@FindBy(xpath="//select[@id='product_sku']")   // 1
	public WebElement  ptype;   // Postcard 5 x 8
		
	@FindBy(xpath="//button[@id='chooseDocument']")
	public WebElement  choosedoc;

	@FindBy(xpath="//*[@name='select_popup_document']")
	public WebElement  selectdoc;
			
	@FindBy(xpath="//button[@id='doc_grid_btn_save_closewindow']")
	public WebElement  saveclose;
		
	@FindBy(xpath="//button[@id='form_savetemplate']")
	public WebElement  savetemp;
					
	// operations

	
	public Dashboard (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void Myaccount()
	{
		Myaccount.click();
	}
	public void buycredit()
	{
		buycredit.click();
	}
	public void creditamount(String z)
	{
		creditamount.sendKeys(z);
	}
	public void cardnumber(String x)
	{
		cardnumber.sendKeys(x);
	}
	
	public void cvv(String y)
	{
		cvv.sendKeys(y);
	}
	
	public void save()
	{
		save.click();
	}
	public void Buy()
	{
		Buy.click();
	}
	public void ok()
	{
		ok.click();
	}
	
	public void addresses()
	{
		addresses.click();
	}
	public void addnewaddress()
	{
		addnewaddress.click();
	}
		
	public void nickname(String name)
	{
		nickname.sendKeys(name);
	}
	public void continuebtn()
	{
		continuebtn.click();
	}
	
	public void address1(String add1)
	{
		address1.sendKeys(add1);
	}
	public void address2(String add2)
	{
		address2.sendKeys(add2);
	}
	public void city(String cityname)
	{
		city.sendKeys(cityname);
	}
	
	public void zipcode(String zip)
	{
		zipcode.sendKeys(zip);
	}
	public void saveaddress()
	{
		saveaddress.click();
	}
	
	public void phone(String ph1)
	{
		ph.sendKeys(ph1);
	}
	public void city2(String cty)
	{
		city2.sendKeys(cty);
	}
	
	public void permit(String per)
	{
		permit.sendKeys(per);
	}
	
	public void returnadd()
	{
		returnadd.click();
	}
	
	public void billingadd()
	{
		billingadd.click();
	}
	
	public void shippingadd()
	{
		shippingadd.click();
	}
	public void eddmadd()
	{
		eddmadd.click();
	}
	
	public void businessadd()
	{
		businessadd.click();
	}
	
	public void courtesyadd()
	{
		courtesyadd.click();
	}
	
	public void companyname(String cname)
	{
		companyname.sendKeys(cname);
	}
	public void managecc()
	{
		managecc.click();
	}
		
	public void manageecheck()
	{
		manageecheck.click();
	}
	public void fn(String fname)
	{
		fn.sendKeys(fname);
	}
	public void ln(String lname)
	{
		ln.sendKeys(lname);
	}
	
	public void street(String streetname)
	{
		street.sendKeys(streetname);
	}
	
	public void cityn(String cityname)
	{
		cityn.sendKeys(cityname);
	}
	
	public void zip(String zipcode)
	{
		zip.sendKeys(zipcode);
	}
	public void tele(String telephone)
	{
		tele.sendKeys(telephone);
	}
	public void ccn(String cnumber)
	{
		ccn.sendKeys(cnumber);
	}
	public void cvn(String cvnumber)
	{
		cvn.sendKeys(cvnumber);
	}

	public void submit()
	{
		submit.click();
	}

	public void mol()
	{
		mol.click();
	}
	public void createtemp()
	{
	createtemp.click();
	}
	public void tempname(String x)
	{
	tempname.sendKeys(x);
	}
	public void choosedoc()
	{
		choosedoc.click();
	}
	public void selectdoc()
	{
	selectdoc.click();
	}
	public void saveclose()
	{
		saveclose.click();
	}
	public void savetemp()
	{
		savetemp.click();
	}

	public void deleteadd()
	{
		deleteadd.click();
	}
	public void del()
	{
	del.click();
	}
	
	
}








