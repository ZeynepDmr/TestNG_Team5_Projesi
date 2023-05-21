package Team05.test;

import Team05.pages.AccountDetailsLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class US_05 extends ReusableMethods {
    //https://hubcomfy.com/ sitesine gider
    //Kullanıcı login olur
    //Acılan sayfada myAccount butonuna tıklar
    //Açılan My Account sayfasında Account details butonuna tıklanır.
    //Açılan Account details sayfasında kullanıcı hesap detayları görünür.
    //Kullanıcı First name, Last name, Display name ve Email address bölümüne veri girer
    //Kullanıcı Biography bölümüne bir metin girer
    //Kullanıcı Current password leave blank to leave unchanged alanına geçerli password girer
    //Kullanıcı New password leave blank to leave unchanged alanına yeni bir  password girer
    //Kullanıcı Confirm password alanına yeni password'u tekrar girer
    //Kullanıcı Account Details sayfasında yer alan SAVE CHANGES butonuna tıklar
    //Kullanıcı Account Details sayfasında onay mesajı alır

    WebDriver driver;
    AccountDetailsLocates accountDetails = new AccountDetailsLocates();


    @Test
    public void TC_01() {
        //WebDriverManager.chromedriver().setup();

        extentReport();
        extentTest=extentReports.createTest("ExtentTest","Test Raporu");

        //https://hubcomfy.com/ sitesine gider

        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("Hubcomfy Adresine Gidildi");

        //Kullanıcı login olur
        bekle(2);

        accountDetails.signInButonu.click();

        accountDetails.Customer_Username.sendKeys(ConfigReader.getProperty("Customer_Username"));

        accountDetails.Customer_Password.sendKeys(ConfigReader.getProperty("Customer_Password"), Keys.ENTER);
        extentTest.info("Kullanıcı login oldu");

        bekle(3);
        scrollEnd();
        bekle(2);

        //Acılan sayfada myAccount butonuna tıklar
        accountDetails.myAccount.click();
        extentTest.info("myAccount butonuna tıklandı");
        bekle(2);

        //Açılan My Account sayfasında Account details butonuna tıklanır.
        accountDetails.accountDetails.click();
        extentTest.info("Account Details butonuna tıklandı");
        bekle(5);




        //Açılan Account details sayfasında kullanıcı hesap detayları görünür.

        Assert.assertTrue(accountDetails.accountDetailsPage.isDisplayed());
        extentTest.info("Account Details Sayfası Açıldı ve Kullanıcı Hesap Detayları göründü");




        //Kullanıcı First name, Last name, Display name ve Email address bölümüne veri girer
        accountDetails.firstName.clear();
        bekle(2);
        accountDetails.firstName.sendKeys(fakerInput("firsname"));
        bekle(2);
        accountDetails.lastName.clear();
        bekle(2);
        accountDetails.lastName.sendKeys(fakerInput("lastname"));
        bekle(2);
        accountDetails.displayName.clear();
        bekle(2);
        accountDetails.displayName.sendKeys(ConfigReader.getProperty("Customer_Username"));
        bekle(2);
        accountDetails.email.clear();
        bekle(2);
        accountDetails.email.sendKeys(ConfigReader.getProperty("Customer_Mail"));
        bekle(5);
        extentTest.info("First name, Last name, Display name ve Email address bölümüne veri girişi yapıldı");
        bekle(2);



        //Kullanıcı Biography bölümüne bir metin girer

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,750)");

        bekle(2);



        Driver.getDriver().switchTo().frame(0);

        accountDetails.biographyText.sendKeys(fakerInput("biography"));
        bekle(3);

        Driver.getDriver().switchTo().defaultContent();
        extentTest.info("Biography bölümüne bir metin girildi");
        bekle(2);





        scrollEnd();
        //bekle(5);
        //Kullanıcı Current password leave blank to leave unchanged alanına geçerli password girer
        accountDetails.oldPasword.sendKeys(ConfigReader.getProperty("Customer_Password"));
        bekle(2);


        //Kullanıcı New password leave blank to leave unchanged alanına yeni bir password girer
        accountDetails.newPasword1.sendKeys(ConfigReader.getProperty("Customer_Password"));
        bekle(2);


        //Kullanıcı Confirm password alanına yeni password'u tekrar girer
        accountDetails.newPasword2.sendKeys(ConfigReader.getProperty("Customer_Password"));
        bekle(2);


        //Kullanıcı Account Details sayfasında yer alan SAVE CHANGES butonuna tıklar
        //accountDetails.saveChangesButton.click();
        extentTest.info("Pasword Değiştirildi");
        //Kullanıcı Account Details sayfasında onay mesajı alır
        tumSayfaResmi();
        extentTest.info("Pasword Değişiminden Sonra Tüm Sayfa Resmi Alındı.");

        bekle(5);



        Driver.closeDriver();

        extentTest.pass("Test sonlandırıldı");
        extentReports.flush();



    }


}

