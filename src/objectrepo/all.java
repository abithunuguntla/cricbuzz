package objectrepo;

import org.openqa.selenium.By;

import utilities.baseclass;

public class all extends baseclass{
	
public static By all = By.xpath("//a[@class = 'cb-mat-mnu-itm cb-mat-mnu-all']");
public static By live = By.xpath("//a[@class = 'cb-nav-pill-2 ' and @ng-click = \"option='live'\" ]");
public static By today = By.xpath("//a[@class = 'cb-nav-pill-2 ' and @ng-click = \"option='today'\" ]");


public static void run20() {
System.out.println("came to Allus section");
	click(all);
	click(live);
	click(today);
}

}
