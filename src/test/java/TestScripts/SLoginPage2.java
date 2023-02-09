package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pompage.FaceBookPage;
import pompage.SkillRaryLoginpage;
import pompage.SkillRarydemoapp;
import pompage.TestingPage;

public class SLoginPage2 extends BaseClass{
	
	@Test
	public void tc2() throws IOException
	{
		SkillRaryLoginpage s = new SkillRaryLoginpage(driver);
		s.gearsbtn();
        s.skillrarydemoapp();

//utils.switchTabs(driver);
        SkillRarydemoapp sd = new SkillRarydemoapp(driver);
        utils.dropDown(sd.getTesting(), pdata.getData("dd"));
        
        TestingPage tp = new TestingPage(driver);
        tp.facebookicon();
        
        FaceBookPage fb = new FaceBookPage(driver);
        fb.Likebtn();
        
	}
	
	

}
