package stepDefination;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class SmokeTestNew2 {

	@Given("^I login to the website$")
	public void i_login_to_the_website() {
		System.out.println("Hello");
		
	}

	@And("^I enter username and password$")
	public void i_enter_username_and_password() {
		System.out.println("Hello");
	}

	@And("^I click login$")
	public void i_click_login() {
		System.out.println("Hello");
	}

	@And("^I logout$")
	public void i_logout() {
		Assert.assertEquals(12, 12);
	}

}
