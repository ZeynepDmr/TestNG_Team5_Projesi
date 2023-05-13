package Team05.test;

import Team05.pages.BillingUsLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class US_05 {
    //https://hubcomfy.com/ sitesine gidilir
    //Kullanıcı login olur
    //Açılan My Account sayfasında Account details butonuna tıklanır.
    //Açılan Account details sayfasında kullanıcı hesap detayları görünür.
    //Kullanıcı First name, Last name, Display name ve Email address bölümüne veri girer
    //Kullanıcı Biography bölümüne bir metin girer
    //Kullanıcı Current password leave blank to leave unchanged alanına geçerli password girer
    //Kullanıcı New password leave blank to leave unchanged alanına 9 karakterli yeni password girer
    //Kullanıcı Confirm password alanına yeni password girer
    //Kullanıcı Account Details sayfasında yer alan SAVE CHANGES butonuna tıklar
    //Kullanıcı Current password leave blank to leave unchanged alanına geçerli password girer
    //Kullanıcı New password leave blank to leave unchanged alanına 9 karakterli yeni password girer
    //Kullanıcı Confirm password alanına yeni password girer
    //Kullanıcı Account Details sayfasında yer alan SAVE CHANGES butonuna tıklar
    //Kullanıcı Account Details sayfasında onay mesajı alır


    @Test
    public void test1() {
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));




    }
}
