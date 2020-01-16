package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderpages

{
	public WebDriver driver;

	// order place with postcard
	
		@FindBy(id="dropdown02")
		public WebElement shiptoyou;
		
		@FindBy(xpath="(//*[text()='Postcard 3.5 x 5'])[2]")
		public WebElement Postcard355;
		
		@FindBy(id="ce_costestimator")
		public WebElement Starthere;
		
		@FindBy(id="start_job_top")
		public WebElement Startjob;
		
		@FindBy(id="edit-document")
		public WebElement selectdocument;
		
		@FindBy(id="select_popup_document_111922")
		public WebElement Sc;
		
		@FindBy(id="doc_grid_btn_save_closewindow")
		public WebElement selectsave;
		
		@FindBy(xpath="//*[@id='dropdown02'] | (//*[@class='top_link'])[2]")
		public WebElement shipedlink;
		@FindBy(xpath="(//*[text()='Postcard 3.5 x 5'])[2]")
		public WebElement postcard1;
		@FindBy(xpath="//img[@id='ce_costestimator']")
		public WebElement Startbutton;
		
		@FindBy(xpath="//*[@id='ce_costestimator']")
		public WebElement start;
		@FindBy(xpath="//a[contains(text(),'Select/Upload')]")
		public WebElement upload;
		
		@FindBy(xpath="//*[@name='select_popup_document']")
		public WebElement checkbox1;
		@FindBy(xpath="//*[@id='doc_grid_btn_save_closewindow']")   
		//(//*[@class='ui-button-text'])[21]
		public WebElement save;
		
		@FindBy(xpath="(//*[@id='continueProof'])[2]")
		public WebElement continue1;
		
		@FindBy(id="downloadProof")
		public WebElement proof;
		
		@FindBy(xpath="//*[@name='approve']")
		public WebElement yes;
		@FindBy(xpath="//*[@name='initials']")
		public WebElement Initials;
		
		@FindBy(xpath="//a[@id='proofContinue']")
		public WebElement addtocart;
		
		@FindBy(xpath="//a[contains(text(),'Finish checkout')]")
		public WebElement finish;
		
		@FindBy(xpath="//*[text()='Successfully added item(s) to the cart.']")
		public WebElement addedtocart;
		
		
		@FindBy(xpath="(//*[@title='Proceed to Checkout'])[1]")
		public WebElement proceedtocheckout;
		
		@FindBy(xpath="//*[@id='usercredits']")
		public WebElement  usercredit; 
		
		@FindBy(xpath="//input[@id='p_method_authnetcim']")
		public WebElement  CreditCard; 
		
		
		@FindBy(xpath="(//*[@id='agreement__1'])[1]")
		public WebElement  accept; 
		@FindBy(xpath="(//*[@title='Place Order'])[3]")
		public WebElement  placeorder; 
		
		@FindBy(xpath="//*[@name='billing[use_for_shipping]']")
		public WebElement  shipaddress; 
		
		@FindBy(xpath="//input[@id='s_method_fedex_FEDEX_GROUND']")
		public WebElement  shipmethod; 
		
		@FindBy(xpath="//*[@name='ko_unique_1']")
		public WebElement  flatrate; 
		
		@FindBy(xpath="//*[text()='Your order has been received.']")
		public WebElement  success;
		
		// operations
		
		public Orderpages (WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		// for place an order with postcard
		
		public void shiptoyou()
		{
			shiptoyou.click();
		}
		public void postcard355()
		{
			Postcard355.click();
	    }

		public void Starthere()
		{
			Starthere.click();
	    }

		public void Startjob()
		{
			Startjob.click();
		}

		public void Selectdocument()
		{
			selectdocument.click();
		}
			
		public void SelectCheckbox()
		{
		Sc.click();
		}

		public void selectsave()
		{
			selectsave.click();
		}
		public void shipedlink()
		{
		shipedlink.click();
		}
		public void postcard1()
		{
		postcard1.click();
		}
		public void Startbutton()
		{
		Startbutton.click();
		}
		public void startjob1()
		{
			start.click();
		}
		public void upload()
		{
			upload.click();
		}
		public void checkbox1()
		{
			checkbox1.click();
		}
		public void save()
		{
			save.click();
		}
		public void continue1()
		{
			continue1.click();
		}
		
		public void proof()
		{
			proof.click();
		}
		public void yes()
		{
			yes.click();
		}
		public void Initials(String ab)
		{
			Initials.sendKeys(ab);
		}
		public void addtocart()
		{
			addtocart.click();
		}
		
		public void finish()
		{
			finish.click();
		}
		
		public void proceedtocheckout()
		{
			proceedtocheckout.click();
		}
		public void CreditCard()
		{
			CreditCard.click();
		}
		
		public void accept()
		{
			accept.click();
		}
		public void placeorder()
		{
			placeorder.click();
		}

		public void shipaddress()
		{
			shipaddress.click();
		}
		
		public void shipmethod() 
		
		{
			shipmethod.click();
		}
		
		public void usercredit() 
		
		{
			usercredit.click();
		}
		
		public void flatrate() 
		
		{
			flatrate.click();
		}
		
		
		public void success()
		{
		success.isDisplayed();
		} 
		
		

		
}
