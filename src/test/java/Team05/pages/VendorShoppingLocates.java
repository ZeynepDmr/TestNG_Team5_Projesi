package Team05.pages;

import Team05.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorShoppingLocates {
    //US_19

    public VendorShoppingLocates(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[@class='login inline-type']")
    public WebElement signIn;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    // @FindBy(xpath = "(//input[@type='search'])[1]")
    // public WebElement aramaKutusu;


    @FindBy(xpath = "(//h3[@class='woocommerce-loop-product__title'])[2]")
    public WebElement urun;

    @FindBy(xpath = "//button[@name='add-to-cart']")
    public WebElement addToCart;

    // @FindBy(xpath = "//span[@class='cart-label']")
    // public WebElement Cart;

    @FindBy(xpath = "//li[@id='menu-item-1078']")
    public WebElement cart ;


    // @FindBy(xpath = "//td[@class='product-name']")
    // public WebElement sepetSonucYazısı ;






}
