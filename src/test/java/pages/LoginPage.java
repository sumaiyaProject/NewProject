package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;

import base.Base;

public class LoginPage extends Base {
	
	In_Patient_Word IPW = new In_Patient_Word();
	By Username = By.id("username");
	By Password = By.id("password");
	By Inpatient_Ward = By.xpath(/*"//ul/li[ .='Inpatient Ward']"*/"//div[@id='content']//ul[@id='sessionLocation']//li[text()='Inpatient Ward']");
	By Isolation_Ward = By.xpath("//ul/li[ .='Isolation Ward']");
	By Laboratory = By.xpath("//ul/li[ .='Laboratory']");
	By Outpatient_Clinic = By.xpath("//ul/li[ .='Outpatient Clinic']");
	By Pharmacy = By.xpath("//ul/li[ .='Pharmacy']");
	By Registration_Desk = By.xpath("//ul/li[ .='Registration Desk']");
	By LoginBtn = By.id("loginButton");
	By LoginBtnText = By.tagName("input");
	
	
	public /*String*/void validCredetial(String u,String p) {
		driver.findElement(Username).sendKeys(u);
		driver.findElement(Password).sendKeys(p);
//		driver.findElement(Inpatient_Ward).click();
//		driver.findElement(LoginBtn).click();
//		String exp ="Logged in as Super User (admin) at Inpatient Ward.";
//		if (exp.equalsIgnoreCase(IPW.inpatientWardText())) {
//			return "PASS";
//		}
//		else {
//			return "FAIL";
//		}
				
	}//Enter Login Credential
	
	public void clickOnInpatientWard() {
		driver.findElement(Inpatient_Ward).click();
	}//Click InPatient Ward
	
	public void clickLoginBtn() {
		driver.findElement(LoginBtn).click();
//		String exp ="Logged in as Super User (admin) at Inpatient Ward.";
//		if (exp.equalsIgnoreCase(IPW.inpatientWardText())) {
//			return "PASS";
//		}
//		else {
//			return "FAIL";
//		}
	}
	
	
}
