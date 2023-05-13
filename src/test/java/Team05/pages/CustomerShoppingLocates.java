package Team05.pages;

import Team05.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerShoppingLocates {
    //US_06
    public CustomerShoppingLocates() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signInButonu;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement Customer_Username;

    @FindBy(id ="password")
    public WebElement Customer_Password;

    @FindBy(xpath ="(//*[@type='search'])[1]")// search box locate'i
    public WebElement searchBox;

    @FindBy(xpath ="//a[@href='https://hubcomfy.com/my-account-2/']")//myAccount locate'i
    public WebElement myAccount;



    @FindBy(xpath ="(//*[@class='w-icon-search'])[1]")// search buttonu locate'i
    public WebElement searchButton;

    @FindBy(xpath ="(//*[@id='main']/div/div/div/div[4]/ul/li[1]/div/div/h3/a)")// ürün locate
    public WebElement secilenUrun;

    @FindBy (xpath = "(//*[@name='add-to-cart'])")// add to cart button locate'i
    public WebElement addToCartButton;

    @FindBy (xpath ="(//*[text()='Cart'])[3]")// cart button locate'i
    public WebElement cartButton;

    @FindBy (xpath ="(//*[text()='View cart'])[1]")//view  cart button locate'i
    public WebElement viewCartButton;

    @FindBy (xpath ="//*[@class='quantity-plus w-icon-plus']")// "+" button locate'i
     public WebElement plusButton;

    @FindBy (xpath = "//*[@class='quantity-minus w-icon-minus']")// "-" button locate'i
    public WebElement minusButton;

    @FindBy (xpath = "//*[@id='coupon_code']")// enter coupon code box locate'i
    public WebElement enterCouponCode;


    @FindBy (xpath = "//*[text()='Apply coupon']")// apply coupon button locate'i
    public WebElement applyCouponButton;

    @FindBy (xpath = "//*[@class='checkout-button button alt wc-forward']")// checkout button locate'i
    public WebElement checkoutButton;

    @FindBy (xpath = "//*[text()='Billing details']")// fatura detayları locate'i
    public WebElement billingDetails;

    @FindBy (xpath = "//*[@id='payment_method_bacs']")// ödeme secenekleri 1 locate'i
    public WebElement paymentMethod1;

    @FindBy(xpath = "//*[@id='payment_method_cod']")// ödeme secenekleri 2 locate'i
    public WebElement getPaymentMethod2;

    @FindBy (xpath = "//*[@id='place_order']")// ödeme tamamlama butonu locate'i
    public WebElement placeOrderButton;












}