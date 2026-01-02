package stepdefinitions;

import io.cucumber.java.en.*;

public class Register {
	@Given("I navigate to register account page")
	public void i_navigate_to_register_account_page() {
        System.out.println("my account Page");
	}

	@When("I enters firstname {string} into the first Name Field")
	public void i_enters_firstname_into_the_first_name_field(String string) {
		System.out.println("Enter first Name");

	}

	@And("I enters lastname {string} into the last Name Field")
	public void i_enters_lastname_into_the_last_name_field(String string) {
		System.out.println("Enter last Name");

	}

	@And("I enters emailAddres {string} into the email Address Field")
	public void i_enters_email_addres_into_the_email_address_field(String string) {

		System.out.println("Enter Email");
	}

	@And("I enters telePhone number {string} into the telephone Field")
	public void i_enters_tele_phone_number_into_the_telephone_field(String string) {

		System.out.println("Enter telePhone number");
	}

	@And("I enters  password {string} into the password Field")
	public void i_enters_password_into_the_password_field(String string) {

		System.out.println("Enter Password");
	}

	@And("I enters  confirm password {string} into the confirm password Field")
	public void i_enters_confirm_password_into_the_confirm_password_field(String string) {
		System.out.println("Enter Confirm Password");

	}

	@And("Selects Privacy Field")
	public void selects_privacy_field() {
		System.out.println("Select privacy field");

	}

	@And("Click Continue button")
	public void click_continue_button() {
		System.out.println("click Continue");

	}

	@Then("Account should Successfully created")
	public void account_should_successfully_created() {
		System.out.println("Successful Created");

	}

	@When("select Yes for Newsletter")
	public void select_yes_for_newsletter() {

		System.out.println("Enter first Name");
	}


}
