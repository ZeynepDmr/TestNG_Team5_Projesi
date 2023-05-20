
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


    
























































































































































































































































































































































































































































    //Store Manager
    @FindBy(xpath= "//*[@href='https://hubcomfy.com/store-manager/']")
    public WebElement storeManager0;

    //Store Manager Text
    @FindBy(xpath= "//h2[1]")
    public WebElement storeManagerText0;

    @FindBy(xpath= "//*[text()='Downloads'])[1]")
    public WebElement downloads;

    @FindBy(css = "a[class='wcfm_menu_item active']")
    public WebElement products;

    @FindBy(xpath = "//*[text()='Products']")
    public WebElement productsText;

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signInLogin;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement signIn2;

  @FindBy(xpath= "//li[@id='menu-item-1079']")
  public WebElement myAccount0;

  @FindBy(xpath= "//*[@class='page-title']")
  public WebElement myAccount2;

    //Product
    @FindBy(xpath= "//*[@class='wcfm_menu_items wcfm_menu_wcfm-products']")
    public WebElement products0;

  //Product Text
    @FindBy(xpath= "//*[text()='Products Dashboard']")
    public WebElement productText;

  //Add New
    @FindBy(xpath= "//*[@href='https://hubcomfy.com/store-manager/products-manage/']")
  public WebElement addNew0;

  //Add New Text
  @FindBy(xpath= "//*[text()='Add Product']")
  public WebElement addNewText;


    //DropDown
    @FindBy(xpath = "//*[@id='product_type']")
    public WebElement dropDown;

    // Product Title
    @FindBy(xpath = "//*[@id='pro_title']")
    public WebElement productTitle0;

  // URL
  @FindBy(xpath = "//*[@id='product_url']")
  public WebElement URL0;

  // Button Text
  @FindBy(xpath = "//*[@id='button_text']")
  public WebElement buttonText0;

  // Price
  @FindBy(xpath = "//*[@id='regular_price']")
  public WebElement price0;

  // Sale Price
  @FindBy(xpath = "//*[@id='sale_price']")
  public WebElement salePrice0;

  // Short Description
  @FindBy(xpath = "//*[@id='tinymce'][1]")
  public WebElement shortDescription0;

  //Product Dashboard Text

  @FindBy(xpath = "//*[text()='Products Dashboard']")
  public WebElement productDashboardText0;

  //Girilen Ürünü arama:Search
  @FindBy(xpath = "(//input[@type='search'])[2]")
  public WebElement searchKutusu0;

  //Girilen Ürün

  @FindBy(xpath = "//*[@alt='Red Apple']")
  public WebElement girilenProduct0;

}





