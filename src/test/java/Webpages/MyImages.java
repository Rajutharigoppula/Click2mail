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
	
	
	
	
	
	
	
	
	//operations
	
			public MyImages (WebDriver driver)
			{
				this.driver=driver;
				PageFactory.initElements(driver,this);
			}
			
			// forgot username and password
				
			
				
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
				
				
				
				
				
				
				
				
}
