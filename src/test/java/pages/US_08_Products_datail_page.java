package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_08_Products_datail_page {
    public  US_08_Products_datail_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='header']/div/div/div/div[2]/div/ul/li[1]/a/text()")
    public WebElement homePage;

    @FindBy(xpath = "//*[@id='header']/div/div/div/div[2]/div/ul/li[2]/a/text()")
    public WebElement products_button;

}
