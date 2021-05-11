package renastech.stepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import renastech.pages.Guru99Page;

public class Guru99Login {

    private static final Logger logger = Logger.getLogger(Guru99Login.class);

    @Given("The user wants to go to guru99")
    public void the_user_wants_to_go_to_guru99() {

       logger.info("======Login to Guru99======");
    }
    @When("The user wants to enter username as {string} and password as {string}")
    public void the_user_wants_to_enter_username_as_and_password_as(String username, String password) {

        Guru99Page guru99Page = new Guru99Page();
        logger.debug("Setting username");
        guru99Page.setUsernameBox(username);
        logger.error("Setting password");
        guru99Page.setPassword(password);

    }
    @Then("The user wants to login to guru")
    public void the_user_wants_to_login_to_guru() {

        Guru99Page guru99Page = new Guru99Page();
        guru99Page.setSbtBtn();
        logger.info("Clicked the login button");

    }
    @Then("The user should be able to verify message as {string}")
    public void the_user_should_be_able_to_verify_message_as(String message) {

        Guru99Page guru99Page = new Guru99Page();
        guru99Page.switchToAlert(message);


    }

}
