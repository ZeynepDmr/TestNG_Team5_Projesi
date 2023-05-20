package Team05.test;

import Team05.pages.VendorCouponsLocates;
import Team05.pages.VendorShoppingLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class US_20 {
    /*
        Kullanıcı ana sayfaya gider
        Kullanıcı Sign in butonunu tıklar
        Kullanıcı geçerli username ve password girer
        Kullanıcı Sign in butonunu tıklar ve Kullanıcı Ana sayfasına girer
        Kullanıcı ana sayfanın en altında bulunan My Account butonuna tıklar
        Kullanıcı açılan sayfada Store Manager seçeneğini tıklar
        Kullanıcı açılan sayfada Coupons seçeneğini tıklar
        Kullanıcı açılan sayfada Add New seçeneğini tıklar
        Kullanıcı açılan sayfada Code kısmına veri yazabilmeli
        Kullanıcı açılan sayfada Description kısmına veri yazabilmeli
        Kullanıcı açılan sayfada Discount Type kısmına Percentage discount veya Fixed Product Discount olarak seçilebilmeli
        Kullanıcı açılan sayfada Coupon Amount kısmına veri yazabilmeli
        Kullanıcı açılan sayfada Coupon expiry date kısmına veri yazabilmeli
        Kullanıcı açılan sayfada Allow free shipping, Show on store seçeneklerini seçebilmeli

     */

    @Test
    public void testCase01() {
    //    Kullanıcı ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));

    //    Kullanıcı Sign in butonunu tıklar
        VendorShoppingLocates vendorShoppingLocates = new VendorShoppingLocates();
        vendorShoppingLocates.signIn.click();

    //    Kullanıcı geçerli username ve password girerek ana sayfaya ulaşır
        ReusableMethods.bekle(3);
        vendorShoppingLocates.username.sendKeys(ConfigReader.getProperty("Vendor_Mail"), Keys.TAB);
        vendorShoppingLocates.password.sendKeys(ConfigReader.getProperty("Vendor_Password"), Keys.ENTER);

    //    Kullanıcı ana sayfanın en altında bulunan My Account butonuna tıklar
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(3);
        vendorShoppingLocates.myAccount.click();

    //    Kullanıcı açılan sayfada Store Manager seçeneğini tıklar
        VendorCouponsLocates vendorCouponsLocates = new VendorCouponsLocates();
        vendorCouponsLocates.storeManagerClick.click();

    //    Kullanıcı açılan sayfada Coupons seçeneğini tıklar
        ReusableMethods.bekle(3);
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();
        vendorCouponsLocates.couponsClick.click();

    //    Kullanıcı açılan sayfada Add New seçeneğini tıklar
        ReusableMethods.bekle(3);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        vendorCouponsLocates.addNewClick.click();

        //    Kullanıcı açılan sayfada Code kısmına veri yazabilmeli
        //    Kullanıcı açılan sayfada Description kısmına veri yazabilmeli
        ReusableMethods.bekle(3);
        action.sendKeys(Keys.PAGE_DOWN).perform();

        vendorCouponsLocates.codeClick.sendKeys("000101",Keys.TAB,"Hediye");

    //    Kullanıcı açılan sayfada Discount Type kısmına Percentage discount veya Fixed Product Discount olarak seçilebilmeli
        ReusableMethods.bekle(3);
      WebElement discountType = Driver.getDriver().findElement(By.xpath("//select[@id='discount_type']"));
        Select select = new Select(discountType);
        select.selectByVisibleText("Fixed Product Discount");
        ReusableMethods.bekle(3);
        select.selectByVisibleText("Percentage discount");
        ReusableMethods.bekle(3);
        select.selectByVisibleText("Fixed Product Discount");

    //    Kullanıcı açılan sayfada Coupon Amount kısmına veri yazabilmeli
        ReusableMethods.bekle(3);
        vendorCouponsLocates.couponAmount.sendKeys("35");

    //    Kullanıcı açılan sayfada Coupon expiry date kısmına veri yazabilmeli
        ReusableMethods.bekle(3);
        vendorCouponsLocates.expiryDate.sendKeys("2023.05.31",Keys.ENTER);

    //    Kullanıcı açılan sayfada Allow free shipping, Show on store seçeneklerini seçebilmeli
        ReusableMethods.bekle(3);
        vendorCouponsLocates.freeShipping.click();
        ReusableMethods.bekle(1);
        vendorCouponsLocates.showOnStore.click();
        ReusableMethods.bekle(1);
        vendorCouponsLocates.freeShipping.click();
        Driver.closeDriver();
    }

    @Test
    public void testCase2() {
        /*
        Kullanıcı ana sayfaya gider
        Kullanıcı Sign in butonunu tıklar
        Kullanıcı geçerli username ve password girer
        Kullanıcı Sign in butonunu tıklar ve Kullanıcı Ana sayfasına girer
        Kullanıcı ana sayfanın en altında bulunan My Account butonuna tıklar
        Kullanıcı TC-01 deki adımları tekrarlar ve sayfanın altında bulunan "Submit" seçeneğine tıklayarak  yeni bir "Coupons" oluşturur
         */

    //    Kullanıcı ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));

    //    Kullanıcı Sign in butonunu tıklar
        VendorShoppingLocates vendorShoppingLocates = new VendorShoppingLocates();
        vendorShoppingLocates.signIn.click();

    //    Kullanıcı geçerli username ve password girerek ana sayfaya ulaşır
        ReusableMethods.bekle(3);
        vendorShoppingLocates.username.sendKeys(ConfigReader.getProperty("Vendor_Mail"), Keys.TAB);
        vendorShoppingLocates.password.sendKeys(ConfigReader.getProperty("Vendor_Password"), Keys.ENTER);

    //    Kullanıcı ana sayfanın en altında bulunan My Account butonuna tıklar
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(3);
        vendorShoppingLocates.myAccount.click();

    //    Kullanıcı TC-01 deki adımları tekrarlar ve sayfanın altında bulunan "Submit" seçeneğine tıklayarak  yeni bir "Coupons" oluşturur

        VendorCouponsLocates vendorCouponsLocates = new VendorCouponsLocates();
        vendorCouponsLocates.storeManagerClick.click();
        ReusableMethods.bekle(3);
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();
        vendorCouponsLocates.couponsClick.click();
        ReusableMethods.bekle(3);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        vendorCouponsLocates.addNewClick.click();
        ReusableMethods.bekle(3);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        vendorCouponsLocates.codeClick.sendKeys("000101",Keys.TAB,"Hediye");
        WebElement discountType = Driver.getDriver().findElement(By.xpath("//select[@id='discount_type']"));
        Select select = new Select(discountType);
        select.selectByVisibleText("Fixed Product Discount");
        ReusableMethods.bekle(3);
        vendorCouponsLocates.couponAmount.sendKeys("35");
        ReusableMethods.bekle(3);
        vendorCouponsLocates.expiryDate.sendKeys("2023.05.31",Keys.ENTER);
        ReusableMethods.bekle(3);
        vendorCouponsLocates.freeShipping.click();
        action.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        vendorCouponsLocates.submitClick.click();
        Driver.closeDriver();



    }
}
