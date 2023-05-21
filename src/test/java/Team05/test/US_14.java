package Team05.test;
import Team05.pages.VendorAddProductLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.security.Key;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
public class US_14 {
    VendorAddProductLocates vendorAddProductLocates;
    Actions actions;
    Select select;
    protected ExtentReports extentReports;
    @BeforeClass
    public void beforeTest() {
        ReusableMethods.extentReport();
        extentReports = ReusableMethods.getExtentReports();
    }
    @Test
    public void test01() {
        ExtentTest extentTest;
        extentTest = extentReports.createTest("testcase01");
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
//    Kullanici All Products Types secegine tiklar
        select = new Select(vendorAddProductLocates.allproducttypes23);
        List<WebElement> selectList = select.getOptions();
        for (WebElement w : selectList) {
            System.out.println(w.getText());
        }
        extentTest.info("All Products Types tiklandi");
//    Kullanici Simple Product, Variable Product, Grouped Product, External - Affiliate Product seçeneklerini görür
        Assert.assertEquals("Simple Product", selectList.get(1).getText());
        Assert.assertEquals("Variable Product", selectList.get(4).getText());
        Assert.assertEquals("Grouped Product", selectList.get(5).getText());
        Assert.assertEquals("External/Affiliate Product", selectList.get(6).getText());
        extentTest.info("menu goruntulendi");
        Driver.closeDriver();
        extentTest.pass("Test basarili bir sekilde sonlandirildi");
        extentReports.flush();
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
//        Kullanici add new butonuna tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.addNew23.click();
        extentTest.info("add new tiklandi");
//        Kullanici Add Product sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.addProductText23.isDisplayed());
        extentTest.info("add Product tiklandi");
//        Kullanici Choose Image kutucuguna tiklar
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();
        ReusableMethods.click(vendorAddProductLocates.image23);
        vendorAddProductLocates.selectFiles23.click();
        extentTest.info("Choose Image tiklandi");
//        Kullanici select files kısmına  tiklar
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();
        ReusableMethods.click(vendorAddProductLocates.image23);
        extentTest.info("select files tiklandi");
//        Kullanici dosyadan resim secer
        //"C:\Users\CASPER\Downloads\books.png"
        ReusableMethods.uploadFilePath("C:\\Users\\CASPER\\Downloads\\books.png");
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.ENTER);
        ReusableMethods.bekle(10);
        ReusableMethods.tumSayfaResmi();
        vendorAddProductLocates.select23.click();
        extentTest.info("dosyadan resim secildi");
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
//        Kullanici add new butonuna tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.addNew23.click();
//        Kullanici Add Product sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.addProductText23.isDisplayed());
        extentTest.info("Add products menusu tiklandi");
//        Kullanici product title alanına bir data girer
        vendorAddProductLocates.productTitle23.sendKeys("iphone");
        extentTest.info("product title alanına bir data girildi");
//        Kullanici Short Description alanına bir data girer
        ReusableMethods.bekle(5);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        Driver.getDriver().switchTo().frame(0);
        vendorAddProductLocates.shortDescription23.sendKeys("waterproof");
        Driver.getDriver().switchTo().defaultContent();
        extentTest.info("Short Description alanına bir data girildi");
//        Kullanici  Description alanına bir data girer
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        Driver.getDriver().switchTo().frame(1);
        vendorAddProductLocates.Description23.sendKeys("quality");
        extentTest.info(" Description alanına bir data girildi");
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
//        Kullanici add new butonuna tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.addNew23.click();
        extentTest.info("Add new category tiklandi");
//        Kullanici Add Product sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.addProductText23.isDisplayed());
        extentTest.info("Add Product sayfasi goruntulendi");
//        Kullanici categories menusunden secim yapar
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN);
        ReusableMethods.click(vendorAddProductLocates.categories23);
        extentTest.info("categories menusunden secim yapildi");
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
//        Kullanici add new butonuna tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.addNew23.click();
        extentTest.info("Add new  tiklandi");
//        Kullanici Add Product sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.addProductText23.isDisplayed());
        extentTest.info("Add Product sayfasi goruntulendi");
//        Kullanici  Add new category secegine tiklar
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        ReusableMethods.click(vendorAddProductLocates.addNewcategory23);
        extentTest.info("Add new category tiklandi");
//        Kullanici category name alanına bir data girer
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        vendorAddProductLocates.Namecategory23.sendKeys("Elektronic");
        extentTest.info("category name alanına bir data girildi");
//        Kullanici ADD butonuna tiklar
        ReusableMethods.bekle(3);
        vendorAddProductLocates.categoryAdd23.click();
        extentTest.info("ADD butonu tiklandi");
//        Kullanici yeni category ekledigini gorur
        ReusableMethods.bekle(3);
        if (vendorAddProductLocates.categoryVerify23.isSelected()) {
            System.out.println("yeni category eklendi");
        }
        System.out.println("yeni category eklenemedi");
        extentTest.info("yeni category eklendi");
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
//        Kullanici add new butonuna tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.addNew23.click();
        extentTest.info("add new butonu tiklandi");
//        Kullanici Add Product sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.addProductText23.isDisplayed());
        extentTest.info("Add  Product sayfasi goruntulendi");
//        Kullanici Product brands  menusunden secim yapar
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        vendorAddProductLocates.productBrands23.click();
        extentTest.info("Product brands secimi yapildi");
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
//        Kullanici add new butonuna tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.addNew23.click();
        extentTest.info("Add new tiklandi");
//        Kullanici Add Product sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.addProductText23.isDisplayed());
        extentTest.info("Add  Product sayfasi goruntulendi");
//        Kullanici Add new Product brands secegine tiklar
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        vendorAddProductLocates.productBrands23.click();
        extentTest.info("Add new Product brands secegine tiklandi");
//        Kullanici Product brands name alanına bir data girer
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        vendorAddProductLocates.productBrandsName23.sendKeys("casper");
        extentTest.info("product brands alanina deger eklendi");
//        Kullanici ADD butonuna tiklar
        ReusableMethods.bekle(3);
        vendorAddProductLocates.productAdd23.click();
        extentTest.info("ADD butonu tiklandi");
        //        Kullanici yeni product brands ekledigini gorur
        ReusableMethods.bekle(3);
        if (vendorAddProductLocates.productBrandsVerify23.isSelected()) {
            System.out.println("Yeni product brands eklendi");
        }
        System.out.println("Yeni product brands eklenemedi");
        extentTest.info("yeni product brands eklendi");
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
//        Kullanici add new butonuna tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.addNew23.click();
        extentTest.info("add new tiklandi");
//        Kullanici Add Product sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.addProductText23.isDisplayed());
        extentTest.info("Add Product sayfasi goruntulendi");
//        Kullanici Choose from the most used tags tiklar
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        vendorAddProductLocates.Choosetags23.click();
        extentTest.info("Choose from the most used tags tiklandi");
//        Kullanici seceneklerden ekleme yapar
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN);
        vendorAddProductLocates.secimChooseTags23.click();
        extentTest.info("ekleme yapildi");
        Driver.closeDriver();
        extentTest.pass("Test basarili bir sekilde sonlandirildi");
        extentReports.flush();
    }
    @Test
    public void test09() {
        ExtentTest extentTest;
        extentTest = extentReports.createTest("testcase09");
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
//              Kullanici add new butonuna tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.addNew23.click();
        extentTest.info("add new tiklandi");
//      Kullanici Add Product sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.addProductText23.isDisplayed());
        extentTest.info("Add product  sayfasi goruntulendi");
//        Kullanici Catalog visibility secenegini gorur
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        ReusableMethods.bekle(3);
        Assert.assertTrue(vendorAddProductLocates.catalogVisibility23.isDisplayed());
        extentTest.info("Catalog visibility goruntulendi");
//        Kullanici shop and search result secenegine tiklar
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        select = new Select(vendorAddProductLocates.shopResult23);
        List<WebElement> selectList = select.getOptions();
        for (WebElement w : selectList) {
            System.out.println(w.getText());
        }
        selectList.forEach(t -> System.out.println(t.getText()));
        extentTest.info("shop and search result  tiklandi");
//        Kullanici Shop and search results, Shop only, Search results only, Hidden seceneklerinden birini secer
        Assert.assertEquals("Shop and search results", selectList.get(0).getText());
        Assert.assertEquals("Shop only", selectList.get(1).getText());
        Assert.assertEquals("Search results only", selectList.get(2).getText());
        Assert.assertEquals("Hidden", selectList.get(3).getText());
        extentTest.info("hop and search results, Shop only, Search results only, Hidden seceneklerinden biri secildi");
        Driver.closeDriver();
        extentTest.pass("Test basarili bir sekilde sonlandirildi");
        extentReports.flush();
    }
}
