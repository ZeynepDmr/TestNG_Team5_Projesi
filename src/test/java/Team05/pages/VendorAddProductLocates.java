package Team05.pages;

import Team05.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorAddProductLocates {

    public VendorAddProductLocates(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

       @FindBy(xpath = "(//*[text()='Sign In'])[2]")
       public WebElement signin23;
        @FindBy(css = "a[class='login inline-type']")
        public WebElement login23;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement email23;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement password23;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement userName23;
        @FindBy(css = "li[id='menu-item-1079']")
        public WebElement myAccount23;
        @FindBy(xpath = "(//*[text()='My Account'])[2]")
        public WebElement myAccountText;
        @FindBy(linkText = "Store Manager")
        public WebElement storemanager23;
        @FindBy(xpath = "(//h2)[1]")
        public WebElement storeManagerText23;
        @FindBy(xpath = "(//*[@class='wcfm_menu_item '])[3]")
        public WebElement products23;
        @FindBy(xpath = "//*[text()='Products']")
        public WebElement productsText23;
        @FindBy(xpath = "(//*[h2])[2]")
        public WebElement addProductText23;
        @FindBy(xpath = "//*[@id='add_new_product_dashboard']")
        public WebElement addNew23;
        @FindBy(xpath = "//*[@class='wcfm-tabWrap']")
        public WebElement menu23;
        @FindBy(xpath = "//*[@id='dropdown_product_type']")
        public WebElement allproducttypes23;
        @FindBy(xpath = "//*[@id='featured_img_display']")
        public WebElement image23;
        @FindBy(xpath = "//*[@id='__wp-uploader-id-1']")
        public WebElement selectFiles23;
        @FindBy(xpath = "(//*[text()='Select'])[2]")
        public WebElement select23;
        @FindBy(xpath = "//*[@id='pro_title']")
        public WebElement productTitle23;
        @FindBy(xpath = "body[data-id='excerpt']")
        public WebElement shortDescription23;
        @FindBy(css = "body[data-id='description']")
        public WebElement Description23;
        @FindBy(xpath = "(//*[@name='product_cats[]'])[2]")
        public WebElement categories;
        @FindBy(xpath = "(//*[@class='wcfm-checkbox checklist_type_product_cat '])[1]")
        public WebElement categories23;
        @FindBy(xpath = "//*[text()='+Add new category']")
        public WebElement addNewcategory23;
        @FindBy(css = "input[@id='wcfm_new_cat']")
        public WebElement Namecategory23;
        @FindBy(xpath = "(//*[text()='Add'])[1]")
        public WebElement categoryAdd23;
        @FindBy(xpath = "(//*[@class='button wcfm_add_category_bt wcfm_add_taxonomy_bt'])[1]")
        public WebElement categoryAdd;
        @FindBy(css = "li[class='product_cats_checklist_item checklist_item_707']")
        public WebElement categoryVerify23;
        @FindBy(xpath = "(//*[@class='wcfm-checkbox checklist_type_product_brand '])[3]")
        public WebElement productBrands23;
        @FindBy(xpath = "//*[text()='+Add new Product brands']")
        public WebElement addNewProductBrands23;
        @FindBy(css = "input[id='wcfm_new_product_brand']")
        public WebElement productBrandsName23;
        @FindBy(xpath = "(//*[text()='Add'])[2]")
        public WebElement productAdd23;
        @FindBy(css = "li[class='product_cats_checklist_item checklist_item_712']")
        public WebElement productBrandsVerify23;
        @FindBy(css = "p[class='description wcfm_full_ele wcfm_side_tag_cloud wcfm_fetch_tag_cloud']")
        public WebElement Choosetags23;
        @FindBy(xpath = "(//*[@role='button'])[36]")
        public WebElement secimChooseTags23;
        @FindBy(css = "p[class='catalog_visibility wcfm_title  wcfm_full_ele catalog_visibility_ele']")
        public WebElement catalogVisibility23;
        @FindBy(xpath = "//*[@id='catalog_visibility']")
        public WebElement shopResult23;
        @FindBy(css = "div[id='wcfm_products_manage_form_inventory_head']")
        public WebElement inventory23;
        @FindBy(css = "input[id='sku']")
        public  WebElement sku23;
        @FindBy(css = "input[id='manage_stock']")
        public  WebElement manageStock23;
        @FindBy(css = "input[id='stock_qty']")
        public  WebElement stockqty23;
        @FindBy(css = "select[id='stock_status']")
        public  WebElement stockStatus23;
        @FindBy(css = "input[id='sold_individually']")
        public  WebElement soldIndividually23;
        @FindBy(css = "div[id='wcfm_products_manage_form_shipping_head']")
        public  WebElement shipping23;
        @FindBy(css = "input[id='weight']")
        public  WebElement weight23;
        @FindBy(css = "input[id='length']")
        public  WebElement lenghtDimensions23;
        @FindBy(css = "input[id='width']")
        public  WebElement widthDimensions23;
        @FindBy(css = "input[id='height']")
        public  WebElement heightDimensions23;
        @FindBy(css = "select[id='shipping_class']")
        public  WebElement shippingClass23;
        @FindBy(css = "select[id='_wcfmmp_processing_time']")
        public  WebElement processingTime23;
        @FindBy(css = "div[id='wcfm_products_manage_form_attribute_head']")
        public  WebElement attributes23;
        @FindBy(css = "input[id='attributes_is_active_1']")
        public  WebElement color23;
        @FindBy(css = "input[id='attributes_is_active_2']")
        public  WebElement size23;
        @FindBy(css = "div[id='wcfm_products_manage_form_linked_head']")
        public  WebElement linked23;
        @FindBy(css = "select[id='upsell_ids']")
        public  WebElement upsell23;
        @FindBy(css = "select[id='crosssell_ids']")
        public  WebElement crosssels23;
        @FindBy(css = "div[id='wcfm_products_manage_form_yoast_head']")
        public  WebElement seo23;
        @FindBy(css = "input[id='yoast_wpseo_focuskw_text_input']")
        public  WebElement enterfocuskeyword23;
        @FindBy(css = "textarea[id='yoast_wpseo_metadesc']")
        public  WebElement metadescription23;
        @FindBy(css = "div[id='wcfm_products_manage_form_toptan-urun-gosterme-ayarlari_head']")
        public WebElement urunAyarlari23;
        @FindBy(xpath = "//*[@id='piecetype']")
        public  WebElement pieceType23;
        @FindBy(css = "input[id='unitpercart']")
        public  WebElement unitsPerPiece23;
        @FindBy(css = "input[id='minorderqtytr']")
        public  WebElement minOrderQuantity23;
        @FindBy(css = "div[id='wcfm_products_manage_form_advanced_head']")
        public  WebElement advanced23;
        @FindBy(css = "input[id='enable_reviews']")
        public  WebElement enablereviews23;
        @FindBy(css = "input[id='menu_order']")
        public  WebElement menuOrder23;
        @FindBy(css = "textarea[id='purchase_note']")
        public WebElement purchaseNote23;


}
