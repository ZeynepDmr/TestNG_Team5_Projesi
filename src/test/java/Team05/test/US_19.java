package Team05.test;

import Team05.pages.VendorShoppingLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Team05.utilities.ReusableMethods.tumSayfaResmi;

public class US_19 extends ReusableMethods {

    /*
    Kullanıcı ana sayfaya gider
    Kullanıcı Sign in butonunu tıklar
    Kullanıcı geçerli username ve password girer
    Kullanıcı Sign in butonunu tıklar ve Kullanıcı Ana sayfasına girer
    Kullanıcı ana sayfada seçtiği herhangibir ürünün üzerine tıklar
    Kullanıcı açılan sayfada Add To Cart seçeneğini tıklayarak seçtiği ürünü sepete ekler
    Kullanıcı cart seçeneğini tıklayarak sepetin güncellendiğini ve eklediği ürünün sepette olduğunu kontrol eder

     */

    @Test
    public void testCase1() {
        extentReport();
        extentTest=extentReports.createTest("ExtentTest","Test Raporu");
        //  Kullanıcı ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("Hubcomfy sitesine gidildi");
        //  Kullanıcı Sign in butonunu tıklar
        VendorShoppingLocates vendorShoppingLocates = new VendorShoppingLocates();
        vendorShoppingLocates.signIn.click();

        //  Kullanıcı geçerli username ve password girer ve giriş yapar
        vendorShoppingLocates.username.sendKeys(ConfigReader.getProperty("Vendor_Mail"),Keys.TAB);
        vendorShoppingLocates.password.sendKeys(ConfigReader.getProperty("Vendor_Password"), Keys.ENTER);

      //  Kullanıcı ana sayfada seçtiği herhangibir ürünün üzerine tıklar
        ReusableMethods.bekle(3);
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN,
                        Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        vendorShoppingLocates.urun.click();

        //  Kullanıcı açılan sayfada Add To Cart seçeneğini tıklayarak seçtiği ürünü sepete ekler
        ReusableMethods.bekle(3);
        vendorShoppingLocates.addToCart.click();

        //  Kullanıcı cart seçeneğini tıklayarak sepetin güncellendiğini ve eklediği ürünün sepette olduğunu kontrol eder
        ReusableMethods.bekle(3);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(3);
        vendorShoppingLocates.cart.click();

        String actualText = Driver.getDriver().findElement(By.xpath("//td[@class='product-name'] ")).getText();
        String expectedText = "Blue Ski Boots";
        Assert.assertEquals(expectedText, actualText);
        extentTest.pass("test sonlandırıldı");
        extentReports.flush();
        Driver.closeDriver();

    }

    @Test
    public void testCase2() {
        extentReport();
        extentTest=extentReports.createTest("ExtentTest","Test Raporu");
        /*
        Kullanıcı ana sayfaya gider
        Kullanıcı Sign in butonunu tıklar
        Kullanıcı geçerli username ve password girer
        Kullanıcı Sign in butonunu tıklar ve Kullanıcı Ana sayfasına girer
        Kullanıcı ana sayfanın en altında bulunan Cart butonuna tıklar
        Kullanıcı açılan sayfada sepete eklediği ürünleri görebilmeli

         */

     //   Kullanıcı ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("Hubcomfy sitesine gidildi");
     //   Kullanıcı Sign in butonunu tıklar
        VendorShoppingLocates vendorShoppingLocates = new VendorShoppingLocates();
        vendorShoppingLocates.signIn.click();

     //   Kullanıcı geçerli username ve password girerek ana sayfaya ulaşır
        ReusableMethods.bekle(3);
        vendorShoppingLocates.username.sendKeys(ConfigReader.getProperty("Vendor_Mail"),Keys.TAB);
        vendorShoppingLocates.password.sendKeys(ConfigReader.getProperty("Vendor_Password"), Keys.ENTER);

     //   Kullanıcı ana sayfanın en altında bulunan Cart butonuna tıklar
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(3);
        vendorShoppingLocates.cart.click();

     //   Kullanıcı açılan sayfada sepete eklediği ürünleri görebilmeli
        ReusableMethods.bekle(3);
        String actualText = Driver.getDriver().findElement(By.xpath("//td[@class='product-name'] ")).getText();
        String expectedText = "Blue Ski Boots";
        Assert.assertEquals(expectedText, actualText);
        extentTest.pass("test sonlandırıldı");
        extentReports.flush();
        Driver.closeDriver();


    }

    @Test
    public void testCase3() {
        extentReport();
        extentTest=extentReports.createTest("ExtentTest","Test Raporu");
        /*
        Kullanıcı ana sayfaya gider
        Kullanıcı Sign in butonunu tıklar
        Kullanıcı geçerli username ve password girer
        Kullanıcı Sign in butonunu tıklar ve Kullanıcı Ana sayfasına girer
        Kullanıcı ana sayfanın en altında bulunan Cart butonuna tıklar
        Kullanıcı açılan sayfada Proceed To Checkout seçeneğini tıklar
        Kullanıcı açılan safada Billing Details alanlarını doldurabilmeli
         */
    //    Kullanıcı ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
    //    Kullanıcı Sign in butonunu tıklar
        VendorShoppingLocates vendorShoppingLocates = new VendorShoppingLocates();
        vendorShoppingLocates.signIn.click();

    //    Kullanıcı geçerli username ve password girerek ana sayfaya ulaşır
        ReusableMethods.bekle(3);
        vendorShoppingLocates.username.sendKeys(ConfigReader.getProperty("Vendor_Mail"),Keys.TAB);
        vendorShoppingLocates.password.sendKeys(ConfigReader.getProperty("Vendor_Password"), Keys.ENTER);

    //    Kullanıcı ana sayfanın en altında bulunan Cart butonuna tıklar
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(3);
        vendorShoppingLocates.cart.click();

    //    Kullanıcı açılan sayfada Proceed To Checkout seçeneğini tıklar
        ReusableMethods.bekle(2);
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        vendorShoppingLocates.proceedToCheckout.click();

    //    Kullanıcı açılan safada Billing Details alanlarını doldurabilmeli
        ReusableMethods.bekle(2);
        vendorShoppingLocates.billingFirstName.sendKeys("Deniz", Keys.TAB,
        "Karagöz", Keys.TAB, "Techproed",Keys.TAB,Keys.TAB,"İstanbul",Keys.TAB,Keys.TAB,
         "34600",Keys.TAB,"İstanbul",Keys.TAB,Keys.TAB,"05423322033",Keys.TAB,"team5vendor@hotmail.com");
        extentTest.pass("test sonlandırıldı");
        extentReports.flush();
        Driver.closeDriver();
    }

    @Test
    public void testCase4() {
        extentReport();
        extentTest=extentReports.createTest("ExtentTest","Test Raporu");
        /*
        Kullanıcı ana sayfaya gider
        Kullanıcı Sign in butonunu tıklar
        Kullanıcı geçerli username ve password girer
        Kullanıcı Sign in butonunu tıklar ve Kullanıcı Ana sayfasına girer
        Kullanıcı ana sayfanın en altında bulunan Cart butonuna tıklar
        Kullanıcı açılan sayfada toplam ödeyeceği tutarı "total" seçeğinde görebilmeli
         */

    //    Kullanıcı ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("Hubcomfy sitesine gidildi");

    //    Kullanıcı Sign in butonunu tıklar
        VendorShoppingLocates vendorShoppingLocates = new VendorShoppingLocates();
        vendorShoppingLocates.signIn.click();

    //    Kullanıcı geçerli username ve password girerek ana sayfaya ulaşır
        ReusableMethods.bekle(3);
        vendorShoppingLocates.username.sendKeys(ConfigReader.getProperty("Vendor_Mail"),Keys.TAB);
        vendorShoppingLocates.password.sendKeys(ConfigReader.getProperty("Vendor_Password"), Keys.ENTER);

    //    Kullanıcı ana sayfanın en altında bulunan Cart butonuna tıklar
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(3);
        vendorShoppingLocates.cart.click();

    //    Kullanıcı açılan sayfada toplam ödeyeceği tutarı "total" seçeğinde görebilmeli
        String actualText = Driver.getDriver().findElement(By.xpath("//tr[@class='order-total'] ")).getText();
        String expectedText = "Total $198.89";
        Assert.assertEquals(expectedText, actualText);
        extentTest.pass("test sonlandırıldı");
        extentReports.flush();
        Driver.closeDriver();

    }

    @Test
    public void testCase5() {
        extentReport();
        extentTest=extentReports.createTest("ExtentTest","Test Raporu");
        /*
        Kullanıcı ana sayfaya gider
        Kullanıcı Sign in butonunu tıklar
        Kullanıcı geçerli username ve password girer
        Kullanıcı Sign in butonunu tıklar ve Kullanıcı Ana sayfasına girer
        Kullanıcı ana sayfanın en altında bulunan Cart butonuna tıklar
        Kullanıcı açılan sayfada Proceed To Checkout seçeneğini tıklar
        Açılan sayfada Payment Methods kısmındaki Wire transfer/EFT veya Pay at the door seçeneklerini seçilir olmalı

         */

    //    Kullanıcı ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("Hubcomfy sitesine gidildi");
    //    Kullanıcı Sign in butonunu tıklar
        VendorShoppingLocates vendorShoppingLocates = new VendorShoppingLocates();
        vendorShoppingLocates.signIn.click();

    //    Kullanıcı geçerli username ve password girerek ana sayfaya ulaşır
        ReusableMethods.bekle(3);
        vendorShoppingLocates.username.sendKeys(ConfigReader.getProperty("Vendor_Mail"),Keys.TAB);
        vendorShoppingLocates.password.sendKeys(ConfigReader.getProperty("Vendor_Password"), Keys.ENTER);


    //    Kullanıcı ana sayfanın en altında bulunan Cart butonuna tıklar
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(3);
        vendorShoppingLocates.cart.click();

    //    Kullanıcı açılan sayfada Proceed To Checkout seçeneğini tıklar
        ReusableMethods.bekle(2);
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        vendorShoppingLocates.proceedToCheckout.click();

    //    Açılan sayfada Payment Methods kısmındaki Wire transfer/EFT veya Pay at the door seçeneklerini seçilir olmalı
        ReusableMethods.bekle(3);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        vendorShoppingLocates.paymentMethodClick.click();
        ReusableMethods.bekle(3);
        vendorShoppingLocates.wireTransferClick.click();
        ReusableMethods.bekle(3);
        vendorShoppingLocates.paymentMethodClick.click();
        ReusableMethods.bekle(3);
        vendorShoppingLocates.wireTransferClick.click();
        extentTest.pass("test sonlandırıldı");
        extentReports.flush();
        Driver.closeDriver();

    }

    @Test
    public void testCase6() {
        extentReport();
        extentTest=extentReports.createTest("ExtentTest","Test Raporu");
        /*
        Kullanıcı ana sayfaya gider
        Kullanıcı Sign in butonunu tıklar
        Kullanıcı geçerli username ve password girer
        Kullanıcı Sign in butonunu tıklar ve Kullanıcı Ana sayfasına girer
        Kullanıcı ana sayfanın en altında bulunan Cart butonuna tıklar
        Kullanıcı açılan sayfada Proceed To Checkout seçeneğini tıklar
        Kullanıcı açılan sayfada place order seçeneğini tıklar ve alışverişin tamamlanıp tamamlanmadığını kontrol eder
         */

    //    Kullanıcı ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("Hubcomfy sitesine gidildi");
    //    Kullanıcı Sign in butonunu tıklar
        VendorShoppingLocates vendorShoppingLocates = new VendorShoppingLocates();
        vendorShoppingLocates.signIn.click();

    //    Kullanıcı geçerli username ve password girerek ana sayfaya ulaşır
        ReusableMethods.bekle(3);
        vendorShoppingLocates.username.sendKeys(ConfigReader.getProperty("Vendor_Mail"),Keys.TAB);
        vendorShoppingLocates.password.sendKeys(ConfigReader.getProperty("Vendor_Password"), Keys.ENTER);

    //    Kullanıcı ana sayfanın en altında bulunan Cart butonuna tıklar
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(3);
        vendorShoppingLocates.cart.click();

    //    Kullanıcı açılan sayfada Proceed To Checkout seçeneğini tıklar
        ReusableMethods.bekle(2);
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        vendorShoppingLocates.proceedToCheckout.click();

    //    Kullanıcı açılan sayfada place order seçeneğini tıklar ve alışverişin tamamlanıp tamamlanmadığını kontrol eder
        ReusableMethods.bekle(2);
        action.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        vendorShoppingLocates.placeOrderClick.click();


        String actualText = Driver.getDriver().findElement(By.xpath("//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")).getText();
        String expectedText = "Thank you. Your order has been received.";
        Assert.assertEquals(expectedText, actualText);
        extentTest.pass("test sonlandırıldı");
        extentReports.flush();
        Driver.closeDriver();

    }

    @Test
    public void testCase7() {
        extentReport();
        extentTest=extentReports.createTest("ExtentTest","Test Raporu");
        /*
        Kullanıcı ana sayfaya gider
        Kullanıcı Sign in butonunu tıklar
        Kullanıcı geçerli username ve password girer
        Kullanıcı Sign in butonunu tıklar ve Kullanıcı Ana sayfasına girer
        Kullanıcı ana sayfanın en altında bulunan My Account butonuna tıklar
        Kullanıcı açılan sayfada Orders butonuna tıklar ve alışveriş ayrıntılarını kontrol eder
         */

    //    Kullanıcı ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("Hubcomfy sitesine gidildi");
    //    Kullanıcı Sign in butonunu tıklar
        VendorShoppingLocates vendorShoppingLocates = new VendorShoppingLocates();
        vendorShoppingLocates.signIn.click();

    //    Kullanıcı geçerli username ve password girerek ana sayfaya ulaşır
        ReusableMethods.bekle(3);
        vendorShoppingLocates.username.sendKeys(ConfigReader.getProperty("Vendor_Mail"),Keys.TAB);
        vendorShoppingLocates.password.sendKeys(ConfigReader.getProperty("Vendor_Password"), Keys.ENTER);

    //    Kullanıcı ana sayfanın en altında bulunan My Account butonuna tıklar
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(3);
        vendorShoppingLocates.myAccount.click();

    //    Kullanıcı açılan sayfada Orders butonuna tıklar ve alışveriş ayrıntılarını kontrol eder
        ReusableMethods.bekle(3);
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();

        vendorShoppingLocates.ordersClick.click();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        tumSayfaResmi();
        extentTest.pass("test sonlandırıldı");
        extentReports.flush();
        Driver.closeDriver();
    }
}



