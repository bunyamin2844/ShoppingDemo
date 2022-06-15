package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class US_08_Products_datailPage {

    public US_08_Products_datailPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='header']/div/div/div/div[1]/div/a/img")
    public WebElement homePage;

    @FindBy(xpath = "//*[contains(text(),'Products')]")
    public WebElement products_button;

    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    public WebElement automationExerciseWebelement;

    @FindBy(xpath = "(//*[@style='color: brown;'])[1]")
    public WebElement viewButton;
    @FindBy(xpath = "//*[@id='sale_image']")
    public WebElement allproducts;


}
