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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class US_18 extends ReusableMethods {
    VendorAddProductLocates vendorAddProductLocates;
    Actions actions;
    Select select;


    @BeforeMethod
    public void setUp() {
        extentReport();
        extentTest=extentReports.createTest("ExtentTest", "Test Raporu");
        //Kullanıcı anasayfayı açar.
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("HumComfy sayfasına gidildi");
        ReusableMethods.bekle(5);

        //Kullanıcı Sign In butonuna tıklar
        vendorAddProductLocates =new VendorAddProductLocates();
        vendorAddProductLocates.signInLogin0.click();
        extentTest.info("Kullanıcı Sign In sekmesine tıkladı");
        ReusableMethods.bekle(5);

        //Kullanıcı username/email alanına Valid bir email girer
        //Kullanıcı password alanına valid bir şifre girer
        vendorAddProductLocates.email.sendKeys(ConfigReader.getProperty("Vendor_Username"),
                Keys.TAB, ConfigReader.getProperty("Vendor_Password"));
        extentTest.info("Kullanıcı geçerli bir email ve password girdi");

        //Kullanıcı SignIn butonuna tıklar
        vendorAddProductLocates.signIn0.click();
        extentTest.info("Kullanıcı Sign In sekmesine tıkladı");
        ReusableMethods.bekle(5);

        //Kullanıcı My Account sayfasını görüntüler
        ReusableMethods.scrollEnd();
        extentTest.info("Kullanıcı sayfayı aşağı kaydırdı");
        ReusableMethods.bekle(5);
        vendorAddProductLocates.myAccount0.click();
        extentTest.info("Kullanıcı My Account sekmesine tıkladı");
        Assert.assertTrue(vendorAddProductLocates.myAccount2.isDisplayed());
        extentTest.info("Kullanıcı My Account sayfasında olduğunu doğruladı");
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
        extentTest.pass("Test sonlandırıldı");
        extentReports.flush();
    }

    @Test
    public void test01(){

                //Kullanıcı Store Manager sekmesine tıklar
        ReusableMethods.bekle(5);
        vendorAddProductLocates.storeManager0.click();
        extentTest.info("Kullanıcı Store Manager sekmesine tıkladı");

        //Kullanici store manager sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.storeManagerText0.isDisplayed());
        extentTest.info("Kullanıcı Store Manager sayfasında olduğunu doğruladı");

        //    Kullanici products menusunün üzerine gelir,
        ReusableMethods.bekle(2);
        actions=new Actions(Driver.getDriver());
        actions.moveToElement(vendorAddProductLocates.products0).perform();
        extentTest.info("Kullanıcı pointer'ı Products sekmesine üzerine getirdi");
       ReusableMethods.bekle(3);

        //Kullanıcı Add New sekmesine tıklar
        ReusableMethods.bekle(2);
        vendorAddProductLocates.addNew0.click();
        extentTest.info("Kullanıcı Add New sekmesine tıkladı");

        //Kullanıcı Add New sayfasının açıldığını doğrular
        ReusableMethods.bekle(2);
        Assert.assertTrue(vendorAddProductLocates.addNewText0.isDisplayed());
        extentTest.info("Kullanıcı Add New sayfasında olduğunu doğruladı");

        //Kullanıcı dropDown'a tıklar
        //Kullanıcı dropdown menuden External/Affiliate Product seçeneğini seçer
        select=new Select(vendorAddProductLocates.dropDown0);
        select.selectByVisibleText("External/Affiliate Product");
        extentTest.info("Kullanıcı DropDown menuden External/Affiliate Product'ı seçti");
        ReusableMethods.bekle(3);

    }

    @Test
    public void test02() {
        //Kullanıcı Store Manager sekmesine tıklar
        ReusableMethods.bekle(5);
        vendorAddProductLocates.storeManager0.click();
        extentTest.info("Kullanıcı Store Manager sekmesine tıkladı");

        //Kullanici store manager sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.storeManagerText0.isDisplayed());
        extentTest.info("Kullanıcı Store Manager sayfasında olduğunu doğruladı");

        //    Kullanici products menusunün üzerine gelir,
        ReusableMethods.bekle(2);
        actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Kullanıcı sayfayı aşağı kaydırdı");
        ReusableMethods.bekle(2);
        actions=new Actions(Driver.getDriver());
        actions.moveToElement(vendorAddProductLocates.products0).perform();
        extentTest.info("Kullanıcı pointer'ı Products sekmesine üzerine getirdi");
        ReusableMethods.bekle(3);

        //Kullanıcı Add New sekmesine tıklar
        ReusableMethods.bekle(2);
        vendorAddProductLocates.addNew0.click();
        extentTest.info("Kullanıcı Add New sekmesine tıkladı");


        //Kullanıcı Add New sayfasının açıldığını doğrular
        ReusableMethods.bekle(2);
        Assert.assertTrue(vendorAddProductLocates.addNewText0.isDisplayed());
        extentTest.info("Kullanıcı Add New sayfasında olduğunu doğruladı");

        //Kullanıcı dropDown'a tıklar
        //Kullanıcı dropdown menuden External/Affiliate Product seçeneğini seçer
        select=new Select(vendorAddProductLocates.dropDown0);
        select.selectByVisibleText("External/Affiliate Product");
        extentTest.info("Kullanıcı DropDown menuden External/Affiliate Product'ı seçti");

        //Kullanıcı Product Title alanına bir ürün ismi girer
        vendorAddProductLocates.productTitle0.sendKeys("Apple",
                Keys.TAB, "www.bestapple.com", Keys.TAB, "Best Apple", Keys.TAB, "20$", Keys.TAB, "25$", Keys.TAB, Keys.TAB);
        extentTest.info("Kullanıcı Product Title alanına Apple, URL alanına www.bestapple.com, " +
                "Button Text alanına Best Apple, Price alanına 20$ ve Sale Price alanı 25$ bilgilerini girdi");

        //Kullanıcı Short Description ve Description alanlarıne bir değer girer
        Driver.getDriver().switchTo().frame(0);
        vendorAddProductLocates.shortDescription0.sendKeys("This is the best apple in the world!",
                Keys.TAB, Keys.TAB, "This apple is red and juicy. " +
                        "It is one of the most expensive apples in the world. It is grown in Amasya, Turkey.");
        extentTest.info("Kullanıcı Short Description alanına This apple is red and juicy, " +
                "Description alanına da It is one of the most expensive apples in the world. It is grown in Amasya, Turkey bilgisini girdi ");
        ReusableMethods.bekle(2);

    }

    @Test
    public void test03() {

        //Kullanıcı Store Manager sekmesine tıklar
        ReusableMethods.bekle(5);
        vendorAddProductLocates.storeManager0.click();
        extentTest.info("Kullanıcı Store Manager sekmesine tıkladı");

        //Kullanici store manager sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.storeManagerText0.isDisplayed());
        extentTest.info("Kullanıcı Store Manager sayfasında olduğunu doğruladı");

        //Kullanıcı Product sekmesine tıklar
        ReusableMethods.bekle(2);
        actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Kullanıcı sayfayı aşağı kaydırdı");
        ReusableMethods.bekle(2);
        Driver.getDriver();
        ReusableMethods.click(vendorAddProductLocates.products0);
        extentTest.info("Kullanıcı Products sekmesine tıklar");

        //Kullanıcı Product Dashboard sayfasını görüntüler
        ReusableMethods.bekle(2);
        Assert.assertTrue(vendorAddProductLocates.productDashboardText0.isDisplayed());
        extentTest.info("Kullanıcı Product Dashboard sayfasının görüntülendiğini doğruladı");

        //Kullanıcı ürün arama kutusuna girdiği ürünün ismini yazar ve ENTER tuşuna basar
        ReusableMethods.bekle(2);
        actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Kullanıcı sayfayı aşağı kaydırdı");
        ReusableMethods.bekle(4);
        vendorAddProductLocates.searchKutusu0.sendKeys("apple", Keys.ENTER);
        extentTest.info("Kullanıcı arama kutusuna eklemiş olduğu ürünün ismini girdi");

        //Kullanıcı  eklemiş olduğu ürünü görüntüler
        ReusableMethods.bekle(5);
        Assert.assertTrue(vendorAddProductLocates.girilenProduct0.isDisplayed());
        extentTest.info("Kullanıcı eklemiş olduğu ürünü görüntüledi");
    }
}


