package Team05.test;


import Team05.pages.CustomerShoppingLocates;
import Team05.pages.VendorCouponsLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


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

    @Test
    public void customerShopping() {
        // Aranacak ürün

        String aranacakUrun = "shoes";

        //https://hubcomfy.com/ sitesine gider

        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        //Kullanıcı login olur
        CustomerShoppingLocates costumerShopping = new CustomerShoppingLocates();
        VendorCouponsLocates vendorCouponsLocates = new VendorCouponsLocates();
        costumerShopping.signInButonu.click();

        costumerShopping.Customer_Username.sendKeys(ConfigReader.getProperty("Customer_Username"), Keys.TAB);

        costumerShopping.Customer_Password.sendKeys(ConfigReader.getProperty("Customer_Password"), Keys.ENTER);

        bekle(5);



        //Search box'a ürün ismi yazar ve enter'e tıklar

        costumerShopping.searchBox.sendKeys(aranacakUrun, Keys.ENTER);

        bekle(3);



        //Listelenen ürünlerden "Gray Leather Shoes" ürününün üzerine tıklar
        costumerShopping.secilenUrun.click();


        //Açılan sayfada yer alan ADD TO CART butonuna tıklar
        costumerShopping.addToCartButton.click();

        scrollEnd();

        bekle(2);


        //Sayfada yer alan cart butonuna tıklar
       costumerShopping.cartButton.click();

       bekle(2);


        //Acılan Shopping Cart sayfasından Quantity yazısının altında yer alan"+" butonuna ve sonrasında Update Cart butonuna tıklar
        costumerShopping.plusButton.click();
        costumerShopping.updateCartButton.click();
        bekle(5);
        tumSayfaResmi();
        bekle(2);


        // Shopping Cart sayfasından Quantity yazısının altında yer alan"-" butonuna ve sonrasında Update Cart butonuna tıklar
        costumerShopping.minusButton.click();
        costumerShopping.updateCartButton.click();
        bekle(5);
        tumSayfaResmi();
        bekle(2);


        //Açılan sayfada BILLING DETAILS başlığı altında fatura adresi gürülür

        Assert.assertTrue(costumerShopping.billingDetails.isDisplayed());


        bekle(3);


        //Sayfada yer alan proceed to checkout butonuna tıklanır
        costumerShopping.checkoutButton.click();
        bekle(3);


        //Shopping Cart sayfasında yer alan COUPON DISCOUNT alanına oluşturulan kupon numarası girer

        costumerShopping.enterYourCode.click();
        costumerShopping.couponCode.sendKeys(fakerInput("fakerCoupon"));
        bekle(3);



        //Apply Coupon butnuna tıklar ve kabul ediğine ilişkin notu görür
        costumerShopping.applyCouponButton.click();
        bekle(5);

        costumerShopping.closeIkon.click();


        //Ürünün fiyatının değiştiğini doğrular






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
        bekle(5);



        //Sayfada yer alan PLACE ORDER butonuna tıklanır
        costumerShopping.placeOrderButton.click();



        Driver.closeDriver();




    }
}
