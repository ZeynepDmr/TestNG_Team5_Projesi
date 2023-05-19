package Team05.test;

import Team05.pages.VendorAddProductLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.geom.RectangularShape;
import java.util.ArrayList;
import java.util.List;


public class US_17 {


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

    WebDriver driver;
    Actions actions;
    Select select;
    VendorAddProductLocates vendorAddProductLocates;
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    Select selectColorVari;
    Select selectSizeVari;

    @Test
    public void test02() {


        //  Kullanici "https://hubcomfy.com" adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));


        //  Kullanici sign in butonuna tiklar
        VendorAddProductLocates vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.login.click();

        //Kullanici gecerli email ve password girer
        vendorAddProductLocates.userName.sendKeys(ConfigReader.getProperty("Vendor_Username"), Keys.ENTER);
        vendorAddProductLocates.password.sendKeys(ConfigReader.getProperty("Vendor_Password"), Keys.ENTER);


        // Kullanici my account yazisini goruntuler

        ReusableMethods.bekle(5);
        ReusableMethods.scrollEnd();
        Driver.getDriver();

        ReusableMethods.bekle(3);
        vendorAddProductLocates.myAccount.click();


        // Kullanici store manager menusune tiklar
        ReusableMethods.bekle(2);
        vendorAddProductLocates.storeManager.click();


        // Kullanici store manager sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.storeManager.isDisplayed());


        // Kullanici products menusune tiklar

        ReusableMethods.bekle(2);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        Driver.getDriver();
        ReusableMethods.click(vendorAddProductLocates.products);
        Assert.assertTrue(vendorAddProductLocates.products.isDisplayed());

        //Kullanıcı Add New butonuna tıklar
        ReusableMethods.bekle(2);
        vendorAddProductLocates.addNew.click();


        // Variable Product seçilebilmeli

        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.PAGE_DOWN).perform();
        select = new Select(vendorAddProductLocates.dropDown);
        select.selectByIndex(1);

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN);
        vendorAddProductLocates.productTitle.sendKeys("a");
        vendorAddProductLocates.productTitle.clear();
        vendorAddProductLocates.productTitle.sendKeys("1234567890123456789012390");
        vendorAddProductLocates.productTitle.clear();
        vendorAddProductLocates.productTitle.sendKeys("Yesil canta", Keys.TAB, Keys.TAB,"123456789 123456789 9 ", Keys.TAB, Keys.TAB);

        vendorAddProductLocates.buyukProductImageEkleme.click();
        ReusableMethods.bekle(2);
        vendorAddProductLocates.mediaLibrary.click();
        vendorAddProductLocates.siyahAyakkabi1.click();
        vendorAddProductLocates.imageSelectButton.click();


        vendorAddProductLocates.categoriesCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        jse.executeScript("arguments[0].scrollIntoView(true);", vendorAddProductLocates.productBrandscheckBox);
        jse.executeScript("arguments[0].click();", vendorAddProductLocates.productBrandscheckBox);

        //tag ekle
        vendorAddProductLocates.productTags.sendKeys("Canta");
        Select select2 = new Select(vendorAddProductLocates.catalogvisibility);
        select2.selectByValue("catalog");



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
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_UP).build().perform();
        ReusableMethods.bekle(2);
        vendorAddProductLocates.attributes.click();
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
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.click(vendorAddProductLocates.submit);
        ReusableMethods.bekle(3);
        //ReusableMethods.tumSayfaResmi();



        // Yeni color ve size eklenebilmeli
        // Eklenen Atributes'a göre ürün bilgileri seçilip ürün özellikleri doldurulabilmeli
        // Variations'a tıklanarak eklenen Atributes görülebilmeli
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        ReusableMethods.click(vendorAddProductLocates.variations);
        ReusableMethods.bekle(8);
        select = new Select(vendorAddProductLocates.dropDown);
        select.selectByIndex(1);
        ReusableMethods.bekle(5);
        select = new Select(vendorAddProductLocates.dropDown);
        select.selectByIndex(1);
        ReusableMethods.bekle(2);


        ReusableMethods.bekle(3);
        selectColorVari=new Select(vendorAddProductLocates.variationsColor);
        selectColorVari.selectByIndex(1);
        ReusableMethods.bekle(3);
        Select selectAnyColor=new Select(vendorAddProductLocates.variationAnyColor);
        selectAnyColor.selectByIndex(1);


        ReusableMethods.bekle(8);
        vendorAddProductLocates.regularPrice.sendKeys("45");
        ReusableMethods.bekle(2);
        Select stock=new Select(vendorAddProductLocates.stockStatus);
        stock.selectByIndex(0);
        ReusableMethods.bekle(2);
        vendorAddProductLocates.weight.sendKeys("uc kilo");
        vendorAddProductLocates.weight.clear();
        ReusableMethods.bekle(2);
        vendorAddProductLocates.weight.sendKeys("3",Keys.TAB,"30 cm");
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
        Select taxSelect=new Select(vendorAddProductLocates.tax);
        taxSelect.selectByIndex(1);
        vendorAddProductLocates.descriptionVari.sendKeys("Green bag is available");
        ReusableMethods.bekle(5);


        // Ürünün eklendiğini Product kısmında görebilmeli
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        ReusableMethods.click(vendorAddProductLocates.products);
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();

        //  ReusableMethods.tumSayfaResmi();




    }
}



