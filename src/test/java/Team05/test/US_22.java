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

public class US_22 {
    @Test
    public void testCase1() {
        /*
        Kullanıcı ana sayfaya gider
        Kullanıcı Sign in butonunu tıklar
        Kullanıcı geçerli username ve password girerek ana sayfaya ulaşır
        Kullanıcı ana sayfada seçtiği herhangibir ürünün üzerine tıklar
        Kullanıcı açılan sayfada Add To Cart seçeneğini tıklayarak seçtiği ürünü sepete ekler
        Kullanıcı cart seçeneğini tıklayarak sepetin güncellendiğini ve eklediği ürünün sepette olduğunu kontrol eder
        Kullanıcı açılan sayfada "Enter coupon code here " kısmına  indirim kodunu girerek "Apply Coupon" seçeneğine tıklar

         */

     //   Kullanıcı ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));

     //   Kullanıcı Sign in butonunu tıklar
        VendorShoppingLocates vendorShoppingLocates = new VendorShoppingLocates();
        vendorShoppingLocates.signIn.click();

     //   Kullanıcı geçerli username ve password girerek ana sayfaya ulaşır
        ReusableMethods.bekle(3);
        vendorShoppingLocates.username.sendKeys(ConfigReader.getProperty("Vendor_Mail"), Keys.TAB);
        vendorShoppingLocates.password.sendKeys(ConfigReader.getProperty("Vendor_Password"), Keys.ENTER);

     //   Kullanıcı ana sayfada seçtiği herhangibir ürünün üzerine tıklar
        ReusableMethods.bekle(3);
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN,
                Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        vendorShoppingLocates.urun.click();

     //   Kullanıcı açılan sayfada Add To Cart seçeneğini tıklayarak seçtiği ürünü sepete ekler
        ReusableMethods.bekle(3);
        vendorShoppingLocates.addToCart.click();

     //   Kullanıcı cart seçeneğini tıklayarak sepetin güncellendiğini ve eklediği ürünün sepette olduğunu kontrol eder
        ReusableMethods.bekle(3);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(3);
        vendorShoppingLocates.cart.click();

        String actualText = Driver.getDriver().findElement(By.xpath("//td[@class='product-name'] ")).getText();
        String expectedText = "Blue Ski Boots";
        Assert.assertEquals(expectedText, actualText);


     //   Kullanıcı açılan sayfada "Enter coupon code here " kısmına  indirim kodunu girerek "Apply Coupon" seçeneğine tıklar
        ReusableMethods.bekle(3);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        vendorShoppingLocates.couponCode.sendKeys("000100");
        vendorShoppingLocates.applyCoupon.click();

    }
}
