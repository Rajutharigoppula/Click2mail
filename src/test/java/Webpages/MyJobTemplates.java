package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyJobTemplates {

	public WebDriver driver;
	
	@FindBy(xpath="x")
	public WebElement x;
	
	
	//operations
	
			public MyJobTemplates (WebDriver driver)
			{
				this.driver=driver;
				PageFactory.initElements(driver,this);
			}
			
			// forgot username and password
				
			
				
				public void x()
				{
					x.click();
				}

}
