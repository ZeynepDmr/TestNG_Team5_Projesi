package Team05.test;

import Team05.pages.VendorAddProductLocates;
import Team05.pages.VendorSignInLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US_18 {
    VendorAddProductLocates vendorAddProductLocates;
    VendorSignInLocates vendorSignInLocates;
    Actions actions;
    Select select;

    @Test
    public void test01(){
        //Kullanıcı anasayfayı açar.
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        ReusableMethods.bekle(5);

        //Kullanıcı Sign In butonuna tıklar
        vendorSignInLocates = new VendorSignInLocates();
        vendorSignInLocates.signInLogin.click();
        ReusableMethods.bekle(5);

        //Kullanıcı username/email alanına Valid bir email girer
        //Kullanıcı password alanına valid bir şifre girer
        vendorSignInLocates.email.sendKeys(ConfigReader.getProperty("Vendor_Username"),
                Keys.TAB, ConfigReader.getProperty("Vendor_Password"));

        //Kullanıcı SignIn butonuna tıklar
        vendorSignInLocates.signIn2.click();
        ReusableMethods.bekle(5);

        //Kullanıcı My Account sayfasını görüntüler
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(5);
        vendorSignInLocates.myAccount.click();
        Assert.assertTrue(vendorSignInLocates.myAccount2.isDisplayed());

        //Kullanıcı Store Manager sekmesine tıklar
        ReusableMethods.bekle(5);
        vendorAddProductLocates.storemanager.click();

        //Kullanici store manager sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.storeManagerText.isDisplayed());

        //    Kullanici products menusune tiklar
        ReusableMethods.bekle(2);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        ReusableMethods.click(vendorAddProductLocates.products);

        //Kullanıcı dropDown'a tıklar
        select=new Select(vendorAddProductLocates.dropDown);
        select.selectByVisibleText("External/Affiliate Product");


    }

}
