
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

    @FindBy(xpath = "//*[@id='attributes_value_1']")
    public WebElement colorBox;


    @FindBy(css = "input[id='attributes_is_active_2']")
    public WebElement size;

    @FindBy(xpath = "//*[@id='attributes_value_2']")
    public WebElement sizeBox;

    // @FindBy(css = "li[class='select2-selection__choice']")
    // public WebElement black;

    // Variations'a tıkla(zeynep)
    @FindBy(xpath = "//*[@id='wcfm_products_manage_form_variations_head']")
    public WebElement variations;

    //Any Color tıkla(zeynep)
    @FindBy(xpath = "//*[@data-name='default_attribute_pa_color']")
    public WebElement anyColor;

    // Any size tıkla(zeynep)
    @FindBy(xpath = "//*[@data-name='default_attribute_pa_size']")
    public WebElement anySize;



   // public WebElement anySize; }
    @FindBy(xpath = "//*[@id='wcfm_products_manage_form_attribute_head']")
    public WebElement attributes;

    @FindBy(xpath ="(//div[@class='thumbnail'])[3]")
    public WebElement siyahAyakkabi1;

    @FindBy(id="featured_img_display")
    public WebElement buyukProductImageEkleme;
    //   @FindBy(id = "[id='menu-item-browse']")
    //   public WebElement media;
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

    @FindBy(id = "attributes_value_1")
    public WebElement blue;

    @FindBy(xpath = "//*[@class='select2-selection__choice']")
    public WebElement sizevalue;

    @FindBy(xpath = "//*[@class='button wcfm_add_attribute_term wcfm_add_attributes_new_term']")
    public WebElement addNewColor;


    // @FindBy(xpath = "(//*[@class='button wcfm_add_attribute_term wcfm_add_attributes_new_term'])[2]")
    // public WebElement addNewSize;

    @FindBy(xpath = "(//*[@type='button'])[48]")
    public WebElement addNewSize;


    @FindBy(xpath = "(//*[@type='button'])[47]")
    public WebElement colorSelectAll;

    @FindBy(xpath = "(//*[@type='button'])[50]")
    public WebElement sizeSelectAll;

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


//buraya kadar zeynep


    @FindBy(linkText = "Store Manager")
    public WebElement storemanager;

    @FindBy(xpath = "(//h2)[1]")
    public WebElement storeManagerText;


    //DropDown
    @FindBy(xpath = "//*[@id='product_type']")
    public WebElement dropDown;

    @FindBy(xpath = "//*[@data-name='default_attribute_pa_color']")
    public WebElement dropDown2;

    @FindBy(xpath = "//*[@data-name='default_attribute_pa_size']")
    public WebElement dropDown3;



    @FindBy(xpath = "//*[text()='Select']")
    public WebElement imageSelectButton;
    @FindBy(xpath = "//input[@value='229']")
    public WebElement categoriesCheckBox;
    @FindBy(xpath = "//input[@value='417']")
    public WebElement productBrandscheckBox;
    @FindBy(xpath="//textarea[@id='product_tags']")
    public  WebElement productTags;
    @FindBy(xpath = "//select[@id='catalog_visibility']")
    public WebElement catalogvisibility;
    @FindBy(xpath = "//button[text()='Media Library']")
    public WebElement mediaLibrary;

    @FindBy(xpath = "//*[@id='wcfm_products_simple_submit_button']")
    public WebElement submit;
    @FindBy(xpath = "(//span[@title='Toggle Block'])[3]") public WebElement sizeOpenDropDown;
    @FindBy(xpath = "(//button[text()='Add New'])[2]") public WebElement addNewSizeButton;
    @FindBy(xpath ="//select[@name='default_attributes[attribute_pa_color]']") public WebElement variationsColor;
    @FindBy(xpath = "//select[@name='variations[0][attribute_pa_color]']") public WebElement variationAnyColor;
    @FindBy(id = "variations_regular_price_0") public WebElement regularPrice;
    @FindBy(id = "variations_stock_status_0") public WebElement stockStatus;
    @FindBy(id = "variations_weight_0") public WebElement weight;
    @FindBy(id="variations_length_0") public WebElement length;
    @FindBy(id="variations_width_0") public WebElement width;
    @FindBy(id="variations_height_0") public WebElement height;
    @FindBy(id="variations_tax_class_0") public WebElement tax;
    @FindBy(id="variations_description_0") public WebElement descriptionVari;


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


