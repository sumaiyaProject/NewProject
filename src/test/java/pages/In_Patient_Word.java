package pages;

import org.openqa.selenium.By;

import base.Base;

public class In_Patient_Word extends Base {
	By InpatientWard = /*By.tagName("h4");*/ By.xpath("//ul[@id='sessionLocation']/li[text()='Inpatient Ward']");
	By InpatientWardText = By.xpath("//h4[normalize-space()='Logged in as Super User (admin) at Inpatient Ward.']");
	
	public void cliclInpatientWord() {
		driver.findElement(InpatientWard).click();
	}
	public String inpatientWardText() {
		String InpText=driver.findElement(InpatientWard).getText();
		String InpText1=driver.findElement(InpatientWardText).getText();
//		System.out.println(InpText);
		if (InpText1.equalsIgnoreCase("Logged in as Super User (admin) at Inpatient Ward.")) {
			System.out.println(InpText1);
			return "PASS";
		}
		else {
			return "FAIL";
		}

	}

}
