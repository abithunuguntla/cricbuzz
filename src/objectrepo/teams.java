package objectrepo;

import org.openqa.selenium.By;


import utilities.baseclass;

public class teams extends baseclass{
	public static By clickteams = By.xpath("//div[@class = 'cb-subnav cb-hm-mnu-itm feature-button cursor-pointer']//following::a[22]");
    public static By india = By.xpath("//div[@class = 'cb-subnav cb-hm-mnu-itm feature-button cursor-pointer']//following::a[23]");
    public static By indiaschedule = By.xpath("//a[@class = 'cb-nav-tab' and @title = 'India Cricket Team Schedule' ]");
    public static By indiaresults = By.xpath("//a[@class = 'cb-nav-tab' and @title = 'India Cricket Team Results' ]"); 
	public static By indianews = By.xpath("//a[@class = 'cb-nav-tab' and @title = 'India Latest Cricket News' ]");
	public static By indiavideos = By.xpath("//a[@class = 'cb-nav-tab' and @title = 'India Videos' ]");
	public static By indiaphotos = By.xpath("//a[@class = 'cb-nav-tab' and @title = 'India Cricket Team Latest Photos']");
	public static By indiastats = By.xpath("//a[@class = 'cb-nav-tab' and @title = 'India Cricket Team Stats' ]");
	public static By indianplayer = By.xpath("//a[@class = 'cb-nav-tab' and @title = 'India Cricket Team Players' ]");
	public static By formatt = By.xpath("//div[@class = 'cb-nav-hdr cb-series-filters']//following::span[1]");
	public static By odi = By.xpath("//div[@class = 'cb-nav-hdr cb-series-filters']//following::span[1]//following::a[2]");
	public static By venues = By.xpath("//div[@class = 'cb-nav-hdr cb-series-filters']//following::span[3]");
	public static By allvenues = By.xpath("//div[@class = 'cb-nav-hdr cb-series-filters']//following::span[3]//following::a[5]");
	
		
	public static void run7() throws Exception {
    
		actios(clickteams);
		click(india);
		Thread.sleep(500);
		click(indiaschedule);
		Thread.sleep(500);
		click(indiaresults);
		Thread.sleep(500);
		click(indianews);
		Thread.sleep(300);
		click(indiavideos);
		Thread.sleep(300);
		click(indiaphotos);
		Thread.sleep(300);
		click(indiastats);
		click(indianplayer);
		click(indiaschedule);
		actios(formatt);
		click(odi);
		actios(venues);
		click(allvenues);

	    	
	}

		
		
	}

		
	
