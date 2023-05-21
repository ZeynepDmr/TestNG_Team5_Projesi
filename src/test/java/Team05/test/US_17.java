package Team05.test;

import Team05.pages.VendorAddProductLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.geom.RectangularShape;
import java.util.ArrayList;
import java.util.List;


public class US_17 {



    WebDriver driver;
    Actions actions;
    Select select;
    VendorAddProductLocates vendorAddProductLocates;
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    Select selectColorVari;
    Select selectSizeVari;



  protected   ExtentReports extentReports;
   // ExtentTest test = extentReports.createTest("tesname", "tanim");


    /*
    Kullanici url'e gider
    Kullanici sign in butonuna tiklar
    Kullanici gecerli email ve password girer
    Kullanici my account yazisini goruntuler
    Kullanici store manager menusune tiklar
    Kullanici store manager sayfasina gider
    Kullanici products menusune tiklar
    Kullanıcı Add New butonuna tıklar
    Variable Product seçilebilmeli
    US14 ve US15 deki işlemler yapılabilmeli
    Ürüne göre Attributes color ve size seçilebilmeli
    Yeni color ve size eklenebilmeli
    Variations'a tıklanarak eklenen Atributes görülebilmeli
    Eklenen Atributes'a göre ürün bilgileri seçilip ürün özellikleri doldurulabilmeli
    Ürünün eklendiğini Product kısmında görebilmeli
     */

    @BeforeTest
    public void setUpExtentReport() {

        ReusableMethods.extentReport();
        extentReports = ReusableMethods.getExtentReports();
    }

    @Test
    public void TC01() {

        ExtentTest extentTest;
        extentTest=extentReports.createTest("TC01");

        //  Kullanici "https://hubcomfy.com" adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.pass(ConfigReader.getProperty("Hubcomfy_Url") + " adresine gidildi");

        // Kullanici sign in butonuna tiklar
        VendorAddProductLocates vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.login.click();
        extentTest.pass("SignIn linkine tiklandi");
        //Kullanici gecerli email ve password girer
        vendorAddProductLocates.userName.sendKeys(ConfigReader.getProperty("Vendor_Username"), Keys.ENTER);
        vendorAddProductLocates.password.sendKeys(ConfigReader.getProperty("Vendor_Password"), Keys.ENTER);
        extentTest.pass("Kullanici adi ve sifresi girilip signin butonuna tiklandi");

        //Kullanici my account yazisini goruntuler
        ReusableMethods.bekle(5);
        ReusableMethods.scrollEnd();
        Driver.getDriver();
        ReusableMethods.bekle(3);
        vendorAddProductLocates.myAccount.click();
        extentTest.pass("My Account Linkine tıklandı ");
/*
        // Kullanici store manager menusune tiklar
        ReusableMethods.bekle(2);
        vendorAddProductLocates.storeManager.click();

        // Kullanici store manager sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.storeManager.isDisplayed());

        extentTest.pass("My Account Sayfasına başarılı giris yapılır ");
        // Kullanici products menusune tiklar

        ReusableMethods.bekle(2);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        Driver.getDriver();
        ReusableMethods.click(vendorAddProductLocates.products);
        Assert.assertTrue(vendorAddProductLocates.products.isDisplayed());
        extentTest.pass("Vendor olarak ürün ekleme sayfasına gidilir ");
        //Kullanıcı Add New butonuna tıklar
        ReusableMethods.bekle(2);
        vendorAddProductLocates.addNew.click();
        extentTest.pass("Vendor olarak yeni ürün ekleme butonuna tıklanır");
*/

        // Variable Product seçilebilmeli

        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.PAGE_DOWN).perform();
        select = new Select(vendorAddProductLocates.dropDown);
        select.selectByIndex(1);
        extentTest.pass("Vendor olarak Variable Product secilir");
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN);
        vendorAddProductLocates.productTitle.sendKeys("a");
        vendorAddProductLocates.productTitle.clear();
        vendorAddProductLocates.productTitle.sendKeys("1234567890123456789012390");
        vendorAddProductLocates.productTitle.clear();
        vendorAddProductLocates.productTitle.sendKeys("Yesil canta", Keys.TAB, Keys.TAB, "123456789 123456789 9 ", Keys.TAB, Keys.TAB);
        extentTest.pass("Vendor olarak yeni ürün ekleme yapılır ");
        vendorAddProductLocates.buyukProductImageEkleme.click();
        ReusableMethods.bekle(2);
        vendorAddProductLocates.mediaLibrary.click();
        vendorAddProductLocates.siyahAyakkabi1.click();
        vendorAddProductLocates.imageSelectButton.click();

        extentTest.pass("Ürüne resim eklenir");
        vendorAddProductLocates.categoriesCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        jse.executeScript("arguments[0].scrollIntoView(true);", vendorAddProductLocates.productBrandscheckBox);
        jse.executeScript("arguments[0].click();", vendorAddProductLocates.productBrandscheckBox);
        vendorAddProductLocates.productTags.sendKeys("Canta");
        Select select2 = new Select(vendorAddProductLocates.catalogvisibility);
        select2.selectByValue("catalog");
        extentTest.pass("Ürün adı yazılır ve dogrulanır");

      // US14 ve US15 deki işlemler yapılabilmeli

        ReusableMethods.bekle(2);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).build().perform();
        ReusableMethods.bekle(2);
        Driver.getDriver();
        ReusableMethods.click(vendorAddProductLocates.attributes);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        ReusableMethods.bekle(3);
        jse.executeScript("arguments[0].click();", vendorAddProductLocates.attributes);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_UP).build().perform();
        ReusableMethods.bekle(2);
        vendorAddProductLocates.attributes.click();
        extentTest.pass("Attributes sekmesine gelinir ");
        vendorAddProductLocates.color.click();
        ReusableMethods.bekle(8);
        vendorAddProductLocates.addNewColor.click();
        ReusableMethods.sendKeysColor("color");
        ReusableMethods.bekle(5);
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.bekle(8);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        vendorAddProductLocates.sizeOpenDropDown.click();
        ReusableMethods.bekle(3);
        vendorAddProductLocates.addNewSizeButton.click();
        ReusableMethods.bekle(3);
        ReusableMethods.sendKeysSize("36");
        ReusableMethods.bekle(5);
        Driver.getDriver().switchTo().alert().accept();
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.pass("Secilen ürüne color ve size eklenir ");
        ReusableMethods.click(vendorAddProductLocates.submit);
        ReusableMethods.bekle(3);
        ReusableMethods.tumSayfaResmi();



        // Eklenen Atributes'a göre ürün bilgileri seçilip ürün özellikleri doldurulabilmeli
        // Variations'a tıklanarak eklenen Atributes görülebilmeli
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        ReusableMethods.click(vendorAddProductLocates.variations);
        extentTest.pass("Variations'a tıklanarak eklenen Atributes görülür");
        ReusableMethods.bekle(8);
        select = new Select(vendorAddProductLocates.dropDown);
        select.selectByIndex(1);
        ReusableMethods.bekle(5);
        select = new Select(vendorAddProductLocates.dropDown);
        select.selectByIndex(1);
        ReusableMethods.bekle(5);
        selectColorVari = new Select(vendorAddProductLocates.variationsColor);
        selectColorVari.selectByIndex(1);
        ReusableMethods.bekle(3);
        Select selectAnyColor = new Select(vendorAddProductLocates.variationAnyColor);
        selectAnyColor.selectByIndex(1);
        extentTest.pass("Eklenen Atributes'a göre ürün bilgileri secilip ürün ozellikleri doldurulabilir");
        ReusableMethods.bekle(8);
        vendorAddProductLocates.regularPrice.sendKeys("45");
        ReusableMethods.bekle(2);
        Select stock = new Select(vendorAddProductLocates.stockStatus);
        stock.selectByIndex(0);
        ReusableMethods.bekle(2);
        vendorAddProductLocates.weight.sendKeys("uc kilo");
        vendorAddProductLocates.weight.clear();
        ReusableMethods.bekle(2);
        vendorAddProductLocates.weight.sendKeys("3", Keys.TAB, "30 cm");
        vendorAddProductLocates.length.clear();
        ReusableMethods.bekle(2);
        vendorAddProductLocates.length.sendKeys("15");
        vendorAddProductLocates.width.sendKeys("7 cm");
        ReusableMethods.bekle(2);
        vendorAddProductLocates.width.click();
        vendorAddProductLocates.width.sendKeys("10");
        vendorAddProductLocates.height.sendKeys("7 cm");
        vendorAddProductLocates.height.clear();
        vendorAddProductLocates.height.sendKeys("15");
        Select taxSelect = new Select(vendorAddProductLocates.tax);
        taxSelect.selectByIndex(1);
        vendorAddProductLocates.descriptionVari.sendKeys("Green bag is available");
        ReusableMethods.bekle(5);
        extentTest.pass("Ürün özellikleri basarıyla eklendigi görülür");




        // Ürünün eklendiğini Product kısmında görebilmeli
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        ReusableMethods.click(vendorAddProductLocates.products);
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        ReusableMethods.tumSayfaResmi();
        extentTest.pass("Product sayfasında eklediginiz ürünün doğru bir şekilde listelendigi dogrulanır");
        Driver.closeDriver();
        extentTest.info("Test Basarılı");
        extentReports.flush();
    }
}







