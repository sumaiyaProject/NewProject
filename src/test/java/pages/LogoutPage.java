package pages;

import org.openqa.selenium.By;

import base.Base;

public class LogoutPage extends Base {
	By LogoutBtn = By.xpath("//a[normalize-space()='Logout']");
	
	public void  clickLogoutBtn() {
		driver.manage().window().fullscreen();
		driver.findElement(LogoutBtn).click();
		
	}
	public String LoginBtnText() {
		
		String logoutBtnText=driver.findElement(By.tagName("input")).getAttribute("value");
		String explogoutBtnText = "Log In";
	if (explogoutBtnText.equalsIgnoreCase("Log In")) {
		return "PASS";
	}	
	else {
		return "FAIL";
	}
		
	}
	
}
