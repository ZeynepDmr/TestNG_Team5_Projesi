package Team05.test;

import Team05.pages.BillingUsLocates;
import Team05.pages.CustomerShoppingLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.css.Counter;

import java.util.List;

public class US_06 extends ReusableMethods {

    //https://hubcomfy.com/ sitesine gider
    //Kullanıcı login olur
    //Search box'a ürün ismi yazar ve enter'e tıklar
    //Açılan sayfada aratmış olduğu ürünlerin listelendiğini görür
    //Listelenen ürünlerden Gray Leather Shoes'in üzerine tıklar
    //Açılan sayfada yer alan ADD TO CART butonuna tıklar
    //Sayfada yer alan cart butonuna tıklar
    //Açılan SHOPPING CART yan penceresinde sepete eklenen ürünleri görüntüler
    //Açılan SHOPPING CART yan penceresinde yer alan view cart butonuna tıklar
    //Shopping Cart sayfasının açıldığı görülür
    // Quantity yazısının altında yer alan"+" butonuna tıklar
    // Quantity yazısının altında yer alan"+" ve "-" butonlarının solunda bulunan counter'ın azaldığı görür
    // Quantity yazısının altında yer alan"-" butonuna tıklar
    // Quantity yazısının altında yer alan"+" ve "-" butonlarının solunda bulunan counter'ın azaldığı görür
    //Shopping Cart sayfasında yer alan COUPON DISCOUNT alanına oluşturulan kupon numarası girer
    //Apply Coupon butnuna tıklar ve kabul ediğine ilişkin notu görür
    //Ürünün fiyatının değiştiğini doğrular
    //Sayfada yer alan proceed to checkout butonuna tıklanır
    //Açılan sayfada BILLING DETAILS başlığı altında fatura adresi gürülür
    //Payment Methods alt başlığı altında yer alan Wire transfer/EFT butonuna seçilir
    //Payment Methods alt başlığı altında yer alan Pay at the door butonuna secilir
    //Sayfada yer alan PLACE ORDER butonuna tıklanır
    //Order Complete sayfasının açıldığı görülür

    WebElement driver;


    @Test
    public void customerShopping() {
        // Aranacak ürün

        String aranacakUrun = "shoes";

        //https://hubcomfy.com/ sitesine gider

        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        //Kullanıcı login olur
        CustomerShoppingLocates costumerShopping = new CustomerShoppingLocates();
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

        bekle(3);


        //Sayfada yer alan cart butonuna tıklar
       costumerShopping.cartButton.click();

       bekle(3);


        //Acılan Shopping Cart sayfasından Quantity yazısının altında yer alan"+" butonuna tıklar
        costumerShopping.plusButton.click();


        costumerShopping.minusButton.click();
        bekle(3);



        // Quantity yazısının altında yer alan"+" ve "-" butonlarının solunda bulunan counter'ın azaldığı görür






        //Shopping Cart sayfasında yer alan COUPON DISCOUNT alanına oluşturulan kupon numarası girer
        //costumerShopping.enterCouponCode.sendKeys();



        //Apply Coupon butnuna tıklar ve kabul ediğine ilişkin notu görür
        costumerShopping.applyCouponButton.click();



        //Ürünün fiyatının değiştiğini doğrular




        //Sayfada yer alan proceed to checkout butonuna tıklanır
        costumerShopping.checkoutButton.click();

        //Açılan sayfada BILLING DETAILS başlığı altında fatura adresi gürülür
        String actualText=driver.findElement(By.xpath("/*[text()='Billing details'] ")).getText();
        String expectedText="BILLING DETAILS";
        Assert.assertEquals(expectedText,actualText);


        //Payment Methods alt başlığı altında yer alan Wire transfer/EFT butonuna seçilir
        costumerShopping.paymentMethod1.click();

        //Payment Methods alt başlığı altında yer alan Pay at the door butonuna secilir
        costumerShopping.getPaymentMethod2.click();

        //Sayfada yer alan PLACE ORDER butonuna tıklanır
        costumerShopping.placeOrderButton.click();



        Driver.closeDriver();




    }
}
