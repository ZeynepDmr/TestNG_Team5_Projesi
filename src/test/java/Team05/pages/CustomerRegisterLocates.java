package Team05.pages;

import Team05.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerRegisterLocates {
    //US_01_02

    public CustomerRegisterLocates() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='header']/div/div/div/div/div/div[9]/div/div/a[2]/span")
    public WebElement Register_Button;

    @FindBy(xpath = "//*[@id='reg_username']")
    public WebElement User_Name_Input;

    @FindBy(xpath = "//*[@id='reg_email']")
    public WebElement E_Mail_Input;

    @FindBy(xpath = "//*[@id='reg_password']")
    public WebElement Password_Input;

    @FindBy(xpath = "//*[@id='register-policy']")
    public WebElement Register_Policy_Check;



}
