package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WamlyStepDefinition {
    @Given("^User is on Wamly login page$")
    public void verifyLoginPage() throws Throwable {
        System.out.println("Login page verified");
    }

    @When("^User enters (.+) and clicks next$")
    public void user_enters_and_clicks_next(String username) throws Throwable {
        System.out.println("Username used is: " + username);
    }

    @Then("^User Enters (.+) to login$")
    public void user_enters_to_login(String password) throws Throwable {
        System.out.println("User password is: " + password);
    }

    @Then("^User is navigated to Wamly dashboard$")
    public void user_is_navigated_to_wamly_dashboard() throws Throwable {
        System.out.println("Welcome to Wamly dashboard");
    }

    @And("^User clicks on login button$")
    public void user_clicks_on_login_button() throws Throwable {
        System.out.println("Login successful");
    }
}
