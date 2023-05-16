package Team05.test;

import Team05.pages.BillingUsLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class US_03 {

    @Test
    public void test1() {
        //  Kullanici ilgili adrese gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        //  Kullanici Sign  In butonuna tiklar
        BillingUsLocates billingUs = new BillingUsLocates();
        billingUs.signInButonu.click();

        // Kullanici username/email adresini girer
        billingUs.userName.sendKeys(ConfigReader.getProperty("Customer_Username1"), Keys.ENTER);
        ReusableMethods.bekle(2);
        // Kullanici alt kutucuga passwordu girer
        billingUs.password.sendKeys(ConfigReader.getProperty("Customer_Password1"), Keys.ENTER);
        ReusableMethods.bekle(2);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
        //Kullanici account kutucuguna tiklar
        Driver.getDriver();
        ReusableMethods.bekle(2);
        billingUs.myAccount.click();

        //Kullanici Addreses bolumune tiklar
        billingUs.addresses.click();
        ReusableMethods.bekle(2);
        /*

      //  Kullanici Billing Adress bolumunde Add kutusunu tiklar
        billingUs.addKutusu.click();

       // Kullanici First Name kutusuna tiklar
       //  Kullanici Isim bilgisini girer
        Actions action = new Actions(Driver.getDriver());
        action.doubleClick(billingUs.firstName);
        billingUs.firstName.sendKeys("Bahar");


       // Kullanici Last Name kutusuna tiklar
        // Kullanici soyisim bilgisini girer
        action.doubleClick(billingUs.lastName);
        billingUs.lastName.sendKeys("'Sonmez");

        action.doubleClick(billingUs.companyKutusu);
        billingUs.companyKutusu.sendKeys("ABC");

       // Kullanici Country/Region alanina tiklar
       // Kullanici Country kutucugundan ulke secer

       Driver.getDriver();
       ReusableMethods.bekle(2);
       action.sendKeys(Keys.PAGE_DOWN).perform();
       // Driver.getDriver();
        ReusableMethods.bekle(2);

        // Kullanici Country kutucugundan ulke secer

        Select select = new Select(billingUs.countryDdm);
        select.selectByVisibleText("Netherlands");

        // Kullanici Street adress alanindaki House number street name alanina tiklar
      //  Kullanici house number ve street name bilgisini girer
       Driver.getDriver();
       billingUs.houseNstreetName.click();
       billingUs.houseNstreetName.sendKeys("Balg 12",Keys.ENTER);
       ReusableMethods.bekle(2);
       billingUs.apartmanNo.sendKeys(" ",Keys.ENTER);
       ReusableMethods.bekle(2);

       // Kullanici Town/City kutusuna tiklar ve bilgi girisi yapar

        billingUs.townCity.sendKeys("Hoofddorp",Keys.ENTER);
        ReusableMethods.bekle(2);

       // Kullanici ZIP code alanina tiklar
      //  Kullanici ZIP code alanina bilgi girisi yapar
        billingUs.zipCodeKutus.sendKeys("2134 ZP",Keys.ENTER);
        ReusableMethods.bekle(2);

       // Kullanici Phone kutusuna tiklar
      //  Kullanici Phone kutusuna  bir telefon numarasi girer
        billingUs.phoneKutusu.sendKeys("0031624506246",Keys.ENTER);
        ReusableMethods.bekle(2);

       // Kullanici Email Adressi kayit olunan e-mail Adresi olarak otomatik gelmeli
        Assert.assertTrue(billingUs.emailAssert.isDisplayed());
        ReusableMethods.bekle(2);

      //  "Save Adress"butonuna tiklayarak Billing Adresse eklenmeli
       billingUs.saveAdressKtusu.click();
        ReusableMethods.bekle(2);
       */
         System.out.println(billingUs.billingscontains.getText());
        ReusableMethods.tumSayfaResmi();
        String billingBilgisi= billingUs.billingscontains.getText();
        Assert.assertTrue(billingBilgisi.contains("Hoofddorp"));





    }


    }

