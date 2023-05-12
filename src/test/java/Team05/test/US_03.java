package Team05.test;

import Team05.pages.BillingUsLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class US_03 {

   /*

    Kullanici Billing Adress bolumunde Add kutusunu tiklar
    Kullanici First Name kutusuna tiklar
    Kullanici Isim bilgisini girer
    Kullanici Last Name kutusuna tiklar
    Kullanici soyisim bilgisini girer
    Kullanici Country/Region alanina tiklar
    Kullanici Country kutucugundan ulke secer
    Kullanici Street adress alanindaki House number street name alanina tiklar
    Kullanici house number ve street name bilgisini girer
    Kullanici Town/City kutusuna tiklar ve bilgi girisi yapar
    Kullanici  Town/City bilgi girisi yapar
    Kullanici ZIP code alanina tiklar
    Kullanici ZIP code alanina bilgi girisi yapar
    Kullanici Phone kutusuna tiklar
    Kullanici Phone kutusuna  bir telefon numarasi girer

    */


    @Test
    public void test1() {
        //  Kullanici ilgili adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        //  Kullanici Sign  In butonuna tiklar
        BillingUsLocates billingUs = new BillingUsLocates();
        billingUs.signInButonu.click();

        // Kullanici username/email adresini girer
        billingUs.userName.sendKeys(ConfigReader.getProperty("Customer_Username"), Keys.ENTER);
        ReusableMethods.bekle(2);
        // Kullanici alt kutucuga passwordu girer
        billingUs.password.sendKeys(ConfigReader.getProperty("Customer_Password"), Keys.ENTER);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
        //Kullanici account kutucuguna tiklar
        Driver.getDriver();
        billingUs.myAccount.click();

        //Kullanici Addreses bolumune tiklar
        billingUs.addresses.click();

      //  Kullanici Billing Adress bolumunde Add kutusunu tiklar









    }


    }

