package objectrepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import utilities.baseclass;

public class followus extends baseclass {
	
	
	
	public static By facebbok = By.xpath("//span[@class = 'cb-social-fb cb-ico']");
	public static By seeall = By.xpath("//div[@class = 'rq0escxv l9j0dhe7 du4w35lb pfnyh3mw d2edcug0 hpfvmrgz nqmvxvec j83agx80 cbu4d94t taijpn5t h676nmdw']//following::span[1]");
	
	
	public static void run17() throws Exception {
		System.out.println("came to foloowus section");
		click(facebbok);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	     switchw();
	    String s =  driver.getTitle();
	    System.out.println(s);
	     Thread.sleep(1500);
	     click(seeall);
          switchw1();
         String j = driver.getTitle();
         System.out.println(j);
	}
	public static By twitter = By.xpath("//span[@class = 'cb-social-twitter cb-ico']");
    public static By search = By.xpath("//input[@class = 'r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-deolkf r-homxoj r-poiln3 r-7cikom r-1ny4l3l r-xyw6el r-y0fyvk r-1dz5y72 r-fdjqy7 r-13qz1uu']");
	public static By youtube = By.xpath("//span[@class = 'cb-social-ytbe cb-ico']");		
	public static By searchyoutube = By.xpath("//input[@id = 'search']");
	public static By searchbutton = By.xpath("//yt-icon[@class = 'style-scope ytd-searchbox']");
			
	
	
	public static void run18(String loc,String local) throws Exception {
	             Thread.sleep(1000);
				 click(twitter);
	             driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
	             switchw2();
	             Thread.sleep(2000);
	             click(search);
	             entertext(search, loc);
	             switchw1();
	             click(youtube);
	             switchw3();
	             entertext(searchyoutube, local);
	             click(searchbutton);
	             closecurrentwindow();
	             switchw2();
	             closecurrentwindow();
	             switchw();
	             closecurrentwindow();
	             switchw4();
	}
}
