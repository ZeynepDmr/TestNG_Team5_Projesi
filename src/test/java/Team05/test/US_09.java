package Team05.test;

import Team05.pages.VendorRegisterLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.*;

import static Team05.utilities.ReusableMethods.bekle;


public class US_09  {
    protected  ExtentReports extentReports;

    @BeforeMethod
    public void setUpExtentReport(){
        ReusableMethods.extentReport();
        extentReports = ReusableMethods.getExtentReports();
        ExtentTest extentTest;
        extentTest = extentReports.createTest("TC_01");
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        VendorRegisterLocates vendorRegisterLocates = new VendorRegisterLocates();
        vendorRegisterLocates.VendorRegister.click();
        extentTest.info("Register butonuna tıklandı");
        bekle(3);
        Assert.assertTrue(vendorRegisterLocates.BecomeVRegister.isEnabled());
        extentTest.info("Become a Vendor Butonu erişilebilir");
        bekle(3);
        vendorRegisterLocates.BecomeVRegister.click();
    }

    @AfterMethod
    public void close(){

        Driver.closeDriver();
        extentReports.flush();
    }

    @Test
    public void TC_02() {
        ReusableMethods.extentReport();
        extentReports = ReusableMethods.getExtentReports();
        ExtentTest extentTest;
        extentTest = extentReports.createTest("TC_02");
        VendorRegisterLocates vendorRegisterLocates = new VendorRegisterLocates();
        Assert.assertTrue(vendorRegisterLocates.VendorEmail.isEnabled());
        extentTest.info("Vendor Email boxı erişilebilir");
        vendorRegisterLocates.VendorEmail.click();
        bekle(2);
        vendorRegisterLocates.VendorEmail.sendKeys("team5vendorgmail.com", Keys.TAB, "123456");
        bekle(3);
        Assert.assertTrue(vendorRegisterLocates.Uyarı.isDisplayed());
        extentTest.info("Geçersiz Email Uyarısı alınır");
        vendorRegisterLocates.VendorEmail.clear();
        vendorRegisterLocates.VendorEmail.sendKeys("team5vendor@gmail", Keys.TAB, "123456");
        bekle(2);
        Assert.assertTrue(vendorRegisterLocates.Uyarı.isDisplayed());
        extentTest.info("Geçersiz Email Uyarısı alınır");
        vendorRegisterLocates.VendorEmail.clear();
        //TC_03
        vendorRegisterLocates.VendorEmail.sendKeys(ConfigReader.getProperty("Vendor_Mail"),Keys.TAB, "123456");
        bekle(2);
        Assert.assertTrue(vendorRegisterLocates.Uyarı2.isDisplayed());
        extentTest.info("Onay kodu gönderildi  uyarısı görüntülenebilir");
        vendorRegisterLocates.VendorEmail.clear();

    }

    @Test
    public void TC_04() {
        ReusableMethods.extentReport();
        extentReports = ReusableMethods.getExtentReports();
        ExtentTest extentTest;
        extentTest = extentReports.createTest("TC_04");
        VendorRegisterLocates vendorRegisterLocates = new VendorRegisterLocates();
        vendorRegisterLocates.VendorEmail.click();
        bekle(3);
        vendorRegisterLocates.VendorEmail.sendKeys(ConfigReader.getProperty("Fake_Mail"),Keys.TAB,"123456",Keys.ENTER);
        bekle(3);
        Assert.assertTrue(vendorRegisterLocates.VerificationCode.isEnabled());
        extentTest.info("Onay Kodu Kutusu Erişilebilir");
        vendorRegisterLocates.VendorPassword.click();
        bekle(2);
        vendorRegisterLocates.VendorPassword.sendKeys(ConfigReader.getProperty("Vendor_Password"),Keys.TAB);
        bekle(5);
        vendorRegisterLocates.PasswordConfirm.sendKeys(ConfigReader.getProperty("Vendor_Password"), Keys.TAB);
        bekle(10);



    }

    @Test
    public void TC_05() {
        ReusableMethods.extentReport();
        extentReports = ReusableMethods.getExtentReports();
        ExtentTest extentTest;
        extentTest = extentReports.createTest("TC_05");
        VendorRegisterLocates vendorRegisterLocates = new VendorRegisterLocates();
        bekle(5);
        vendorRegisterLocates.VendorEmail.sendKeys(ConfigReader.getProperty("Vendor_Mail"),Keys.TAB, "123456" );
        bekle(3);
        Assert.assertTrue(vendorRegisterLocates.VendorConfirm.isDisplayed());
        extentTest.info("Mail Adresinize Kod Gönderildi Uyarısı Görüntülenir");
        vendorRegisterLocates.VendorPassword.click();
        vendorRegisterLocates.VendorPassword.sendKeys("Tea5*");
        Assert.assertTrue(vendorRegisterLocates.tooShort.isDisplayed()); //tooshort yasısı görüntülendi
        extentTest.info("Too Short Uyarısı Görüntülenir");
        bekle(3);
        vendorRegisterLocates.VendorPassword.clear();
        vendorRegisterLocates.VendorPassword.sendKeys("Team55");
        Assert.assertTrue(vendorRegisterLocates.good.isDisplayed()); //good yazısı doğrulama
        extentTest.info("Good Uyarısı Görüntülenebilir");
        bekle(3);
        vendorRegisterLocates.VendorPassword.clear();
        vendorRegisterLocates.VendorPassword.sendKeys("Team*555*"); //sadece harf weak
        extentTest.info("Strong Uyarısı Görüntülebilir");
        bekle(10);
        Assert.assertTrue(vendorRegisterLocates.strong.isDisplayed());
        bekle(3);
        vendorRegisterLocates.VendorPassword.clear();
        vendorRegisterLocates.VendorPassword.sendKeys("teamaa"); //sadece harf weak
        Assert.assertTrue(vendorRegisterLocates.Weak.isDisplayed());
        extentTest.info("Weak Uyarısı Görüntülebilir");
        bekle(3);
        vendorRegisterLocates.PasswordConfirm.sendKeys("teamaa",Keys.ENTER);
        Assert.assertTrue(vendorRegisterLocates.gooddogrulama.isDisplayed());
        extentTest.info("En Az 'Good Olmalı' Uyarısı Görüntülebilir");


    }

    @Test
    public void TC_06() {
        ReusableMethods.extentReport();
        extentReports = ReusableMethods.getExtentReports();
        ExtentTest extentTest;
        extentTest = extentReports.createTest("TC_06");
        VendorRegisterLocates vendorRegisterLocates = new VendorRegisterLocates();
        vendorRegisterLocates.VendorEmail.sendKeys(ConfigReader.getProperty("Vendor_Mail"),Keys.TAB, "123456" );
        bekle(3);
        vendorRegisterLocates.VendorPassword.click();
        vendorRegisterLocates.VendorPassword.sendKeys(ConfigReader.getProperty("Vendor_Password"),Keys.TAB,"Team*111*",Keys.ENTER);
        bekle(4);
        Assert.assertTrue(vendorRegisterLocates.passwordConfirmHata.isDisplayed());
        extentTest.info("Parolalar Uyuşmuyor Hatası Görüntülenebilir");

    }

    @Test
    public void TC_07() {
        ReusableMethods.extentReport();
        extentReports = ReusableMethods.getExtentReports();
        ExtentTest extentTest;
        extentTest = extentReports.createTest("TC_07");
        VendorRegisterLocates vendorRegisterLocates = new VendorRegisterLocates();
        bekle(4);
        vendorRegisterLocates.VendorEmail.click();
        bekle(3);
        vendorRegisterLocates.VendorEmail.sendKeys(ConfigReader.getProperty("Vendor_Mail"),Keys.TAB,ConfigReader.getProperty("Vendor_Code") );
        bekle(3);
        vendorRegisterLocates.VendorPassword.click();
        bekle(2);
        vendorRegisterLocates.VendorPassword.sendKeys(ConfigReader.getProperty("Vendor_Password"),Keys.TAB);
        bekle(5);
        vendorRegisterLocates.PasswordConfirm.sendKeys(ConfigReader.getProperty("Vendor_Password"),Keys.ENTER);
        bekle(5);
        Assert.assertTrue(vendorRegisterLocates.Emailalreadyexists.isDisplayed());
        extentTest.info("Email Adresi Daha Önce Alınmıştır Uyarısı Görüntülebilir");


    }



}








