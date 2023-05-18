package Team05.pages;

import Team05.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorCouponsLocates {
    //US_20_21_22

    public VendorCouponsLocates(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--wcfm-store-manager']")
    public WebElement storeManagerClick;


    @FindBy(xpath = "//div[@class='wcfm_menu_items wcfm_menu_wcfm-coupons']")
    public WebElement couponsClick;



    @FindBy(xpath = "(//span[@class='wcfmfa fa-gift'])[3]")
    public WebElement addNewClick;

    @FindBy(xpath = "//input[@id='title']")
    public WebElement codeClick;

 //   @FindBy(xpath = "//select[@id='discount_type']")
 //   public WebElement percentageDiscount;

    @FindBy(xpath = "//input[@id='coupon_amount']")
    public WebElement couponAmount;

    @FindBy(xpath = "//input[@id='expiry_date']")
    public WebElement expiryDate;

    @FindBy(xpath = "//input[@id='free_shipping']")
    public WebElement freeShipping;

    @FindBy(xpath = "//input[@id='show_on_store']")
    public WebElement showOnStore;

    @FindBy(xpath = "//input[@id='wcfm_coupon_manager_submit_button']")
    public WebElement submitClick;





































































































































































































    //Buraya kadar salih sonrası ilhan
}
