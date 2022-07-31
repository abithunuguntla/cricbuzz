package objectrepo;

import org.openqa.selenium.By;

import utilities.baseclass;

public class more extends baseclass {
	public static By more = By.xpath("/html/body/header/div/nav/div[6]");
	public static By worldtest = By.xpath("//a[@title = 'World Test Championship' and @class = 'cb-subnav-item']");
	public static By worldsuperleague = By.xpath("//a[@title = 'World Cup Super League' and @class = 'cb-subnav-item']");
	public static By quiz = By.xpath("//a[@title = 'Cricket Quiz' and @class = 'cb-subnav-item']");
	public static By photos = By.xpath("//a[@title = 'Photo Gallery' and @class = 'cb-subnav-item']");
	public static By apps = By.xpath("//a[@title = 'Mobile Apps' and @class = 'cb-subnav-item']");
	public static By carrer = By.xpath("//a[@title = 'Careers' and @class = 'cb-subnav-item']");
	public static By contactus = By.xpath("//a[@title = 'Contact Us' and @class = 'cb-subnav-item']");
	
	
	public static void run11() {
		System.out.println("came to more section");
		actios(more);
		click(worldtest);
		actios(more);
		click(worldsuperleague);
		actios(more);
		click(quiz);
		actios(more);
		click(photos);
		actios(more);
		click(apps);
		actios(more);
		click(carrer);
		actios(more);
		click(contactus);
	}

}
