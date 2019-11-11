package stepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;

import Webpages.Dashboard;
import Webpages.Homepage;
import Webpages.Loginpage;
import Webpages.Orderpages;
import Webpages.Productpage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Gluecode 
{

	private static final int Screenshot1 = 0;
	public WebDriver driver;
	public Loginpage lg;
	public Productpage Pd;
	public Dashboard Db;
	public Homepage hp;
	public Orderpages op;
	public Scenario S; 
	public Properties pro;
	public WebDriverWait wait;
	
	
                                                                                                                                                                                                   
	@Before
	public void method1 (Scenario s) throws IOException 
		{
		this.S=s;
		pro = new Properties();
		FileInputStream fip = new FileInputStream("src\\test\\resources\\paths\\Path.properties");
		pro.load(fip);
		}
		
	
	@Given("^open application with \"(.*)\"$" )
	public void method2(String br) throws InterruptedException
	  {
		if(br.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", pro.getProperty("cdriver"));					
			driver= new ChromeDriver();	
			driver.manage().window().maximize();
		}
		
		else if(br.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", pro.getProperty("fdriver"));					
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		Thread.sleep(3000);
		}		
		
		
    driver.manage().window().maximize();			
    lg = new Loginpage(driver);
    Pd = new Productpage(driver);
    Db = new Dashboard(driver);
    hp = new Homepage(driver);
    op = new Orderpages(driver);
	driver.get(pro.getProperty("url"));
	wait = new WebDriverWait(driver,50);
	  }
	  
	@When("^click on the new customer$")
	public void method3()
		{
		lg.newcust();
		}
		

	
	@And("^enter emailid and other details \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void method(String x, String y, String z, String z1, String a, String b) throws InterruptedException
		{
		lg.emailid(x);
		lg.userid(y);
		lg.pwd(z);
		lg.cnfpwd(z1);
		Select hintqe = new Select(lg.hintq);
		hintqe.selectByVisibleText("My first car"); Thread.sleep(2000);
		lg.ans(a);
		lg.cnfans.sendKeys(b, Keys.TAB); Thread.sleep(2000);
		lg.cntebtn();
		}
	

	@And("^enter companyname \"(.*)\"$")
	public void method(String c1)
		{
		lg.companyname(c1);
		Select industry = new Select(lg.industryType);
		industry.selectByVisibleText("Technology");
		lg.continuebutton();
		}
		
		
	@Then("^select prefix and enter customer details \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void method1(String name, String lname,String addresss1,String cty,String post,String phnumber) throws InterruptedException
		{
		Select prefix = new Select(lg.prefix);
		prefix.selectByVisibleText("Mr.");
		lg.firstname(name);
		lg.lastname(lname);
		Select country = new Select(lg.country);
		country.selectByVisibleText("United States"); Thread.sleep(2000);
		lg.address(addresss1);
		lg.city(cty);
		Select region = new Select(lg.region);
		region.selectByVisibleText("New Jersey");Thread.sleep(2000);
		lg.postcode.sendKeys(post);
		lg.ustelephone(phnumber);
		lg.register(); Thread.sleep(5000);
		String successmsg = lg.Thankyou.getText();
		System.out.println(successmsg);
		
		}
		
	@When("^select account type as business$")
	public void method22() throws InterruptedException
		{
		lg.business();	Thread.sleep(4000);

		}
	
	@When("^select account type as person$")
	public void method24() throws InterruptedException
		{
		lg.person(); Thread.sleep(4000);
		}
	
	@Then("close browser$")
	public void method23() throws InterruptedException
		{
			driver.quit();
		}
	
	
	
	
// login from homepage
	
	@Then("^enter username and password \"(.*)\" and \"(.*)\"$")
	public void method25(String uname,String pname ) throws InterruptedException
	{
		hp.UsernameH.click();
		hp.UsernameH.clear();
		hp.UsernameH(uname);
		hp.PasswordH.click();
		hp.PasswordH.clear();
		hp.PasswordH(pname);
		hp.SigninH();
		
	}
	
	
// order palce with postcard
	
	@And("^click on shiptoyou product link$")
	public void method28() throws InterruptedException
	{
		op.shiptoyou();
		Thread.sleep(2000);
		}
	
	@And("^click on postcard355$")
	public void method29() throws InterruptedException
	{
		op.postcard355();
		Thread.sleep(4000);
	}
	
	@And("^click on starthere button$")
	public void method30() throws InterruptedException
	{
		op.Starthere();
		Thread.sleep(3000);
	}
	@And("^click on startjob button$")
	public void method31() throws InterruptedException
	{
		op.Startjob();
		Thread.sleep(3000);
	}
	@And("^select a document$")
	public void method34()
		{
		wait.until(ExpectedConditions.visibilityOf(op.selectdocument));
		op.Selectdocument();
		}
	
	
	
	@Then("^select print and ship$")
	public void method33() throws InterruptedException 
	{
	Actions action = new Actions(driver);
	WebElement w = op.shipedlink;
	action.moveToElement(w).build().perform();
	}
	
	@Then("^select postcard355$")
	public void method36() throws InterruptedException
	{
	op.postcard1();
	Thread.sleep(4000);
	}
	
		
	@Then("^select postcard4256$")
	public void method37() throws InterruptedException
	{
	Pd.postcard4256();
	Thread.sleep(4000);
	}
	
	@Then("^select postcard49$")
	public void method38() throws InterruptedException
	{
	Pd.postcard49();
	Thread.sleep(4000);
	}
	
	@Then("^select postcard58$")
	public void method39() throws InterruptedException
	{
	Pd.postcard58();
	Thread.sleep(4000);
	}
	
	@Then("^select postcard611$")
	public void method40() throws InterruptedException
	{
	Pd.postcard611();
	Thread.sleep(4000);
	}
	
	@Then("^select postcard659$")
	public void method41() throws InterruptedException
	{
	Pd.postcard659();
	Thread.sleep(4000);
	}
	
	@Then("^select rackcard49$")
	public void method42() throws InterruptedException
	{
	Pd.rackcard49();
	Thread.sleep(4000);
	}
	@Then("^select brochure1185$")
	public void method43() throws InterruptedException
	{
	Pd.brochure1185();
	Thread.sleep(4000);
	}
	
	@Then("^select flyer8511$")
	public void method44() throws InterruptedException
	{
	Pd.flyer8511();
	Thread.sleep(4000);
	}
	
	@Then("^select cardstock1245$")
	public void method45() throws InterruptedException
	{
	Pd.cardstock1245();
	Thread.sleep(4000);

	}
		
	
	@Then("^shipped product placing orders$")
	public void method27() throws InterruptedException	
	{
	op.Startbutton();
	Thread.sleep(5000);
	op.startjob1();
	wait.until(ExpectedConditions.visibilityOf(op.upload));
	op.upload();
	Thread.sleep(7000);
	driver.switchTo().frame("iframe");
	op.checkbox1();
	wait.until(ExpectedConditions.visibilityOf(op.save));
	op.save();
	Thread.sleep(5000);
	driver.switchTo().defaultContent();
	Thread.sleep(7000);
	wait.until(ExpectedConditions.visibilityOf(op.continue1));
	op.continue1();
	wait.until(ExpectedConditions.visibilityOf(op.proof));
	op.proof();
	Thread.sleep(7000);
	ArrayList<String> tabs_windows = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs_windows.get(0));
	wait.until(ExpectedConditions.visibilityOf(op.Initials));
	op.yes();
	}
	
	@And("^enter initials for shiped product \"(.*)\"$")
	public void method34 (String ab) throws InterruptedException
	{ 
	op.Initials(ab);
	Thread.sleep(5000);
	op.addtocart();
	wait.until(ExpectedConditions.visibilityOf(op.finish));
	op.finish();
	wait.until(ExpectedConditions.visibilityOf(op.proceedtocheckout));
	op.proceedtocheckout();Thread.sleep(7000);	
	op.shipaddress();Thread.sleep(7000);  
	op.shipmethod();Thread.sleep(7000);
	op.CreditCard();Thread.sleep(7000); 
	op.accept();	Thread.sleep(5000);
	op.placeorder(); Thread.sleep(5000);
	wait.until(ExpectedConditions.visibilityOf(op.success));
		
	}

	@Then("^select print and mail list products$")
	public void method46()  
	{
	Actions action = new Actions(driver);
	WebElement w = Pd.printandmaillist;
	action.moveToElement(w).build().perform();
	}
	
	
	@Then("^print and mail products place an order$")
	public void method35() throws InterruptedException	
	{
	
	op.Startbutton();Thread.sleep(5000); 
	op.startjob1();Thread.sleep(5000);
	op.upload();Thread.sleep(5000);
	driver.switchTo().frame("iframe");
	op.checkbox1();Thread.sleep(3000);
	op.save();
	driver.switchTo().defaultContent();Thread.sleep(7000);
	Pd.edit();Thread.sleep(5000);
	driver.switchTo().frame("iframe");
	Pd.mailinglist();Thread.sleep(2000);
	Pd.saveandclose();
	driver.switchTo().defaultContent();Thread.sleep(10000);
	op.continue1();Thread.sleep(7000);
	op.proof();Thread.sleep(7000);
	ArrayList<String> tabs_windows = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs_windows.get(0));
	op.yes();Thread.sleep(5000);
	}
		
		
	@And("^enter initials for print mail \"(.*)\"$")
	public void method47 (String ab) throws InterruptedException
	{
	op.Initials(ab);Thread.sleep(5000);
	op.addtocart();Thread.sleep(5000);
	op.finish();Thread.sleep(5000);
	op.proceedtocheckout();Thread.sleep(5000);
	op.CreditCard();Thread.sleep(5000);
	op.accept();Thread.sleep(5000);
	op.placeorder();Thread.sleep(5000);
	wait.until(ExpectedConditions.visibilityOf(op.success));
	}
			
	//print and mail list
		
	@Then("^select p postcard355$")
	public void method48() throws InterruptedException
	{
	Pd.Ppostcard355();
	Thread.sleep(4000);
	}
	
	@Then("^select p postcard4256$")
	public void method49() throws InterruptedException
	{
	Pd.Ppostcard4256();
	Thread.sleep(4000);
	}
	@Then("^select p postcard49$")
	public void method50() throws InterruptedException
	{
	Pd.Ppostcard49();
	Thread.sleep(4000);
	}
	@Then("^select p postcard58$")
	public void method51() throws InterruptedException
	{
	Pd.Ppostcard58();
	Thread.sleep(4000);
	}
	@Then("^select p postcard69$")
	public void method52() throws InterruptedException
	{
	Pd.Ppostcard69();
	Thread.sleep(4000);
	}
	@Then("^select p postcard611$")
	public void method53() throws InterruptedException
	{
	Pd.Ppostcard611();
	Thread.sleep(4000);
	}
	@Then("^select p notecard1$")
	public void method54() throws InterruptedException
	{
	Pd.notecard1();
	Thread.sleep(4000);
	}
	@Then("^select p notecard2$")
	public void method55() throws InterruptedException
	{
	Pd.notecard2();
	Thread.sleep(4000);
	}
	@Then("^select p rackcard49$")
	public void method56() throws InterruptedException
	{
	Pd.rackcard49();
	Thread.sleep(4000);
	}
	@Then("^select p booklet1$")
	public void method57() throws InterruptedException
	{
	Pd.booklet1();
	Thread.sleep(4000);
	}
	@Then("^select p booklet2$")
	public void method58() throws InterruptedException
	{
	Pd.booklet2();
	Thread.sleep(4000);
	}
	@Then("^select p booklet3$")
	public void method59() throws InterruptedException
	{
	Pd.booklet3();
	Thread.sleep(4000);
	}
	@Then("^select p letter1$")
	public void method60() throws InterruptedException
	{
	Pd.letter1();
	Thread.sleep(4000);
	}
	@Then("^select p letter2$")
	public void method61() throws InterruptedException
	{
	Pd.letter2();
	Thread.sleep(4000);
	}
	@Then("^select p securemailer$")
	public void method62() throws InterruptedException
	{
	Pd.securemailer();
	Thread.sleep(4000);
	}
	@Then("^select p replay mail1$")
	public void method63() throws InterruptedException
	{
	Pd.replaymail1();
	Thread.sleep(4000);
	}
	@Then("^select p replay mail2$")
	public void method64() throws InterruptedException
	{
	Pd.replaymail2();
	Thread.sleep(4000);
	}
	@Then("^select p certified mail1$")
	public void method65() throws InterruptedException
	{
	Pd.certifiedmail1();
	Thread.sleep(4000);
	}
	@Then("^select p certified mail2$")
	public void method66() throws InterruptedException
	{
	Pd.certifiedmail2();
	Thread.sleep(4000);
	}
	
	@Then("^select p certified mail3$")
	public void method67() throws InterruptedException
	{
	Pd.certifiedmail3();
	Thread.sleep(4000);
	}
	
	@Then("^select p priority mail$")
	public void method68() throws InterruptedException
	{
	Pd.prioritymail();
	Thread.sleep(4000);
	}
	@Then("^select p priority mail express$")
	public void method69() throws InterruptedException
	{
	Pd.priorityexpress();
	Thread.sleep(4000);
	}
	@Then("^select p flyer$")
	public void method70() throws InterruptedException
	{
	Pd.flyer();
	Thread.sleep(4000);
	}
	@Then("^select p brochures$")
	public void method71() throws InterruptedException
	{
	Pd.brochure();
	Thread.sleep(4000);
	}
	
	//buy credit
	
			
	
	@Then("^enter buy credit amount \"(.*)\"$")
	public void method73(String z) throws InterruptedException
	{
		Db.buycredit();Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(Db.creditamount));
		
		Db.creditamount(z);
				
		Select paymenttype = new Select(Db.Payment);
		paymenttype.selectByVisibleText("Add new card");
		
		Select cardtype = new Select(Db.cardtype);
		cardtype.selectByVisibleText("Visa");
			
	}
	
	@Then("^enter card details \"(.*)\" and \"(.*)\"$")
	public void method74(String x, String y) throws InterruptedException
	{
		Db.cardnumber(x);
		
		Select paymenttype = new Select(Db.exp);
		paymenttype.selectByVisibleText("10 - October");
		
		Select year = new Select(Db.year);
		year.selectByVisibleText("2022");
		Db.cvv(y);
		Thread.sleep(2000);
		Db.save();
	
		Select state = new Select(Db.state);
		state.selectByVisibleText("New York");
		Thread.sleep(2000);
		Db.Buy();
		wait.until(ExpectedConditions.visibilityOf(Db.ok));
		String Txt = Db.creditbalance.getText();
		System.out.println(Txt);
		Db.ok();
	}
	

	@Then("^click on addresses link$")
	public void method76() throws InterruptedException
	{
		Db.addresses();Thread.sleep(5000);
		Db.addnewaddress();Thread.sleep(5000);
	}
	
		
	@Then ("^enter address type \"(.*)\"$")
	public void method78(String xy) throws InterruptedException
	{
			
	if(xy.equalsIgnoreCase("return"))
	{
		Db.returnadd();
		Thread.sleep(6000);

		
	}
	else if(xy.equalsIgnoreCase("billing"))
	{
		Db.billingadd();
		Thread.sleep(6000);

	}
	else if(xy.equalsIgnoreCase("shipping"))
	{
		Db.shippingadd();
		Thread.sleep(6000);

	}
	else if(xy.equalsIgnoreCase("eddm"))
	{
		Db.eddmadd();
		Thread.sleep(6000);

	}
	else if(xy.equalsIgnoreCase("business"))
	{
		Db.businessadd();
		Thread.sleep(6000);
	}
	else if(xy.equalsIgnoreCase("courtesy"))
	{
		Db.courtesyadd();
	}
	else
	{
		
	}
}


	@Then ("^create return address \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void method80(String name, String add1,String add2, String cityname, String zip) throws InterruptedException
	{
		Db.nickname(name);Thread.sleep(3000);
		Db.continuebtn();Thread.sleep(3000);
		Db.address1(add1);Thread.sleep(3000);
		Db.address2(add2);Thread.sleep(3000);
		Db.city(cityname);Thread.sleep(3000);
		Select state= new Select(Db.state1);
		state.selectByVisibleText("New York"); Thread.sleep(4000);
		Db.zipcode(zip);
		Thread.sleep(4000);
		Db.saveaddress();
		Thread.sleep(6000);
		if(Db.saveaddress.isDisplayed())
		{
			Db.saveaddress();
			Thread.sleep(6000);
		}
	}
		@And("^click on add new address link$")
		public void method86() throws InterruptedException
		{
				
		Db.addnewaddress();Thread.sleep(5000);
		}

	
	@Then ("^create billing address \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void method81(String name, String add1,String add2, String cityname, String zip, String ph1) throws InterruptedException
	{		

		Db.nickname(name);
		Db.continuebtn();Thread.sleep(3000);
		Db.address1(add1);Thread.sleep(3000);
		Db.address2(add2);Thread.sleep(3000);
		Db.city(cityname);Thread.sleep(3000);
		Select state= new Select(Db.state1);
		state.selectByVisibleText("New York"); Thread.sleep(4000);
		Db.zipcode(zip);
		Db.phone(ph1);
		Thread.sleep(4000);
		Db.saveaddress();
		Thread.sleep(6000);
		if(Db.saveaddress.isDisplayed())
		{
			Db.saveaddress();
			Thread.sleep(6000);
		}
	}
	
	@Then ("^create shipping address \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void method82(String name, String add1,String add2, String cityname, String zip, String ph1) throws InterruptedException
	{		

		Db.nickname(name);
		Db.continuebtn();Thread.sleep(3000);
		Db.address1(add1);Thread.sleep(3000);
		Db.address2(add2);Thread.sleep(3000);
		Db.city(cityname);Thread.sleep(3000);
		Select state= new Select(Db.state1);
		state.selectByVisibleText("New York"); Thread.sleep(4000);
		Db.zipcode(zip);
		Db.phone(ph1);
		Thread.sleep(4000);
		Db.saveaddress();
		Thread.sleep(6000);
		if(Db.saveaddress.isDisplayed())
		{
			Db.saveaddress();
			Thread.sleep(6000);
		}
		
	}
	
	@Then ("^create eddm address \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void method83(String name, String add1,String add2, String cityname, String zip, String ph1) throws InterruptedException
	{		

		Db.nickname(name);
		Db.continuebtn();Thread.sleep(3000);
		Db.address1(add1);Thread.sleep(3000);
		Db.address2(add2);Thread.sleep(3000);
		Db.city(cityname);Thread.sleep(3000);
		Select state= new Select(Db.state1);
		state.selectByVisibleText("New York"); Thread.sleep(4000);
		Db.zipcode(zip);
		Db.phone(ph1);
		Thread.sleep(4000);
		Db.saveaddress();
		Thread.sleep(6000);
		if(Db.saveaddress.isDisplayed())
		{
			Db.saveaddress();
			Thread.sleep(6000);
		}

	}
	
	@Then ("^create business address \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void method84(String name,String cname, String add1,String add2, String cityname, String zip, String ph1,String cty,String per) throws InterruptedException
	{		
		Db.nickname(name);
		Db.continuebtn();Thread.sleep(3000);
		Db.companyname(cname);
		Db.address1(add1);Thread.sleep(3000);
		Db.address2(add2);Thread.sleep(3000);
		Db.city(cityname);Thread.sleep(3000);
		Select state= new Select(Db.state1);
		state.selectByVisibleText("New York"); Thread.sleep(4000);
		Db.zipcode(zip);
		Db.city2(cty);
		Select state1= new Select(Db.state2);
		state1.selectByVisibleText("New York"); Thread.sleep(4000);
		Db.permit(per);
		Thread.sleep(5000);
		Db.saveaddress();
		Thread.sleep(6000);
	}
	@Then ("^create courtesy address \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void method85(String name, String add1,String add2, String cityname, String zip) throws InterruptedException
	{
		Db.nickname(name);
		Db.continuebtn();Thread.sleep(3000);
		Db.address1(add1);Thread.sleep(3000);
		Db.address2(add2);Thread.sleep(3000);
		Db.city(cityname);Thread.sleep(3000);
		Select state= new Select(Db.state1);
		state.selectByVisibleText("New York"); Thread.sleep(4000);
		Db.zipcode(zip);
		Thread.sleep(4000);
		Db.saveaddress();
		Thread.sleep(6000);
		if(Db.saveaddress.isDisplayed())
		{
			Db.saveaddress();
			Thread.sleep(8000);
		}
	}
	
	@Then("^click on myaccount link$")
	public void method77() throws InterruptedException
	{
		Db.Myaccount();
		Thread.sleep(3000);		
		/*if(Db.accept.isDisplayed())
		{
			Db.accept.click();
		}*/
	}
	
		
	@Then("^create molpro template \"(.*)\"$")
	public void method79(String x) throws InterruptedException
	{
		Db.mol();Thread.sleep(3000);
		Db.createtemp();Thread.sleep(3000);
		Db.tempname(x);Thread.sleep(3000);
		Select doc = new Select(Db.choosedoc);Thread.sleep(3000);
		doc.selectByVisibleText("Postcard 5 x 8");Thread.sleep(3000);
		Db.selectdoc();Thread.sleep(3000);
		Db.saveclose();Thread.sleep(3000);
		Db.savetemp();
	}
	
	@Then("^create new project \"(.*)\"$")
	public void method80(String pname) throws InterruptedException
	{
		Db.newproject();Thread.sleep(5000);
		Db.projectname(pname);Thread.sleep(3000);
		Db.okbutton();Thread.sleep(5000);
	}
		
	@And("^delete retrun address additional address$")
	public void method82() throws InterruptedException
	{
		Db.addresses();Thread.sleep(5000);
		Db.deleteadd(); Thread.sleep(5000);
		Db.del();Thread.sleep(5000);
	}
		
	@Then("^click on forgot username \"(.*)\"$")
	public void method83(String x) throws InterruptedException
	{
		hp.SigninH();Thread.sleep(4000);
		hp.forgotuname();Thread.sleep(4000);
		hp.forgotuemail(x);Thread.sleep(4000);
		hp.continueubtn();
		wait.until(ExpectedConditions.visibilityOf(hp.closebtn));
		hp.closebtn();
	}
	
	@Then("^click on forgot password \"(.*)\"$")
	public void method84(String y) throws InterruptedException
	{
		hp.SigninH();   Thread.sleep(4000);
		hp.forgotpwd(); Thread.sleep(4000);
		hp.forgotpemail(y);
		hp.continuepbtn();
		wait.until(ExpectedConditions.visibilityOf(hp.close));
		hp.close();
	}
	
	@Then("^update account details \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void method85(String x,String y,String z,String a,String b,String c,String d,String e,String f,String g) throws InterruptedException
	{
		lg.account();Thread.sleep(2000);
		lg.edit();
		lg.Fname.clear();Thread.sleep(2000);
		lg.Fname(x);
		lg.Lname.clear();Thread.sleep(2000);
		lg.Lname(y);
		lg.Email.clear();Thread.sleep(2000);
		lg.Email(z);
		lg.phone.clear();Thread.sleep(2000);
		lg.phone(a);
		lg.firstname1.clear();Thread.sleep(2000);
		lg.firstname1(b);
		lg.lastname1.clear();Thread.sleep(2000);
		lg.lastname1(c);
		lg.company.clear();Thread.sleep(2000);
		lg.company(d);
		lg.add1.clear();Thread.sleep(2000);
		lg.add1(e);
		lg.city1.clear();Thread.sleep(2000);
		lg.city1(f);
		Select country = new Select(lg.country1);
		country.selectByVisibleText("United States"); Thread.sleep(2000);
		Select state = new Select(lg.State);
		state.selectByVisibleText("New York"); Thread.sleep(2000);
		lg.Zip.clear();Thread.sleep(2000);
		lg.Zip(g);Thread.sleep(2000);
		lg.save1();
		wait.until(ExpectedConditions.visibilityOf(lg.successmsg));
	}
	
	@Then("^create a new project \"(.*)\"$")
	public void method85(String x) throws InterruptedException
	{
		lg.MyProjects();Thread.sleep(4000);
		lg.newproject();Thread.sleep(2000);
		lg.projectname(x);
		lg.ok();Thread.sleep(5000);
	}
	
	@Then("^delete a project \"(.*)\"$")
	public void method86(String x) throws InterruptedException
	{
		lg.MyProjects();Thread.sleep(3000);
		lg.searchbox(x);Thread.sleep(3000);
		lg.searchbtn();Thread.sleep(3000);
		Select act = new Select(lg.action);
		act.selectByVisibleText("Delete Project");Thread.sleep(3000);
		lg.delete();
		wait.until(ExpectedConditions.visibilityOf(lg.status));Thread.sleep(3000);
	}
	
	@When("^create mailing list \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void method87(String a,String b,String c,String d,String e) throws InterruptedException
	{
		lg.mailing();Thread.sleep(4000);
		lg.newlist();
		wait.until(ExpectedConditions.visibilityOf(lg.malingname));
		lg.malingname(a);
		lg.savemailing();Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOf(lg.addreceipient));
		lg.addreceipient();Thread.sleep(4000);
		lg.Firstname(b);
		lg.Lastname(c);
		lg.Address1(d);
		lg.City(e);
		Select sta = new Select (lg.State1);
		sta.selectByVisibleText("New York");Thread.sleep(4000);
		lg.Standardize();Thread.sleep(4000);
		lg.close1();Thread.sleep(4000);
		lg.done();Thread.sleep(4000);
		wait.until(ExpectedConditions.invisibilityOf(lg.Mailinglist));
	
		}
	

	

	
	
}

	
	
	


