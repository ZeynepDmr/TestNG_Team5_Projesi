package Team05.pages;

import Team05.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCompareLocates {


    //US_07
    @FindBy(xpath = "(//*[@class='w-icon-account'])[1]")
    public WebElement signIn;

    //reg_username
    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='rememberme']")
    public WebElement rememberMe;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement login;

    @FindBy(xpath ="//*[text()='Sign Out']")
    public WebElement sigInYapildi;
    //2    Kullanici istedigi urun alanina tiklar(Electronics)

    //3    Sayfanin acildigni Gorur
    //4    Search butonuna tiklar
    @FindBy(xpath = "(//input[@type='search'])[1]")
    public WebElement searchButton;
    //5    Search butonundan urun  yazar ve "enter" a basar
    //6    Bulunan sonuclarin "Compare" ozelligi tasidigini gorur

    @FindBy(xpath = "(//a[@title='Compare'])[1]")
    public WebElement compareOzelligi;
    //7    Kullanici istedigi 4 urunu  secer

    @FindBy(xpath = "(//a[text()='Xiaomi Phone -4'])[1]")
    public WebElement urun1;

    @FindBy(xpath = "(//a[text()='Xiaomi Phone -4'])[2]")
    public WebElement urun2;

    @FindBy(xpath = "(//a[text()='Xiaomi Phone -4'])[3]")
    public WebElement urun3;

    @FindBy(xpath = "(//a[@href='https://pearlymarket.com/urun/xiaomi-phone-4/'])[2]")
    public WebElement urun4;


    ////a[text()='Xiaomi Phone -3']

    @FindBy(xpath = "//a[text()='Xiaomi Phone -3']")
    public WebElement urun5;

    //(//a[@title='Compare'])[1]
    @FindBy(xpath = "(//a[@title='Compare'])[1]")
    public WebElement compareUrun5;
    @FindBy(xpath = "//a[text()='Start Compare !']")
    public WebElement startCompareYazisi;

    @FindBy(xpath = "(//*[text()='4'])[2]")
    public WebElement dortEleman;

    //8    Kullanici karsilastrimak icin 5. urunu secmeye calisir
    //9    Ekranda dort urun bulunmasini bekler

    //--------------TC-03  LoCateleri--------------------------------
    @FindBy(xpath = "(//h3[@class='woocommerce-loop-product__title'])[1]")
    public WebElement ur1;

    //(//*[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[3]

    @FindBy(xpath = "(//h3[@class='woocommerce-loop-product__title'])[2]")
    public WebElement ur2;


    @FindBy(xpath = "(//h3[@class='woocommerce-loop-product__title'])[3]")
    public WebElement ur3;

    @FindBy(xpath = "(//h3[@class='woocommerce-loop-product__title'])[4]")
    public WebElement ur4;

    @FindBy(xpath = "(//i[@class='w-icon-times-solid'])[1]")
    public WebElement carpiIsareti;
    @FindBy(xpath = "(//i[@class='w-icon-times-solid'])[2]")
    public WebElement carpiIsareti1;
    @FindBy(xpath = "(//i[@class='w-icon-times-solid'])[3]")
    public WebElement carpiIsareti2;

    @FindBy(xpath = "(//a[@class='compare-action remove_from_compare'])[1]")
    public WebElement carpiIsareti3;

    @FindBy(xpath = "(//a[@class='compare-action remove_from_compare'])[4]")
    public WebElement carpiIsareti4;


    @FindBy(xpath = "//a[@class='compare-clean']")
    public WebElement cleanAll;


    @FindBy(xpath = "//h2[text()='No products added to the compare']")
    public WebElement noProduitsYazisi;


    @FindBy(xpath = "//h3[text()='Compare Products']")
    public WebElement compareProductKismi;



    //Class 3 icin
    @FindBy(xpath = "(//a[@class='compare btn-product-icon'])[1]")
    public WebElement compare3;

    @FindBy(xpath = "(//a[@class='compare btn-product-icon'])[2]")
    public WebElement compare4;

    @FindBy(xpath = "(//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[1]")
    public WebElement uru1;

    @FindBy(xpath = "(//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[2]")
    public WebElement uru2;

    @FindBy(xpath = "(//li[@class='slider-slide'])[1]")
    public WebElement artiIsareti;

    @FindBy(xpath = "//a[text()='Clean All']")
    public WebElement cleanAll1;

    @FindBy(xpath = "//*[text()='0']")
    public WebElement sifirUrun;

    @FindBy(xpath = "(//*[@class='compare-col compare-field'])[1]")
    public WebElement productYazisi;

    @FindBy(xpath = "(//*[@class='compare-col compare-field'])[2]")
    public WebElement priceYazisi;

    @FindBy(xpath = "(//*[@class='compare-col compare-field'])[3]")
    public WebElement availabilityYazisi;

    @FindBy(xpath = "(//*[@class='compare-col compare-field'])[4]")
    public WebElement descriptionYazisi;

    @FindBy(xpath = "(//*[@class='compare-col compare-value'])[4]")
    public WebElement price;

    //(//*[@class='compare-col compare-value'])[7]
    @FindBy(xpath = "(//*[@class='compare-col compare-value'])[7]")
    public WebElement avability;

    @FindBy(xpath = "(//*[@class='compare-col compare-value'])[10]")
    public WebElement description;

    @FindBy(xpath = "//a[@class='woocommerce-Button button']")
    public WebElement goShopYazisi;
 }
