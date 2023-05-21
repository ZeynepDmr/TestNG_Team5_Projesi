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

public class US_11 extends  ReusableMethods {
VendorSignInLocates vendorSignInLocates;
VendorAddProductLocates vendorAddProductLocates;
Actions actions;

@BeforeMethod
    public void setUp() {
    extentReport();
    extentTest=extentReports.createTest("ExtentTest", "Test Raporu");
    //Kullanıcı anasayfayı açar.
    Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
    extentTest.info("HumComfy sayfasına gidildi");
    ReusableMethods.bekle(5);

    //Kullanıcı Sign In butonuna tıklar
    vendorSignInLocates = new VendorSignInLocates();
    vendorSignInLocates.signInLogin.click();
    extentTest.info("Kullanıcı Sign In butonuna tıkladı");
    ReusableMethods.bekle(5);
}

    @Test
    public void test01() {
        //Kullanıcı username/email alanına Valid bir email girer
        //Kullanıcı password alanına valid bir şifre girer
        vendorSignInLocates.email.sendKeys(ConfigReader.getProperty("Vendor_Username"),
         Keys.TAB, ConfigReader.getProperty("Vendor_Password"));
        extentTest.info("Kullanıcı username alanına geçerli bir email adresi girdi");
        extentTest.info("Kullanıcı password alanına geçerli bir şifre girdi");

        //Kullanıcı SignIn butonuna tıklar
        vendorSignInLocates.signIn2.click();
        extentTest.info("Kullanıcı Sign In butonuna tıkladı");
        ReusableMethods.bekle(5);

        //Kullanıcı My Account sayfasını görüntüler
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(5);
        vendorSignInLocates.myAccount.click();
        extentTest.info("Kullanıcı My Account sayfasını görüntüledi");
        Assert.assertTrue(vendorSignInLocates.myAccount2.isDisplayed());
        extentTest.info("Kullanıcı My Account sayfasında olduğunu doğruladı");
        Driver.closeDriver();
        extentTest.pass("Test sonlandırıldı");
        extentReports.flush();

    }

    @Test
    public void test02() {
        // Dashboard altında ise; Store manager, orders, downloads, addresses ,
        // account details, wishlist, Support tickets, followings ve log out olmali
        vendorSignInLocates.email.sendKeys(ConfigReader.getProperty("Vendor_Username"),
        Keys.TAB, ConfigReader.getProperty("Vendor_Password"));
        vendorSignInLocates.signIn2.click();
        extentTest.info("Kullanıcı geçerli bir email ve password girdi ve Sign In butonuna tıkladı");
        ReusableMethods.bekle(5);
        ReusableMethods.scrollEnd();
        extentTest.info("Kullanıcı sayfanın en alt kısmına geldi");
        ReusableMethods.bekle(5);
        vendorSignInLocates.myAccount.click();
        extentTest.info("Kullanıcı My Account sekmesine tıkladı");

      //Kullanıcı Store Manager alanının tıklanabilir olduğunu doğrular
       vendorSignInLocates.storeManager.click();
        extentTest.info("Kullanıcı Store Manager sekmesine tıkladı");
        Assert.assertTrue(vendorSignInLocates.storeManagerText.isDisplayed());
        extentTest.info("Kullanıcı Store Manager sayfasında olduğunu doğruladı");
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();
        extentTest.info("Kullanıcı back butonuna tıkladı");

        //Kullanıcı Orders alanının tıklanabilir olduğunu doğrular
        vendorSignInLocates.orders2.click();
        extentTest.info("Kullanıcı Orders sekmesine tıkladı");
        Assert.assertTrue(vendorSignInLocates.ordersText.isDisplayed());
        extentTest.info("Kullanıcı Orders sayfasında olduğunu doğruladı");
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();
        extentTest.info("Kullanıcı back butonuna tıkladı");

        //Kullanıcı DOwnloads alanının tıklanabilir olduğunu doğrular
        vendorSignInLocates.downloads2.click();
        extentTest.info("Kullanıcı Downloads sekmesine tıkladı");
        Assert.assertTrue(vendorSignInLocates.downloads2Text.isDisplayed());
        extentTest.info("Kullanıcı Downloads sayfasında olduğunu doğruladı");
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();
        extentTest.info("Kullanıcı back butonuna tıkladı");

        //Kullanıcı Addresses alanının tıklanabilir olduğunu doğrular
        actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Kullanıcı sayfayı aşağı çekti");
        vendorSignInLocates.addresses2.click();
        extentTest.info("Kullanıcı Addresses sekmesine tıkladı");
        Assert.assertTrue(vendorSignInLocates.addresses2Text.isDisplayed());
        extentTest.info("Kullanıcı Addresses sayfasında olduğunu doğruladı");
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();
        extentTest.info("Kullanıcı back butonuna tıkladı");

        //Kullanıcı Account Details alanının tıklanabilir olduğunu doğrular
        vendorSignInLocates.accountDetails2.click();
        extentTest.info("Kullanıcı Account Details sekmesine tıkladı");
        Assert.assertTrue(vendorSignInLocates.accountDetails2Text.isDisplayed());
        extentTest.info("Kullanıcı Account Details sayfasında olduğunu doğruladı");
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();
        extentTest.info("Kullanıcı back butonuna tıkladı");

       //Kullanıcı Wishlist alanının tıklanabilir olduğunu doğrular
        ReusableMethods.bekle(5);
        //ReusableMethods.scrollEnd();
        actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Kullanıcı sayfayı aşağı çekti");
        vendorSignInLocates.wishlist2.click();
        extentTest.info("Kullanıcı Wishlist sekmesine tıkladı");
        Assert.assertTrue(vendorSignInLocates.wishlist2.isDisplayed());
        extentTest.info("Kullanıcı Wishlist sayfasında olduğunu doğruladı");
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();
        extentTest.info("Kullanıcı back butonuna tıkladı");

        //Kullanıcı Support Tickets alanının tıklanabilir olduğunu doğrular
        ReusableMethods.scrollEnd();
        extentTest.info("Kullanıcı sayfayı aşağı kaydırdı");
        vendorSignInLocates.supportTickets.click();
        extentTest.info("Kullanıcı Support Tickets sekmesine tıkladı");
        Assert.assertTrue(vendorSignInLocates.supportTicketsText.isDisplayed());
        extentTest.info("Kullanıcı Support Tickets sayfasında olduğunu doğruladı");
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();
        extentTest.info("Kullanıcı back butonuna tıkladı");

        //Kullanıcı Followings alanının tıklanabilir olduğunu doğrular
        ReusableMethods.scrollEnd();
        extentTest.info("Kullanıcı sayfayı aşağı kaydırdı");
        vendorSignInLocates.followings.click();
        extentTest.info("Kullanıcı Followings sekmesine tıkladı");
        Assert.assertTrue(vendorSignInLocates.followingsText.isDisplayed());
        extentTest.info("Kullanıcı Followings sayfasında olduğunu doğruladı");
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();
        extentTest.info("Kullanıcı back butonuna tıkladı");

        //Kullanıcı Logout alanının tıklanabilir olduğunu doğrular
        ReusableMethods.scrollEnd();
        extentTest.info("Kullanıcı sayfayı aşağı kaydırdı");
        vendorSignInLocates.logout2.click();
        extentTest.info("Kullanıcı Logout sekmesine tıkladı");
        Assert.assertTrue(vendorSignInLocates.logout2Text.isDisplayed());
        extentTest.info("Kullanıcı çıkış yaptığını doğruladı");
        ReusableMethods.bekle(5);
       Driver.closeDriver();
        extentTest.pass("Test sonlandırıldı");
        extentReports.flush();



    }
    @Test
    public void test03(){
        //Orders, Downloads, addresses, account details,whislist ve Logout gorulmeli
        vendorSignInLocates.email.sendKeys(ConfigReader.getProperty("Vendor_Username"),
          Keys.TAB, ConfigReader.getProperty("Vendor_Password"));
        vendorSignInLocates.signIn2.click();
        extentTest.info("Kullanıcı geçerli bir email ve password girdi ve Sign In butonuna tıkladı");
        ReusableMethods.bekle(5);
        ReusableMethods.scrollEnd();
        extentTest.info("Kullanıcı sayfayı aşağı kaydırdı");
        ReusableMethods.bekle(5);
        vendorSignInLocates.myAccount.click();
        extentTest.info("Kullanıcı My Account sekmesine tıkladı");
        ReusableMethods.bekle(5);

        //Kullanıcı Orders sekmesine tıklar
        vendorSignInLocates.orders.click();
        extentTest.info("Kullanıcı Orders sekmesine tıkladı");

        //Kullanıcı Orders sayfasının görüntülendiğini doğrular
        Assert.assertTrue(vendorSignInLocates.ordersText.isDisplayed());
        extentTest.info("Kullanıcı Orders sayfasında olduğunu doğruladı");
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();
        extentTest.info("Kullanıcı geri sekmesine tıkladı");

       //Kullanıcı Downloads sekmesine tıklar
        vendorSignInLocates.downloads.click();
        extentTest.info("Kullanıcı Downloads sekmesine tıkladı");

        //KUllanıcı Downloads sayfasının görüntülendiğini doğrular
        Assert.assertTrue(vendorSignInLocates.downloadsText.isDisplayed());
        extentTest.info("Kullanıcı Downloads sayfasında olduğunu doğruladı");
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();
        extentTest.info("Kullanıcı geri sekmesine tıkladı");

        //KUllanıcı Addresses sekmesine tıklar
        vendorSignInLocates.addresses.click();
        extentTest.info("Kullanıcı Addresses sekmesine tıkladı");

        //KUllanıcı Addresses sayfasının görüntülendiğini doğrular
        Assert.assertTrue(vendorSignInLocates.addressesText.isDisplayed());
        extentTest.info("Kullanıcı Addresses sayfasında olduğunu doğruladı");
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();
        extentTest.info("Kullanıcı geri sekmesine tıkladı");

        //Kullanıcı Account Details sekmesine tıklar
        //ReusableMethods.scrollEnd();
        actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Kullanıcı sayfayı aşağı kaydırdı");
        ReusableMethods.bekle(5);
        vendorSignInLocates.accountDetails.click();
        extentTest.info("Kullanıcı Account Details sekmesine tıkladı");

        //KUllanıcı Account Details sayfasının açıldığını doğrular
        Assert.assertTrue(vendorSignInLocates.accountDetailsText.isDisplayed());
        extentTest.info("Kullanıcı Account Details sayfasında olduğunu doğruladı");
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();
        extentTest.info("Kullanıcı geri sekmesine tıkladı");


        //Kullanıcı Wishlist sekmesine tıklar
        //ReusableMethods.scrollEnd();
        actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Kullanıcı sayfayı aşağı kaydırdı");
        ReusableMethods.bekle(5);
        vendorSignInLocates.wishlist.click();
        extentTest.info("Kullanıcı Wishlist sekmesine tıkladı");

        //Kullanıcı Wishlist sayfasının açıldığını doğrular
        Assert.assertTrue(vendorSignInLocates.wishlistText.isDisplayed());
        extentTest.info("Kullanıcı Wishlist sayfasında olduğunu doğruladı");
        ReusableMethods.bekle(5);
        Driver.getDriver().navigate().back();
        extentTest.info("Kullanıcı geri sekmesine tıkladı");

        //Kullanıcı Logout sekmesine tıklar
        //ReusableMethods.scrollEnd();
        actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Kullanıcı sayfayı aşağı kaydırdı");
        ReusableMethods.bekle(5);
        vendorSignInLocates.logout.click();
        extentTest.info("Kullanıcı Logout sekmesine tıkladı");

        //Kullanıcı Logout olduğunu doğrular
        Assert.assertTrue(vendorSignInLocates.logoutText.isDisplayed());
        extentTest.info("Kullanıcı çıkış yapıldığını doğruladı");
        ReusableMethods.bekle(5);
        Driver.closeDriver();
        extentTest.pass("Test sonlandırıldı");
        extentReports.flush();


    }
}









