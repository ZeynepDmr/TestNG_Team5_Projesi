package Team05.pages;

import Team05.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorSignInLocates {
    //US_11
    public VendorSignInLocates(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signInLogin;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement signIn2;

    @FindBy(xpath= "//li[@id='menu-item-1079']")
    public WebElement myAccount;

    @FindBy(xpath= "//*[@class='page-title']")
    public WebElement myAccount2;

    //Wrong username or password
    @FindBy(xpath= "//*[text()='Wrong username or password.']")
    public WebElement wrongUsernameOrPass;

    //Orders
    @FindBy(xpath= "(//*[@class='text-uppercase text-center mb-0'])[1]")
    public WebElement orders;


    //Orders Text
    @FindBy(xpath= "//*[@class='icon-box-title text-normal']")
    public WebElement ordersText;

    //Downloads
    @FindBy(xpath= "(//*[text()='Downloads'])[2]")
    public WebElement downloads;

    //Downloads Text
    @FindBy(xpath= "(//*[text()='Downloads'])[3]")
    public WebElement downloadsText;

    //Addresses
    @FindBy(xpath= "(//*[text()='Addresses'])[2]")
    public WebElement addresses;

    //Addresses Text
    @FindBy(xpath= "(//*[text()='Addresses'])[3]")
    public WebElement addressesText;

    //Account Details
    @FindBy(xpath= "(//*[text()='Account details'])[2]")
    public WebElement accountDetails;

    //Account Details Text
    @FindBy(xpath= "(//*[text()='Account Details'])[1]")
    public WebElement accountDetailsText;

    //Wishlist
    @FindBy(xpath= "(//*[text()='Wishlist'])[3]")
    public WebElement wishlist;

    //Wishlist Text
    @FindBy(xpath= "(//*[text()='Wishlist'])[2]")
    public WebElement wishlistText;

    //Logout
    @FindBy(xpath= "(//*[text()='Logout'])[2]")
    public WebElement logout;

    //Logout Text
    @FindBy(xpath= "(//*[text()='My Account'])[2]")
    public WebElement logoutText;

    //Store Manager
    @FindBy(xpath= "//*[text()='Store Manager']")
    public WebElement storeManager;

    //Store Manager Text
    @FindBy(xpath= "//h2[1]")
    public WebElement storeManagerText;

    //Orders2
    @FindBy(xpath= "(//*[text()='Orders'])[1]")
    public WebElement orders2;

    //Downloads2
    @FindBy(xpath= "(//*[text()='Downloads'])[1]")
    public WebElement downloads2;

    //Downloads2
    @FindBy(xpath= "//*[@class='icon-box-title text-normal']")
    public WebElement downloads2Text;


    //Addresses2
    @FindBy(xpath= "(//*[text()='Addresses'])[1]")
    public WebElement addresses2;

    //Addresses2
    @FindBy(xpath= "//*[@class='icon-box-title text-normal']")
    public WebElement addresses2Text;


    //Account Details2
    @FindBy(xpath= "(//*[text()='Account details'])[1]")
    public WebElement accountDetails2;

    //Account Details2
    @FindBy(xpath= "//*[@class='icon-box-title text-normal']")
    public WebElement accountDetails2Text;


    //Wishlist2
    @FindBy(xpath= "(//*[text()='Wishlist'])[2]")
    public WebElement wishlist2;

    //Support Tickets
    @FindBy(xpath= "//*[text()='Support Tickets']")
    public WebElement supportTickets;

    //Support Tickets Text
    @FindBy(xpath= "//*[@colspan='4']")
    public WebElement supportTicketsText;

    //Followings
    @FindBy(xpath= "//*[text()='Followings']")
    public WebElement followings;

    //Followings Text
    @FindBy(xpath= "//*[@colspan='2']")
    public WebElement followingsText;

    //Logout2
    @FindBy(xpath= "(//*[text()='Logout'])[1]")
    public WebElement logout2;

    //Logout2
    @FindBy(xpath= "//*[@class='page-title']")
    public WebElement logout2Text;




    }
