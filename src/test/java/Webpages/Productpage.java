package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage 
{
	public WebDriver driver;

		// print and mail list elements
		// postcards
	
		@FindBy(xpath="(//*[text()='Postcard 3.5 x 5'])[2]")
		public WebElement Ppostcard355;
		@FindBy(xpath="(//*[text()='Postcard 4.25 x 6'])[2]")
		public WebElement Ppostcard4256;
		@FindBy(xpath="//a[@href='https://dev.click2mail.com/by-product/postcards/postcard-4-x-9']")
		public WebElement Ppostcard49;
		@FindBy(xpath="//a[@href='https://dev.click2mail.com/by-product/postcards/postcard-5-x-8']")
		public WebElement Ppostcard58;
		@FindBy(xpath="//a[@href='https://dev.click2mail.com/by-product/postcards/postcard-6-x-9']")
		public WebElement Ppostcard69;
		@FindBy(xpath="//a[@href='https://dev.click2mail.com/by-product/postcards/postcard-6-x-11']")
		public WebElement Ppostcard611;

		//notecards
		
		@FindBy(xpath="//a[@href='https://dev.click2mail.com/by-product/notecards/notecard-4-25-x-5-5']")
		public WebElement notecard1;
		@FindBy(xpath="//a[contains(text(),'Folded Notecard 4.125 x 5.5')]")
		public WebElement notecard2;
		
		//rackcard
		
		@FindBy(xpath="//a[@href='https://dev.click2mail.com/by-product/rack-card/rack-card-4-x-9-mailed']")
		public WebElement rackcard;

		//booklets
		
		@FindBy(xpath="//a[@href='https://dev.click2mail.com/by-product/booklets/booklet-self-mailer-8-5-x-11']")
		public WebElement booklet1;
		@FindBy(xpath="//a[contains(text(),'Booklet Address Back Page')]")
		public WebElement booklet2;
		@FindBy(xpath="//a[contains(text(),'Booklet Address Front Page')]")
		public WebElement booklet3;

		//letters
		
		@FindBy(xpath="//a[@href='https://dev.click2mail.com/by-product/letters/letter-8-5-x-11']")
		public WebElement letter1;
		@FindBy(xpath="//a[@href='https://dev.click2mail.com/by-product/letters/letter-8-5-x-14']")
		public WebElement letter2;
		
		//secure mailer
		
		@FindBy(xpath="//a[@href='https://dev.click2mail.com/by-product/secure-mailer/secure-self-mailer-8-5-x-11']")
		public WebElement securemailer;
		
		//replay mail
		
		@FindBy(xpath="//a[@href='https://dev.click2mail.com/by-product/reply-mail/reply-postcard-4-25-x-6']")
		public WebElement replaymail1;
		@FindBy(xpath="//a[contains(text(),'Reply Letter 8.5 x 11')]")
		public WebElement replaymail2;
		
		// certified mail
		
		@FindBy(xpath="//a[@href='https://dev.click2mail.com/by-product/certified-mail/certified-self-mailer-8-5x11']")
		public WebElement certifiedmail1;
		@FindBy(xpath="//a[contains(text(),'Certified Self Mailer Green Card')]")
		public WebElement certifiedmail2;
		@FindBy(xpath="//a[@href='https://dev.click2mail.com/by-product/certified-mail/certified-letter-8-5-x-11']")
		public WebElement certifiedmail3;
		
		// priority mail plus
		
		@FindBy(xpath="//a[@href='https://dev.click2mail.com/by-product/priority-mail/priority-letter-8-5-x-11']")
		public WebElement prioritymail;
		// priority mail express

		@FindBy(xpath="//a[@href='https://dev.click2mail.com/by-product/priority-mail-express/priority-mail-express-letter-8-5-x-11']")
		public WebElement priorityexpress;
				
		// flyer

		@FindBy(xpath="//a[@href='https://dev.click2mail.com/by-product/flyers/flyer-8-5-x-11']")
		public WebElement flyer;
		
		// brochure
		
		@FindBy(xpath="//a[@href='https://dev.click2mail.com/by-product/brochures/brochure-11-x-8-5']")
		public WebElement brochure;

		//Print and mail to list configurations elements
		
		@FindBy(xpath="(//*[@class='top_link nav-link dropdown-toggle'])[1]")
		public WebElement  printandmaillist;
		
		@FindBy(id="edit-recipient")
		public WebElement edit;

		@FindBy(xpath="(//*[@class='ui-widget-content jqgrow ui-row-ltr'])[1]/td[5]/input")
		public WebElement mailinglist;

		@FindBy(xpath="//*[@id='rec_popup_save_close']")
		public WebElement saveandclose;
		
		@FindBy(xpath="(//*[@id='continueProof'])[1]")
		public WebElement Continue;
	
		//print and ship products
		
		@FindBy(xpath="(//*[text()='Postcard 4.25 x 6'])[2]")
		public WebElement  postcard4256; 
		
		@FindBy(xpath="(//*[text()='Postcard 4 x 9'])[2]")
		public WebElement  postcard49; 
		
		@FindBy(xpath="(//*[text()='Postcard 5 x 8'])[1]")
		public WebElement  postcard58; 
		
		@FindBy(xpath="//div[@class='top-mnu-con']//a[contains(text(),'Postcard 6 x 11')]")
		public WebElement  postcard611; 
		
		@FindBy(xpath="//a[contains(text(),'Postcard 6.5 x 9')]")
		public WebElement  postcard659; 
		
		@FindBy(xpath="//div[@class='top-mnu-con']//a[contains(text(),'Rack Card 4 x 9')]")
		public WebElement  rackcard49;
		
		@FindBy(xpath="//div[@class='top-mnu-con']//a[contains(text(),'Brochure 11 x 8.5')]")
		public WebElement  brochure1185;
		
		@FindBy(xpath="//div[@class='top-mnu-con']//a[contains(text(),'Flyer 8.5 x 11')]")
		public WebElement  flyer8511;
		
		@FindBy(xpath="//a[contains(text(),'Cardstock 12 x 4.5')]")
		public WebElement  cardstock1245;
		
		

		// operations

		public Productpage (WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		public void postcard4256()
		{
		postcard4256.click();
		}
		public void postcard49()
		{
			postcard49.click();
		}
		public void postcard58()
		{
			postcard58.click();
		}
		public void postcard611()
		{
			postcard611.click();
		}
		public void postcard659()
		{
			postcard659.click();
		}
		public void rackcard49()
		{
			rackcard49.click();
		}
		public void brochure1185()
		{
			brochure1185.click();
		}
		public void flyer8511()
		{
			flyer8511.click();
		}
		public void cardstock1245()
		{
			cardstock1245.click();
		}
		public void printandmaillist()
		{
			printandmaillist.click();
		}
		public void edit()
		{
			edit.click();
		}
		public void mailinglist()
		{
			mailinglist.click();
		}
		public void saveandclose()
		{
			saveandclose.click();
		}
		public void Continue()
		{
			Continue.click();
		}
		public void Ppostcard355()
		{
			Ppostcard355.click();
		}
		public void Ppostcard4256()
		{
			Ppostcard4256.click();
		}
		public void Ppostcard49()
		{
			Ppostcard49.click();
		}
		public void Ppostcard58()
		{
			Ppostcard58.click();
		}
		public void Ppostcard69()
		{
			Ppostcard69.click();
		}
		public void Ppostcard611()
		{
			Ppostcard611.click();
		}
		public void notecard1()
		{
			notecard1.click();
		}
		public void notecard2()
		{
			notecard2.click();
		}
		public void rackcard()
		{
			rackcard.click();
		}
		public void booklet1()
		{
			booklet1.click();
		}
		public void booklet2()
		{
			booklet2.click();
		}
		public void booklet3()
		{
			booklet3.click();
		}
		public void letter1()
		{
			letter1.click();
		}
		public void letter2()
		{
			letter2.click();
		}
		public void securemailer()
		{
			securemailer.click();
		}
		public void replaymail1()
		{
			replaymail1.click();
		}
		public void replaymail2()
		{
			replaymail2.click();
		}
		public void certifiedmail1()
		{
			certifiedmail1.click();
		}
		public void certifiedmail2()
		{
			certifiedmail2.click();
		}
		public void certifiedmail3()
		{
			certifiedmail3.click();
		}
		public void prioritymail()
		{
			prioritymail.click();
		}
		public void priorityexpress()
		{
			priorityexpress.click();
		}
		public void flyer()
		{
			flyer.click();
		}
		public void brochure()
		{
			brochure.click();
		}
		
		
 



}
