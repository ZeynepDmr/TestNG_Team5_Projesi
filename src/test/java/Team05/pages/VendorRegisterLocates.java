package Team05.pages;

import Team05.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorRegisterLocates {

    //US_09_10

    public VendorRegisterLocates(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy (xpath = "//*[text()='Register']")
    public WebElement VendorRegister;

@FindBy (xpath = "//*[text()='Become a Vendor']")
    public WebElement BecomeVRegister;

@FindBy (xpath = "//*[@id='user_email']")
    public WebElement VendorEmail;

@FindBy(xpath = "//*[@name='wcfm_email_verified_input']")
    public WebElement VerificationCode;

@FindBy(xpath = "//input[@type='button']")
    public WebElement reSendCode;//dogrulamakodu icin yeniden dogrulama

@FindBy(xpath = "//*[@id='passoword']")
    public WebElement VendorPassword;

@FindBy(xpath = "//*[@class='wcfm-text wcfm_email_verified_input']")
    public WebElement VendorConfirm;

@FindBy(xpath = "//*[@id='wcfm_membership_register_button']")
    public WebElement RegisterButton;

    @FindBy(xpath = "//*[@class='wcfm-message email_verification_message wcfm-error']")
    public WebElement Uyarı; //Geçerli mail girin uyarısı

    @FindBy(xpath = "//*[@class='wcfm-message email_verification_message wcfm-success']")
    public WebElement Uyarı2; //Kod gönderildi uyarısı





    @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div")
    public WebElement Copy;


    @FindBy(xpath = "//*[@id='password_strength']")//passwordda kisa oldu dogrulama
    public WebElement tooShort;


    @FindBy(xpath = "//*[text()='Weak']")//passwordda zayif oldugunu dogrulama
    public WebElement Weak;

    @FindBy(xpath = "//*[text()='Password strength should be atleast Good.']")//paasword kisminda olan paralo gucu en az good seviyesinde olmalidir dogrulama
    public WebElement good;

    @FindBy(xpath = "//*[text()='Password and Confirm-password are not same.']")//Password and Confirm-password are not same. paralo ve paralo onaylama kismi ayni olmadigini dogrulama
    public  WebElement passwordConfirmPassword;

    @FindBy(xpath = "//*[@class='wcfm-message wcfm-error']")//Bu E-posta zaten var dogrulama
    public WebElement Emailalreadyexists;

    @FindBy(xpath = "//*[@class='wcfm-message wcfm-error']")//gecersiz dogrulama kodu
    public WebElement Verificationcodeinvalid;

    @FindBy(xpath = "(//h1)[2]")//basarili sekilde kayit olduguna dair dogrulama
    public WebElement basariliKayit;



}




