package Team05.test;

import Team05.pages.BillingUsLocates;
import Team05.pages.VendorAddProductLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Key;

public class US_16 {

    /*
Kullanici url'e gider
Kullanici sign in butonuna tiklar
Kullanici gecerli email ve password girer
Kullanici my account yazisini goruntuler
Kullanici store manager menusune tiklar
Kullanici store manager sayfasina gider
Kullanici products menusune tiklar
Kullanıcı Add New butonuna tıklar
Simple Product default olarak gelmeli
Virtual ve Downloadable seçilebilmeli
Price ve Sale Price yazılabilmeli
US14 ve US15 deki işlemler yapılabilmeli
Ürünün eklendiğini Product kısmında görebilmeli

     */
    WebDriver driver;
    Actions actions;
    VendorAddProductLocates vendorAddProductLocates;

    @Test
    public void test1() {



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


        //Kullanıcı Add New butonuna tıklar
        ReusableMethods.bekle(2);
        vendorAddProductLocates.addNew.click();


        // Simple Product default olarak gelmeli
        ReusableMethods.tumSayfaResmi();
        ReusableMethods.bekle(2);
        Assert.assertTrue(vendorAddProductLocates.simpleProduct.isDisplayed());


        // Virtual ve Downloadable seçilebilmeli
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.PAGE_DOWN).perform();
        vendorAddProductLocates.virtual.click();
        vendorAddProductLocates.is_downloadable.click();

        ReusableMethods.bekle(2);
        vendorAddProductLocates.productTitle.sendKeys("Canta");


        //Price ve Sale Price yazılabilmeli

        ReusableMethods.bekle(2);
        vendorAddProductLocates.price.sendKeys("100", Keys.TAB, "50");


        // US14 ve US15 deki işlemler yapılabilmeli

        ReusableMethods.bekle(2);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        ReusableMethods.click(vendorAddProductLocates.draft);

        // ReusableMethods.tumSayfaResmi();


        // Ürünün eklendiğini Product kısmında görebilmeli
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        ReusableMethods.click(vendorAddProductLocates.products);
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();

        //  ReusableMethods.tumSayfaResmi();

    }
}

