package pompage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryLoginpage {
	
	public WebDriver driver;
    
	//Initialization
	/*public SkillRaryLoginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Declaration
	By gears = By.xpath("//a[text() = ' GEARS ']");
	By skillraryDemoapp = By.xpath("(//a[text() = ' SkillRary Demo APP'])[2]");
	By search = By.name("q");
	By searchbtn = By.xpath("//input[@value = 'go']");
	
	
	
	
	//Implementation
	public void gearsbtn()
	{
		driver.findElement(gears).click();
	}
	
	public void searchtb(String coursename)
	{
		driver.findElement(search).sendKeys(coursename);
	}
	
	public void Searchbtn()
	{
		driver.findElement(searchbtn).click();
	}
	
	public SkillRarydemoapp skillrarydemoapp()
	{
		driver.findElement(skillraryDemoapp).click();
		return new SkillRarydemoapp(driver);
	}
	*/
	
	@FindBy(xpath = "//a[text() = ' GEARS ']")
	private WebElement gears;

	@FindBy(xpath = "(//a[text() = ' SkillRary Demo APP'])[2]")
	private WebElement skillraryDemoapp;
	
	
	@FindBy(name = "q")
	private WebElement search;
	
	@FindBy(xpath = "//input[@value = 'go']")
	private WebElement searchbtn;
	
	public SkillRaryLoginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void gearsbtn()
	{
		gears.click();
	}
	public void skillrarydemoapp()
	{
		skillraryDemoapp.click();
	}
	public void searchtb(String Coursename) 
	{
		searchbtn.sendKeys(Coursename);
	}
	public void Searchbtn()
	{
		searchbtn.click();
	}
}
