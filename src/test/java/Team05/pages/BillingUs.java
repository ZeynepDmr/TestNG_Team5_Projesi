package Team05.pages;

import Team05.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BillingUs {
    public BillingUs() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
        @FindBy(xpath = "//*[text()='Sign In']")
        public WebElement signInButonu;

        @FindBy(xpath = "(//input[@type='text'])[1]")
        public WebElement userName;

        @FindBy(id ="password")
        public WebElement password;

       @FindBy(xpath ="//a[@href='https://hubcomfy.com/my-account-2/']")
       public WebElement myAccount;

}

