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
    public WebElement reSendCode;//dogrulama kodu icin yeniden dogrulama

@FindBy(xpath = "//*[@id='passoword']")
    public WebElement VendorPassword;
@FindBy(xpath = "//*[@id='confirm_pwd']")
 public WebElement PasswordConfirm;

@FindBy(xpath = "//*[@class='wcfm-text wcfm_email_verified_input']")
    public WebElement VendorConfirm;

@FindBy(xpath = "//*[@id='wcfm_membership_register_button']")
    public WebElement RegisterButton;

    @FindBy(xpath = "//*[@class='wcfm-message email_verification_message wcfm-error']")
    public WebElement Uyarı; //Geçerli mail girin uyarısı

    @FindBy(xpath = "//*[@class='wcfm-message email_verification_message wcfm-success']")
    public WebElement Uyarı2; //Kod gönderildi uyarısı


    @FindBy(xpath = "//*[@id='password_strength']")//passwordda kisa oldu dogrulama
    public WebElement tooShort;

    @FindBy(xpath = "//*[@id='password_strength']" )
    public WebElement good;

    @FindBy(xpath = "//*[@id='password_strength']")
    public WebElement strong;


    @FindBy(xpath = "//*[@id='password_strength']") //passwordda zayif oldugunu dogrulama
    public WebElement Weak;

    @FindBy(xpath = "//*[@class='wcfm-message wcfm-error']")//paasword kisminda olan paralo gucu en az good seviyesinde olmalidir dogrulama
    public WebElement gooddogrulama;

    @FindBy(xpath = "//*[@class='wcfm-message wcfm-error']")//Password and Confirm-password are not same. paralo ve paralo onaylama kismi ayni olmadigini dogrulama
    public  WebElement passwordConfirmHata;

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div/div/div/div/div/div/form/div[3]")//Bu E-posta zaten var dogrulama
    public WebElement Emailalreadyexists;

    @FindBy(xpath = "//*[@class=\"wcfm-message wcfm-error\"]")//gecersiz dogrulama kodu
    public WebElement Verificationcodeinvalid;

    @FindBy(xpath = "//*[@class='hidden-xs hidden-sm klikaciRadek newMail']") //fake mail
    public WebElement FakeMail;

    @FindBy(xpath = "(//h1)[2]")//basarili sekilde kayit olduguna dair dogrulama
    public WebElement basariliKayit;



}




