package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import pages.US03_AutoExercisePage;
import pages.US_08_Products_datail_page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_08_Product_Details {
    US_08_Products_datail_page pg = new US_08_Products_datail_page();
    Driver driver;

    @Test
//    @Given("Launch browser")
//    public void launchBrowser() {
//
//        Driver.getDriver().get(ConfigurationReader.getProperty("login_url"));
//    }
    @Given("Navigate to url {string}")
    public void navigateToUrl() {

        Driver.getDriver().get(ConfigurationReader.getProperty("login_url"));
    }

    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
    Driver.wait(5);
        Assert.assertTrue(pg.homePage.isDisplayed());
    }

    @And("Click on Products button")
    public void click_on_products_button() {
        Driver.wait(5);
        Driver.waitAndClick(pg.products_button);

    }

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        Driver.wait(5);
        Assert.assertTrue(pg.allproducts.isDisplayed());

    }

    @And("The products list is visible")
    public void the_products_list_is_visible() {

    }

    @And("Click on View ProductsPage of first product")
    public void click_on_view_product_of_first_product() {
        Driver.waitAndClick(pg.viewButton);

    }

    @Then("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
       String title =Driver.getDriver().getTitle();
       Assert.assertEquals("title","Automation Exercise - ProductsPage Details");

    }

    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {

    }



}