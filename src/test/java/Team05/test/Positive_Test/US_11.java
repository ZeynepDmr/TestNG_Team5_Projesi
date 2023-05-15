package Team05.test.Positive_Test;

import Team05.pages.VendorSignInLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.DataProviderUtils;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US_11 {
VendorSignInLocates vendorSignInLocates;
Actions actions;

@BeforeMethod
    public void setUp() {
    //Kullanıcı anasayfayı açar.
    Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
    ReusableMethods.bekle(5);

    //Kullanıcı Sign In butonuna tıklar
    vendorSignInLocates = new VendorSignInLocates();
    vendorSignInLocates.signInLogin.click();
    ReusableMethods.bekle(5);
}

    @Test
    public void test01() {
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
        Driver.closeDriver();

    }

    @Test
    public void test02() {
    //Orders, Downloads, addresses, account details,whislist ve Logout gorulmeli
        vendorSignInLocates.email.sendKeys(ConfigReader.getProperty("Vendor_Username"),
        Keys.TAB, ConfigReader.getProperty("Vendor_Password"));
        vendorSignInLocates.signIn2.click();
        ReusableMethods.bekle(5);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(5);
        vendorSignInLocates.myAccount.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
         Assert.assertTrue(vendorSignInLocates.orders.isDisplayed());
        Assert.assertTrue(vendorSignInLocates.downloads.isDisplayed());
        Assert.assertTrue(vendorSignInLocates.addresses.isDisplayed());
        Assert.assertTrue(vendorSignInLocates.accountDetails.isDisplayed());
        Assert.assertTrue(vendorSignInLocates.wishlist.isDisplayed());
        Assert.assertTrue(vendorSignInLocates.logout.isDisplayed());
        Driver.closeDriver();

    }
    @Test
    public void test03(){
        //Dashboard altında ise; Store manager, orders, downloads, addresses ,
        // account details, wishlist, Support tickets, followings ve log out olmali
        vendorSignInLocates.email.sendKeys(ConfigReader.getProperty("Vendor_Username"),
       Keys.TAB, ConfigReader.getProperty("Vendor_Password"));
        vendorSignInLocates.signIn2.click();
        ReusableMethods.bekle(5);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(5);
        vendorSignInLocates.myAccount.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    Assert.assertTrue(vendorSignInLocates.storeManager.isDisplayed());
    Assert.assertTrue(vendorSignInLocates.orders2.isDisplayed());
    Assert.assertTrue(vendorSignInLocates.downloads2.isDisplayed());
    Assert.assertTrue(vendorSignInLocates.addresses2.isDisplayed());
    Assert.assertTrue(vendorSignInLocates.accountDetails2.isDisplayed());
    Assert.assertTrue(vendorSignInLocates.wishlist2.isDisplayed());
    Assert.assertTrue(vendorSignInLocates.supportTickets.isDisplayed());
    Assert.assertTrue(vendorSignInLocates.followings.isDisplayed());
    Assert.assertTrue(vendorSignInLocates.logout2.isDisplayed());
    Driver.closeDriver();

    }
}







