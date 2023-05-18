package Team05.pages;

import Team05.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorAddProductLocates {
    //US_14_18



































































































































































































    public VendorAddProductLocates(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "div[class='account']")
    public WebElement siginlogin;

    @FindBy(css = "a[class='login inline-type']")
    public WebElement siginlogin1;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "(//*[@type='submit'])[1]")
    public WebElement sigin;
    @FindBy(xpath= "//li[@id='menu-item-1079']")
    public WebElement myAccount;

    @FindBy(xpath = "(//[h2])[1]")
    public WebElement myAccountText;

    @FindBy(linkText = "Store Manager")
    public WebElement storemanager;

    @FindBy(xpath = "(//h2)[1]")
    public WebElement storeManagerText;

    @FindBy(xpath = "(//*[@class='wcfm_menu_item '])[3]")
    public WebElement products;

    @FindBy(xpath = "//*[text()='Products']")
    public WebElement productsText;
    @FindBy(xpath = "(//*[h2])[2]")
    public WebElement addProductText;

    @FindBy(xpath = "//*[@id='add_new_product_dashboard']")
    public WebElement addNew;


    @FindBy(xpath = "//*[@class='wcfm-tabWrap']")
    public WebElement menu;

    @FindBy(xpath = "//*[@id='dropdown_product_type']")
    public WebElement allproducttypes;


    @FindBy(xpath = "//*[@id='featured_img_display']")
    public WebElement image;
    @FindBy(xpath = "//*[@id='__wp-uploader-id-1']")
    public WebElement selectFiles;

    @FindBy(xpath = "//*[@id='pro_title']")
    public WebElement productTitle;

    @FindBy(xpath = "body[data-id='excerpt']")
    public WebElement shortDescription;
    @FindBy(css = "body[data-id='description']")
    public WebElement Description;

    @FindBy(xpath = "(//*[@name='product_cats[]'])[2]")
    public WebElement categories;

    //     @FindBy(xpath = "(//*[@class='wcfm-checkbox checklist_type_product_cat '])[1]")
//      public WebElement categories;
    @FindBy(xpath = "//*[text()='+Add new category']")
    public WebElement addNewcategory;
    @FindBy(css = "input[@id='wcfm_new_cat']")
    public WebElement Namecategory;

    //    @FindBy(xpath = "(//*[text()='Add'])[1]")
//     public WebElement categoryAdd;
    @FindBy(xpath = "(//*[@class='button wcfm_add_category_bt wcfm_add_taxonomy_bt'])[1]")
    public WebElement categoryAdd;

    @FindBy(css = "li[class='product_cats_checklist_item checklist_item_707']")
    public WebElement categoryVerify;

    @FindBy(xpath = "(//*[@class='wcfm-checkbox checklist_type_product_brand '])[3]")
    public WebElement productBrands;

    //    @FindBy(xpath = "(//*[@name='product_custom_taxonomies[product_brand][]'])[2]")
//     public WebElement productBrands1;
    @FindBy(xpath = "//*[text()='+Add new Product brands']")
    public WebElement addNewProductBrands;

    @FindBy(css = "input[id='wcfm_new_product_brand']")
    public WebElement productBrandsName;

    @FindBy(xpath = "(//*[text()='Add'])[2]")
    public WebElement productAdd;
    @FindBy(css = "li[class='product_cats_checklist_item checklist_item_712']")
    public WebElement productBrandsVerify;
    @FindBy(css = "p[class='description wcfm_full_ele wcfm_side_tag_cloud wcfm_fetch_tag_cloud']")
    public WebElement Choosetags;

    @FindBy(xpath = "(//*[@role='button'])[36]")
    public WebElement secimChooseTags;

    @FindBy(css = "p[class='catalog_visibility wcfm_title  wcfm_full_ele catalog_visibility_ele']")
    public WebElement catalogVisibility;
    @FindBy(xpath = "//*[@id='catalog_visibility']")
    public WebElement shopResult;

    @FindBy(css = "div[id='wcfm_products_manage_form_inventory_head']")
    public WebElement inventory;

    @FindBy(css = "input[id='sku']")
    public  WebElement sku;

    @FindBy(css = "input[id='manage_stock']")
    public  WebElement manageStock;
    @FindBy(css = "input[id='stock_qty']")
    public  WebElement stockqty;

    @FindBy(css = "select[id='stock_status']")
    public  WebElement stockStatus;
    @FindBy(css = "input[id='sold_individually']")
    public  WebElement soldIndividually;
    @FindBy(css = "div[id='wcfm_products_manage_form_shipping_head']")
    public  WebElement shipping;
    @FindBy(css = "input[id='weight']")
    public  WebElement weight;
    @FindBy(css = "input[id='length']")
    public  WebElement lenghtDimensions;

    //@FindBy(css = "input[id='width']")
//public  WebElement widthDimensions;
//@FindBy(css = "input[id='height']")
//public  WebElement heightDimensions;
    @FindBy(css = "select[id='shipping_class']")
    public  WebElement shippingClass;
    @FindBy(css = "select[id='_wcfmmp_processing_time']")
    public  WebElement processingTime;
    @FindBy(css = "div[id='wcfm_products_manage_form_attribute_head']")
    public  WebElement attributes;
    @FindBy(css = "input[id='attributes_is_active_1']")
    public  WebElement color;
    @FindBy(css = "input[id='attributes_is_active_2']")
    public  WebElement size;
    @FindBy(css = "div[id='wcfm_products_manage_form_linked_head']")
    public  WebElement linked;
    @FindBy(css = "select[id='upsell_ids']")
    public  WebElement upsell;
    @FindBy(css = "select[id='crosssell_ids']")
    public  WebElement crosssels;
    @FindBy(css = "div[id='wcfm_products_manage_form_yoast_head']")
    public  WebElement seo;
    @FindBy(css = "input[id='yoast_wpseo_focuskw_text_input']")
    public  WebElement enterfocuskeyword;
    @FindBy(css = "textarea[id='yoast_wpseo_metadesc']")
    public  WebElement metadescription;
    @FindBy(css = "div[id='wcfm_products_manage_form_toptan-urun-gosterme-ayarlari_head']")
    public WebElement urunAyarlari;
    //@FindBy(css = "select[id='piecetype']")
//public  WebElement select1;
    @FindBy(xpath = "//*[@id='piecetype']")
    public  WebElement pieceType;
    @FindBy(css = "input[id='unitpercart']")
    public  WebElement unitsPerPiece;

    @FindBy(css = "input[id='minorderqtytr']")
    public  WebElement minOrderQuantity;
    @FindBy(css = "div[id='wcfm_products_manage_form_advanced_head']")
    public  WebElement advanced;
    @FindBy(css = "input[id='enable_reviews']")
    public  WebElement enablereviews;
    @FindBy(css = "input[id='menu_order']")
    public  WebElement menuOrder;
    @FindBy(css = "textarea[id='purchase_note']")
    public  WebElement purchaseNote;


















}
