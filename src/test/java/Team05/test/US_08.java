package Team05.test;

import Team05.pages.WishListLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class US_08 extends ReusableMethods {
    @Test
    public void test01() {

        WishListLocates WishListLocates = new WishListLocates();
        ReusableMethods.extentReportParametreli("Ali Kaya", "US-08 TC01-01");
        Driver.getDriver().get(ConfigReader.getProperty("pearly_Url"));
        //2 Kullanici istedigi urun alanina tiklar(Electronics DropDown, SmarthPhone kismi)
        List<WebElement> tumListe = Driver.getDriver().findElements(By.xpath("//*[@id='menu-item-3832']"));
        tumListe.get(0).click();



        //3 Sayfanin acildigni Gorur
        assertTrue(Driver.getDriver().getTitle().contains("Electronics"));

        //4 Search butonuna "Xiaomi Phone" yazar ve enter'a basar
        WishListLocates.searchButton.sendKeys("Xiaomi Phone", Keys.ENTER);
        ReusableMethods.extentTest.info("Iki tane urun secildi ve WishList'e eklendi");
        WishListLocates.urun1.click();
        ReusableMethods.bekle(3);
        WishListLocates.wishListIsareti.click();
        Driver.getDriver().navigate().back();

        WishListLocates.urun2.click();
        ReusableMethods.bekle(3);
        WishListLocates.wishListIsareti2.click();


        WishListLocates.wishListSayfasi.click();
        assertTrue(WishListLocates.productYazisi.isDisplayed());
        ReusableMethods.extentTest.pass("Secilen urunler WishList bolumunde basarili bir sekilde goruldu");

        ReusableMethods.extentReports.flush();
        Driver.closeDriver();



    }

    @Test
    public void test02() {

        ReusableMethods.extentReportParametreli("Ali Kaya", "US-08 TC02-01");
        WishListLocates WishListLocates = new WishListLocates();
        Driver.getDriver().get(ConfigReader.getProperty("pearly_Url"));
        //2 Kullanici istedigi urun alanina tiklar(Electronics DropDown, SmarthPhone kismi)
        List<WebElement> tumListe = Driver.getDriver().findElements(By.xpath("//*[@id='menu-item-3832']"));
        tumListe.get(0).click();
        ReusableMethods.extentTest.info("Electronics bolumune gidildi");
        WishListLocates.searchButton.sendKeys("Xiaomi Phone", Keys.ENTER);
        ReusableMethods.extentTest.info("Electronics 'Xiaomi Phone' aratildi");
        WishListLocates.urun1.click();
        ReusableMethods.bekle(3);
        WishListLocates.wishListIsareti.click();
        Driver.getDriver().navigate().back();
        WishListLocates.urun2.click();
        ReusableMethods.bekle(3);
        WishListLocates.wishListIsareti2.click();
        WishListLocates.wishListSayfasi.click();
        ReusableMethods.extentTest.info("Secilen urunler WishList'e eklendi");

        assertTrue(WishListLocates.productYazisi.isDisplayed());
        ReusableMethods.extentTest.pass("WishList sayfasinda Product yazisi gorundu");
        assertTrue(WishListLocates.priceYazisi.isDisplayed());
        ReusableMethods.extentTest.pass("WishList sayfasinda Price yazisi gorundu");
        assertTrue(WishListLocates.stockYazisi.isDisplayed());
        ReusableMethods.extentTest.pass("WishList sayfasinda Stock yazisi gorundu");

        WishListLocates.quickViewButonu.click();
        assertTrue(WishListLocates.baslik.isDisplayed());
        ReusableMethods.extentTest.pass("WishList sayfasinda Quick View butonu gorundu");
        Driver.getDriver().navigate().refresh();

        ReusableMethods.extentReports.flush();
        Driver.getDriver().close();

    }

    @Test
    public void test03() {

        WishListLocates WishListLocates = new WishListLocates();
        ReusableMethods.extentReportParametreli("Ali Kaya", "US-08 TC03-01");
        Driver.getDriver().get(ConfigReader.getProperty("pearly_Url"));
        List<WebElement> tumListe = Driver.getDriver().findElements(By.xpath("//*[@id='menu-item-3832']"));
        tumListe.get(0).click();
        ReusableMethods.extentTest.info("Sayfaya gidildi");
        WishListLocates.searchButton.sendKeys("Xiaomi Phone", Keys.ENTER);
        WishListLocates.urun1.click();
        ReusableMethods.bekle(3);
        WishListLocates.wishListIsareti.click();
        Driver.getDriver().navigate().back();
        WishListLocates.urun2.click();
        ReusableMethods.bekle(3);
        WishListLocates.wishListIsareti2.click();
        WishListLocates.wishListSayfasi.click();
        ReusableMethods.extentTest.info("Iki urun secildi WishList isaretine tiklandi");

        assertTrue(WishListLocates.addToCard2.isDisplayed());
        ReusableMethods.extentTest.pass("Add to Card isaretinin gorundu");
        WishListLocates.addToCard2.click();

        WishListLocates.cardTusu.click();
        ReusableMethods.extentTest.info("Add Card tusuna tiklandi");

        ReusableMethods.extentReports.flush();
        Driver.closeDriver();

    }
    @Test
    public void test04() throws InterruptedException {
        ReusableMethods.extentReportParametreli("Ali Kaya", "US-08 TC04-01");
        WishListLocates WishListLocates = new WishListLocates();
        Driver.getDriver().get(ConfigReader.getProperty("pearly_Url"));
        List<WebElement> tumListe = Driver.getDriver().findElements(By.xpath("//*[@id='menu-item-3832']"));
        tumListe.get(0).click();
        ReusableMethods.extentTest.info("Sayfaya gidildi");
        WishListLocates.searchButton.sendKeys("Xiaomi Phone", Keys.ENTER);
        ReusableMethods.extentTest.info("Urun aratildi");
        WishListLocates.urun1.click();
        ReusableMethods.bekle(3);
        WishListLocates.wishListIsareti.click();
        Driver.getDriver().navigate().back();
        WishListLocates.urun2.click();
        ReusableMethods.bekle(3);
        WishListLocates.wishListIsareti2.click();
        ReusableMethods.extentTest.info("Iki tane urun secildi  ve WishList(Begenilen) sayfasina eklendi");
        Driver.getDriver().navigate().back();
        WishListLocates.urun1.click();
        ReusableMethods.bekle(3);
        WishListLocates.add.click();
        ReusableMethods.extentTest.info("Urunler sepete eklendi");
        WishListLocates.cardTusu.click();
        ReusableMethods.extentTest.info("Sepet sayfasina gidildi");

        WishListLocates.add2.click();

        Faker faker = new Faker();
        String name= faker.name().name();
        String lastName= faker.name().lastName();
        String companyName= faker.name().title();
        String adress = faker.address().fullAddress();
        String apartman = faker.address().secondaryAddress();
        String city = faker.address().city();


        ReusableMethods.bekle(2);
        //WishListLocates.checkout.click();
        WishListLocates.name.sendKeys(name, Keys.TAB, lastName, Keys.TAB, companyName, Keys.TAB, Keys.ENTER, Keys.ENTER);
        ReusableMethods.extentTest.info("Biling Details bilgileri dolduruldu");


        String zipCode = ConfigReader.getProperty("zipCode");
        String  phone =ConfigReader.getProperty("phoneNumber");
        String emailAdres = faker.internet().emailAddress();
        
        WishListLocates.adress.sendKeys( adress, Keys.TAB,
                apartman, Keys.TAB, city);


        WishListLocates.zipCode.sendKeys(zipCode, Keys.TAB, phone, Keys.TAB, emailAdres, Keys.TAB);
        JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()",WishListLocates.createAccount);
        ReusableMethods.bekle(2);

        String fakeUser = faker.name().username();
        String password = String.valueOf(faker.number());
        WishListLocates.user.sendKeys(fakeUser, Keys.TAB, password, Keys.ENTER );

        js.executeScript("arguments[0].click()",WishListLocates.placeOrder);
        ReusableMethods.bekle(2);
        ReusableMethods.extentTest.info("Place Order butonuna tiklanarak alisveris tamamlandi");


        assertTrue(WishListLocates.siparisinizKaydoldu.isDisplayed());
        ReusableMethods.extentTest.pass("Siparisiniz kaydoldu yazisi gorulur");
        //Thank you. Your order has been received.
        assertTrue(WishListLocates.siparisinizKaydoldu.isDisplayed());
        ReusableMethods.extentTest.pass("'Thank you. Your order has been received.' yazisi goruldu");
        ReusableMethods.extentTest.info("Siparis basarili bir sekilde tamamlandi");


        ReusableMethods.extentReports.flush();
        Driver.closeDriver();
    }
 

    
}
