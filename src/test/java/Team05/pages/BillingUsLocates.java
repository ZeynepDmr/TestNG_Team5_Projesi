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
    @FindBy(xpath = "//*[@id='header']/div/div/div/div/div/div[9]/div/div/a[2]/span")

    public WebElement Register_Button1;



    @FindBy(id = "reg_username")
    public WebElement User_Name_Input1;

    @FindBy(xpath = "//*[@id='reg_email']")
    public WebElement E_Mail_Input1;

    @FindBy(xpath = "//*[@id='reg_password']")
    public WebElement Password_Input1;

    @FindBy(xpath = "//*[@id='register-policy']")
    public WebElement Register_Policy_Check1;

    @FindBy(xpath ="//button[@value='Sign Up']" )
    public  WebElement SignUpKutusu;

    @FindBy(xpath ="//button[@value='Sign In']")
    public WebElement signInButonu;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//a[@href='https://hubcomfy.com/my-account-2/']")
    public WebElement myAccount;

       @FindBy(xpath = "//a[@ href='https://hubcomfy.com/my-account-2/edit-address/']")
       public WebElement addresses;


       @FindBy(xpath = "//a[@href='https://hubcomfy.com/my-account-2/edit-address/billing/']")
       public WebElement addKutusu;

      @FindBy(xpath = "//input[@id='billing_first_name']")
      public WebElement firstName;

       @FindBy(id ="billing_last_name")
       public WebElement lastName;

       @FindBy(xpath ="//input[@name='billing_company']")
      public  WebElement companyKutusu;

        @FindBy(xpath ="//*[@id='billing_country']")
        public WebElement countryDdm;


       @FindBy(xpath ="//input[@name='billing_address_1']")
       public WebElement houseNstreetName;


    //  @FindBy(xpath ="//input[@name='billing_address_1']")
     //  public WebElement houseNumStrName;

      @FindBy(xpath ="//input[@name='billing_address_2']")
      public WebElement apartmanNo;

      @FindBy(xpath ="//input[@id='billing_city']")
      public WebElement townCity;


      @FindBy(xpath ="//input[@id='billing_postcode']")
      public WebElement zipCodeKutus;

      @FindBy(xpath ="//input[@id='billing_phone']")
      public WebElement phoneKutusu;

      @FindBy(xpath ="(//input[@type='email'])[1]")
      public WebElement emailAssert;

      @FindBy(xpath ="//button[@value='Save address']")
      public WebElement saveAdressKtusu;

      @FindBy(xpath ="(//a[@href='https://hubcomfy.com/my-account-2/'])[1]")
      public WebElement shippingAccount;

      @FindBy(xpath ="(//table[@class='address-table'])[1]")
      public  WebElement billingscontains;

      @FindBy(xpath ="//a[@href='https://hubcomfy.com/my-account-2/edit-address/shipping/']")
      public WebElement shippingBillAddKutusu;

     @FindBy(xpath ="//a[@href='https://hubcomfy.com/my-account-2/edit-address/billing/']")
     public WebElement addShippingKutusu;

     @FindBy(id ="shipping_first_name")
     public WebElement shipFirstName;

     @FindBy(id ="shipping_last_name")
     public WebElement shipLastName;

     @FindBy(xpath ="//input[@id='shipping_company']")
     public WebElement shipCompanyName;

     @FindBy(xpath ="//select[@id='shipping_country']")
     public WebElement shipCountryDdm;

     @FindBy(id ="shipping_address_1")
     public WebElement shipAdress;

     @FindBy(id="shipping_address_2")
    public WebElement shipApatmanKutusu;

     @FindBy(xpath = "//input[@id='shipping_postcode']")
     public WebElement shipPostcode1;

     @FindBy(id ="shipping_city")
     public WebElement shipTownCity;

     @FindBy(xpath ="//button[@name='save_address']")
    public  WebElement shipSaveAdress;



    //  @FindBy(className = "btn btn-dark btn-rounded btn-sm")
  //   public WebElement shipSavebutonu;



}

