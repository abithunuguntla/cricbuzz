package utilities;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class baseclass {

	public static WebDriver driver; 
	
	public static void openbrowser(String browsername) {
		try {
			if(browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver103.exe");
				driver = new ChromeDriver();
				System.out.println("opening chrome browser");
			}
			else if (browsername.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", ".\\lib\\geckodriver.exe");
				driver = new FirefoxDriver();
				System.out.println("opening firefox browser");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("unable to open browser");
			
		}
		
	}
	
	public static void openurl () {
		try {
			driver.get("https://www.cricbuzz.com/");
			System.out.println("opening cricbuzz");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
		} catch (Exception e) {
			System.out.print("unable to open the url ");
		}
		
	}
	public static void click(By locvalue) {
		try {
			driver.findElement(locvalue).click();
			System.out.println("clicking on " + locvalue);
		} catch (Exception e) {
			System.out.println("unable to click " + locvalue);
		}
	}
	
	public static void actios(By locvalue) {
	try {
		WebElement actions =	driver.findElement(locvalue);
		Actions act = new Actions(driver);
		act.moveToElement(actions).build().perform();
		System.out.println("moving to element" + locvalue);
	} catch (Exception e) {
		System.out.println("unablemove to element" + locvalue);
	}
		
	}
	public static void navigaeback() {
		try {
			driver.navigate().back();
			System.out.println("navigated to back ");
		} catch (Exception e) {
			System.out.println("unable to navigate to back");
		}
	}
	public static void entertext(By data , String lolvalue) {
		try {
			driver.findElement(data).clear();
			driver.findElement(data).sendKeys(lolvalue);
			System.out.println("entering the text " + lolvalue);
		} catch (Exception e) {
			System.out.println("unable to enter" + lolvalue);
		}
	}
	public static void switchw() {
		try {
			Set<String>awn = driver.getWindowHandles();
			String w1 = (String)awn.toArray()[0];
			String w2 = (String)awn.toArray()[1];
			driver.switchTo().window(w2);
			System.out.println("switched to window" + w2);
		} catch (Exception e) {
			System.out.println("unable to swith to window");
		}
	}
		public static void switchw1() {
			try {
				Set<String>awn = driver.getWindowHandles();
				String w1 = (String)awn.toArray()[0];
				String w2 = (String)awn.toArray()[1];
				driver.switchTo().window(w1);
				System.out.println("switched to window" + w1);
			} catch (Exception e) {
				System.out.println("unable to swith to window");
	}
		}
		public static void switchw2() {
			try {
				Set<String>awn = driver.getWindowHandles();
				String w1 = (String)awn.toArray()[0];
				String w2 = (String)awn.toArray()[1];
				String w3 = (String)awn.toArray()[2];
				driver.switchTo().window(w3);
				System.out.println("switched to window" + w3);
			} catch (Exception e) {
				System.out.println("unable to swith to window");
	}
		}
		public static void switchw3() {
			try {
				Set<String>awn = driver.getWindowHandles();
				String w1 = (String)awn.toArray()[0];
				String w2 = (String)awn.toArray()[1];
				String w3 = (String)awn.toArray()[2];
				String w4 = (String)awn.toArray()[3];
				driver.switchTo().window(w4);
				System.out.println("switched to window" + w3);
			} catch (Exception e) {
				System.out.println("unable to swith to window");
	}
		}
		public static void switchw4() {
			try {
				Set<String>awn = driver.getWindowHandles();
				String w1 = (String)awn.toArray()[0];
				driver.switchTo().window(w1);
				System.out.println("switched to window" + w1);
			} catch (Exception e) {
				System.out.println("unable to swith to window");
	}
		}
	public static void closecurrentwindow() {
		driver.close();
		System.out.println("closing the current window");
	}
	public static void quit() {
		try {
			driver.quit();
			System.out.println("driver quited");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("unable to quit driver");
		}
	}
	public static void selectclass(By locval , String data) {
		try {
			new Select(driver.findElement(locval)).selectByVisibleText(data);
			System.out.println("slected the "+ locval);
		} catch (Exception e) {
			System.out.println("Unable to select");
		}
	}
	}
