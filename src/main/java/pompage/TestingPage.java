package pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	public WebDriver driver;
	
	@FindBy(xpath = "//i[@class = 'fa fa-facebook']")
	private WebElement facebook;
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public FaceBookPage facebookicon()
	{
		facebook.click();
	 return new FaceBookPage(driver);
	}

}
