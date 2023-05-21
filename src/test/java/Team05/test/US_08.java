package Team05.test;


public class US_08 {


import Team05.pages.ProductCompareLocates;
import Team05.pages.WishListLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class US_08 extends ReusableMethods {

    ProductCompareLocates productCompareLocates = new ProductCompareLocates();
    WishListLocates WishListLocates = new WishListLocates();

    @Test
    public void test01() {

        extentReport();
        ExtentTest extentTest = extentReports.createTest("TestCase-1", "Test Raporu");
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("Kullanici Hubcomfy sayfasina tikladi.");
        List<WebElement> tumListe = Driver.getDriver().findElements(By.xpath("//*[@id='menu-item-3832']"));
        tumListe.get(0).click();
        extentTest.info("Kullanici Hubcomfy sayfasina gider");
        ProductCompareLocates.urun1.click();
        ReusableMethods.bekle(3);
        WishListLocates.wishListIsareti1.click();
        Driver.getDriver().navigate().back();
        ProductCompareLocates.urun2.click();
        ReusableMethods.bekle(3);
        WishListLocates.wishListIsareti2.click();
        Driver.getDriver().navigate().back();
        ProductCompareLocates.urun3.click();
        ReusableMethods.bekle(3);
        WishListLocates.wishListIsareti3.click();
        Driver.getDriver().navigate().back();
        ProductCompareLocates.urun4.click();
        ReusableMethods.bekle(3);
        WishListLocates.wishListIsareti4.click();
        Driver.getDriver().navigate().back();
        extentTest.info("WishLisesine 4 urun eklendi");
        WishListLocates.wishListSayfasi.click();
        assertTrue(WishListLocates.productYazisi.isDisplayed());
        extentTest.info("WishLisesine 4 urun eklendi dogrulandi");
        extentReports.flush();
        Driver.closeDriver();


    }

    @Test
    public void test02() {
        extentReport();
        ExtentTest extentTest = extentReports.createTest("TestCase-2", "Test Raporu");
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("Kullanici Hubcomfy sayfasina gider");
        ProductCompareLocates.signIn.click();
        ProductCompareLocates.userName.sendKeys(ConfigReader.getProperty("Customer_Username"));
        ProductCompareLocates.password.sendKeys(ConfigReader.getProperty("Customer_Password"));
        ReusableMethods.bekle(2);
        ProductCompareLocates.login.click();
        ReusableMethods.bekle(3);
        List<WebElement> tumListe = Driver.getDriver().findElements(By.xpath("//*[@id='menu-item-3832']"));
        tumListe.get(0).click();
        extentTest.info("Kullanici Electoronic bolumune tikladi.");
        ProductCompareLocates.urun1.click();
        ReusableMethods.bekle(3);
        WishListLocates.wishListIsareti1.click();
        Driver.getDriver().navigate().back();
        ProductCompareLocates.urun2.click();
        ReusableMethods.bekle(3);
        WishListLocates.wishListIsareti2.click();
        Driver.getDriver().navigate().back();
        ProductCompareLocates.urun3.click();
        ReusableMethods.bekle(3);
        WishListLocates.wishListIsareti3.click();
        Driver.getDriver().navigate().back();
        ProductCompareLocates.urun4.click();
        ReusableMethods.bekle(3);
        WishListLocates.wishListIsareti4.click();
        Driver.getDriver().navigate().back();
        WishListLocates.wishListSayfasi.click();
        extentTest.info("4 urun eklendi");
        assertTrue(WishListLocates.productYazisi.isDisplayed());
        extentTest.info("WishList listesinde 4 urun oldugu dogrulandi");
        ReusableMethods.bekle(2);
        WishListLocates.quickViewButonu.click();
        extentTest.info("WishList sayfasinda Quick View butonuna tiklandi");
        assertTrue(WishListLocates.baslik.isDisplayed());
        extentTest.info("Urun ozelliklerinin goruldugu dogrulandi");
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().refresh();
        WishListLocates.addToCard1.click();
        extentTest.info("Urun sepete eklendi");
        ReusableMethods.bekle(2);
        WishListLocates.cardTusu.click();
        WishListLocates.checkout.click();
        extentTest.info("Odeme sayfasina gecildi");
        ReusableMethods.bekle(2);
        JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()",WishListLocates.placeOrder);
        ReusableMethods.bekle(2);
        assertTrue(WishListLocates.siparisinizKaydoldu.isDisplayed());
        extentTest.pass("Siparisiniz kaydoldu yazisi gorulur");
        //Thank you. Your order has been received.
        assertTrue(WishListLocates.siparisinizKaydoldu.isDisplayed());
        extentTest.info("Siparis basarili bir sekilde tamamlandi");
        extentReports.flush();
        Driver.getDriver().close();

    }


}
