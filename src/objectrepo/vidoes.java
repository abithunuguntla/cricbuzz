package objectrepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import utilities.baseclass;

public class vidoes  extends baseclass{
	public static By vidoes = By.xpath("//div[@class = 'cb-subnav cb-hm-mnu-itm feature-button cursor-pointer' and @title = 'Cricket Videos']");
	public static By categories = By.xpath("//div[@class = 'cb-subnav cb-hm-mnu-itm feature-button cursor-pointer' and @title = 'Cricket Videos']//following::a[2]");
	public static By allvideos = By.xpath("//div[@class = 'cb-subnav cb-hm-mnu-itm feature-button cursor-pointer' and @title = 'Cricket Videos']//following::a[1]");
	public static By playlists = By.xpath("//div[@class = 'cb-subnav cb-hm-mnu-itm feature-button cursor-pointer' and @title = 'Cricket Videos']//following::a[3]");
	public static void run6() throws Exception {
		System.out.println("came to vidoes section");
		actios(vidoes);
		click(categories);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		actios(vidoes);
		click(allvideos);
		actios(vidoes);
		click(playlists);
		
		
	}

}
