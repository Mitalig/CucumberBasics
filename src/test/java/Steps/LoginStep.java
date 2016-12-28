package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by ashwin on 28/12/16.
 */
public class LoginStep {

    @Given("^I have navigated to the Login page$")
    public void i_have_navigated_to_the_Login_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("^I have clicked on Login button$")
    public void i_have_clicked_on_Login_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }


    @Then("^The user form should be displayed$")
    public void theUserFormShouldBeDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }


    @And("^I have entered username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iHaveEnteredUsernameAsAndPasswordAs(String userName, String password) throws Throwable {


    }
}
