package Team05.pages;

import Team05.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorAddressLocates {
    //US_12_13

    public VendorAddressLocates() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    // SingIn
    @FindBy(xpath = "//a[.='Sign In']")
    public WebElement signIn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passWord;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement singInButton;

    @FindBy(className = "submit-status")
    public WebElement loginSuccessful;

    @FindBy(xpath = "//li[@id='menu-item-1079']")
    public WebElement myAccount;


    //Billing Address Locates
    @FindBy(xpath = "//a[.='Addresses']")
    public WebElement addresses;

    @FindBy(xpath = "(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
    public WebElement addBillingAddress;

    @FindBy(xpath = "//input[@id='billing_first_name']")
    public WebElement billingAddressFirstName;

    @FindBy(xpath = "//input[@id='billing_last_name']")
    public WebElement billingAddressLastName;

    @FindBy(xpath = "//select[@id='billing_country']")
    public WebElement billingAddressCountry;

    @FindBy(xpath = "//input[@name='billing_address_1']")
    public WebElement billingAddressAddresLine;

    @FindBy(xpath = "//select[@id='billing_state']")
    public WebElement billingAddressState;

    @FindBy(xpath = "//input[@id='billing_postcode']")
    public WebElement billingAddressPostCode;

    @FindBy(xpath = "//input[@id='billing_city']")
    public WebElement billingAddressCity;

    @FindBy(xpath = "//select[@id='billing_state']")
    public WebElement billingAddressProvince;

    @FindBy(xpath = "//input[@id='billing_phone']")
    public WebElement billingAddressPhone;

    @FindBy(xpath = "//input[@id='billing_email']")
    public WebElement billingAddressEmail;

    @FindBy(xpath = "//button[@name='save_address']")
    public WebElement billingAddressSaveAddress;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement addressSaveAlert;


    //Shipping Address Locates
    @FindBy(xpath = "(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
    public WebElement addShippingAddress;

    @FindBy(xpath = "//input[@id='shipping_first_name']")
    public WebElement shippingAddressFirstName;

    @FindBy(xpath = "//input[@id='shipping_last_name']")
    public WebElement shippingAddressLastName;

    @FindBy(xpath = "//select[@id='shipping_country']")
    public WebElement shippingAddressCountry;

    @FindBy(xpath = "//input[@name='shipping_address_1']")
    public WebElement shippingAddressAddressLine;

    @FindBy(xpath = "//input[@id='shipping_postcode']")
    public WebElement shippingAddressPostcode;

    @FindBy(xpath = "//input[@id='shipping_city']")
    public WebElement shippingAddressCity;

    @FindBy(xpath = "//select[@id='shipping_state']")
    public WebElement shippingAddressProvince;

    @FindBy(xpath = "//button[@name='save_address']")
    public WebElement shippingAddressSaveAddress;

    public void clearField(WebElement field) {
        if (!field.getAttribute("value").isEmpty()) {
            field.clear();
        }
    }


}
