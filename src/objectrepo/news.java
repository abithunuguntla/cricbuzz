package objectrepo;

import org.openqa.selenium.By;

import utilities.baseclass;

public class news extends baseclass {

	public static By news = By.xpath("//a[@class = 'text-white']");
	public static By cricbuzzplus = By.xpath("//a[@class = 'cb-subnav-item' and @title = 'Cricbuzz Plus Premium Articles']");
	public static By topics = By.xpath("//a[@class = 'cb-subnav-item' and @title = 'Latest Cricket Topics']");
	public static By liveblogs = By.xpath("//a[@class = 'cb-subnav-item' and @title = 'Latest Cricket Match live blogs']");
	public static By playerinterview = By.xpath("//a[@class = 'cb-subnav-item' and @title = 'Latest Cricket Player Interviews']");
	public static By statsandviews = By.xpath("//a[@class = 'cb-subnav-item' and @title = 'Latest Cricket Stats & Analysis']");
	public static By latestcricketopinions = By.xpath("//a[@class = 'cb-subnav-item' and @title = 'Latest Cricket Opinions & Editorials']");
		
	public static void run5() throws Exception{
		System.out.println("came to news section");
		actios(news);
		click(cricbuzzplus);
		Thread.sleep(1500);
		actios(news);
		click(topics);
		Thread.sleep(1500);
		actios(news);
		click(liveblogs);
		Thread.sleep(1500);
		actios(news);
		click(playerinterview);
		Thread.sleep(1500);
		actios(news);
		click(statsandviews);
		Thread.sleep(1500);
		actios(news);
		click(latestcricketopinions);	
		Thread.sleep(1300);
	}
}
