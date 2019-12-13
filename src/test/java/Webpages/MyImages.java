package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyImages {
	
	public WebDriver driver;
	
	@FindBy(xpath="//*[@title='My Images']")
	public WebElement MyImage;
		
	@FindBy(id="upload_image_btn")
	public WebElement uploadimage;
	
	@FindBy(id="new_project_ok")
	public WebElement ok;
	
	@FindBy(xpath="//div[@id='button_set_one']//b[contains(text(),'Upload')]")
	public WebElement upload;
	
	@FindBy(xpath="(//*[text()='Delete Image'])[1]")
	public WebElement deleteimage;
		
	@FindBy(xpath="//span[contains(text(),'Ok')]")
	public WebElement ok2;
	
	//operations
	
	public MyImages (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
			
	public void MyImage()
	{
		MyImage.click();
	}
	public void uploadimage()
	{
		uploadimage.click();
	}
	public void ok()
	{
		ok.click();
	}
	public void upload()
	{
		upload.click();
	}
				
	public void deleteimage()
	{
		deleteimage.click();
	}			
	public void ok2()
	{
		ok2.click();
	}
							
				
				
				
}
