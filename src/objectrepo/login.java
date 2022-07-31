package objectrepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import utilities.baseclass;

public class login extends baseclass{
	public static By login = By.xpath("//span[@class ='cb-plus-ico cb-user-icon']");
    public static By scrollnext = By.xpath("//img[@class ='cb-view-all-ga']");
	public static By home = By.xpath("//img[@id ='cb-logo-main-menu' and @title = 'Cricbuzz Logo' and @itemprop = 'image' and @style = 'bottom: 4px; position: relative; vertical-align:middle;']");
	
	public static void run16() {
		System.out.println("came to login section");
		click(login);
		driver.navigate().back();
		click(home);
		click(scrollnext);
	}	
	
	public static By email = By.xpath("//input[@type = 'email']");
		public static void run19(String loc) {
			
	click(login);
	entertext(email, loc);
	driver.navigate().back();
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		}

		
		
	}

