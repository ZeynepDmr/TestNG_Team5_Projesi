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

public class US_10 {

    protected ExtentReports extentReports;

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
        bekle(5);

    }

    @AfterMethod
    public void close(){

        Driver.closeDriver();
        extentReports.flush();
    }


    @Test
    public void TC_01() {
        ReusableMethods.extentReport();
        extentReports = ReusableMethods.getExtentReports();
        ExtentTest extentTest;
        extentTest = extentReports.createTest("TC_01");
        VendorRegisterLocates vendorRegisterLocates = new VendorRegisterLocates();
        vendorRegisterLocates.VendorEmail.sendKeys(ConfigReader.getProperty("Vendor_Mail"),Keys.TAB, "123456" );
        bekle(3);
        vendorRegisterLocates.VendorPassword.click();
        vendorRegisterLocates.VendorPassword.sendKeys("aaaa");
        Assert.assertTrue(vendorRegisterLocates.tooShort.isDisplayed());
        extentTest.info("Too Short Uyarısı Görüntülenir");
        bekle(3);
        vendorRegisterLocates.VendorPassword.clear();
        vendorRegisterLocates.VendorPassword.click();
        vendorRegisterLocates.VendorPassword.sendKeys("1234");
        Assert.assertTrue(vendorRegisterLocates.tooShort.isDisplayed());
        extentTest.info("Too Short Uyarısı Görüntülenir");
        bekle(3);
        vendorRegisterLocates.VendorPassword.clear();
        vendorRegisterLocates.VendorPassword.click();
        vendorRegisterLocates.VendorPassword.sendKeys("123456");
        Assert.assertTrue(vendorRegisterLocates.tooShort.isDisplayed());
        extentTest.info("Herhangi 6 karakter girildiğinde Too Short Uyarısı Alınmaz");
        bekle(3);
        vendorRegisterLocates.VendorPassword.clear();
    }

    @Test
    public void TC_02() {
        ReusableMethods.extentReport();
        extentReports = ReusableMethods.getExtentReports();
        ExtentTest extentTest;
        extentTest = extentReports.createTest("TC_01");
        VendorRegisterLocates vendorRegisterLocates = new VendorRegisterLocates();
        vendorRegisterLocates.VendorEmail.sendKeys(ConfigReader.getProperty("Vendor_Mail"),Keys.TAB, "123456" );
        bekle(3);
        vendorRegisterLocates.VendorPassword.click();
        vendorRegisterLocates.VendorPassword.sendKeys("bbbbbb");
        Assert.assertTrue(vendorRegisterLocates.Weak.isDisplayed());
        extentTest.info("Weak Uyarısı Görüntülenir");
        bekle(3);
        vendorRegisterLocates.VendorPassword.clear();
        vendorRegisterLocates.VendorPassword.click();
        vendorRegisterLocates.VendorPassword.sendKeys("******");
        Assert.assertTrue(vendorRegisterLocates.Weak.isDisplayed());
        extentTest.info("Weak Uyarısı Görüntülenir");
        bekle(3);
        vendorRegisterLocates.VendorPassword.clear();
    }

    @Test
    public void TC_03() {
        ReusableMethods.extentReport();
        extentReports = ReusableMethods.getExtentReports();
        ExtentTest extentTest;
        extentTest = extentReports.createTest("TC_01");
        VendorRegisterLocates vendorRegisterLocates = new VendorRegisterLocates();
        vendorRegisterLocates.VendorEmail.sendKeys(ConfigReader.getProperty("Vendor_Mail"),Keys.TAB, "123456" );
        bekle(3);
        vendorRegisterLocates.VendorPassword.click();
        vendorRegisterLocates.VendorPassword.sendKeys("Aaaaaaaa");
        Assert.assertTrue(vendorRegisterLocates.good.isDisplayed());
        extentTest.info("Good Uyarısı Görüntülenir");
        bekle(3);
        vendorRegisterLocates.VendorPassword.clear();
        vendorRegisterLocates.VendorPassword.click();
        vendorRegisterLocates.VendorPassword.sendKeys("1234567*");
        Assert.assertTrue(vendorRegisterLocates.good.isDisplayed());
        extentTest.info("Good Uyarısı Görüntülenir");
        bekle(3);
        vendorRegisterLocates.VendorPassword.clear();

    }

    @Test
    public void TC_04() {
        ReusableMethods.extentReport();
        extentReports = ReusableMethods.getExtentReports();
        ExtentTest extentTest;
        extentTest = extentReports.createTest("TC_01");
        VendorRegisterLocates vendorRegisterLocates = new VendorRegisterLocates();
        vendorRegisterLocates.VendorEmail.sendKeys(ConfigReader.getProperty("Vendor_Mail"),Keys.TAB, "123456" );
        bekle(3);
        vendorRegisterLocates.VendorPassword.click();
        vendorRegisterLocates.VendorPassword.sendKeys("Ab123*");
        Assert.assertTrue(vendorRegisterLocates.tooShort.isDisplayed());
        extentTest.info("Strong Uyarısı Görüntülenir");
        bekle(3);
        vendorRegisterLocates.VendorPassword.clear();
        vendorRegisterLocates.VendorPassword.click();
        vendorRegisterLocates.VendorPassword.sendKeys("1234");
        Assert.assertTrue(vendorRegisterLocates.strong.isDisplayed());
        extentTest.info("Strong Uyarısı Görüntülenir");
        bekle(3);
        vendorRegisterLocates.VendorPassword.clear();
        vendorRegisterLocates.VendorPassword.click();
        vendorRegisterLocates.VendorPassword.sendKeys("123456");
        Assert.assertTrue(vendorRegisterLocates.strong.isDisplayed());
        extentTest.info("Strong Uyarısı Görüntülenir");
        bekle(3);
        vendorRegisterLocates.VendorPassword.clear();
    }
}
