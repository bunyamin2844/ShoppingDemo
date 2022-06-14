package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ConfigurationReader;
import utilities.Driver;



public class Hooks {
    WebDriver driver;


    @Before(order =2)
    public void navigateToHomePage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("login_url"));

    }

        @Before(order =1)

        public void setupBrowser(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }





//        @After
//        public void tearDown (Scenario scenario){
//
//            if (scenario.isFailed()) {
//                final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//
//                scenario.attach(screenshot, "image/png", "screenshots");
//            }
//
////        Driver.closeDriver();
//
//        }
    }

