package Team05.pages;

import Team05.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountDetailsLocates {

    //US_05

    public AccountDetailsLocates() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//i[@class='w-icon-account']")
    public WebElement signInButonu;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement Customer_Username;

    @FindBy(id ="password")
    public WebElement Customer_Password;

    @FindBy(css = "#menu-item-1079 > a")
    public WebElement myAccount;

    @FindBy(xpath = "(//*[text()='Account details'])[2]")
    public WebElement accountDetails;

    @FindBy(xpath = "//*[@class='icon-box-title text-normal']")
    public WebElement accountDetailsPage;


    @FindBy(xpath ="//*[@id=\"account_first_name\"]")
    public WebElement firstName;

    @FindBy(xpath ="//*[@id=\"account_last_name\"]")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id=\"account_display_name\"]")
    public WebElement displayName;


    @FindBy(xpath = "//*[@id=\"account_email\"]")
    public WebElement email;

   @FindBy(xpath = "//*[@id='user_description_ifr']")
    public WebElement biography;

   @FindBy(css= "#tinymce > p > br")
   public WebElement biographyText;

    @FindBy(xpath = "//*[@id=\"password_current\"]")
    public WebElement oldPasword;

    @FindBy(xpath = "//*[@id=\"password_1\"]")
    public WebElement newPasword1;

    @FindBy(xpath = "//*[@id=\"password_2\"]")
    public WebElement newPasword2;

    @FindBy(xpath = "//*[text()='Save changes']")
    public WebElement saveChangesButton;






}
