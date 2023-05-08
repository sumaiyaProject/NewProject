package stepdifinations;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;
import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.In_Patient_Word;
import pages.LoginPage;
import pages.LogoutPage;
import pages.Register_A_Patient;

public class medical_Patient_Record extends Base{
	
	LoginPage loginPage = new LoginPage();
	LogoutPage logoutPage = new LogoutPage();
	In_Patient_Word ipw=new In_Patient_Word();
	Register_A_Patient rp = new Register_A_Patient();
	
	@Given("I am in Login Page")
	public void i_am_in_Login_Page() {
		navigateURL("https://demo.openmrs.org/openmrs/");
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("document.body.style.zoom='50%';");
	}

	@When("I enter valid credential and click on Inpatient Ward")
	public void i_enter_valid_credential_and_click_on_Inpatient_Ward() {
		loginPage.validCredetial("Admin", "Admin123");
		System.out.println("PASS");
		loginPage.clickOnInpatientWard();
		System.out.println("PASS");
	}

	@And("click on Login button")
	public void click_on_Login_button() {
	    loginPage.clickLoginBtn();
	    System.out.println("PASS");  
	}
	
	@Then("verify Login in Inpatient Ward")
	public void verify_Login_in_Inpatient_Ward() throws InterruptedException {
//	   ipw.inpatientWardText();
//	   System.out.println("PASS");
		Thread.sleep(3000);
		String expText="Logged in as Super User (admin) at Inpatient Ward.";
		String accText=driver.findElement(By.xpath("//h4[normalize-space()='Logged in as Super User (admin) at Inpatient Ward.']")).getText();
		assertEquals(expText, accText);
		System.out.println("Assertion PASS");
	}
	
	@And("click on Logout button")
	public void click_on_Logout_button() throws InterruptedException {
	   Thread.sleep(5000);
	    driver.manage().window().fullscreen();
		logoutPage.clickLogoutBtn();
	    System.out.println("PASS");
//	    driver.close();
//	    System.out.println("Browser CLosed");
	}
	//Register a patient
	@Then("I click on Register a patient")
	public void i_click_on_Register_a_patient() throws InterruptedException {
	    Thread.sleep(3000);
		rp.click_On_Register_a_Patient();
	    System.out.println("Successfully click on Reg a Patient");
	}

	@And("verify I am in Register a patient page")
	public void verify_I_am_in_Register_a_patient_page() {
	    String actText = "Register a patient";
	    String expText=driver.findElement(By.xpath("//h2[normalize-space()='Register a patient']")).getText();
	    
	    assertEquals(expText, actText);
	    System.out.println("Successfully assert Reg a patient page");
	}

	@And("I enter Patient Demographics")
	public void i_enter_Patient_Demographics() throws IOException, InterruptedException  {
//		String excelFilePath=("C:\\Batch2021-JUNE-SDET\\JAVA\\workspace\\openMRSTest\\src\\test\\java\\TestData1\\MRS.xlsx");
		String excelFilePath=("C:\\Batch2021-JUNE-SDET\\JAVA\\workspace\\openMRSTest\\src\\test\\java\\TestData1\\Test.xlsx");
		String result =("C:\\Batch2021-JUNE-SDET\\JAVA\\workspace\\openMRSTest\\src\\test\\java\\result\\outResult.xlsx");
		FileInputStream fi=new FileInputStream(excelFilePath);
		
		
		String res=null;
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);  
		XSSFSheet ws1 = wb.getSheet("Testdata");
		
		int tsRowNum=ws1.getLastRowNum();
		System.out.println(tsRowNum);
		
		for (int i = 1; i <= tsRowNum; i++) {
			String g=ws1.getRow(i).getCell(0).getStringCellValue();
			String f=ws1.getRow(i).getCell(1).getStringCellValue();
//			driver.manage().window().fullscreen();
			
			rp.Enterpatient(g, f);
			rp.selectGender();
			rp.dateOfBirth();
			res=rp.Address1();  
			ws1.getRow(i).createCell(2).setCellValue(res);
			Thread.sleep(3000);
			driver.manage().window().fullscreen();
			Thread.sleep(10000);
//			JavascriptExecutor jse = (JavascriptExecutor)driver;
//			jse.executeScript("document.body.style.zoom='70%';");
			
			WebElement element=driver.findElement(By.xpath(/*"//ul//li[3]*/"//a[normalize-space()='Logout']"));
//			JavascriptExecutor jse = (JavascriptExecutor)driver;
//			jse.executeScript("argument[0].click();",element);
			
			WebDriverWait w=new WebDriverWait(driver, 160);
			w.until(ExpectedConditions.elementToBeClickable(By.xpath(/*"//ul//li[3]*/"//a[normalize-space()='Logout']")));
			
			logoutPage.clickLogoutBtn();
			
			
			loginPage.validCredetial("Admin", "Admin123");
			loginPage.clickOnInpatientWard();
			ipw.cliclInpatientWord();
			loginPage.clickLoginBtn();
			Thread.sleep(2000);
			rp.click_On_Register_a_Patient();	
			
		}
		FileOutputStream fo = new FileOutputStream(result);
		wb.write(fo);
		wb.close();
		
		}

//	@Then("I click on Confirm button")
//	public void i_click_on_Confirm_button() {
//	    
//	}

}
