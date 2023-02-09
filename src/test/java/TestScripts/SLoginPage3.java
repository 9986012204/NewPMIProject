package TestScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pompage.CoreJavaPage;
import pompage.SkillRaryLoginpage;
import pompage.TwitterPage;

public class SLoginPage3 extends BaseClass{
	
	
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		SkillRaryLoginpage sp = new SkillRaryLoginpage(driver);
		sp.searchtb(pdata.getData("Coursename"));
		sp.Searchbtn();
		
		CoreJavaPage cj = new CoreJavaPage(driver);
		cj.corejavaforselenium();
		
		TwitterPage tp = new TwitterPage(driver);
		utils.switchToFrame(driver);
		tp.playbutton();
		Thread.sleep(6000);
		tp.pausebutton();
		utils.switchBackToHome(driver);
		tp.twitterbtn();
	}

}
