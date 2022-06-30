package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.guruHome;
import utils.BrowserUtils;
import utils.ConfigurationsReader;
import utils.Driver;


public class steps extends BrowserUtils {

    guruHome guruHome=new guruHome();





 @Given("The user wants to see Guru demo site")
 public void the_user_wants_to_see_guru_demo_site() {
  Driver.getDriver().get(ConfigurationsReader.getProperties("demoURL"));

 }

    @When("the user wants to add a customer")
    public void the_user_wants_to_add_a_customer() {
        guruHome.setAddCustomerButton();

    }
    @Then("the user wants to verify {string} header")
    public void the_user_wants_to_verify_header(String string) {
        guruHome.setVerifyCustomerHeader(string);
    }
    @Then("The user wants to enter background check as {string}")
    public void the_user_wants_to_enter_background_check_as(String bCheck) {
        guruHome.setBackgroundCheck(bCheck);
    }
    @Then("The user wants to enter billingaddress as {string} and {string} and {string} and {string} and {string}")
    public void the_user_wants_to_enter_billingaddress_as_and_and_and_and(String fName, String lName, String email,
                                                                          String address, String pNumber) {
        guruHome.setFillingInTableInfo(fName,lName,email,address,pNumber);
    }
    @Then("The wants to verify message as {string}")
    public void the_wants_to_verify_message_as(String string) {
        guruHome.setVerifyAccessDetails(string);
    }

}