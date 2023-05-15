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
    @FindBy(xpath= "(//*[text()='Orders'])[2]")
    public WebElement orders;

    //Downloads
    @FindBy(xpath= "(//*[text()='Downloads'])[2]")
    public WebElement downloads;

    //Addresses
    @FindBy(xpath= "(//*[text()='Addresses'])[2]")
    public WebElement addresses;

    //Account Details
    @FindBy(xpath= "(//*[text()='Account details'])[2]")
    public WebElement accountDetails;

    //Wishlist
    @FindBy(xpath= "(//*[text()='Wishlist'])[3]")
    public WebElement wishlist;

    //Logout
    @FindBy(xpath= "(//*[text()='Logout'])[2]")
    public WebElement logout;

    //Store Manager
    @FindBy(xpath= "//*[text()='Store Manager']")
    public WebElement storeManager;

    //Orders2
    @FindBy(xpath= "(//*[text()='Orders'])[1]")
    public WebElement orders2;

    //Downloads2
    @FindBy(xpath= "(//*[text()='Downloads'])[1]")
    public WebElement downloads2;

    //Addresses2
    @FindBy(xpath= "(//*[text()='Addresses'])[1]")
    public WebElement addresses2;

    //Account Details2
    @FindBy(xpath= "(//*[text()='Account details'])[1]")
    public WebElement accountDetails2;

    //Wishlist2
    @FindBy(xpath= "(//*[text()='Wishlist'])[2]")
    public WebElement wishlist2;

    //Support Tickets
    @FindBy(xpath= "//*[text()='Support Tickets']")
    public WebElement supportTickets;

    //Followings
    @FindBy(xpath= "//*[text()='Followings']")
    public WebElement followings;

    //Logout2
    @FindBy(xpath= "(//*[text()='Logout'])[1]")
    public WebElement logout2;




















}
