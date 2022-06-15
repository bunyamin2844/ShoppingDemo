package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;

public class US10_HomePageSubscriptionStepDefs {

    HomePage pg=new HomePage();
    Faker faker=new Faker();

//    @Given("Launch browser")
//    public void launch_browser() {
//
//    }
//
//    @When("Navigate to url {string}")
//    public void navigate_to_url(String string) {
//
//    }
//    @Then("Verify that home page is visible successfully")
//    public void verify_that_home_page_is_visible_successfully() {
//
//    }
    @When("Scroll down to footer")
    public void scroll_down_to_footer() {
        Driver.scrollIntoViewJS(pg.SubscriptionText);

    }
    @Then("Verify text {string}")
    public void verify_text(String string) {
        Assert.assertTrue(pg.SubscriptionText.isDisplayed());

    }
    @When("Enter email address in input and click arrow button")
    public void enter_email_address_in_input_and_click_arrow_button() {

    }
    @Then("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String string) {

    }
}
