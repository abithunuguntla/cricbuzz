package objectrepo;

import org.openqa.selenium.By;

import utilities.baseclass;

public class series extends baseclass {

	
	public static By series = By.xpath("//div[@class = 'cb-subnav cb-hm-mnu-itm feature-button cursor-pointer' and @id = 'seriesDropDown' ]");
	public static By allseries = By.xpath("//img[@title = 'Cricbuzz Logo']//following::a[25]");
	public static By domesandother = By.xpath("//a[@class = 'cb-nav-pill-1 cb-font-12 ng-binding' and @id = 'srs_category[1].dom_id']");
	public static By T2oleagues = By.xpath("//a[@class = 'cb-nav-pill-1 cb-font-12 ng-binding' and @id = 'srs_category[2].dom_id']");
	public static By Women = By.xpath("//a[@class = 'cb-nav-pill-1 cb-font-12 ng-binding' and @id = 'srs_category[3].dom_id']");
	
	
	
	
	public static void run6() throws Exception{
		System.out.println("in series icon");
		try {
			actios(series);
			click(series);		
		} catch (Exception e) {
			System.err.println("unable to comlete the actions of " + series + "and" + allseries);
		}
			
		click(allseries);
		click(domesandother);
		Thread.sleep(1200);
		click(T2oleagues);
		Thread.sleep(1200);
		click(Women);
		
		
		
	}
}
