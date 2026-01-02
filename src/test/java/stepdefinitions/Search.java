package stepdefinitions;

import io.cucumber.java.en.*;

public class Search {
	@Given("User Open the Application")
	public void user_open_the_application() {

       System.out.println("opened Application");
	}

	@When("User enters the valid product into the search field")
	public void user_enters_the_valid_product_into_the_search_field() {
		System.out.println("entered valid Product");
	}

	@When("User clicks on Search button")
	public void user_clicks_on_search_button() {
		System.out.println("clicked search button");
	}

	@Then("valid Product should get displayed in search field")
	public void valid_product_should_get_displayed_in_search_field() {
	    System.out.println("valid Product displayed");
	}

	@When("User enters the non-existing product into the search field")
	public void user_enters_the_non_existing_product_into_the_search_field() {
		System.out.println("entered invalid Product");
	}

	@Then("Proper text informimg the User about no product matching should displayed")
	public void proper_text_informimg_the_user_about_no_product_matching_should_displayed() {
		System.out.println(" invalid Product not displayed");
	}

	@When("User dont enter any product into the search field")
	public void user_dont_enter_any_product_into_the_search_field() {
		System.out.println(" enter Product in search field");
	}

}
