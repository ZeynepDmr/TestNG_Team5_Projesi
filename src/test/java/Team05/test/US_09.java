package Team05.test;

import Team05.pages.VendorRegisterLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import static Team05.utilities.ReusableMethods.bekle;
import static Team05.utilities.ReusableMethods.fakerInput;

public class US_09 {
    ExtentReports extentReports; //Raporlamayı başlatır
    ExtentHtmlReporter extentHtmlReporter;//Raporu HTML formatında düzenler
    ExtentTest extentTest;//Tüm test aşamalarında extentTest objesi ile bilgi ekleriz
    @BeforeTest
    public void TC_01() {

        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        VendorRegisterLocates vendorRegisterLocates = new VendorRegisterLocates();
        vendorRegisterLocates.VendorRegister.click();
        bekle(3);
        Assert.assertTrue(vendorRegisterLocates.BecomeVRegister.isEnabled());
        bekle(3);
        vendorRegisterLocates.BecomeVRegister.click();

    }
    @AfterTest
    public void close(){
        Driver.closeDriver();
    }


    @Test
    public void TC_02() {
        VendorRegisterLocates vendorRegisterLocates = new VendorRegisterLocates();
        Assert.assertTrue(vendorRegisterLocates.VendorEmail.isEnabled());
        vendorRegisterLocates.VendorEmail.click();
        bekle(2);
        vendorRegisterLocates.VendorEmail.sendKeys("team5vendorgmail.com", Keys.TAB, "123456");
        bekle(3);
        Assert.assertTrue(vendorRegisterLocates.Uyarı.isDisplayed());
        vendorRegisterLocates.VendorEmail.clear();
        vendorRegisterLocates.VendorEmail.sendKeys("team5vendor@gmail", Keys.TAB, "123456");
        bekle(2);
        Assert.assertTrue(vendorRegisterLocates.Uyarı.isDisplayed());
        vendorRegisterLocates.VendorEmail.clear();
        //TC_03
        vendorRegisterLocates.VendorEmail.sendKeys(ConfigReader.getProperty("Vendor_Mail"),Keys.TAB, "123456");
        bekle(2);
        Assert.assertTrue(vendorRegisterLocates.Uyarı2.isDisplayed());
    }

    @Test
    public void TC_05() {
        VendorRegisterLocates vendorRegisterLocates = new VendorRegisterLocates();
        Assert.assertTrue(vendorRegisterLocates.VendorConfirm.isDisplayed());
        //vendorRegisterLocates.VendorEmail.click();
        vendorRegisterLocates.VendorEmail.sendKeys(ConfigReader.getProperty("Vendor_Mail"),Keys.TAB, "123456" );
        bekle(3);
        vendorRegisterLocates.VendorPassword.click();
        vendorRegisterLocates.VendorPassword.sendKeys("Tea5*");
        bekle(3);
        Assert.assertTrue(vendorRegisterLocates.tooShort.isDisplayed());
        vendorRegisterLocates.VendorPassword.clear();
        vendorRegisterLocates.VendorPassword.sendKeys("Team5*");

        /*vendorRegisterLocates.VendorPassword.sendKeys("Team**");
        vendorRegisterLocates.VendorPassword.sendKeys("Team55");
        vendorRegisterLocates.VendorPassword.sendKeys("Team*555*");*/

    }

    @Test
    public void TC_06() {
        VendorRegisterLocates vendorRegisterLocates = new VendorRegisterLocates();
        vendorRegisterLocates.VendorEmail.sendKeys(ConfigReader.getProperty("Vendor_Mail"),Keys.TAB, "123456" );
        bekle(3);
        vendorRegisterLocates.VendorPassword.click();
        vendorRegisterLocates.VendorPassword.sendKeys(ConfigReader.getProperty("Vendor_Password"),Keys.TAB,"Team*111*");

    }



    //madde bir git add .
        //git commit -m""
        // git branch: hangi branchte oldugumu gösterir ayrıca branch listemi de gösterir
        //git branch (branch ismi): olusturmak istedigim branchtir
        //git checkout (branch ismi): hangi branche geçmek istersem bunu kullanırız
        //git merge branch ismi: branchimi merge yapmak (birlestirmek) istedigimde kullanırım.
        // master ve maindeyken merge yapmamak gerekli

        //branchte yapılan değişikler için her zaman git add it commit -m yapmak gerek
        //branchte yapılan değişiklikler main'e geçtikten sonra MERGE edilir

        //"değisiklik yaptıktan sonra değişikliği birleştirmek için "git merge "main""



}
