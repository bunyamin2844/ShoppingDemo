package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_08_Products_datail_page;
import utilities.ConfigReader;
import utilities.Driver;

public class US_08_Product_Details {
    US_08_Products_datail_page pg = new US_08_Products_datail_page();




    @When("Navigate to url {string}.")
    public void navigateToUrl(String url) {
        Driver.getDriver().get(url);
    }

    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
    }

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {

    }
    @And("Click on Products button")
    public void clickOnProductsButton() {
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