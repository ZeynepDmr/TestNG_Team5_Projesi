package Team05.test;

import Team05.pages.ProductCompareLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import static org.testng.Assert.assertTrue;



public class US_07 extends ReusableMethods {


    ProductCompareLocates productCompareLocates = new ProductCompareLocates();

    @Test
    public void test01() {

        extentReport();
        ExtentTest extentTest = extentReports.createTest("TestCase-1", "Test Raporu");
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("Kullanici Hubcomfy sayfasina tikladi.");
        ProductCompareLocates.signIn.click();
        ProductCompareLocates.userName.sendKeys(ConfigReader.getProperty("Customer_Username"), Keys.TAB);
        ProductCompareLocates.password.sendKeys(ConfigReader.getProperty("Customer_Password"), Keys.TAB);
        ReusableMethods.bekle(2);
        ProductCompareLocates.login.click();
        extentTest.info("Kullanici basarili bir sekilde login olur");
        ReusableMethods.bekle(2);
        assertTrue(ProductCompareLocates.sigInYapildi.isDisplayed());
        extentTest.pass("Sayfa kapatildi");
        extentReports.flush();
        Driver.closeDriver();

    }

    @Test
    public void test02() {
        extentReport();
        ExtentTest extentTest = extentReports.createTest("TestCase-2", "Test Raporu");
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("Kullanici Hubcomfy sayfasina gider");
        List<WebElement> tumListe = Driver.getDriver().findElements(By.xpath("//*[@id='menu-item-3832']"));
        tumListe.get(0).click();
        extentTest.info("Kullanici Electoronic bolumune tikladi.");
        assertTrue(Driver.getDriver().getTitle().contains("Electronics"));
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
        extentTest.info("Kullanici dort urun secer");
        extentTest.info("Kullanici sectigi urunlerin 'Compare' ozelligi tasidigini gorur");
        ProductCompareLocates.urun4.click();
        ProductCompareLocates.compareOzelligi.click();
        ReusableMethods.bekle(3);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement compare2 = Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-dark btn-rounded']"));
        js.executeScript("arguments[0].click()", compare2);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.scrollHome();
        assertTrue(ProductCompareLocates.dortEleman.isDisplayed());
        extentTest.info("Kullanici 4 urun oldugunu dogruladi");
        extentTest.pass("Sayfa kapatildi");
        extentReports.flush();
        Driver.closeDriver();

    }

    @Test
    public void test03() throws InterruptedException {
        extentReport();
        ExtentTest extentTest = extentReports.createTest("TestCase-3", "Test Raporu");
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("Kullanici Hubcomfy sayfasina gider");
        List<WebElement> tumListe = Driver.getDriver().findElements(By.xpath("//*[@id='menu-item-3832']"));
        tumListe.get(0).click();
        extentTest.info("Kullanici Electoronic bolumune tikladi.");
        assertTrue(Driver.getDriver().getTitle().contains("Electronics"));
        ReusableMethods.bekle(2);
        ProductCompareLocates.urun1.click();
        ReusableMethods.bekle(2);
        ProductCompareLocates.compareOzelligi.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
        ProductCompareLocates.urun2.click();
        ReusableMethods.bekle(2);
        ProductCompareLocates.compareOzelligi.click();
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().back();
        ProductCompareLocates.urun3.click();
        ReusableMethods.bekle(2);
        ProductCompareLocates.compareOzelligi.click();
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
        ProductCompareLocates.urun4.click();
        ProductCompareLocates.compareOzelligi.click();
        extentTest.info("4 urun secildi");
        ReusableMethods.bekle(3);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement compare2 = Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-dark btn-rounded']"));
        js.executeScript("arguments[0].click()", compare2);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.scrollHome();
        assertTrue(ProductCompareLocates.dortEleman.isDisplayed());
        extentTest.info("4 urun oldugunu dogruladi");
        js.executeScript("window.scrollTo(0,750)");
        ReusableMethods.bekle(2);
        assertTrue(ProductCompareLocates.productYazisi.isDisplayed());
        assertTrue(ProductCompareLocates.priceYazisi.isDisplayed());
        assertTrue(ProductCompareLocates.availabilityYazisi.isDisplayed());
        assertTrue(ProductCompareLocates.descriptionYazisi.isDisplayed());
        extentTest.info("Urunlerin ozelliklerinin oldugu goruntulendi");
        extentTest.pass("Sayfa kapatildi");
        extentReports.flush();
        Driver.closeDriver();

    }

    @Test
    public void test04() {
        extentReport();
        ExtentTest extentTest = extentReports.createTest("TestCase-4", "Test Raporu");
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("Kullanici Hubcomfy sayfasina gider");
        List<WebElement> tumListe = Driver.getDriver().findElements(By.xpath("//*[@id='menu-item-3832']"));
        tumListe.get(0).click();
        extentTest.info("Kullanici Electoronic bolumune tikladi.");
        assertTrue(Driver.getDriver().getTitle().contains("Electronics"));
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
        extentTest.info("Kullanici dort urun secti");
        ProductCompareLocates.urun4.click();
        ProductCompareLocates.compareOzelligi.click();
        ReusableMethods.bekle(3);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement compare2 = Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-dark btn-rounded']"));
        js.executeScript("arguments[0].click()", compare2);
        ReusableMethods.bekle(2);
        ReusableMethods.scrollHome();
        assertTrue(ProductCompareLocates.carpiIsareti.isDisplayed());
        ProductCompareLocates.carpiIsareti.click();
        extentTest.info("Urun listeden cikartildi");
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        ProductCompareLocates.urun5.click();
        ProductCompareLocates.compareOzelligi.click();
        extentTest.info("5. urun ekledi");
        WebElement compare3 = Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-dark btn-rounded']"));
        js.executeScript("arguments[0].click()", compare3);
        assertTrue(ProductCompareLocates.dortEleman.isDisplayed());
        extentTest.pass("5. urun eklendigi dogrulandi");
        Driver.closeDriver();

    }

}
