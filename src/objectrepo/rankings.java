package objectrepo;

import org.openqa.selenium.By;

import utilities.baseclass;

public class rankings extends baseclass{
	public static By rankings = By.xpath("//div[@class = 'cb-subnav cb-hm-mnu-itm feature-button cursor-pointer' and @title = 'ICC Rankings']");
    public static By womenrankings = By.xpath("//div[@class = 'cb-subnav cb-hm-mnu-itm feature-button cursor-pointer' and @title = 'ICC Rankings']//following::a[2]");
	public static By menrankings = By.xpath("//div[@class = 'cb-subnav cb-hm-mnu-itm feature-button cursor-pointer' and @title = 'ICC Rankings']//following::a[1]");
	public static By mensbowler = By.xpath("//a[@class = 'cb-nav-tab cb-ranking-nav' and @title = 'Bowler Rankings']");
	public static By mensallrounders = By.xpath("//a[@class = 'cb-nav-tab cb-ranking-nav' and @title = 'All Rounder Rankings']");
	public static By mensteamrankings = By.xpath("//a[@class = 'cb-nav-tab cb-ranking-nav' and @title = 'Team Rankings']");
	public static void run9() throws Exception {
		System.out.println("came to ranking section");
		actios(rankings);
		click(womenrankings);
		Thread.sleep(300);
		actios(rankings);
		click(menrankings);
		click(mensbowler);
		click(mensallrounders);
		click(mensteamrankings);
	}
	
	
	public static By womenbowlers = By.xpath("//a[@class = 'cb-nav-tab cb-ranking-nav' and @title = 'Bowler Rankings']");
	public static By womenallrounders = By.xpath("//a[@class = 'cb-nav-tab cb-ranking-nav' and @title = 'All Rounder Rankings']");
	public static By womenteamrankings = By.xpath("//a[@class = 'cb-nav-tab cb-ranking-nav' and @title = 'Team Rankings']");
	
	public static void run10() {
		actios(rankings);
		click(womenrankings);
		click(womenbowlers);
		click(womenallrounders);
		click(womenteamrankings);
		
		
	}
}
