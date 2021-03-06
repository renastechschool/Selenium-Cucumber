package renastech.stepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import renastech.pages.PassionTea;
import renastech.utils.BrowserUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class PassionTeaSteps extends BrowserUtils{




    @Given("The user wants to navigate to passion tea company")
    public void the_user_wants_to_navigate_to_passion_tea_company() {
        Driver.getDriver();
        driver.manage().window().maximize();
        driver.get(ConfigurationsReader.getProperties("url2"));

    }
    @When("The user wants to buy green tea")
    public void the_user_wants_to_buy_green_tea() {
        PassionTea passionTea = new PassionTea();
        passionTea.clickCheckout();
    }

    @Given("The user wants to login to practice page")
    public void the_user_wants_to_login_to_practice_page() {
        System.out.println("We are running with Hooks class");
    }

    @Then("The user should provide customer information")
    public void the_user_should_provide_customer_information(Map<String,String> dataTable) {

        PassionTea passionTea = new PassionTea();
        passionTea.setEmail(dataTable.get("Email"));
        passionTea.setName(dataTable.get("Name"));
        passionTea.setAddress(dataTable.get("Address"));


    }
    @Then("The user should provide payment information")
    public void the_user_should_provide_payment_information(List<List<String>> dataTable) {
        PassionTea passionTea = new PassionTea();
        passionTea.setCardType(dataTable.get(1).get(0));
        passionTea.setCardNumber(dataTable.get(1).get(1));
        passionTea.setHolderName(dataTable.get(1).get(2));
        passionTea.setVerifycode(dataTable.get(1).get(3));



    }
    @Then("The user wants to place order")
    public void the_user_wants_to_place_order() {

        PassionTea passionTea = new PassionTea();
        passionTea.setPlaceOrder();

    }


    @Then("The user wants to provide {string} and {string} and {string}")
    public void the_user_wants_to_provide_and_and(String email, String name, String address) {

        PassionTea passionTea = new PassionTea();
        passionTea.enterCustomerInfoForOutline(email,name,address);

    }
    @Then("The user wants to provide payment option as {string} and {string} and {string} and {string}")
    public void the_user_wants_to_provide_payment_option_as_and_and_and(String cType, String CNumber, String cName, String vCode) {

        PassionTea passionTea = new PassionTea();
        passionTea.enterPaymentInfoForOutline(cType,CNumber,cName,vCode);
    }


}
