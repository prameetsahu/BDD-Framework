package stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hooks_StepDefination {
	
	@Before
	public void launchBroser(){
		System.out.println("Launch the browser");
		System.out.println("Enter URL");
		
	}
	
	@After
	public void teardown(){
		System.out.println("Close the broser");
		
	}
	
	@Before("@First")
	public void preCond1(){
		System.out.println("Tagged hooks1");
	}
	
	@After("@Second")
	public void postCond1(){
		System.out.println("Tagged hooks2");
	}
	
	@Given("^user is on deal page$")
	public void user_is_on_deal_page() {
	    System.out.println("Click on new deal option");
	}

	@When("^user fills the deal form$")
	public void user_fills_the_deal_form() throws Throwable {
	    System.out.println("Enter all details");
	}

	@Then("^deal is created$")
	public void deal_is_created() throws Throwable {
	    System.out.println("Click on save button and add the deal");
	}

	@Then("^close the opened browwser$")
	public void close_the_opened_browwser() {
	    System.out.println("Logout from website");
	}
	
	@Given("^user is on contact page$")
	public void user_is_on_contact_page(){
		System.out.println("Click on new contact option");
	}

	@When("^user fills the contact form$")
	public void user_fills_the_contact_form(){
		System.out.println("Enter all contact details");
	}

	@Then("^contac is created$")
	public void contac_is_created() throws Throwable {
	    System.out.println("contact created");
	}
	
	


}
