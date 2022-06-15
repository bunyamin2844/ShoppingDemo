package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ProductionPage;
import utilities.ConfigurationReader;
import utilities.Driver;



public class Hooks {
    WebDriver driver;
    ProductionPage autoExercisePage;
    @Before()
    public void commonSteps(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Driver.getDriver().get(ConfigurationReader.getProperty("login_url"));
        autoExercisePage= new ProductionPage();
        Assert.assertTrue(autoExercisePage.automationExerciseWebelement.isDisplayed());
    }
        @After
        public void tearDown (Scenario scenario){

            if (scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

                scenario.attach(screenshot, "image/png", "screenshots");
            }

//        Driver.closeDriver();

        }
    }

