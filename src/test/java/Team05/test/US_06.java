package Team05.test;


import Team05.pages.CustomerShoppingLocates;
import Team05.pages.VendorCouponsLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.text.SimpleDateFormat;
import java.util.Date;


public class US_06 extends ReusableMethods {
    //https://hubcomfy.com/ sitesine gider
    //Kullanıcı login olur
    //Search box'a ürün ismi yazar ve enter'e tıklar
    //Listelenen ürünlerden "Gray Leather Shoes" ürününün üzerine tıklar
    //Açılan sayfada yer alan ADD TO CART butonuna tıklar
    //Sayfada yer alan cart butonuna tıklar
    //Acılan Shopping Cart sayfasından Quantity yazısının altında yer alan"+" butonuna tıklar
    // Shopping Cart sayfasından Quantity yazısının altında yer alan"-" butonuna tıklar
    //Açılan sayfada BILLING DETAILS başlığı altında fatura adresi gürülür
    //Sayfada yer alan proceed to checkout butonuna tıklanır
    //Shopping Cart sayfasında yer alan COUPON DISCOUNT alanına oluşturulan kupon numarası girer
    //Apply Coupon butnuna tıklar ve kabul ediğine ilişkin notu görür
    //Ürünün fiyatının değiştiğini doğrular
    //Payment Methods alt başlığı altında yer alan Pay at the door butonuna secilir
    //Payment Methods alt başlığı altında yer alan Wire transfer/EFT butonuna secilir
    //Sayfada yer alan PLACE ORDER butonuna tıklanır

    WebElement driver;
    SoftAssert softAssert= new SoftAssert();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    CustomerShoppingLocates costumerShopping = new CustomerShoppingLocates();
    VendorCouponsLocates vendorCouponsLocates=new VendorCouponsLocates();



    @Test
    public void customerShopping() {

        extentReport();
        extentTest=extentReports.createTest("ExtentTest","Test Raporu");

        //https://hubcomfy.com/ sitesine gider

        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("Hubcomfy Adresine Gidildi");

        //Kullanıcı login olur

        CustomerShoppingLocates costumerShopping = new CustomerShoppingLocates();
        VendorCouponsLocates vendorCouponsLocates = new VendorCouponsLocates();
        costumerShopping.signInButonu.click();

        costumerShopping.Customer_Username.sendKeys(ConfigReader.getProperty("Customer_Username"), Keys.TAB);

        costumerShopping.Customer_Password.sendKeys(ConfigReader.getProperty("Customer_Password"), Keys.ENTER);

        extentTest.info("Kullanıcı login oldu");
        bekle(5);


        // Aranacak ürün

        String aranacakUrun = "shoes";

        //Search box'a ürün ismi yazar ve enter'e tıklar

        costumerShopping.searchBox.sendKeys(aranacakUrun, Keys.ENTER);
        extentTest.info("Aranacak Ürün Search Box'a girildi ve Enter'a Tıklandı");

        bekle(3);


        //Listelenen ürünlerden "Gray Leather Shoes" ürününün üzerine tıklar
        costumerShopping.secilenUrun.click();
        extentTest.info("Listelenen ürünlerden Gray Leather Shoes'un üzerine tıklandı");


        //Açılan sayfada yer alan ADD TO CART butonuna tıklar
        costumerShopping.addToCartButton.click();
        extentTest.info("Açılan sayfada yer alan ADD TO CART butonuna tıklandı");

        scrollEnd();

        bekle(2);


        //Sayfada yer alan cart butonuna tıklar
       costumerShopping.cartButton.click();
        extentTest.info("Sayfada yer alan cart butonuna tıklandı");




        bekle(2);


        //Acılan Shopping Cart sayfasından Quantity yazısının altında yer alan"+" butonuna ve sonrasında Update Cart butonuna tıklar
        costumerShopping.plusButton.click();
        costumerShopping.updateCartButton.click();
        extentTest.info("Sayfada yer alan '+' ve Update Cart butonlarına tıklandı");

        bekle(5);
        tumSayfaResmi();
        extentTest.info("Ürünün sayısının arttığına ilişkin sayfa resmi alındı");
        bekle(2);


        // Shopping Cart sayfasından Quantity yazısının altında yer alan"-" butonuna ve sonrasında Update Cart butonuna tıklar
        costumerShopping.minusButton.click();
        costumerShopping.updateCartButton.click();
        extentTest.info("Sayfada yer alan '-' ve Update Cart butonlarına tıklandı");

        bekle(5);
        tumSayfaResmi();
        extentTest.info("Ürünün sayısının azalığına ilişkin sayfa resmi alındı");
        bekle(2);


        //Sayfada yer alan Shipping Başlığı altında  fatura adresi olduğu gürülür

        Assert.assertTrue(costumerShopping.billingDetails.isDisplayed());
        extentTest.info("Sayfada yer alan Shipping Başlığı altında  fatura adresi olduğu görüldü");

        bekle(3);


        //Sayfada yer alan proceed to checkout butonuna tıklanır
        costumerShopping.checkoutButton.click();
        extentTest.info("Sayfada yer alan proceed to checkout butonuna tıklandı");

        bekle(3);


        //ENTER YOUR CODE alanına oluşturulan kupon numarası girer

        costumerShopping.enterYourCode.click();
        costumerShopping.couponCode.sendKeys(fakerInput("Coupon"));
        extentTest.info("ENTER YOUR CODE alanına oluşturulan Coupon No girildi");

        bekle(3);



        //Apply Coupon butnuna tıklar ve kabul ediğine ilişkin notu görür
        costumerShopping.applyCouponButton.click();
        extentTest.info("Apply Coupon butnuna tıklar ve Coupon'un kabul edilmediği görüldü");
        tumSayfaResmi();
        extentTest.info("Coupon'un kabul edilmediğine ilişkin mesajın yer aldığı sayfa resmi alındı");
        bekle(5);

        costumerShopping.closeIkon.click();


        //Ürünün fiyatının değiştiğini doğrular
        tumSayfaResmi();
        extentTest.info("Ürünün fiyatının değişmediği görüldü");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,750)");
        bekle(3);

        //Payment Methods alt başlığı altında yer alan Pay at the door butonuna secilir

        costumerShopping.paymentMethod2.click();
        Assert.assertTrue(costumerShopping.paymentMethod2.isSelected());

        bekle(2);


        //Payment Methods alt başlığı altında yer alan Wire transfer/EFT butonuna secilir
        costumerShopping.paymentMethod1.click();
        Assert.assertTrue(costumerShopping.paymentMethod1.isSelected());
        extentTest.info("Payment Methods alt başlığı altında yer alan Pay at the door ve Wire transfer/EFT butonlarının secilebildiği görüldü");
        bekle(5);

        //Sayfada yer alan PLACE ORDER butonuna tıklanır
        costumerShopping.placeOrderButton.click();
        extentTest.info("PLACE ORDER butonuna tıklanarak alışverişin tamamlandığı görüldü.");



        extentTest.pass("Test sonlandırıldı");
        extentReports.flush();


        Driver.closeDriver();


    }
}
