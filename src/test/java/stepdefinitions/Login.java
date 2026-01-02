package stepdefinitions;

import io.cucumber.java.en.*;

public class Login {
	@Given("User navigates the login Page")
	public void User_navigates_the_login_page() {
       System.out.println("Go to Login page");
	}

	@When("User enter the valid Email {string}")
	public void user_enter_the_valid_email(String emailAddress) {

		System.out.println("Entered Email Address: "+emailAddress);
	}

	@And("User enter the valid Password {string}")
	public void user_enter_the_valid_password(String pasw) {
		System.out.println("Entered Password : "+pasw);

	}

	@And("click Login Button")
	public void click_login_button() {
		System.out.println("clicked Login Button");
	}

	@Then("User should Login successfully")
	public void user_should_login_successfully() {
		System.out.println("successful Login");

	}

	@And("User should not Login successfully")
	public void user_should_not_login_successfully() {
		System.out.println(" Not successful Login");
	}

}
