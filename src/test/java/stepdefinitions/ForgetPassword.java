package stepdefinitions;

import io.cucumber.java.en.*;

public class ForgetPassword {
	@When("User clicks on MyAccount")
	public void user_clicks_on_my_account() {

     System.out.println("opened Application");
	}

	@When("Select the login Option")
	public void select_the_login_option() {
		 System.out.println("select login button");
	}

	@When("Clicks on forgotten Password option")
	public void clicks_on_forgotten_password_option() {
		 System.out.println("select forget option button");
	}

	@When("Enters valid Email Address")
	public void enters_valid_email_address() {
		 System.out.println("Enter valid Email");
	}

	@When("Click on Continue button")
	public void click_on_continue_button() {
		 System.out.println("click continue button");
	}

	@Then("Proper Confirmation message should be displayed")
	public void proper_confirmation_message_should_be_displayed() {
		 System.out.println("message displayed");
	}

}
