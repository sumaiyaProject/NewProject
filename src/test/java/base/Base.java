package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Base {
protected static WebDriver driver;
	
	public static void click(By by) {
		driver.findElement( by ).click();
		
	}
	
	public static void sendKeys(By by, String value) {
		driver.findElement( by ).sendKeys( value );
	}
	
	public static boolean isDisplayed(By by){
		//WebElement element = browser.findElement( by );
		return driver.findElement( by ).isDisplayed();
	}
	
	public static boolean isEnabled(By by){
		//WebElement element = browser.findElement( by );
		return driver.findElement( by ).isEnabled();
	}
	
	public static String getText(By by){
		return driver.findElement(by).getText();
	}

	public static void submit(By by){
		driver.findElement(by).submit();
	}
	public static void navigateURL(String url) {
		driver.get( url );
	}
	
	public static void mousehoover(By by) {
		Actions action = new Actions(driver);
		WebElement element2 = driver.findElement(by);
		action.moveToElement(element2).build().perform();
	}
}
