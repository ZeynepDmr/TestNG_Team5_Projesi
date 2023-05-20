package Team05.test.Positive_Test;

import Team05.pages.VendorAddProductLocates;
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
VendorAddProductLocates vendorAddProductLocates;
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
        // Dashboard altında ise; Store manager, orders, downloads, addresses ,
        // account details, wishlist, Support tickets, followings ve log out olmali
        vendorSignInLocates.email.sendKeys(ConfigReader.getProperty("Vendor_Username"),
        Keys.TAB, ConfigReader.getProperty("Vendor_Password"));
        vendorSignInLocates.signIn2.click();
        ReusableMethods.bekle(5);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(5);
        vendorSignInLocates.myAccount.click();

      //Kullanıcı Store Manager alanının tıklanabilir olduğunu doğrular
       vendorSignInLocates.storeManager.click();
        Assert.assertTrue(vendorSignInLocates.storeManagerText.isDisplayed());
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();

        //Kullanıcı Orders alanının tıklanabilir olduğunu doğrular
        vendorSignInLocates.orders2.click();
        Assert.assertTrue(vendorSignInLocates.ordersText.isDisplayed());
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();

        //Kullanıcı DOwnloads alanının tıklanabilir olduğunu doğrular
        vendorSignInLocates.downloads2.click();
        Assert.assertTrue(vendorSignInLocates.downloads2Text.isDisplayed());
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();

        //Kullanıcı Addresses alanının tıklanabilir olduğunu doğrular
        actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        vendorSignInLocates.addresses2.click();
        Assert.assertTrue(vendorSignInLocates.addresses2Text.isDisplayed());
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();

        //Kullanıcı Account Details alanının tıklanabilir olduğunu doğrular
        vendorSignInLocates.accountDetails2.click();
        Assert.assertTrue(vendorSignInLocates.accountDetails2Text.isDisplayed());
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();

       //Kullanıcı Wishlist alanının tıklanabilir olduğunu doğrular
        ReusableMethods.bekle(5);
        //ReusableMethods.scrollEnd();
        actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        vendorSignInLocates.wishlist2.click();
        Assert.assertTrue(vendorSignInLocates.wishlist2.isDisplayed());
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();

        //Kullanıcı Support Tickets alanının tıklanabilir olduğunu doğrular
        ReusableMethods.scrollEnd();
        vendorSignInLocates.supportTickets.click();
        Assert.assertTrue(vendorSignInLocates.supportTicketsText.isDisplayed());
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();

        //Kullanıcı Followings alanının tıklanabilir olduğunu doğrular
        ReusableMethods.scrollEnd();
        vendorSignInLocates.followings.click();
        Assert.assertTrue(vendorSignInLocates.followingsText.isDisplayed());
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();

        //Kullanıcı Logout alanının tıklanabilir olduğunu doğrular
        ReusableMethods.scrollEnd();
        vendorSignInLocates.logout2.click();
        Assert.assertTrue(vendorSignInLocates.logout2Text.isDisplayed());
        ReusableMethods.bekle(5);
       Driver.closeDriver();


    }
    @Test
    public void test03(){
        //Orders, Downloads, addresses, account details,whislist ve Logout gorulmeli
        vendorSignInLocates.email.sendKeys(ConfigReader.getProperty("Vendor_Username"),
          Keys.TAB, ConfigReader.getProperty("Vendor_Password"));
        vendorSignInLocates.signIn2.click();
        ReusableMethods.bekle(5);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(5);
        vendorSignInLocates.myAccount.click();
        ReusableMethods.bekle(5);

        //Kullanıcı Orders sekmesine tıklar
        vendorSignInLocates.orders.click();

        //Kullanıcı Orders sayfasının görüntülendiğini doğrular
        Assert.assertTrue(vendorSignInLocates.ordersText.isDisplayed());
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();

       //Kullanıcı Downloads sekmesine tıklar
        vendorSignInLocates.downloads.click();

        //KUllanıcı Downloads sayfasının görüntülendiğini doğrular
        Assert.assertTrue(vendorSignInLocates.downloadsText.isDisplayed());
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();

        //KUllanıcı Addresses sekmesine tıklar
        vendorSignInLocates.addresses.click();

        //KUllanıcı Addresses sayfasının görüntülendiğini doğrular
        Assert.assertTrue(vendorSignInLocates.addressesText.isDisplayed());
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();

        //Kullanıcı Account Details sekmesine tıklar
        //ReusableMethods.scrollEnd();
        actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(5);
        vendorSignInLocates.accountDetails.click();

        //KUllanıcı Account Details sayfasının açıldığını doğrular
        Assert.assertTrue(vendorSignInLocates.accountDetailsText.isDisplayed());
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();


        //Kullanıcı Wishlist sekmesine tıklar
        //ReusableMethods.scrollEnd();
        actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(5);
        vendorSignInLocates.wishlist.click();

        //Kullanıcı Wishlist sayfasının açıldığını doğrular
        Assert.assertTrue(vendorSignInLocates.wishlistText.isDisplayed());
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();

        //Kullanıcı Logout sekmesine tıklar
        //ReusableMethods.scrollEnd();
        actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(5);
        vendorSignInLocates.logout.click();

        //Kullanıcı Logout olduğunu doğrular
        Assert.assertTrue(vendorSignInLocates.logoutText.isDisplayed());
        ReusableMethods.bekle(5);
        Driver.closeDriver();


    }
}







