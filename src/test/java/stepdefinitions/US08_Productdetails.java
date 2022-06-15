package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US08_Productdetails {

    US08_Productdetails page =new US08_Productdetails();


    @Test
    @Given("Launch browser")
    public void launch_browser() {

    }
    @When("Navigate to url {string}")
    public void navigate_to_url(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("login_url"));

    }
    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {


    }
    @Then("Click on Products button")
    public void click_on_products_button() {




    }
    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {

    }
    @Then("The products list is visible")
    public void the_products_list_is_visible() {

    }
    @Then("Click on View Product of first product")
    public void click_on_view_product_of_first_product() {

    }
    @Then("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {

    }
    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {

    }



}