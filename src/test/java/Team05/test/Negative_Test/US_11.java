package Team05.test.Negative_Test;

import Team05.pages.VendorSignInLocates;
import Team05.utilities.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class US_11 {
    VendorSignInLocates vendorSignInLocates;

    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }

    @Test(dataProvider = "loginData", dataProviderClass = DataProviderUtils.class)
    public void test01(String email, String password) {

        //Kullanıcı anasayfayı açar.
                Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        ReusableMethods.bekle(5);

        //Kullanıcı Sign In butonuna tıklar
        vendorSignInLocates = new VendorSignInLocates();
        vendorSignInLocates.signInLogin.click();
        ReusableMethods.bekle(5);

        //Kullanıcı username/email alanına geçersiz bir email girer
        //Kullanıcı password alanına geçersiz bir şifre girer
        //Kullanıcı username/email alanına valid bir email girer
        //Kullanıcı password alanına geçersiz bir şifre girer
        // Kullanıcı username/email alanına geçersiz bir email girer
        //Kullanıcı password alanına valid bir şifre girer
        //Kullanıcı "Wrong Username or Password" uyarısı aldığını doğrular
        vendorSignInLocates.email.sendKeys(email, Keys.TAB, password, Keys.ENTER);
        ReusableMethods.bekle(5);
        Assert.assertTrue(vendorSignInLocates.wrongUsernameOrPass.isDisplayed());
        ReusableMethods.tumSayfaResmi();

    }

}
