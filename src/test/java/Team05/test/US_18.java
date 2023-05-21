
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

public class US_18 {
    VendorAddProductLocates vendorAddProductLocates;
    Actions actions;
    Select select;


    @BeforeMethod
    public void setUp() {
        //Kullanıcı anasayfayı açar.
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        ReusableMethods.bekle(5);

        //Kullanıcı Sign In butonuna tıklar
        vendorAddProductLocates =new VendorAddProductLocates();
        vendorAddProductLocates.signInLogin.click();
        ReusableMethods.bekle(5);

        //Kullanıcı username/email alanına Valid bir email girer
        //Kullanıcı password alanına valid bir şifre girer
        vendorAddProductLocates.email.sendKeys(ConfigReader.getProperty("Vendor_Username"),
                Keys.TAB, ConfigReader.getProperty("Vendor_Password"));

        //Kullanıcı SignIn butonuna tıklar
        vendorAddProductLocates.signIn2.click();
        ReusableMethods.bekle(5);

        //Kullanıcı My Account sayfasını görüntüler
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(5);
        vendorAddProductLocates.myAccount0.click();
        Assert.assertTrue(vendorAddProductLocates.myAccount2.isDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }

    @Test
    public void test01(){

                //Kullanıcı Store Manager sekmesine tıklar
        ReusableMethods.bekle(5);
        vendorAddProductLocates.storeManager0.click();

        //Kullanici store manager sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.storeManagerText0.isDisplayed());

        //    Kullanici products menusunün üzerine gelir,
        ReusableMethods.bekle(2);
        actions=new Actions(Driver.getDriver());
        actions.moveToElement(vendorAddProductLocates.products0).perform();
       ReusableMethods.bekle(3);

        //Kullanıcı Add New sekmesine tıklar
        ReusableMethods.bekle(2);
        vendorAddProductLocates.addNew0.click();

        //Kullanıcı Add New sayfasının açıldığını doğrular
        ReusableMethods.bekle(2);
        Assert.assertTrue(vendorAddProductLocates.addNewText.isDisplayed());

        //Kullanıcı dropDown'a tıklar
        //Kullanıcı dropdown menuden External/Affiliate Product seçeneğini seçer
        select=new Select(vendorAddProductLocates.dropDown);
        select.selectByVisibleText("External/Affiliate Product");
        ReusableMethods.bekle(3);

    }

    @Test
    public void test02() {
        //Kullanıcı Store Manager sekmesine tıklar
        ReusableMethods.bekle(5);
        vendorAddProductLocates.storeManager0.click();

        //Kullanici store manager sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.storeManagerText0.isDisplayed());

        //    Kullanici products menusunün üzerine gelir,
        ReusableMethods.bekle(2);
        actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        actions=new Actions(Driver.getDriver());
        actions.moveToElement(vendorAddProductLocates.products0).perform();
        ReusableMethods.bekle(3);

        //Kullanıcı Add New sekmesine tıklar
        ReusableMethods.bekle(2);
        vendorAddProductLocates.addNew0.click();

        //Kullanıcı Add New sayfasının açıldığını doğrular
        ReusableMethods.bekle(2);
        Assert.assertTrue(vendorAddProductLocates.addNewText.isDisplayed());

        //Kullanıcı dropDown'a tıklar
        //Kullanıcı dropdown menuden External/Affiliate Product seçeneğini seçer
        select=new Select(vendorAddProductLocates.dropDown);
        select.selectByVisibleText("External/Affiliate Product");

        //Kullanıcı Product Title alanına bir ürün ismi girer
        vendorAddProductLocates.productTitle0.sendKeys("Apple",
                Keys.TAB, "www.bestapple.com", Keys.TAB, "Best Apple", Keys.TAB, "20$", Keys.TAB, "25$", Keys.TAB, Keys.TAB);

        //Kullanıcı Short Description ve Description alanlarıne bir değer girer
        Driver.getDriver().switchTo().frame(0);
        vendorAddProductLocates.shortDescription0.sendKeys("This is the best apple in the world!",
                Keys.TAB, Keys.TAB, "This apple is red and juicy. " +
                        "It is one of the most expensive apples in the world. It is grown in Amasya, Turkey.");
        ReusableMethods.bekle(2);

    }

    @Test
    public void test03() {

        //Kullanıcı Store Manager sekmesine tıklar
        ReusableMethods.bekle(5);
        vendorAddProductLocates.storeManager0.click();

        //Kullanici store manager sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.storeManagerText0.isDisplayed());

        //Kullanıcı Product sekmesine tıklar
        ReusableMethods.bekle(2);
        actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        Driver.getDriver();
        ReusableMethods.click(vendorAddProductLocates.products0);

        //KUullanıcı Product Dashboard sayfasını görüntüler
        ReusableMethods.bekle(2);
        Assert.assertTrue(vendorAddProductLocates.productDashboardText0.isDisplayed());

        //Kullanıcı ürün arama kutusuna girdiği ürünün ismini yazar ve ENTER tuşuna basar
        ReusableMethods.bekle(2);
        actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(4);
        vendorAddProductLocates.searchKutusu0.sendKeys("apple", Keys.ENTER);

        //Kullanıcı  eklemiş olduğu ürünü görüntüler
        ReusableMethods.bekle(5);
        Assert.assertTrue(vendorAddProductLocates.girilenProduct0.isDisplayed());
    }
}
