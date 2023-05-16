
package Team05.pages;

import Team05.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorAddProductLocates {

    //US_14_18
    public VendorAddProductLocates() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //AddNew locator(zeynep)
    @FindBy(xpath = "(//*[text()='Add New'])[1]")
    public WebElement addNew;

    //Virtual tıklama(zeynep)
    @FindBy(xpath = "//*[@id='is_virtual']")
    public WebElement virtual;

    //is_downloadable tıklama(zeynep)
    @FindBy(xpath = "//*[@id='is_downloadable']")
    public WebElement is_downloadable;

    //price kutucugu (zeynep)
    @FindBy(xpath = "//*[@id='regular_price']")
    public WebElement price;

    //sale price kutucugu(zeynep)
    @FindBy(xpath = "//*[@id='sale_price']")
    public WebElement salePrice;



    //color secimi(zeynep)
    @FindBy(css = "input[id='attributes_is_active_1']")
    public WebElement color;

    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[2]")
    public WebElement colorBox;


    @FindBy(css = "input[id='attributes_is_active_2']")
    public WebElement size;

    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[2]")
    public WebElement sizeBox;



    // Variations'a tıkla(zeynep)
    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[6]")
    public WebElement variations;

    //Any Color tıkla(zeynep)
    @FindBy(xpath = "//*[@data-name='default_attribute_pa_color']")
    public WebElement anyColor;

    // Any size tıkla(zeynep)
    @FindBy(xpath = "//*[@data-name='default_attribute_pa_size']")
    public WebElement anySize;


    @FindBy(xpath = "//*[@id='wcfm_products_manage_form_attribute_head']")
    public WebElement attributes;

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement login;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "(//*[text()='Sign In'])[2]")
    public WebElement signin;



    @FindBy(linkText = "My Account")
    public static WebElement myAccount;

    @FindBy(linkText = "Store Manager")
    public static WebElement storeManager;


    @FindBy(xpath = "//*[@class='wcfm_menu_items wcfm_menu_wcfm-products']")
    public WebElement products;

    @FindBy(xpath = "//*[@id='product_type']")
    public WebElement simpleProduct;

    @FindBy(css = "input[id='pro_title']")
    public WebElement productTitle;


    @FindBy(css = "input[id='wcfm_products_simple_draft_button']")
    public WebElement draft;


    //variableProduct secimi(zeynep)
    @FindBy(xpath = "//*[@id='product_type']")
    public static WebElement variableProduct;


    @FindBy(xpath = "//img[@id='featured_img_display']")
    public WebElement imageBuyuk;



    @FindBy(xpath = "(//input[@*='submit'])[3]")
    public WebElement submitButton;

    @FindBy(xpath = "//input[@value='View']")
    public WebElement viewButton;

    @FindBy(xpath = "(//img[@*='presentation'])[1]")
    public WebElement productLastImage;

    @FindBy(linkText = "Store Manager")
    public WebElement storemanager;

    @FindBy(xpath = "(//h2)[1]")
    public WebElement storeManagerText;


    //DropDown
    @FindBy(xpath = "//*[@id='product_type']")
    public WebElement dropDown;
}



//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////Buraya kadar Tuba
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////buraya kadar zeynep


