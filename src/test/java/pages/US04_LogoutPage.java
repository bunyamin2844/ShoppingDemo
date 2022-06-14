package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US04_LogoutPage {
        public US04_LogoutPage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }
        @FindBy(xpath = "//img[@alt='Website for automation practice']")
        public WebElement automationExerciseImage;

        @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
        public WebElement signUpLogIn;

        @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
        public WebElement loginToYourAccountText;

        @FindBy(xpath = "//input[@data-qa='login-email']")
        public WebElement emailTextBox;

        @FindBy(xpath = "//input[@placeholder='Password']")
        public WebElement passwordTextBox;

        @FindBy(xpath = "//button[normalize-space()='Login']")
        public WebElement loginButton;

        @FindBy(xpath = "//li[9]//a[1]")
        public WebElement loggedInAs;
        @FindBy(xpath = "//*[@class='fa fa-user']")
        public WebElement loggedInAsUsername;

        @FindBy(xpath = "//a[normalize-space()='Logout']")
        public WebElement logoutButton;




    }


