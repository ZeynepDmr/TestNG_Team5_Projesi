package Team05.test;

import Team05.pages.ProductCompareLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class US_07 {


    ProductCompareLocates productCompareLocates = new ProductCompareLocates();
    Driver driver;

    @Test
    public void test01() {

        ReusableMethods.extentReportParametreli("Kubra Simsek", "US-07 TC01-01");
        ProductCompareLocates ProductCompareLocates = new ProductCompareLocates();
        ReusableMethods.extentTest.info("Kullanici Anasayfaya gider");
        //Kulanici sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearly_Url"));

        //1 Kullanici SigIn yapar
        ProductCompareLocates.signIn.click();
        ReusableMethods.extentTest.info("Kullanici SignIn yapar");
        ProductCompareLocates.userName.sendKeys(ConfigReader.getProperty("emailK"),Keys.TAB);
        ProductCompareLocates.password.sendKeys(ConfigReader.getProperty("sifreK"),Keys.TAB);
        ReusableMethods.extentTest.info("Kullanici email ve sifre bilgilerini girer");
        ProductCompareLocates.rememberMe.click();
        ReusableMethods.bekle(2);
        ProductCompareLocates.login.click();



        ReusableMethods.bekle(2);
        assertTrue(ProductCompareLocates.sigInYapildi.isDisplayed());
        ReusableMethods.extentTest.pass("Kullanici basarili bir sekilde SignIn oldugu dogrulanir");

    }


    @Test
    public void tets02(){
        ProductCompareLocates ProductCompareLocates = new ProductCompareLocates();
        //Kulanici sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearly_Url"));
        ProductCompareLocates = new ProductCompareLocates();
        //2 Kullanici istedigi urun alanina tiklar(Electronics DropDown, SmarthPhone kismi)
        List<WebElement> tumListe = Driver.getDriver().findElements(By.xpath("//*[@id='menu-item-3832']"));
        tumListe.get(0).click();
        ReusableMethods.extentTest.info("Kullanici Electoronic bolumune ulasir");


        //3 Sayfanin acildigni Gorur
        assertTrue(Driver.getDriver().getTitle().contains("Electronics"));
        ReusableMethods.extentTest.pass("Kullanici Electoronic bolumune ulasir");

        //4 Search butonuna "Xiaomi Phone" yazar ve enter'a basar
        ProductCompareLocates.searchButton.sendKeys("Xiaomi Phone", Keys.ENTER);
        ReusableMethods.extentTest.info("Kullanici urun aratma islemini yapar");


        //6 Bulunan sonuclardan 4 tane urun secer ve "Compare" ozelligi tasidigini gorur
        ProductCompareLocates.urun1.click();
        ProductCompareLocates.compareOzelligi.click();
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().back();


        ProductCompareLocates.urun2.click();
        ProductCompareLocates.compareOzelligi.click();
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().back();

        ProductCompareLocates.urun3.click();
        ProductCompareLocates.compareOzelligi.click();
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().back();
        ReusableMethods.extentTest.info("Kullanici dort urun secer");
        ReusableMethods.extentTest.info("Kullanici sectigi urunlerin 'Compare' ozelligi tasidigini gorur");


        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.scroll(ProductCompareLocates.urun4);

        WebElement urun4 = Driver.getDriver().findElement(By.xpath("(//a[@href='https://pearlymarket.com/urun/xiaomi-phone-4/'])[2]"));
        JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()", urun4);
        ProductCompareLocates.compareOzelligi.click();


        ReusableMethods.bekle(2);

        assertTrue(ProductCompareLocates.startCompareYazisi.isDisplayed());
        ReusableMethods.extentTest.pass("Kullanici 'Start Compare' yazisini gorur");
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().back();



        //8 Kullanici karsilastrimak icin 5. urunu secmeye calisir
        WebElement urun5 = Driver.getDriver().findElement(By.xpath("//a[text()='Xiaomi Phone -3']"));
        js.executeScript("arguments[0].click()", urun5);

        ProductCompareLocates.compareOzelligi.click();
        ReusableMethods.extentTest.info("Kullanici karsilastirmak icin 5. urunu secmeye calisir");

        //9 Ekranda dort urun bulunmasini bekler
        assertTrue(ProductCompareLocates.dortEleman.isDisplayed());
        ReusableMethods.extentTest.pass("5. urunun eklenmedigi, ekranda 4 urun oldugu gorulur");

        ReusableMethods.extentReports.flush();
        Driver.closeDriver();

    }

    @Test
    public void test01() throws InterruptedException {
        ReusableMethods.extentReportParametreli("Kubra Simsek", "US-07 TC02-01");
        ProductCompareLocates = new ProductCompareLocates();
        Driver.getDriver().get(ConfigReader.getProperty("pearly_Url"));
        ReusableMethods.extentTest.info("Kullanici Anasayfaya gider");
        Driver.getDriver().get(ConfigReader.getProperty("pearly_Url"));
        ProductCompareLocates = new ProductCompareLocates();

        //2 Kullanici istedigi urun alanina tiklar(Electronics DropDown, SmarthPhone kismi)
        List<WebElement> tumListe = Driver.getDriver().findElements(By.xpath("//*[@id='menu-item-3832']"));
        tumListe.get(0).click();
        ProductCompareLocates.searchButton.sendKeys("Xiaomi Phone", Keys.ENTER);
        ReusableMethods.extentTest.info("Kullanici urun aratir");

        ReusableMethods.bekle(2);




        ProductCompareLocates.urun1.click();
        ProductCompareLocates.compareOzelligi.click();
        ReusableMethods.extentTest.info("Kullanici sectigi urunlerin 'Compare' ozelligini tiklar");
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().back();


        ProductCompareLocates.urun2.click();
        ProductCompareLocates.compareOzelligi.click();
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().back();

        ProductCompareLocates.urun3.click();
        ProductCompareLocates.compareOzelligi.click();
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().back();

        WebElement urun4 = Driver.getDriver().findElement(By.xpath("(//a[@href='https://pearlymarket.com/urun/xiaomi-phone-4/'])[2]"));
        JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()", urun4);
        ProductCompareLocates.compareOzelligi.click();
        ReusableMethods.extentTest.info("Kullanici 'Start Compare' yazisina tiklar");

        //Start Compare yazisina JScript ile ulastik
        //    Submit tuşuna tıkla
        WebElement submit = Driver.getDriver().findElement(By.xpath("//a[text()='Start Compare !']"));

        try {
            submit.click();//normal click yap, dogru locate ettin yine de calismadi ise
        } catch (Exception e) {//o zaman java script le yazilmis olabilir, asagidaki kod devreye girer

            js.executeScript("arguments[0].click()", submit);
        }

        assertTrue(ProductCompareLocates.productYazisi.isDisplayed());
        ReusableMethods.extentTest.pass("Kullanici karsilastirma sayfasinda 'Product' yazisini basarili sekilde gorur");
        assertTrue(ProductCompareLocates.priceYazisi.isDisplayed());
        ReusableMethods.extentTest.pass("Kullanici karsilastirma sayfasinda 'Price' yazisini basarili sekilde gorur");
        assertTrue(ProductCompareLocates.availabilityYazisi.isDisplayed());
        ReusableMethods.extentTest.pass("Kullanici karsilastirma sayfasinda 'Avability' yazisini basarili sekilde gorur");
        assertTrue(ProductCompareLocates.descriptionYazisi.isDisplayed());
        ReusableMethods.extentTest.pass("Kullanici karsilastirma sayfasinda 'Description' yazisini basarili sekilde gorur");


        ReusableMethods.extentReports.flush();
        Driver.closeDriver();


    }

    @Test
    public void test01(){
        //kullanici "pearly.com" sayfasina gider
        //Electronics dropdown menusunu secer
        //"xaiomi phone -4" urununu aratir ve karsilastirma isaretine basar
        //Kullanici karsilastirma sayfasinda urunlerin ustunde  "x" urun cikarma isretini gorur
        //Kullanici karsilastirma sayfasinda urunlerin ustunde "x" urun cikarma isretini tiklar.
        //Compare Product kisminada silinen urunlerin yerine "+" isaretine tiklayarak yeni urun ekler
        //bu yukardaki step jira da gecerli, burda adimlarini yazmadim
        //Kullanici "Clean all" tusunu gorur ve tiklar

        ReusableMethods.extentReportParametreli("Kubra Simsek", "US-07 TC03-01");
        ProductCompareLocates ProductCompareLocates = new ProductCompareLocates();
        Driver.getDriver().get(ConfigReader.getProperty("pearly_Url"));
        List<WebElement> tumListe = Driver.getDriver().findElements(By.xpath("//*[@id='menu-item-3832']"));
        tumListe.get(0).click();
        ReusableMethods.extentTest.info("Electronics kismina tiklandi");

        //4 Search butonuna "Xiaomi Phone -4" yazar ve enter'a basar
        ProductCompareLocates.searchButton.sendKeys("Xiaomi Phone -4", Keys.ENTER);
        ReusableMethods.extentTest.info("Urun aratildi");


        //6 Bulunan sonuclardan 4 tane urun secer ve "Compare" ozelligi tasidigini gorur
        ReusableMethods.extentTest.info("Dort urun secildi ve 'Compare' ozelligini tiklandi");

        ProductCompareLocates.ur1.click();
        ProductCompareLocates.compareOzelligi.click();
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().back();


        ProductCompareLocates.ur2.click();
        ProductCompareLocates.compareOzelligi.click();
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().back();

        ProductCompareLocates.ur3.click();
        ProductCompareLocates.compareOzelligi.click();
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().back();


        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        ProductCompareLocates.ur4.click();
        ProductCompareLocates.compareOzelligi.click();


        ReusableMethods.bekle(2);
        ProductCompareLocates.startCompareYazisi.click();
        ReusableMethods.extentTest.info("'Start Compare' bolumune gecildi");

        assertTrue(ProductCompareLocates.carpiIsareti.isDisplayed());
        ReusableMethods.extentTest.pass("Secilen urunlerin uzerinde 'carpi' isareti goruldu");


        ProductCompareLocates.carpiIsareti.click();
        Driver.getDriver().navigate().refresh();
        ReusableMethods.bekle(1);
        ProductCompareLocates.carpiIsareti2.click();
        Driver.getDriver().navigate().refresh();
        ReusableMethods.bekle(1);
        ProductCompareLocates.carpiIsareti3.click();
        Driver.getDriver().navigate().refresh();
        ReusableMethods.bekle(1);
        ProductCompareLocates.carpiIsareti.click();
        Driver.getDriver().navigate().refresh();
        ReusableMethods.bekle(1);
        ProductCompareLocates.carpiIsareti.click();
        Driver.getDriver().navigate().refresh();
        ReusableMethods.bekle(1);
        ProductCompareLocates.carpiIsareti.click();
        Driver.getDriver().navigate().refresh();
        ReusableMethods.bekle(1);
        ReusableMethods.extentTest.info("Secilen tum urunlerin uzerindeki 'Carpi' isaretini tiklandi");

        //"No Produits added compare" yazisi gorunur
        //karsilastirilan urunlerin tumu silinebilir

        assertTrue(ProductCompareLocates.noProduitsYazisi.isDisplayed());
        ReusableMethods.extentTest.pass("Cikartilan tum urunlerin silindigini basarili sekilde goruldu");


    }

    @Test
    public void test02(){
        //Compare Product kisminada silinen urunlerin yerine "+" isaretine tiklayarak yeni urun ekler
        //Kullanici "Clean all" tusunu gorur ve tiklar

        ReusableMethods.extentReportParametreli("Kubra Simsek", "US-07 TC03-02");
        Driver.getDriver().navigate().to(ConfigReader.getProperty("pearly_Url"));

        List<WebElement> ddmKids = Driver.getDriver().findElements(By.xpath("//*[@id='menu-item-12999']"));
        ddmKids.get(0).click();
        ReusableMethods.extentTest.info("'Kids DDM' menusune tiklandi");
        ReusableMethods.bekle(2);
        ProductCompareLocates ProductCompareLocates = new ProductCompareLocates();
        ProductCompareLocates.uru1.click();
        ProductCompareLocates.compare3.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
        ProductCompareLocates.uru2.click();
        ProductCompareLocates.compare3.click();
        ReusableMethods.bekle(1);
        ReusableMethods.extentTest.info("Uc tane urun karsilastirmak icin secildi");
        ReusableMethods.extentTest.info("Secilen urunlerden biri sildi");

        //!!!!!!!!!
        //+ isareti gorulebiliyor ama secilemiyor
        assertTrue(ProductCompareLocates.artiIsareti.isDisplayed());
        ReusableMethods.extentTest.pass("'arti' urun ekleme isaretini basarili sekilde goruldu");
        assertFalse(ProductCompareLocates.artiIsareti.isSelected());
        ReusableMethods.extentTest.pass("'arti' urun ekleme isaretine tiklanamadi");




        //CleanAll==> secenegi ile tum secilenler silinebiliyor
        ReusableMethods.bekle(2);
        //Clean All
        WebElement cleanAll= Driver.getDriver().findElement(By.xpath("//*[text()='Clean All']"));

        try {
            cleanAll.click();//normal click yap, dogru locate ettin yine de calismadi ise
        } catch (Exception e) {//o zaman java script le yazilmis olabilir, asagidaki kod devreye girer
            JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click()", cleanAll);
        }



        assertTrue(ProductCompareLocates.cleanAll1.isDisplayed());
        ReusableMethods.extentTest.pass("Clean All secenegi ile tum sectigi urunlerin silindigini basarili sekilde goruldu");

        //Start Compare yazisina JScript ile ulastik
        //    Submit tuşuna tıkla
        WebElement submit = Driver.getDriver().findElement(By.xpath("//a[text()='Start Compare !']"));

        try {
            submit.click();//normal click yap, dogru locate ettin yine de calismadi ise
        } catch (Exception e) {//o zaman java script le yazilmis olabilir, asagidaki kod devreye girer
            JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click()", submit);
        }

        ReusableMethods.extentReports.flush();
        Driver.closeDriver();



    }
    @Test
    public void test01(){
        Driver.getDriver().navigate().to(ConfigReader.getProperty("pearly_Url"));
        ReusableMethods.extentReportParametreli("Kubra Simsek", "US-07 TC04-01");

        List<WebElement> ddmKids = Driver.getDriver().findElements(By.xpath("//*[@id='menu-item-12999']"));
        ddmKids.get(0).click();
        ReusableMethods.extentTest.info("'Kids DDM' menusune tiklandi");
        ReusableMethods.bekle(2);
        ProductCompareLocates ProductCompareLocates = new ProductCompareLocates();
        ProductCompareLocates.uru1.click();
        ProductCompareLocates.compare3.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
        ProductCompareLocates.uru2.click();
        ProductCompareLocates.compare3.click();
        ReusableMethods.bekle(1);
        ReusableMethods.extentTest.info("Uc tane urun eklendi");
        ReusableMethods.extentTest.info("'Compare Product' kismina tiklandi");
        ReusableMethods.extentTest.info("'Start Compare' butonuna tiklandi");

        //Start Compare yazisina JScript ile ulastik
        //    Submit tuşuna tıkla
        WebElement submit = Driver.getDriver().findElement(By.xpath("//a[text()='Start Compare !']"));

        try {
            submit.click();//normal click yap, dogru locate ettin yine de calismadi ise
        } catch (Exception e) {//o zaman java script le yazilmis olabilir, asagidaki kod devreye girer
            JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click()", submit);
        }

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        assertFalse(ProductCompareLocates.price.getText().contains("[0-9]"));
        ReusableMethods.extentTest.pass("Karsilastirilan urunun fiyati gorulemedi");
        assertFalse(ProductCompareLocates.avability.getText().contains("in stock"));
        ReusableMethods.extentTest.pass("Karsilastirilan urunun stok durumu goruldu");
        System.out.println(ProductCompareLocates.avability.getText());
        assertFalse(ProductCompareLocates.description.getText().contains("[a-z]"));
        ReusableMethods.extentTest.pass("karsilasirilan urunun 'Description' u goruldu");

        ReusableMethods.extentReports.flush();
        Driver.closeDriver();
    }
    @Test
    public void test01(){

        ReusableMethods.extentReportParametreli("Kubra Simsek", "US-07 TC05-01");
        ProductCompareLocates ProductCompareLocates = new ProductCompareLocates();
        Driver.getDriver().get(ConfigReader.getProperty("pearly_Url"));
        List<WebElement> tumListe = Driver.getDriver().findElements(By.xpath("//*[@id='menu-item-3832']"));
        tumListe.get(0).click();

        ProductCompareLocates.searchButton.sendKeys("Xiaomi Phone", Keys.ENTER);
        ReusableMethods.extentTest.info("Urun aratildi");

        ProductCompareLocates.urun1.click();
        ProductCompareLocates.compareOzelligi.click();
        ReusableMethods.extentTest.info("'Compare' ozelligi tiklandi");



        WebElement submit = Driver.getDriver().findElement(By.xpath("//a[text()='Start Compare !']"));

        try {
            submit.click();//normal click yap, dogru locate ettin yine de calismadi ise
        } catch (Exception e) {//o zaman java script le yazilmis olabilir, asagidaki kod devreye girer
            JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click()", submit);
        }


        ProductCompareLocates.carpiIsareti.click();
        ReusableMethods.extentTest.info("'Compare' sayfasindan urun cikarildi'");

        ReusableMethods.bekle(1);

        assertTrue(ProductCompareLocates.goShopYazisi.isDisplayed());
        ReusableMethods.extentTest.pass("'Go shop' yazisi goruldu'");

        ReusableMethods.extentReports.flush();
        Driver.closeDriver();
    }

}
