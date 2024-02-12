package stepDefnitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphSteps {
	public static WebDriver driver;
	String URL = "https://dsportalapp.herokuapp.com/";

@Given("the user is logged in")
public void the_user_is_logged_in() {
	 

    throw new io.cucumber.java.PendingException();
}

@When("the user clicks the {string} button")
public void the_user_clicks_the_button(String string) {
	 
    throw new io.cucumber.java.PendingException();
}

@Then("the user should be directed to the {string} Page")
public void the_user_should_be_directed_to_the_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("the user is in the Graph page after logged in")
public void the_user_is_in_the_graph_page_after_logged_in() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the user should be redirected to a page having a tryEditor with a Run button to test")
public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("the user is in the Graph Representations page after logged in")
public void the_user_is_in_the_graph_representations_page_after_logged_in() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


}
