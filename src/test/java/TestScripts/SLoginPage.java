package TestScripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pompage.Addingtocart;
import pompage.SkillRaryLoginpage;
import pompage.SkillRarydemoapp;

public class SLoginPage extends BaseClass {
	
	@Test
	public void tc1()
	{
		SkillRaryLoginpage s = new SkillRaryLoginpage(driver);
		s.gearsbtn();
		s.Searchbtn();
		
		SkillRarydemoapp sd = new SkillRarydemoapp(driver);
		utils.mouseHover(driver,sd.getCourse());
		sd.selenium();
		
		Addingtocart ad = new Addingtocart(driver);
		utils.doubleClick(driver,ad.getAdd());
		ad.Addtocart();
		utils.alertpopup(driver);
	}

}
