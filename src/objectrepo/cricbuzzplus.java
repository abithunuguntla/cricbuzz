package objectrepo;

import org.openqa.selenium.By;

import utilities.baseclass;

public class cricbuzzplus extends baseclass {
	public static By plus = By.xpath("//a[@class = 'cb-plus-menu-button cb-text-gray']");
	public static By videos = By.xpath("//a[@class = 'cb-nav-tab ' and @title = 'Cricbuzz Plus Videos']");
	public static By editoriols = By.xpath("//a[@class = 'cb-nav-tab ' and @title = 'Cricbuzz Plus Editorials']");
	
	public static void run12() {
		System.out.println("came to cricbuzzplus section");
		click(plus);
		click(videos);
		driver.navigate().back();
		click(editoriols);
		
	}

}
