package pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.Base;

public class Register_A_Patient extends Base {
	LogoutPage logoutPage = new LogoutPage();
	By Register_A_Patient = By.xpath("//a[normalize-space()='Register a patient']");
	By GivenName = By.name("givenName");
	By FamilyName = By.name("familyName");
	By NextButton = By.id("next-button");
	By Gender = By.xpath("//select[@id='gender-field']");
	By Day = By.name("birthdateDay");
	By Month = By.name("birthdateMonth");
	By Year = By.name("birthdateYear");
	By Address1 = By.id("address1");
	By City = By.id("cityVillage");
	By PhoneNumber = By.name("phoneNumber");
	By Confirm = By.id("submit");
	
	public void click_On_Register_a_Patient() {
		driver.findElement(Register_A_Patient).click();
	}
	public /*String*/ void Enterpatient(String /*gName*/g,String /*fName*/f) throws InterruptedException {
//		driver.manage().window().fullscreen(); 
		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("document.body.style.zoom='50%';");

		driver.findElement(GivenName).sendKeys(/*gName*/g);
		Thread.sleep(2000);
		driver.findElement(FamilyName).sendKeys(/*fName*/f);
		driver.findElement(NextButton).click();
//		return "PASS";
	}
	
	public void selectGender() {
//		driver.manage().window().fullscreen(); 
		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("document.body.style.zoom='50%';");
		WebElement gender=driver.findElement(Gender);
		
		Select g=new Select(gender);
		List<WebElement>x=g.getOptions();
		System.out.println(x.size());
		g.selectByValue("M");
		driver.findElement(By.xpath("//button[@id='next-button']")).click();		
	}
	
	public void dateOfBirth() throws InterruptedException {
//		driver.manage().window().fullscreen(); 
		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("document.body.style.zoom='50%';");
		
		driver.findElement(Day).sendKeys("7");
		Thread.sleep(2000);
		WebElement mn=driver.findElement(Month);
		Select s=new Select(mn);
		s.selectByValue("7");
		Thread.sleep(4000);
		driver.findElement(Year).sendKeys("1980");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='next-button']")).click();
	}
	
	public String Address1() throws InterruptedException { //
//		driver.manage().window().fullscreen(); 
		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("document.body.style.zoom='50%';");
		driver.findElement(Address1).sendKeys("A1,Road,Ctg");
		driver.findElement(City).sendKeys("Chittagong");
		driver.findElement(By.xpath("//button[@id='next-button']")).click();
		Thread.sleep(5000);
		driver.findElement(PhoneNumber).sendKeys("231615604");
		driver.findElement(By.xpath("//button[@id='next-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='next-button']")).click();
		Thread.sleep(3000);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@id='next-button']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@id='next-button']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@id='next-button']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@id='next-button']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@id='next-button']")).click();
//		Thread.sleep(3000);
		driver.findElement(Confirm).click();
		Thread.sleep(10000);
		String expTxt="Family Name";
		String actText =driver.findElement(By.xpath("//h1//span[2]//em[text()='Family Name']")).getText();
		if (actText.equalsIgnoreCase(expTxt)) {
			return "Registered";
		}
		else {
			return "Not Reg";
		}
//		driver.manage().window().fullscreen();
		
//		jse = (JavascriptExecutor)driver;
//		jse.executeScript("document.body.style.zoom='50%';");
//		Thread.sleep(30000);
//		logoutPage.clickLogoutBtn();
	}

}
