package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyDocuments {

	public WebDriver driver;
	
	// Create document

	@FindBy(xpath="//*[@title='My Documents']")
	public WebElement mydocuments;
	
	@FindBy(xpath="//*[@id='create_document_btn']")
	public WebElement createdocument;
	
	@FindBy(name="createdocname")
	public WebElement createdocname;
	
	@FindBy(xpath="(//*[@name='product_sku'])[2]")
	public WebElement producttype;
		
	@FindBy(name="editorchoice")
	public WebElement editorchoice;
	
	@FindBy(id="continue_create_doc_editor_mydoc")
	public WebElement doccontinue;
	
	@FindBy(xpath="//*[text()='No']/parent::*")
	public WebElement no;
	
	@FindBy(id="tool_text")
	public WebElement abtext;
	
	@FindBy(xpath="(//*[@class='upper-canvas '])[3]")
	public WebElement canvas;
	
	@FindBy(xpath="//*[@id='editor-mailmerge-confirm']")
	public WebElement editor;
	
	@FindBy(id="editor-main-window-iframe")
	public WebElement iframe;
				
	@FindBy(xpath="(//*[@id='dialog_buttons']/input[1])[1]")
	public WebElement messageok;
			
	@FindBy(id="save_close_btn")
	public WebElement saveandclose;
	
	//upload document
	
	@FindBy(xpath="//*[@id='und_button']")
	public WebElement upload;
	
	@FindBy(name="documentupload[]")
	public WebElement uploaddoc;
	
	
	
	
	
	
	
	//operations
	
			
	public MyDocuments (WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	 }
						
	public void mydocuments()
	{
		mydocuments.click();
	}
	public void createdocument()
	{
		createdocument.click();
	}
	public void createdocname(String a)
	{
		createdocname.sendKeys(a);
	}			
			
	public void editorchoice()
	{
		editorchoice.click();
	}
	public void doccontinue()
	{
		doccontinue.click();
	}
	public void no()
	{
		no.click();
	}
	public void abtext()
	{
		abtext.click();
	}
			
	public void canvas()
	{
		canvas.click();
	}
	public void saveandclose()
	{
		saveandclose.click();
	}
	public void upload()
	{
		upload.click();
	}			
		
	public void uploaddoc()
	{
		uploaddoc.click();
	}
}
