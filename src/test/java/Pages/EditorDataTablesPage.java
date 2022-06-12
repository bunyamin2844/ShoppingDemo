package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorDataTablesPage {

    public EditorDataTablesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    /*
   @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement editorPageNewButton;

     @FindBy(xpath = "(//input[@type='text']_[1]")
     public WebElement firstNamePrompt;

     @FindBy(xpath = "//button[text()='Create']")
     public WebElement editorPageCreateButton;

    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement lastNamePrompt;

    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement positionPrompt;

    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement officePrompt;

    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement extentionPrompt;

    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement startDatePrompt;

    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement salaryPrompt;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement editorSearchBox;

     @FindBy(xpath = "(//td[@class='sorting_1'])[1]")
     public WebElement editorFirstRow;*/


 @FindBy(xpath = "//button[@class='dt-button buttons-create']")
 public WebElement newButonu;

 @FindBy(xpath="//input[@id='DTE_Field_first_name']")
 public WebElement firstNameBox;

 @FindBy(xpath="//input[@id='DTE_Field_last_name']")
 public WebElement lastNameBox;

 @FindBy(xpath="//input[@id='DTE_Field_position']")
 public WebElement possitionBox;

 @FindBy(xpath="//input[@id='DTE_Field_office']")
 public WebElement officeBox;

 @FindBy(xpath="//input[@id='DTE_Field_extn']")
 public WebElement extensionBox;

 @FindBy(xpath="//input[@id='DTE_Field_start_date']")
 public WebElement dateBox;

 @FindBy(xpath="//input[@id='DTE_Field_salary']")
 public WebElement salary;

 @FindBy(css = "[class=\"btn\"]")
 public  WebElement createButtonElement;

 @FindBy(css = "[type=\"search\"]")
 public WebElement searchBoxElement;

 @FindBy(css = "[class=\"sorting_1\"]")
 public WebElement aramasonucuElement;



}
