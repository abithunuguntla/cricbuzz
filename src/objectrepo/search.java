package objectrepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import utilities.baseclass;

public class search extends baseclass{
	public static By search = By.xpath("//span[@class ='cb-ico cb-search-input-icon cb-search-input-icon-nav']");
	public static By clickonsearchspace = By.xpath("//input[@type = 'text']");
	public static By searc = By.xpath("//a[@class ='text-white cb-srch-bttn cb-srch-high-zIndex']");
	
	public static void run13(String locvalue) throws Exception {
		System.out.println("came to search section");
		click(search);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		click(clickonsearchspace);
		entertext(clickonsearchspace, locvalue);
		click(searc);
		}
public static By selectedresultsearch = By.xpath("//span[@class = 'ng-binding' and @ng-bind = 'result.title']");
public static By fullprofile = By.xpath("//a[@class = 'cb-text-link ']");


public static void run14() throws Exception {
	click(selectedresultsearch);
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	click(fullprofile);
}

public static By kohliTestdebut = By.xpath("//div[@class = 'cb-col cb-col-84 cb-ftr-lst']//following::a[1]");
public static By Highlights = By.xpath("//a[@class = 'cb-nav-tab ' and @title = 'West Indies vs India, 1st Test Highlights']");
public static By FullCommentry = By.xpath("//a[@class = 'cb-nav-tab ' and @title = 'West Indies vs India, 1st Test Full Commentary']");
public static By liveblog = By.xpath("//a[@class = 'cb-nav-tab ' and @title = 'West Indies vs India, 1st Test Live Blog']");
public static By facts = By.xpath("//a[@class = 'cb-nav-tab ' and @title = 'West Indies vs India, 1st Test Match Facts']");
public static By news = By.xpath("//a[@class = 'cb-nav-tab ' and @title ='West Indies vs India, 1st Test News']");
public static By photos = By.xpath("//a[@class = 'cb-nav-tab ' and @title ='West Indies vs India, 1st Test Photos']");





public static void run15() throws Exception {
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	click(kohliTestdebut);
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	click(Highlights);
	click(FullCommentry);
	click(liveblog);
	click(facts);
	click(news);
	click(photos);
}
}
