package stepdifinations;

import base.Base;
import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.In_Patient_Word;
import pages.LoginPage;
import pages.LogoutPage;
import pages.Register_A_Patient;

public class openMRS extends Base {
	
	LoginPage loginPage = new LoginPage();
	LogoutPage logoutPage = new LogoutPage();
	In_Patient_Word ipw=new In_Patient_Word();
	Register_A_Patient rp = new Register_A_Patient();
	
	@Given("I am in the OpenMRS landing page")
	public void i_am_in_the_OpenMRS_landing_page() {
//	    navigateURL("https://demo.openmrs.org/openmrs/");
		driver.get("https://demo.openmrs.org/openmrs/");
	}

	@Given("I enter  Login valid credential")
//	@And("I enter  Login valid credential")
	public void i_enter_Login_valid_credential() {
		loginPage.validCredetial("Admin", "Admin123");
		System.out.println("PASS");
	    
	}

//	@Given("I select Inpatient Wars")
//	public void i_select_Inpatient_Wars() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
	@And("I click on Login button")
	public void i_click_on_Login_button() {
		loginPage.clickLoginBtn();
		System.out.println("PASS");
	}

	@Then("Verify I Loged in Inpatient Ward location")
	public void verify_I_Loged_in_Inpatient_Ward_location() {
	   String expTxt = "Logged in as Super User (admin) at Inpatient Ward.";
		String actTxt=ipw.inpatientWardText();
	   assertEquals(expTxt,actTxt);
	   System.out.println(actTxt);
	   System.out.println("PASS");
	   
	}

//	@Given("I am in the In-Patient Ward page")
//	public void i_am_in_the_In_Patient_Ward_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@When("I click on Logout button")
	public void i_click_on_Logout_button() {
	    logoutPage.clickLogoutBtn();
	}

	@Then("Verify I Logged Out from Inpatient Ward location")
	public void verify_I_Logged_Out_from_Inpatient_Ward_location() {
	   logoutPage.LoginBtnText();
	}
//
//	@Then("I click on Register a Patient")
//	public void i_click_on_Register_a_Patient() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Verify Register a Patient Page")
//	public void verify_Register_a_Patient_Page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
}
