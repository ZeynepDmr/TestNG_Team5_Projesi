
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

    //AddNew locator(zeynep)
    @FindBy(xpath = "(//*[text()='Add New'])[1]")
    public WebElement addNew;

    //color secimi(zeynep)
    @FindBy(css = "div[class='multi_input_block wcfm_attributes_blocks wcfm_defined_attributes wcfm_attributes_block_pa_color ui-sortable-handle']")
    public WebElement color;

    @FindBy(xpath = "//*[@id='attributes_value_1']")
    public WebElement colorBox;


    @FindBy(css = "div[class='multi_input_block wcfm_attributes_blocks wcfm_defined_attributes wcfm_attributes_block_pa_size ui-sortable-handle']")
    public WebElement size;

    @FindBy(xpath = "//*[@id='attributes_value_2']")
    public WebElement sizeBox;

    // @FindBy(css = "li[class='select2-selection__choice']")
    // public WebElement black;

    // Variations'a tıkla(zeynep)
    @FindBy(xpath = "//*[@id='wcfm_products_manage_form_variations_head']")
    public WebElement variations;

    // Any size tıkla(zeynep)
    @FindBy(xpath = "//*[@data-name='default_attribute_pa_size']")
    public WebElement anySize;


    // public WebElement anySize; }
    // @FindBy(xpath = "//*[@id='wcfm_products_manage_form_attribute_head']")
    // public WebElement attributes;

    @FindBy(xpath = "(//div[@class='thumbnail'])[3]")
    public WebElement siyahAyakkabi1;


    @FindBy(id = "featured_img_display")
    public WebElement buyukProductImageEkleme;
    //   @FindBy(id = "[id='menu-item-browse']")
    //   public WebElement media;
    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement login;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement userName;


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


    @FindBy(xpath = "//span[text()='Register']")
    public WebElement register;

    @FindBy(xpath = "//span[text()='Sign In ']")
    public WebElement signIn;

    @FindBy(xpath = "//input[@id='reg_username']")
    public WebElement registerUsername;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement signInEmail;

    @FindBy(xpath = "(//input[@type='search'])[1]")
    public WebElement searchBox;

    @FindBy(xpath = "//a[text()='Store Manager']")
    public WebElement storeManager;

    @FindBy(xpath = "(//a[text()='My Account'])[1]")
    public WebElement myAccount;

    @FindBy(xpath = "(//span[@class='text'])[4]")
    public WebElement vendorProducts;

    @FindBy(xpath = "//span[text()='Add New']")
    public WebElement productAddNew;

    //WebElement tumEyaletler = driver.findElement(By.cssSelector("select[id='state']"));
    @FindBy(id = "product_type")
    public WebElement productType;

    //   @FindBy(id="pro_title")
    //   public WebElement productTitle;

    //   @FindBy(id="featured_img_display")
    //   public WebElement buyukProductImageEkleme;


    @FindBy(id = "__wp-uploader-id-1")
    public WebElement productResimDosyasiSecme;

    @FindBy(xpath = "//button[@id='menu-item-upload']")
    public WebElement uploadImage;

    @FindBy(xpath = "//select[@name='default_attributes[attribute_pa_color]']")
    public WebElement variationsColor;
    @FindBy(xpath = "//select[@name='variations[0][attribute_pa_color]']")
    public WebElement variationAnyColor;
    @FindBy(id = "variations_regular_price_0")
    public WebElement regularPrice;
    @FindBy(id = "variations_stock_status_0")
    public WebElement stockStatus;
    @FindBy(id = "variations_weight_0")
    public WebElement weight;
    @FindBy(id = "variations_length_0")
    public WebElement length;
    @FindBy(id = "variations_width_0")
    public WebElement width;
    @FindBy(id = "variations_height_0")
    public WebElement height;
    @FindBy(id = "variations_tax_class_0")
    public WebElement tax;
    @FindBy(id = "variations_description_0")
    public WebElement descriptionVari;
    @FindBy(xpath = "//button[text()='Media Library']")
    public WebElement mediaLibrary;


    @FindBy(xpath = "(//div[@class='thumbnail'])[4]")
    public WebElement siyahAyakkabi2;


    @FindBy(xpath = "(//button[text()='Add New'])[2]")
    public WebElement addNewSizeButton;

    @FindBy(xpath = "(//button[@type='button'])[87]")
    public WebElement imageSelectButton;

    @FindBy(xpath = "//input[@value='229']")
    public WebElement categoriesCheckBox;

    @FindBy(xpath = "//input[@value='417']")
    public WebElement productBrandscheckBox;

    @FindBy(xpath = "//textarea[@id='product_tags']")
    public WebElement productTags;

    @FindBy(xpath = "//select[@id='catalog_visibility']")
    public WebElement catalogvisibility;

    @FindBy(xpath = "//label[@class='wcfmfa fa-server']")
    public WebElement attributes;

    @FindBy(id = "attributes_is_active_1")
    public WebElement attributesIsActive;

    @FindBy(xpath = "//div[@class='multi_input_block wcfm_attributes_blocks wcfm_defined_attributes wcfm_attributes_block_pa_color ui-sortable-handle']")
    public WebElement colorCercevesi;

    @FindBy(xpath = "(//ul[@class='select2-selection__rendered'])[2]")
    public WebElement selectColor;

    @FindBy(xpath = "//li[@title='Black']")
    public WebElement blackColor;

    @FindBy(xpath = "//select[@id='attributes_value_2']")
    public WebElement attributesIsActive2;

    @FindBy(xpath = "(//ul[@class='select2-selection__rendered'])[3]")
    public WebElement selectSize;

    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement submitProduct;

    //   @FindBy(xpath = "//div[text()='Variations']") public WebElement variations;
    //   @FindBy(xpath ="//select[@name='default_attributes[attribute_pa_color]']") public WebElement variationsColor;

    @FindBy(xpath = "//select[@name='default_attributes[attribute_pa_size]']")
    public WebElement variationsSize;
    @FindBy(xpath = "//select[@name='variations[0][attribute_pa_size]']")
    public WebElement variationAnySize;
    //    @FindBy(xpath = "//select[@name='variations[0][attribute_pa_color]']") public WebElement variationAnyColor;
    @FindBy(xpath = "(//a[@class='wcfm_product_title'])[1]")
    public WebElement assertProductTitle;
    //    @FindBy(xpath = "(//input[@type='submit'])[1]") public WebElement draft;
    @FindBy(id = "__wp-uploader-id-7")
    public WebElement selectFile;


    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement password23;


    @FindBy(xpath = "//*[@class='wcfm_menu_items wcfm_menu_wcfm-products']")
    public WebElement products0;

    //Product Text
    @FindBy(xpath = "//*[text()='Products Dashboard']")
    public WebElement productText;

    //Add New
    @FindBy(xpath = "//*[@href='https://hubcomfy.com/store-manager/products-manage/']")
    public WebElement addNew0;


    // Product Title
    @FindBy(xpath = "//*[@id='pro_title']")
    public WebElement productTitle0;

    // URL
    @FindBy(xpath = "//*[@id='product_url']")
    public WebElement URL0;
}






//
//    public WebElement anySize;
//
//    public WebElement anySize; }
//
//
//}
//
//
//   public WebElement anySize;
//
//
//
//*/
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
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
//    }
//    @FindBy(xpath = "//*[text()='Sign In']")
//    public WebElement login;
//    @FindBy(xpath="//*[@id='username']")
//    public WebElement userName;
//
//    @FindBy(xpath = "//*[@id='password']")
//    public WebElement password;

//    @FindBy(linkText = "Store Manager")
//    public WebElement storemanager;
//
//
//    @FindBy(xpath = "(//h2)[1]")
//    public WebElement storeManagerText;
//
//    @FindBy(css = "a[class='wcfm_menu_item active']")
//    public WebElement products;
//
//    @FindBy(xpath = "//*[text()='Products']")
//    public WebElement productsText;
//
//    //DropDown
//    @FindBy(xpath = "//*[@id='product_type']")
//    public WebElement dropDown;
//}
//
//
//
//
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
////package Team05.pages;
////
////import Team05.utilities.Driver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.support.FindBy;
////import org.openqa.selenium.support.PageFactory;
////
////public class VendorAddProductLocates {
////    //US_14_18
////    public VendorAddProductLocates() {
////        PageFactory.initElements(Driver.getDriver(), this);
////
////    }
////    //AddNew locator(zeynep)
////    @FindBy(xpath = "(//*[text()='Add New'])[1]")
////    public WebElement addNew;
////
////    //Virtual tıklama(zeynep)
////    @FindBy(xpath = "//*[@id='is_virtual']")
////    public WebElement virtual;
////
////    //is_downloadable tıklama(zeynep)
////    @FindBy(xpath = "//*[@id='is_downloadable']")
////    public WebElement is_downloadable;
////
////    //price kutucugu (zeynep)
////    @FindBy(xpath = "//*[@id='regular_price']")
////    public WebElement price;
////
////    //sale price kutucugu(zeynep)
////    @FindBy(xpath = "//*[@id='sale_price']")
////    public WebElement salePrice;
////
////    //variableProduct secimi(zeynep)
////    @FindBy(xpath = "//*[@id='product_type']")
////    public WebElement variableProduct;
////
////    //color secimi(zeynep)
////    @FindBy(xpath = "//*[@id='is_virtual']")
////    public WebElement color;
////
////    //size secimi(zeynep)
////    @FindBy(xpath = "//*[@id='attributes_is_active_2']")
////    public WebElement size;
////
////    // Variations'a tıkla(zeynep)
////    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[6]")
////    public WebElement variations;
////
////    // Any Color tıkla(zeynep)
////    @FindBy(xpath = "//*[@data-name='default_attribute_pa_color']")
////    public WebElement anyColor;
////
////    // Any size tıkla(zeynep)
////   // @FindBy(xpath = "//*[@data-name='default_attribute_pa_size']")
////    //public WebElement anySize;
////
