package genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {

	public void dropDown(WebElement ele, String text)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public void mouseHover(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public void doubleClick(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
		
	}
	
	public void switchToFrame(WebDriver driver)
	{
		driver.switchTo().frame(0);
	}
	
	public void switchBackToHome(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	public void switchTabs(WebDriver driver)
	{
		Set<String> child = driver.getWindowHandles();
		for(String d:child)
		{
			driver.switchTo().window(d);
		}
	}
	
	public void scrollBar(WebDriver driver, String X,String Y)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+X+","+Y+")");
	}
	
	public void alertpopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
}
