package testcases;

import org.testng.annotations.Test;

import objectrepo.all;
import objectrepo.cricbuzzplus;
import objectrepo.followus;
import objectrepo.login;
import objectrepo.more;
import objectrepo.news;
import objectrepo.rankings;
import objectrepo.search;
import objectrepo.series;
import objectrepo.teams;
import objectrepo.vidoes;
import utilities.baseclass;

public class tc1  extends baseclass{
	
	
	@Test(priority = 0 )
	public void run1() throws Exception{
	openbrowser("chrome");
	openurl();
    news.run5();
	series.run6();
	Thread.sleep(500);
	teams.run7();
	vidoes.run6();
	rankings.run9();
	rankings.run10();
	more.run11();
	cricbuzzplus.run12();
	search.run13("Viratkohili");
	search.run14();
	search.run15();
	login.run16();
	followus.run17();
	followus.run18("kohli"  , "rohitsharma");
	login.run19("abi.thunuguntla@gmail.com");
	all.run20();
	quit();

	}

}
