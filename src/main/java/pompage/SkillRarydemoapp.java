package pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRarydemoapp {
	
	@FindBy(id = "course")
	private WebElement Course;
   
	@FindBy(xpath = "//a[text() = ' Selenium Training ']")
	private WebElement seleniumtraining;
	
	@FindBy(name ="addresstype")
	private WebElement Testing;
	
	public WebElement getTesting() {
		return Testing;
	}

	public SkillRarydemoapp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCourse() {
		return Course;
	}
	public void selenium()
	{
		Course.click();
	}

}
