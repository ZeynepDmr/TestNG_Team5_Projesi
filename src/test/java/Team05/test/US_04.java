package Team05.test;

import Team05.pages.BillingUsLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class US_04 {
    /*

    Kullanici username/email  kutusuna tiklar
    Kullanici username/email bilgisini girer
    Kullanici alt kutucuga password'u girer
    Kullanici Sign In butonuna tiklar
    Kullanici sayfaya giris yapar
    Kullanci My Account bolumune tiklar
    Kullancic Addresses bolumune tiklar
    Kullancic acilan sayfada Shipping Address alanina tiklar
    Kullanici First name kutusuna tiklar
    Kullanici First name kutusuna isim bilgisini girer
    Kullancic Last name kutusuna tiklar
    Kullanici Last name kutusuna bilgi girisi yapar
    Kullanici Country/Region kutusuna gelir ve sagdaki ^ isaretine tiklar
    Kullanici Country kutusundaki seceneklerden birini secer
    Kullanici Street address alaninda ilk kutucuga tiklar
    Kullanici Street address alaninina adresini yazar
    Kullanici Postcode/ Zip  alanina tiklar
    Kullanici Postcode/ Zip  alanina posta kodu girer
    Kullanici Town/City alanina tiklar
    Kullanici Town/cCity bilgisi girer

     */
    @Test
    public void test1() {
        //  Kullanici ilgili adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        //  Kullanici Sign  In butonuna tiklar
        BillingUsLocates billingUs = new BillingUsLocates();
        billingUs.signInButonu.click();
       // Kullanici username/email  kutusuna tiklar
        //Kullanici username/email bilgisini girer
        billingUs.userName.sendKeys(ConfigReader.getProperty("Customer_Username1"), Keys.ENTER);
        ReusableMethods.bekle(2);
        // Kullanici alt kutucuga passwordu girer
        billingUs.password.sendKeys(ConfigReader.getProperty("Customer_Password1"), Keys.ENTER);
        ReusableMethods.bekle(2);
        ReusableMethods.scrollEnd();
       // Kullanici Sign In butonuna tiklar
        billingUs.signInButonu.click();
       // Kullanici sayfaya giris yapar



    }
}

