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

@FindBy(xpath = "//*[@id='confirm_pwd']")
    public WebElement VendorConfirm;

@FindBy(xpath = "//*[@id='wcfm_membership_register_button']")
    public WebElement RegisterButton;

    @FindBy(xpath = "//div[@class='wcfm-message email_verification_message'")
    public WebElement Thisfieldisrequired; //E-posta Doğrulama Kodu: Bu alan zorunludur. kismi

    @FindBy(xpath = "//div[@class='wcfm-message wcfm-error']")
//Lütfen geçerli bir e-posta adresi girin. kismi @ veya.com denmedigigde
    public WebElement gecerliEpostaDogrulama;




}
