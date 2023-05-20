package Team05.test;

import Team05.pages.ProductCompareLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static Team05.utilities.ReusableMethods.bekle;

public class US_07 {


    ProductCompareLocates productCompareLocates = new ProductCompareLocates();
    Driver driver;

    @Test
    public void TC_1() {
        //Kullanici anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));


        //Kullanici siteye giris yapar
        productCompareLocates.signInButon.click();
        bekle(2);

        productCompareLocates.userName.sendKeys(ConfigReader.getProperty("Customer_Username"), Keys.TAB);
        productCompareLocates.password.sendKeys(ConfigReader.getProperty("Customer_Password"), Keys.ENTER);
        bekle(2);

        //Kullanici Electronics kategorisine tiklar
        productCompareLocates.electronics.click();
        bekle(2);

        // Kullanici listedeki herhangi bir urunu secer(bu islem 4 kez tekrarlanir)
        productCompareLocates.productSelect1.click();
        bekle(2);

        //Kullanici sectigi urunu "compare" kismina ekler(bu islem 4 kez tekrarlanir)
        productCompareLocates.addToCompare1.click();
        bekle(2);

        productCompareLocates.spaceClick.click();
        bekle(2);

        productCompareLocates.electronics2.click();

        Driver.getDriver().navigate().refresh();

        productCompareLocates.productSelect2.click();
//        bekle(5);

        productCompareLocates.addToCompare2.click();
        bekle(2);

//        productCompareLocates.spaceClick.click();
//        bekle(2);

//        productCompareLocates.productSelect2.click();
//        bekle(5);

//        productCompareLocates.productSelect3.click();
//        bekle(2);
//        productCompareLocates.addToCompare3.click();
//        bekle(2);
//        productCompareLocates.productSelect4.click();
//        bekle(2);
//        productCompareLocates.addToCompare4.click();
//        bekle(2);
//
//    }
//
//    @Test
//    public void TC_2() {
//        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
//        ProductCompareLocates productCompareLocates = new ProductCompareLocates();
//
//        //Kullanici sepet sayfasina gider ve sectigi urunleri kontrol eder
//        productCompareLocates.comparePageCheck.click();
//        bekle(2);
//
//        //Kullanıcı "Compare" kismindan sectigi urunu "Kaldır" butonuna tiklar.
//        productCompareLocates.removeProduct.click();
//        bekle(2);
//
////        //Kullanici ana sayfaya geri doner
////        productCompareLocates.homePageButon.click();
////        bekle(2);
  }

}
