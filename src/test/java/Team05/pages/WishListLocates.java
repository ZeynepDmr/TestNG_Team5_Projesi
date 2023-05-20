package Team05.pages;
import Team05.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WishListLocates {
    public WishListLocates() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //US_08

    @FindBy(xpath = "//div[@class='yith-wcwl-add-to-wishlist add-to-wishlist-18752  btn-product-icon wishlist-fragment on-first-load']//a[1]")
    public WebElement wishListIsareti1;

    @FindBy(xpath = "//div[@class='yith-wcwl-add-to-wishlist add-to-wishlist-19218  btn-product-icon wishlist-fragment on-first-load']//a[1]")
    public WebElement wishListIsareti2;

    @FindBy(xpath = "//div[@class='yith-wcwl-add-to-wishlist add-to-wishlist-19221  btn-product-icon wishlist-fragment on-first-load']//a[1]")
    public WebElement wishListIsareti3;

    @FindBy(xpath = "//div[@class='yith-wcwl-add-to-wishlist add-to-wishlist-25232  btn-product-icon wishlist-fragment on-first-load']//a[1]")
    public WebElement wishListIsareti4;

    @FindBy(xpath = "//div[@class='yith-wcwl-add-to-wishlist add-to-wishlist-19329  btn-product-icon wishlist-fragment on-first-load']//a[1]")
    public WebElement wishListIsareti5;

    @FindBy(xpath = "//*[@class='wishlist block-type']")
    public WebElement wishListSayfasi;

    @FindBy(xpath = "(//input[@type='search'])[1]")
    public WebElement searchButton;

    @FindBy(xpath = "(//a[text()='Xiaomi Phone -4'])[1]")
    public WebElement urun1;

    @FindBy(xpath = "(//a[text()='Xiaomi Phone -4'])[2]")
    public WebElement urun2;

    @FindBy(xpath = "//*[text()='Product']")
    public WebElement productYazisi;

    @FindBy(xpath = "//*[text()='Quick View']")
    public WebElement quickViewButonu;

    @FindBy(xpath = "//button[@value='16275']")//wishlist'te quickview sayfasi acilinca cikan "addtocard"
    public WebElement addToCard;

    @FindBy(xpath = "//h2")
    public WebElement baslik;//quickview aclinca cikan baslik

    @FindBy(xpath = "//button[@type='button']")//quickview sayfasini kapatmak icin
    public WebElement kapat;

    @FindBy(xpath = "//*[@class='wishlist-in-stock']")//stock yazisi
    public WebElement stockYazisi;

    @FindBy(xpath = "//*[@class='woocommerce-Price-currencySymbol']")//stock yazisi
    public WebElement priceYazisi;

    @FindBy(xpath = "//a[@data-product_id='19218']")
    public WebElement addToCard1;

    @FindBy(xpath = "(//a[text()='Add to cart'])[1]")
    public WebElement addToCard2;

    @FindBy(xpath = "//*[@class='cart-label']")
    public WebElement cardTusu;

    @FindBy(xpath = "//a[@class='button checkout wc-forward']")
    public WebElement checkout;

    @FindBy(xpath = "//input[@name='billing_first_name'] ")
    public WebElement name;

    @FindBy(xpath = "//a[@data-product_id='16275']")
    public WebElement addToCard3;

    @FindBy(xpath = "//button[@name='add-to-cart']")
    public WebElement add;

    @FindBy(xpath = "//a[@class='button checkout wc-forward']")
    public WebElement add2;

    @FindBy(xpath = "//*[@id='select2-billing_country-container']")
    public WebElement ddm;

    @FindBy(xpath = "//input[@id='billing_address_1']")
    public WebElement adress;

    @FindBy(xpath = "//input[@name='billing_postcode']")
    public WebElement zipCode;

    @FindBy(xpath = "//li[@class='wc_payment_method payment_method_cod']")
    public WebElement payAtTheDoor;

    @FindBy(xpath = "//button[@id='place_order']")
    public  WebElement placeOrder;

    //span[text()='Create an account?']
    @FindBy(xpath = "//span[text()='Create an account?']")
    public WebElement createAccount;

    @FindBy(xpath = "//input[@id='account_username']")
    public WebElement user;

    @FindBy(xpath = "//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
    public WebElement siparisinizKaydoldu;

}



