package Team05.pages;

import Team05.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingUsLocates {
    //US_03_04
    public BillingUsLocates() {
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

       @FindBy(xpath = "//a[@ href='https://hubcomfy.com/my-account-2/edit-address/']")
       public WebElement addresses;


       @FindBy(xpath = "(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
       public WebElement addKutusu;

      @FindBy(xpath = "//input[@id='billing_first_name']")
      public WebElement firstName;

       @FindBy(id ="billing_last_name")
       public WebElement lastName;

       @FindBy(xpath ="//input[@name='billing_company']")
      public  WebElement companyKutusu;

       @FindBy(id ="select2-billing_country-container")
       public WebElement countrDdm;

       @FindBy(xpath ="//input[@name='billing_address_1']")
       public WebElement houseNstreetName;

       @FindBy(xpath ="//span[@tittle='Nederlands']")
       public WebElement nederlandsddm;



}

