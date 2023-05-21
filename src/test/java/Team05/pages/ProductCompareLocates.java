package Team05.pages;

import Team05.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCompareLocates {


    //US_07

    public  ProductCompareLocates() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//*[@class='w-icon-account'])[1]")
    public static WebElement signIn;

    //reg_username
    @FindBy(xpath = "//input[@id='username']")
    public static WebElement userName;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public static WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    public static WebElement password;

    @FindBy(xpath = "//input[@name='rememberme']")
    public static WebElement rememberMe;

    @FindBy(xpath = "//button[@name='login']")
    public static WebElement login;

    @FindBy(xpath = "//*[text()='Sign Out']")
    public static WebElement sigInYapildi;
    //2    Kullanici istedigi urun alanina tiklar(Electronics)

    //3    Sayfanin acildigni Gorur
    //4    Search butonuna tiklar
    @FindBy(xpath = "(//input[@type='search'])[1]")
    public static WebElement searchButton;
    //5    Search butonundan urun  yazar ve "enter" a basar
    //6    Bulunan sonuclarin "Compare" ozelligi tasidigini gorur

    @FindBy(xpath = "(//a[@title='Compare'])[1]")
    public static WebElement compareOzelligi;
    //7    Kullanici istedigi 4 urunu  secer

    @FindBy(xpath = "//div[@class='product-loop product-default content-center product type-product post-18752 status-publish first instock product_cat-electronics has-post-thumbnail shipping-taxable product-type-variable']//img[2]")
    public static WebElement urun1;

    @FindBy(xpath = "//div[@class='product-loop product-default content-center product type-product post-19218 status-publish instock product_cat-electronics product_tag-phone has-post-thumbnail shipping-taxable purchasable product-type-simple']//img[2]")
    public static WebElement urun2;

    @FindBy(xpath = "//div[@class='product-loop product-default content-center product type-product post-19221 status-publish instock product_cat-electronics has-post-thumbnail sale shipping-taxable purchasable product-type-variable has-default-attributes']//img[2]")
    public static WebElement urun3;

    @FindBy(xpath = "//div[@class='product-loop product-default content-center product type-product post-25232 status-publish last instock product_cat-electronics product_tag-apple shipping-taxable product-type-external']//img[@alt='Placeholder']")
    public static WebElement urun4;


    ////a[text()='Xiaomi Phone -3']

    @FindBy(xpath = "//div[@class='product-loop product-default content-center product type-product post-19329 status-publish instock product_cat-electronics has-post-thumbnail virtual purchasable product-type-simple']//img[2]")
    public static WebElement urun5;

    //(//a[@title='Compare'])[1]
    @FindBy(xpath = "(//a[@title='Compare'])[1]")
    public static WebElement compareUrun5;

    @FindBy(xpath = "//div[@class='page-title-wrap']/h2")
    public static WebElement dortEleman;

    @FindBy(xpath = "//a[@class='btn btn-dark btn-rounded']")
    public static WebElement compare2;

    //8    Kullanici karsilastrimak icin 5. urunu secmeye calisir
    //9    Ekranda dort urun bulunmasini bekler

    //--------------TC-03  LoCateleri--------------------------------
    @FindBy(xpath = "(//h3[@class='woocommerce-loop-product__title'])[1]")
    public static WebElement ur1;

    //(//*[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[3]

    @FindBy(xpath = "(//h3[@class='woocommerce-loop-product__title'])[2]")
    public static WebElement ur2;


    @FindBy(xpath = "(//h3[@class='woocommerce-loop-product__title'])[3]")
    public static WebElement ur3;

    @FindBy(xpath = "(//h3[@class='woocommerce-loop-product__title'])[4]")
    public static WebElement ur4;

    @FindBy(xpath = "(//div[@class='compare-basic-info']/a[@class='compare-action remove_from_compare'])[1]")
    public static WebElement carpiIsareti;


    @FindBy(xpath = "//a[@class='compare-clean']")
    public static WebElement cleanAll;


    @FindBy(xpath = "//h2[text()='No products added to the compare']")
    public static WebElement noProduitsYazisi;


    @FindBy(xpath = "//h3[text()='Compare Products']")
    public static WebElement compareProductKismi;


    //Class 3 icin
    @FindBy(xpath = "(//a[@class='compare btn-product-icon'])[1]")
    public static WebElement compare3;

    @FindBy(xpath = "(//a[@class='compare btn-product-icon'])[2]")
    public static WebElement compare4;

    @FindBy(xpath = "(//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[1]")
    public static WebElement uru1;

    @FindBy(xpath = "(//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[2]")
    public static WebElement uru2;

    @FindBy(xpath = "(//li[@class='slider-slide'])[1]")
    public static WebElement artiIsareti;

    @FindBy(xpath = "//a[text()='Clean All']")
    public static WebElement cleanAll1;

    @FindBy(xpath = "//*[text()='0']")
    public static WebElement sifirUrun;

    @FindBy(xpath = "(//*[@class='compare-col compare-field'])[1]")
    public static WebElement productYazisi;

    @FindBy(xpath = "(//*[@class='compare-col compare-field'])[2]")
    public static WebElement priceYazisi;

    @FindBy(xpath = "(//*[@class='compare-col compare-field'])[3]")
    public static WebElement availabilityYazisi;

    @FindBy(xpath = "(//*[@class='compare-col compare-field'])[4]")
    public static WebElement descriptionYazisi;

    @FindBy(xpath = "(//*[@class='compare-col compare-value'])[4]")
    public static WebElement price;

    //(//*[@class='compare-col compare-value'])[7]
    @FindBy(xpath = "(//*[@class='compare-col compare-value'])[7]")
    public static WebElement avability;

    @FindBy(xpath = "(//*[@class='compare-col compare-value'])[10]")
    public static WebElement description;

    @FindBy(xpath = "//a[@class='woocommerce-Button button']")
    public static WebElement goShopYazisi;
}
