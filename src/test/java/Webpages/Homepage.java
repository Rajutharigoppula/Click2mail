package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{

	public WebDriver driver;

// login with existing user from homepage
		
	@FindBy(xpath="//*[@value='Username']")
	public WebElement UsernameH;
	
	@FindBy(xpath="//*[@value='Password']")
	public WebElement PasswordH;
	
	@FindBy(xpath="(//*[@value='Sign In'])[2]")
	public WebElement SigninH;
		

// forgot username and password

	@FindBy(xpath="//a[contains(text(),'I forgot my username')]")
	public WebElement forgotuname;

	@FindBy(xpath="//input[@id='forget_email']")
	public WebElement forgotuemail;
		
	@FindBy(xpath="//button[@id='forget_user']")
	public WebElement continueubtn;
		
	@FindBy(xpath="//a[contains(text(),'I forgot my password')]")
	public WebElement forgotpwd;
		
	@FindBy(xpath="//input[@id='forget_username']")
	public WebElement forgotpemail;
		
	@FindBy(xpath="//button[@id='forget_pass']")
	public WebElement continuepbtn;
		
	@FindBy(xpath="//button[@id='forget_user_sent']")
	public WebElement closebtn;
		
	@FindBy(xpath="//button[@id='forget_pass_sent']")
	public WebElement close;
		
		
//operations
		
	public Homepage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		
// forgot username and password
			
	public void forgotuname()
	{
		forgotuname.click();
	}
	public void forgotuemail(String x)
	{
		forgotuemail.sendKeys(x);
	}
	public void continueubtn()
	{
		continueubtn.click();
	}
	public void forgotpwd()
	{
		forgotpwd.click();
	}
	public void forgotpemail(String y)
	{
		forgotpemail.sendKeys(y);
	}
	public void continuepbtn()
	{
		continuepbtn.click();
	}
	public void closebtn()
	{
		closebtn.click();
	}
	public void close()
	{
		close.click();
	}
			
// login with existing user from homepage
	
	public void SigninH()
	{
		SigninH.click();
	}
	public void PasswordH(String pname)
	{
		PasswordH.sendKeys(pname);
	}
	public void UsernameH(String uname)
	{
		UsernameH.sendKeys(uname);
	}
			
			
}
