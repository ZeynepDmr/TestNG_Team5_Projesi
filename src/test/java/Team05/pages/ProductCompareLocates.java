package Team05.pages;

import Team05.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCompareLocates {


    //US_07
    public ProductCompareLocates() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='header']/div/div/div/div/div/div[9]/div/div/a[1]")
    public WebElement signInButon;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

//    @FindBy(xpath = "//*[@id='header']/div/div/div/div/div/div[2]/div/a/img")
//    public WebElement homePageButon;

    @FindBy(xpath = "//*[@id=\"menu-item-3832\"]/a")
    public WebElement electronics;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div[4]/ul/li[1]/div/figure/a/img[2]")
    public WebElement productSelect1;

    @FindBy(xpath = "//*[@id=\"product-18752\"]/div[2]/div/div[5]/a")
    public WebElement addToCompare1;

    @FindBy(xpath = "/html/body/div[2]/div[4]")
    public WebElement spaceClick;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/ul[1]/li[3]/a")
    public WebElement electronics2;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div[4]/ul/li[2]/div/div/h3/a")
    public WebElement productSelect2;


    @FindBy(xpath = "//*[@id=\"product-19218\"]/div[2]/div/div[5]/a")
    public WebElement addToCompare2;



    @FindBy(xpath = "/html/body/div[2]/div[4]")
    public WebElement addToCompare3;
//
//    @FindBy(xpath = "//a[@class='compare btn-product-icon']")
//    public WebElement addToCompare3;
//
//    @FindBy(xpath = "//a[contains(text(),'Apple Super Notecom')]")
//    public WebElement productSelect4;
//
//    @FindBy(xpath = "//a[@class='compare btn-product-icon']")
//    public WebElement addToCompare4;
//
//    @FindBy(xpath = "//h2[contains(text(),'Compare')]")
//    public WebElement comparePageCheck;
//
//    //ekran fotografi alma
//
//    @FindBy(xpath = "//i[@class='w-icon-times-solid']")
//    public WebElement removeProduct;
//
//    //ekran fotografi alma
//
//    @FindBy(xpath = "Hubcomfy_Url")
//    public WebElement backToHomePage;
//
//
 }
