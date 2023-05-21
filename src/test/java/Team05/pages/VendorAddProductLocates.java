
//
//package Team05.pages;
//
//import Team05.utilities.Driver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class VendorAddProductLocates {}
//    //US_14_18
//  // public VendorAddProductLocates() {
////        PageFactory.initElements(Driver.getDriver(), this);
//
//
//
//
//
////    }
///*
//
//
//    }
//
//
//
//
//    //AddNew locator(zeynep)
//    @FindBy(xpath = "(//*[text()='Add New'])[1]")
//    public WebElement addNew;
//
//    //Virtual tıklama(zeynep)
//    @FindBy(xpath = "//*[@id='is_virtual']")
//    public WebElement virtual;
//
//    //is_downloadable tıklama(zeynep)
//    @FindBy(xpath = "//*[@id='is_downloadable']")
//    public WebElement is_downloadable;
//
//    //price kutucugu (zeynep)
//    @FindBy(xpath = "//*[@id='regular_price']")
//    public WebElement price;
//
//    //sale price kutucugu(zeynep)
//    @FindBy(xpath = "//*[@id='sale_price']")
//    public WebElement salePrice;
//
//    //variableProduct secimi(zeynep)
//    @FindBy(xpath = "//*[@id='product_type']")
//    public WebElement variableProduct;
//
//    //color secimi(zeynep)
//    @FindBy(xpath = "//*[@id='is_virtual']")
//    public WebElement color;
//
//    //size secimi(zeynep)
//    @FindBy(xpath = "//*[@id='attributes_is_active_2']")
//    public WebElement size;
//
//    // Variations'a tıkla(zeynep)
//    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[6]")
//    public WebElement variations;
//
//    //Any Color tıkla(zeynep)
//    @FindBy(xpath = "//*[@data-name='default_attribute_pa_color']")
//    public WebElement anyColor;
//
//    // Any size tıkla(zeynep)
//    @FindBy(xpath = "//*[@data-name='default_attribute_pa_size']")


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
    @FindBy(xpath = "(//*[text()='Add New'])[1]") public WebElement addNew;
    @FindBy(css = "input[id='attributes_is_active_1']") public WebElement color;
    @FindBy(css = "input[id='is_downloadable']") public WebElement is_downloadable;
    @FindBy(css = "input[id='attributes_is_active_2']") public WebElement size;

    @FindBy(xpath = "//*[@id='attributes_value_2']") public WebElement sizeBox;
    @FindBy(xpath = "//*[@id='wcfm_products_manage_form_variations_head']") public WebElement variations;
   @FindBy(xpath = "//*[@id='regular_price']") public WebElement price;
    @FindBy(xpath = "(//div[@class='thumbnail'])[3]") public WebElement siyahAyakkabi1;
    @FindBy(id = "featured_img_display") public WebElement buyukProductImageEkleme;
    @FindBy(xpath = "//*[text()='Sign In']") public WebElement login;
    @FindBy(xpath = "//*[@id='username']") public WebElement userName;
    @FindBy(xpath = "//*[@class='wcfm_menu_items wcfm_menu_wcfm-products']") public WebElement products;
    @FindBy(xpath = "//*[@id='product_type']") public WebElement simpleProduct;
    @FindBy(css = "input[id='pro_title']") public WebElement productTitle;
    @FindBy(xpath = "//*[@class='button wcfm_add_attribute_term wcfm_add_attributes_new_term']") public WebElement addNewColor;
    @FindBy(css = "input[id='wcfm_products_simple_draft_button']") public WebElement draft;

    @FindBy(xpath = "//span[text()='Sign In ']") public WebElement signIn;

    @FindBy(xpath = "(//input[@type='search'])[1]") public WebElement searchBox;
    @FindBy(css="input[id='is_virtual']") public WebElement virtual;
    @FindBy(xpath = "//a[text()='Store Manager']") public WebElement storeManager;

    @FindBy(xpath = "(//a[text()='My Account'])[1]") public WebElement myAccount;
    @FindBy(xpath = "//select[@name='default_attributes[attribute_pa_color]']") public WebElement variationsColor;
    @FindBy(xpath = "//select[@name='variations[0][attribute_pa_color]']") public WebElement variationAnyColor;
    @FindBy(id = "variations_regular_price_0") public WebElement regularPrice;
    @FindBy(id = "variations_stock_status_0") public WebElement stockStatus;
    @FindBy(id = "variations_weight_0") public WebElement weight;
    @FindBy(id = "variations_length_0") public WebElement length;
    @FindBy(id = "variations_width_0") public WebElement width;
    @FindBy(id = "variations_height_0") public WebElement height;
    @FindBy(id = "variations_tax_class_0") public WebElement tax;
    @FindBy(id = "variations_description_0") public WebElement descriptionVari;
    @FindBy(xpath = "//button[text()='Media Library']") public WebElement mediaLibrary;
    @FindBy(xpath = "(//button[text()='Add New'])[2]") public WebElement addNewSizeButton;

    @FindBy(xpath = "//*[@class='button media-button button-primary button-large media-button-select']") public WebElement imageSelectButton;

    @FindBy(xpath = "//input[@value='229']") public WebElement categoriesCheckBox;

    @FindBy(xpath = "//input[@value='417']") public WebElement productBrandscheckBox;

    @FindBy(xpath = "//textarea[@id='product_tags']") public WebElement productTags;

    @FindBy(xpath = "//select[@id='catalog_visibility']") public WebElement catalogvisibility;

    @FindBy(xpath = "//label[@class='wcfmfa fa-server']") public WebElement attributes;

    @FindBy(xpath = "//input[@value='Submit']") public WebElement submitProduct;

    @FindBy(xpath = "//*[@href='https://hubcomfy.com/store-manager/']") public WebElement storeManager0;

    @FindBy(xpath = "//h2[1]") public WebElement storeManagerText0;

    @FindBy(xpath = "//*[text()='Downloads'])[1]") public WebElement downloads;

    @FindBy(xpath = "//*[text()='Sign In']") public WebElement signInLogin;

    @FindBy(xpath = "//*[@id='username']") public WebElement email;

    @FindBy(xpath = "//*[@id='password']") public WebElement password;

    @FindBy(xpath = "(//button[@type='submit'])[1]") public WebElement signIn2;

    @FindBy(xpath = "//li[@id='menu-item-1079']") public WebElement myAccount0;

    @FindBy(xpath = "//*[@class='page-title']") public WebElement myAccount2;
    @FindBy(xpath = "//*[@class='wcfm_menu_items wcfm_menu_wcfm-products']") public WebElement products0;
    @FindBy(xpath = "//*[@href='https://hubcomfy.com/store-manager/products-manage/']") public WebElement addNew0;

    @FindBy(xpath = "//*[text()='Add Product']") public WebElement addNewText;
    @FindBy(xpath = "//*[@id='product_type']") public WebElement dropDown;
    @FindBy(xpath = "//*[@id='pro_title']") public WebElement productTitle0;

    @FindBy(xpath = "//*[@id='product_url']") public WebElement URL0;

    @FindBy(xpath = "//*[@id='button_text']") public WebElement buttonText0;

    @FindBy(xpath = "//*[@id='regular_price']") public WebElement price0;

    @FindBy(xpath = "//*[@id='sale_price']") public WebElement salePrice0;
    @FindBy(xpath = "//*[@id='tinymce'][1]") public WebElement shortDescription0;

    @FindBy(xpath = "//*[text()='Products Dashboard']") public WebElement productDashboardText0;

    @FindBy(xpath = "//*[@data-name='default_attribute_pa_color']") public WebElement dropDown2;

    @FindBy(xpath = "//*[@data-name='default_attribute_pa_size']") public WebElement dropDown3;
    @FindBy(xpath = "(//input[@type='search'])[2]") public WebElement searchKutusu0;
    @FindBy(xpath = "//*[@alt='Red Apple']") public WebElement girilenProduct0;


}

// zeynep son//
