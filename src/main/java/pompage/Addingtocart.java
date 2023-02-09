package pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addingtocart {
	
	@FindBy(id ="add")
	private WebElement add;
	
	@FindBy(xpath = "//a[text() = ' Add to Cart']")
	private WebElement addToCart;
	
	public Addingtocart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdd() {
		return add;
	}
	public void Addtocart()
	{
		addToCart.click();
	}

}
