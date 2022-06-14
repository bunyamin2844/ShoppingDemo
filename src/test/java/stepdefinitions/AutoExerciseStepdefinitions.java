package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import pages.US03_AutoExercisePage;

import utilities.ConfigurationReader;
import utilities.Driver;

public class AutoExerciseStepdefinitions {
    US03_AutoExercisePage autoExercisePage;

    @Given("Navigate to url")
    public void navigateToUrl() {
        Driver.getDriver().get(ConfigurationReader.getProperty("login_url"));
    }
    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        autoExercisePage= new US03_AutoExercisePage();
        Assert.assertTrue(autoExercisePage.automationExerciseWebelement.isDisplayed());

    }
    @Then("Click on {string} button")
    public void click_on_button(String login) {
        autoExercisePage.signupLoginLinkWebelement.click();

    }
    @Then("Verify {string} is visible")
    public void verify_is_visible(String text) {
        Assert.assertTrue(autoExercisePage.loginToYourAccountWebelement.isDisplayed());

    }
    @Then("Enter incorrect email address and password")
    public void enter_incorrect_email_address_and_password() {
        Faker faker=new Faker();

      autoExercisePage.emailAddressWebelement.sendKeys(faker.internet().emailAddress());
      autoExercisePage.passwordWebelement.sendKeys(faker.internet().password());
    }
    @Then("Click {string} button")
    public void click_button(String login) {

        autoExercisePage.loginWebelement.click();
    }


    @And("Verify error {string} is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible(String errorText) {

        Assert.assertTrue(autoExercisePage.emailPasswordVisibleTextWebelement.isDisplayed());
    }



}
