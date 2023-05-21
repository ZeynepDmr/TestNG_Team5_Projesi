package Team05.test;

import Team05.pages.VendorAddProductLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class US_15 {

    VendorAddProductLocates vendorAddProductLocates;
    Actions actions;
    Select select;

    public static ExtentReports extentReports;

    @BeforeTest
    public  void beforeTest() {
        ReusableMethods.extentReport();
        extentReports = ReusableMethods.getExtentReports();


    }


    @Test
    public void test02() {
        ExtentTest extentTest;
        extentTest = extentReports.createTest("testcase02");


        //     Kullanici url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));

         extentTest.info("Hubcomfy sayfasina gidildi");
//     Kullanici sigin tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.login23.click();
         extentTest.info("Sing in butonuna tiklandi");


//        Kullanici gecerli email ve password girer
        vendorAddProductLocates.email23.sendKeys(ConfigReader.getProperty("Vendor_Username"));
        vendorAddProductLocates.password23.sendKeys(ConfigReader.getProperty("Vendor_Password"));
        vendorAddProductLocates.signin23.click();
       extentTest.info(" siteye vendor olarak giriş yapildi");


//        Kullanici my account tiklar
        ReusableMethods.bekle(4);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(3);
        Driver.getDriver();
        vendorAddProductLocates.myAccount23.click();
        extentTest.info("my account tiklandi");


//        Kullanici store manager menusune tiklar
        ReusableMethods.bekle(2);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        vendorAddProductLocates.storemanager23.click();
       extentTest.info("store manage tiklandi");

//     Kullanici store manage yazisini gorur
        Assert.assertTrue(vendorAddProductLocates.storeManagerText23.isDisplayed());
        extentTest.info("store manage sayfasi goruntulendi");
//        Kullanici products menusune tiklar
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(3);
        ReusableMethods.click(vendorAddProductLocates.products23);
         extentTest.info("products menusu tiklandi");


//        Kullanici products sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.productsText23.isDisplayed());
         extentTest.info("products  sayfasi goruntulendi");

//        Kullanici products sayfasinda add new butonuna tiklar
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        vendorAddProductLocates.addNew23.click();
      extentTest.info("add new butonu tiklandi");

//        Kullanici Add Product sayfasina gider
        ReusableMethods.bekle(3);
        Assert.assertTrue(vendorAddProductLocates.addProductText23.isDisplayed());
        extentTest.info("Add products  sayfasi goruntulendi");
//        Kullanici Inventory, Shipping, Attributes, Linked, Seo, Toptan Ürün Gösterme Ayarları, Advanced menülerini görür
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        Assert.assertTrue(vendorAddProductLocates.menu23.isDisplayed());
        ReusableMethods.webElementResmi(vendorAddProductLocates.menu23);
        extentTest.info("menuler goruntelendi");


//        Kullanici Inventory secenegine  tiklar
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        ReusableMethods.click(vendorAddProductLocates.inventory23);
        extentTest.info("inventory tiklandi");



//        Kullanici  SKU alanına bir deger girer
        ReusableMethods.bekle(2);
        vendorAddProductLocates.sku23.sendKeys("in stock");
        extentTest.info("SKU alanina deger girildi");

//        Kullanici Manage Stock secegine tiklar
        ReusableMethods.bekle(2);
        vendorAddProductLocates.manageStock23.click();
        extentTest.info(" Manage Stock tiklandi");


//      Kullanici Stock Qty alanina bir deger girer
        ReusableMethods.bekle(2);
        vendorAddProductLocates.stockqty23.sendKeys("2");
        extentTest.info("Stock Qty alanina deger girildi");

//     Kullanici Stock status menusune tiklar
        ReusableMethods.bekle(2);
        select = new Select(vendorAddProductLocates.stockStatus23);
        List<WebElement> selectList = select.getOptions();
        for (WebElement w:selectList) {
            System.out.println(w.getText());

        }
        extentTest.info("  Stock status tiklandi");

//     Kullanici Sold Individually secenegine tiklar
        ReusableMethods.bekle(2);
        vendorAddProductLocates.soldIndividually23.click();
        extentTest.info("Sold Individually tiklandi");

        Driver.closeDriver();
        extentTest.pass("Test basarili bir sekilde sonlandirildi");
        extentReports.flush();
    }

    @Test
    public void test03() {
        ExtentTest extentTest;
        extentTest = extentReports.createTest("testcase03");

//     Kullanici url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
       extentTest.info("Hubcomfy sayfasina gidildi");
//     Kullanici sigin tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.login23.click();
     extentTest.info("Sing in butonuna tiklandi");


//        Kullanici gecerli email ve password girer
        vendorAddProductLocates.email23.sendKeys(ConfigReader.getProperty("Vendor_Username"));
        vendorAddProductLocates.password23.sendKeys(ConfigReader.getProperty("Vendor_Password"));
        vendorAddProductLocates.signin23.click();
      extentTest.info(" siteye vendor olarak giriş yapildi");


//        Kullanici my account tiklar
        ReusableMethods.bekle(4);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(3);
        Driver.getDriver();
        vendorAddProductLocates.myAccount23.click();
      extentTest.info("my account tiklandi");

//        Kullanici store manager menusune tiklar
        ReusableMethods.bekle(2);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        vendorAddProductLocates.storemanager23.click();
         extentTest.info("store manage tiklandi");

//     Kullanici store manage yazisini gorur
        Assert.assertTrue(vendorAddProductLocates.storeManagerText23.isDisplayed());
        extentTest.info("store manage sayfasi goruntulendi");

//        Kullanici products menusune tiklar
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(3);
        ReusableMethods.click(vendorAddProductLocates.products23);
        extentTest.info("products menusu tiklandi");


//        Kullanici products sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.productsText23.isDisplayed());
       extentTest.info("products  sayfasi goruntulendi");

//        Kullanici products sayfasinda add new butonuna tiklar
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        vendorAddProductLocates.addNew23.click();
      extentTest.info("add new butonu tiklandi");

//        Kullanici Add Product sayfasina gider
        ReusableMethods.bekle(3);
        Assert.assertTrue(vendorAddProductLocates.addProductText23.isDisplayed());
        extentTest.info("Add products  sayfasi goruntulendi");

//        Kullanici Inventory, Shipping, Attributes, Linked, Seo, Toptan Ürün Gösterme Ayarları, Advanced menülerini görür
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        Assert.assertTrue(vendorAddProductLocates.menu23.isDisplayed());
        ReusableMethods.webElementResmi(vendorAddProductLocates.menu23);
      extentTest.info("menuler goruntelendi");



        //        Kullanici Shipping secenegine  tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        ReusableMethods.click(vendorAddProductLocates.shipping23);
        extentTest.info("Shipping tiklandi");


//        Kullanici Weight (kg) alanina bir deger girer
        ReusableMethods.bekle(2);
        vendorAddProductLocates.weight23.sendKeys("15");
        extentTest.info("Weight (kg) deger girildi");

//        Kullanici Dimensions (cm) alanina  deger girer
        ReusableMethods.bekle(2);
        vendorAddProductLocates.lenghtDimensions23.sendKeys("20",Keys.TAB,"10",Keys.TAB,"45");
        extentTest.info("Dimensions (cm) deger girildi");
//        Kullanici Shipping class secenegine tiklar
        ReusableMethods.bekle(2);
        vendorAddProductLocates.shippingClass23.click();
        extentTest.info("Shipping class tiklandi");
//        Kullanici Processing Time secenegine tiklar
        ReusableMethods.bekle(2);
        ReusableMethods.ddmVisibleText(vendorAddProductLocates.processingTime23,"1-3 business days");
        extentTest.info("Processing Time  tiklandi");
        Driver.closeDriver();
        extentTest.pass("Test basarili bir sekilde sonlandirildi");
        extentReports.flush();
    }

    @Test
    public void test04() {
        ExtentTest extentTest;
        extentTest = extentReports.createTest("testcase04");

        //     Kullanici url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
         extentTest.info("Hubcomfy sayfasina gidildi");

//     Kullanici sigin tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.login23.click();
      extentTest.info("Sing in butonuna tiklandi");


//        Kullanici gecerli email ve password girer
        vendorAddProductLocates.email23.sendKeys(ConfigReader.getProperty("Vendor_Username"));
        vendorAddProductLocates.password23.sendKeys(ConfigReader.getProperty("Vendor_Password"));
        vendorAddProductLocates.signin23.click();

        extentTest.info(" siteye vendor olarak giriş yapildi");


//        Kullanici my account tiklar
        ReusableMethods.bekle(4);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(3);
        Driver.getDriver();
        vendorAddProductLocates.myAccount23.click();
      extentTest.info("my account tiklandi");


//        Kullanici store manager menusune tiklar
        ReusableMethods.bekle(2);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        vendorAddProductLocates.storemanager23.click();
       extentTest.info("store manage tiklandi");

//     Kullanici store manage yazisini gorur
        Assert.assertTrue(vendorAddProductLocates.storeManagerText23.isDisplayed());
       extentTest.info("store manage sayfasi goruntulendi");

//        Kullanici products menusune tiklar
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(3);
        ReusableMethods.click(vendorAddProductLocates.products23);
         extentTest.info("products menusu tiklandi");


//        Kullanici products sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.productsText23.isDisplayed());
         extentTest.info("products  sayfasi goruntulendi");

//        Kullanici products sayfasinda add new butonuna tiklar
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        vendorAddProductLocates.addNew23.click();
         extentTest.info("add new butonu tiklandi");

//        Kullanici Add Product sayfasina gider
        ReusableMethods.bekle(3);
        Assert.assertTrue(vendorAddProductLocates.addProductText23.isDisplayed());
        extentTest.info("Add products  sayfasi goruntulendi");

//        Kullanici Inventory, Shipping, Attributes, Linked, Seo, Toptan Ürün Gösterme Ayarları, Advanced menülerini görür
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        Assert.assertTrue(vendorAddProductLocates.menu23.isDisplayed());
        ReusableMethods.webElementResmi(vendorAddProductLocates.menu23);
        extentTest.info("menuler goruntelendi");


//        Kullanici Attributes secenegine  tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        ReusableMethods.click(vendorAddProductLocates.attributes23);
        extentTest.info("Attributes tiklandi");

//        Kullanici color secenegine tiklar
        ReusableMethods.bekle(5);
        ReusableMethods.click(vendorAddProductLocates.color23);
        extentTest.info("color tiklandi");
//        Kullanici size secenegine tiklar
        ReusableMethods.bekle(5);
        ReusableMethods.click(vendorAddProductLocates.size23);
        extentTest.info("size tiklandi");


        Driver.closeDriver();
        extentTest.pass("Test basarili bir sekilde sonlandirildi");
        extentReports.flush();
    }

    @Test
    public void test05() {
        ExtentTest extentTest;
        extentTest = extentReports.createTest("testcase05");
        //     Kullanici url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("Hubcomfy sayfasina gidildi");

//     Kullanici sigin tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.login23.click();
        extentTest.info("Sing in butonuna tiklandi");


//        Kullanici gecerli email ve password girer
        vendorAddProductLocates.email23.sendKeys(ConfigReader.getProperty("Vendor_Username"));
        vendorAddProductLocates.password23.sendKeys(ConfigReader.getProperty("Vendor_Password"));
        vendorAddProductLocates.signin23.click();
        extentTest.info(" siteye vendor olarak giriş yapildi");


//        Kullanici my account tiklar
        ReusableMethods.bekle(4);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(3);
        Driver.getDriver();
        vendorAddProductLocates.myAccount23.click();
       extentTest.info("my account tiklandi");


//        Kullanici store manager menusune tiklar
        ReusableMethods.bekle(2);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        vendorAddProductLocates.storemanager23.click();
          extentTest.info("store manage tiklandi");

//     Kullanici store manage yazisini gorur
        Assert.assertTrue(vendorAddProductLocates.storeManagerText23.isDisplayed());
        extentTest.info("store manage sayfasi goruntulendi");

//        Kullanici products menusune tiklar
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(3);
        ReusableMethods.click(vendorAddProductLocates.products23);
        extentTest.info("products menusu tiklandi");


//        Kullanici products sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.productsText23.isDisplayed());
         extentTest.info("products  sayfasi goruntulendi");

//        Kullanici products sayfasinda add new butonuna tiklar
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        vendorAddProductLocates.addNew23.click();
         extentTest.info("add new butonu tiklandi");

//        Kullanici Add Product sayfasina gider
        ReusableMethods.bekle(3);
        Assert.assertTrue(vendorAddProductLocates.addProductText23.isDisplayed());
         extentTest.info("Add products  sayfasi goruntulendi");

//        Kullanici Inventory, Shipping, Attributes, Linked, Seo, Toptan Ürün Gösterme Ayarları, Advanced menülerini görür
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        Assert.assertTrue(vendorAddProductLocates.menu23.isDisplayed());
        ReusableMethods.webElementResmi(vendorAddProductLocates.menu23);
        extentTest.info("menuler goruntelendi");


//        Kullanici Linked secenegine  tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        ReusableMethods.click(vendorAddProductLocates.linked23);
        extentTest.info("Linked tiklandi");

//        Kullanici Up-sells secenegine tiklar
        ReusableMethods.bekle(2);
       ReusableMethods.click(vendorAddProductLocates.upsell23);
        extentTest.info("Up-sells tiklandi");

//        Kullanici Cross-sells secenegine tiklar
        ReusableMethods.bekle(2);
        ReusableMethods.click(vendorAddProductLocates.crosssels23);
        extentTest.info("Cross-sells tiklandi");

        Driver.closeDriver();
        extentTest.pass("Test basarili bir sekilde sonlandirildi");
        extentReports.flush();
    }

    @Test
    public void test06() {
        ExtentTest extentTest;
        extentTest = extentReports.createTest("testcase06");
        //     Kullanici url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("Hubcomfy sayfasina gidildi");

//     Kullanici sigin tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.login23.click();
        extentTest.info("Sing in butonuna tiklandi");


//        Kullanici gecerli email ve password girer
        vendorAddProductLocates.email23.sendKeys(ConfigReader.getProperty("Vendor_Username"));
        vendorAddProductLocates.password23.sendKeys(ConfigReader.getProperty("Vendor_Password"));
        vendorAddProductLocates.signin23.click();
        extentTest.info(" siteye vendor olarak giriş yapildi");


//        Kullanici my account tiklar
        ReusableMethods.bekle(4);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(3);
        Driver.getDriver();
        vendorAddProductLocates.myAccount23.click();
         extentTest.info("my account tiklandi");


//        Kullanici store manager menusune tiklar
        ReusableMethods.bekle(2);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        vendorAddProductLocates.storemanager23.click();
         extentTest.info("store manage tiklandi");

//     Kullanici store manage yazisini gorur
        Assert.assertTrue(vendorAddProductLocates.storeManagerText23.isDisplayed());
       extentTest.info("store manage sayfasi goruntulendi");

//        Kullanici products menusune tiklar
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(3);
        ReusableMethods.click(vendorAddProductLocates.products23);
       extentTest.info("products menusu tiklandi");

//        Kullanici products sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.productsText23.isDisplayed());
        extentTest.info("products  sayfasi goruntulendi");

//        Kullanici products sayfasinda add new butonuna tiklar
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        vendorAddProductLocates.addNew23.click();
         extentTest.info("add new butonu tiklandi");

//        Kullanici Add Product sayfasina gider
        ReusableMethods.bekle(3);
        Assert.assertTrue(vendorAddProductLocates.addProductText23.isDisplayed());
        extentTest.info("Add products  sayfasi goruntulendi");

//        Kullanici Inventory, Shipping, Attributes, Linked, Seo, Toptan Ürün Gösterme Ayarları, Advanced menülerini görür
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        Assert.assertTrue(vendorAddProductLocates.menu23.isDisplayed());
        ReusableMethods.webElementResmi(vendorAddProductLocates.menu23);
        extentTest.info("menuler goruntelendi");


//        Kullanici SEO secenegine  tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        ReusableMethods.click(vendorAddProductLocates.seo23);
        extentTest.info("SEO tiklandi");


//        Kullanici Enter a focus keyword alanina  deger girer
        ReusableMethods.bekle(2);
        vendorAddProductLocates.enterfocuskeyword23.sendKeys("dijital",Keys.TAB,"good product");
        extentTest.info("Enter a focus keyword alanina  deger girdi");
        ReusableMethods.tumSayfaResmi();


//        Kullanici Meta description alanina deger girer
        extentTest.info("Meta description alanina  deger girdi");
        //KeysTAB ile yukarıda hallettim

        Driver.closeDriver();
        extentTest.pass("Test basarili bir sekilde sonlandirildi");
        extentReports.flush();

    }

    @Test
    public void test07() {
        ExtentTest extentTest;
        extentTest = extentReports.createTest("testcase07");
        //     Kullanici url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
         extentTest.info("Hubcomfy sayfasina gidildi");
//     Kullanici sigin tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.login23.click();
        extentTest.info("Sing in butonuna tiklandi");


//        Kullanici gecerli email ve password girer
        vendorAddProductLocates.email23.sendKeys(ConfigReader.getProperty("Vendor_Username"));
        vendorAddProductLocates.password23.sendKeys(ConfigReader.getProperty("Vendor_Password"));
        vendorAddProductLocates.signin23.click();
       extentTest.info(" siteye vendor olarak giriş yapildi");


//        Kullanici my account tiklar
        ReusableMethods.bekle(4);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(3);
        Driver.getDriver();
        vendorAddProductLocates.myAccount23.click();
      extentTest.info("my account tiklandi");

//        Kullanici store manager menusune tiklar
        ReusableMethods.bekle(2);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        vendorAddProductLocates.storemanager23.click();
        extentTest.info("store manage tiklandi");

//     Kullanici store manage yazisini gorur
        Assert.assertTrue(vendorAddProductLocates.storeManagerText23.isDisplayed());
         extentTest.info("store manage sayfasi goruntulendi");

//        Kullanici products menusune tiklar
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(3);
        ReusableMethods.click(vendorAddProductLocates.products23);
       extentTest.info("products menusu tiklandi");


//        Kullanici products sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.productsText23.isDisplayed());
         extentTest.info("products  sayfasi goruntulendi");

//        Kullanici products sayfasinda add new butonuna tiklar
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        vendorAddProductLocates.addNew23.click();
       extentTest.info("add new butonu tiklandi");

//        Kullanici Add Product sayfasina gider
        ReusableMethods.bekle(3);
        Assert.assertTrue(vendorAddProductLocates.addProductText23.isDisplayed());
        extentTest.info("Add products  sayfasi goruntulendi");

//        Kullanici Inventory, Shipping, Attributes, Linked, Seo, Toptan Ürün Gösterme Ayarları, Advanced menülerini görür
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        Assert.assertTrue(vendorAddProductLocates.menu23.isDisplayed());
        ReusableMethods.tumSayfaResmi();
        extentTest.info("menuler goruntelendi");


//        "Kullanici Toptan Ürün Gösterme Ayarları secenegine  tiklar"
        vendorAddProductLocates = new VendorAddProductLocates();
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        ReusableMethods.click(vendorAddProductLocates.urunAyarlari23);
        extentTest.info("Toptan Ürün Gösterme Ayarları tiklandi");


//        Kullanici Piece Type secenegine  tiklar
        Driver.getDriver();
        ReusableMethods.bekle(2);
        ReusableMethods.ddmValue(vendorAddProductLocates.pieceType23,"Carton");
        extentTest.info("Piece Type  tiklandi");

//        Kullanici Units Per Piece alanina deger girer
        ReusableMethods.bekle(2);
        vendorAddProductLocates.unitsPerPiece23.sendKeys("24");
        extentTest.info("Units Per Piece alanina deger girdi");


//        Kullanici Min Order Quantity? alanina deger girer
        ReusableMethods.bekle(2);
        vendorAddProductLocates.minOrderQuantity23.sendKeys("12");
        extentTest.info(" Min Order Quantity? alanina deger girdi");


        Driver.closeDriver();
        extentTest.pass("Test basarili bir sekilde sonlandirildi");
        extentReports.flush();
    }

    @Test
    public void test08() {
        ExtentTest extentTest;
        extentTest = extentReports.createTest("testcase08");
        //     Kullanici url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("Hubcomfy sayfasina gidildi");
//     Kullanici sigin tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.login23.click();
     extentTest.info("Sing in butonuna tiklandi");


//        Kullanici gecerli email ve password girer
        vendorAddProductLocates.email23.sendKeys(ConfigReader.getProperty("Vendor_Username"));
        vendorAddProductLocates.password23.sendKeys(ConfigReader.getProperty("Vendor_Password"));
        vendorAddProductLocates.signin23.click();
        extentTest.info(" siteye vendor olarak giriş yapildi");


//        Kullanici my account tiklar
        ReusableMethods.bekle(4);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(3);
        Driver.getDriver();
        vendorAddProductLocates.myAccount23.click();
         extentTest.info("my account tiklandi");


//        Kullanici store manager menusune tiklar
        ReusableMethods.bekle(2);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        vendorAddProductLocates.storemanager23.click();
       extentTest.info("store manage tiklandi");
//     Kullanici store manage yazisini gorur
        Assert.assertTrue(vendorAddProductLocates.storeManagerText23.isDisplayed());
         extentTest.info("store manage sayfasi goruntulendi");
//        Kullanici products menusune tiklar
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(3);
        ReusableMethods.click(vendorAddProductLocates.products23);
       extentTest.info("products menusu tiklandi");


//        Kullanici products sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.productsText23.isDisplayed());
       extentTest.info("products  sayfasi goruntulendi");
//        Kullanici products sayfasinda add new butonuna tiklar
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        vendorAddProductLocates.addNew23.click();
        extentTest.info("add new butonu tiklandi");

//        Kullanici Add Product sayfasina gider
        ReusableMethods.bekle(3);
        Assert.assertTrue(vendorAddProductLocates.addProductText23.isDisplayed());
        extentTest.info("Add products  sayfasi goruntulendi");
//        Kullanici Inventory, Shipping, Attributes, Linked, Seo, Toptan Ürün Gösterme Ayarları, Advanced menülerini görür
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        Assert.assertTrue(vendorAddProductLocates.menu23.isDisplayed());
        ReusableMethods.webElementResmi(vendorAddProductLocates.menu23);
      extentTest.info("menuler goruntelendi");


//        Advanced secenegine  tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        ReusableMethods.click(vendorAddProductLocates.advanced23);
        extentTest.info("Advanced tiklandi");

//        Kullanici  Enable reviews secenegine  tiklar
        ReusableMethods.bekle(2);
        ReusableMethods.click(vendorAddProductLocates.enablereviews23);
        extentTest.info("Enable reviews tiklandi");
//        Kullanici Menu Order alanina deger girer
        ReusableMethods.bekle(2);
        vendorAddProductLocates.menuOrder23.sendKeys("23",Keys.TAB,"56");
        extentTest.info("Menu Order alanina deger girdi");
//        Kullanici Purchase Note alanina deger girer
        //KeysTAB ile yazdırdım
        extentTest.info("Purchase Note alanina deger girdi");


        Driver.closeDriver();
        extentTest.pass("Test basarili bir sekilde sonlandirildi");
        extentReports.flush();
    }
}
