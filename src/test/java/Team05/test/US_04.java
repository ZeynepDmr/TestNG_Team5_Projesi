package Team05.test;

import Team05.pages.BillingUsLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import static Team05.utilities.ReusableMethods.bekle;
import static Team05.utilities.ReusableMethods.fakerInput;

public class US_04 {

    @Test
    public void test1() {
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        BillingUsLocates billingUs = new BillingUsLocates();
        String username1 = fakerInput("username");
        String email1 = fakerInput("email");

        String password1 = fakerInput("password");

        billingUs.Register_Button1.click();

        billingUs.User_Name_Input1.sendKeys(fakerInput("username"));
        billingUs.User_Name_Input1.click();
        ReusableMethods.bekle(2);
        billingUs.E_Mail_Input1.sendKeys(fakerInput("email"));
        ReusableMethods.bekle(2);
        billingUs.Password_Input1.sendKeys(fakerInput("password"));
        ReusableMethods.bekle(2);
        billingUs.Register_Policy_Check1.click();
        ReusableMethods.bekle(2);

        billingUs.SignUpKutusu.click();
        ReusableMethods.bekle(2);


        ReusableMethods.scrollEnd();
        bekle(2);
        //Kullanici account kutucuguna tiklar
        Driver.getDriver();
        bekle(2);
        billingUs.shippingAccount.click();

        //Kullanici Addreses bolumune tiklar
        billingUs.addresses.click();
        bekle(2);

        billingUs.addKutusu.click();

        // Kullanici First Name kutusuna tiklar
        //  Kullanici Isim bilgisini girer
        Actions action = new Actions(Driver.getDriver());
        action.doubleClick(billingUs.firstName);
        billingUs.firstName.sendKeys(fakerInput("firstname"));

        action.doubleClick(billingUs.lastName);
        billingUs.lastName.sendKeys(fakerInput("lastname"));

        action.doubleClick(billingUs.companyKutusu);
        billingUs.companyKutusu.sendKeys(fakerInput("company"));

        Driver.getDriver();
        bekle(2);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        // Driver.getDriver();
        bekle(2);

        // Kullanici Country kutucugundan ulke secer
        Select select = new Select(billingUs.countryDdm);
        select.selectByVisibleText("Netherlands");

        // Kullanici Street adress alanindaki House number street name alanina tiklar
        //  Kullanici house number ve street name bilgisini girer
        Driver.getDriver();
        billingUs.houseNstreetName.click();
        billingUs.houseNstreetName.sendKeys(fakerInput("street"));

        bekle(2);
        billingUs.apartmanNo.sendKeys(" ", Keys.ENTER);
        bekle(2);

        // Kullanici Town/City kutusuna tiklar ve bilgi girisi yapar

        billingUs.townCity.sendKeys(fakerInput("towncity"));
        bekle(2);
        billingUs.zipCodeKutus.sendKeys("2134ZP", Keys.ENTER);
        bekle(2);
        billingUs.phoneKutusu.sendKeys("0031624506246");
        bekle(2);
        billingUs.saveAdressKtusu.click();
        ReusableMethods.tumSayfaResmi();
        bekle(2);

        action.sendKeys(Keys.PAGE_DOWN).perform();
        bekle(2);

        Driver.getDriver();
        billingUs.shippingBillAddKutusu.click();
        bekle(2);

        billingUs.shipFirstName.sendKeys(fakerInput("firstname"));
        bekle(2);

        billingUs.shipLastName.sendKeys(fakerInput("lastname"));
        bekle(2);

        billingUs.shipCompanyName.sendKeys(fakerInput("company"));
        bekle(2);

        Select select1 = new Select(billingUs.shipCountryDdm);
        select1.selectByVisibleText("Netherlands");
        bekle(2);

        Driver.getDriver();

        billingUs.shipAdress.sendKeys(fakerInput("street"));
        bekle(2);

        billingUs.shipApatmanKutusu.sendKeys(" ");
        bekle(2);

        billingUs.shipPostcode1.sendKeys("2134ZP");
        bekle(2);

        billingUs.shipTownCity.sendKeys(fakerInput("towncity"));
        bekle(2);

        billingUs.shipSaveAdress.click();
        bekle(2);
        ReusableMethods.tumSayfaResmi();
         bekle(2);
         Driver.closeDriver();


    }

}