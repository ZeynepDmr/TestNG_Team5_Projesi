package Team05.test;

import Team05.pages.AccountDetailsLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;


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

    @Test
    public void accountDetailsTest() {


        //https://hubcomfy.com/ sitesine gider

        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));

        //Kullanıcı login olur
        AccountDetailsLocates accountDetails = new AccountDetailsLocates();
        accountDetails.signInButonu.click();

        accountDetails.Customer_Username.sendKeys(ConfigReader.getProperty("Customer_Username"), Keys.TAB);

        accountDetails.Customer_Password.sendKeys(ConfigReader.getProperty("Customer_Password"), Keys.ENTER);

        bekle(5);

        scrollEnd();
        bekle(2);

        //Acılan sayfada myAccount butonuna tıklar
        accountDetails.myAccount.click();
        bekle(2);

        //Açılan My Account sayfasında Account details butonuna tıklanır.
        accountDetails.accountDetails.click();
        bekle(5);

        //Açılan Account details sayfasında kullanıcı hesap detayları görünür.


        Assert.assertTrue(accountDetails.accountDetailsPage.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void kullaniciBilgiTest() {
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));

        AccountDetailsLocates accountDetails = new AccountDetailsLocates();

        accountDetails.signInButonu.click();

        accountDetails.Customer_Username.sendKeys(ConfigReader.getProperty("Customer_Username"), Keys.TAB);

        accountDetails.Customer_Password.sendKeys(ConfigReader.getProperty("Customer_Password"), Keys.ENTER);

        bekle(5);

        scrollEnd();
        bekle(2);

        accountDetails.myAccount.click();
        bekle(2);

        accountDetails.accountDetails.click();
        bekle(5);


        //Kullanıcı First name, Last name, Display name ve Email address bölümüne veri girer
        accountDetails.firstName.clear();
        accountDetails.firstName.sendKeys(fakerInput("firsname"));
        bekle(2);
        accountDetails.lastName.clear();
        accountDetails.lastName.sendKeys(fakerInput("lastname"));
        bekle(2);
        accountDetails.displayName.clear();
        accountDetails.displayName.sendKeys(fakerInput("username"));
        bekle(2);
        accountDetails.email.clear();
        accountDetails.email.sendKeys(fakerInput("email"));
        bekle(5);
        Driver.closeDriver();
    }

    @Test
    public void biographyTest() {

        Driver.getDriver();
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));

        AccountDetailsLocates accountDetails = new AccountDetailsLocates();

        accountDetails.signInButonu.click();

        accountDetails.Customer_Username.sendKeys(ConfigReader.getProperty("Customer_Username"), Keys.TAB);

        accountDetails.Customer_Password.sendKeys(ConfigReader.getProperty("Customer_Password"), Keys.ENTER);

        bekle(5);

        scrollEnd();
        bekle(2);

        accountDetails.myAccount.click();
        bekle(2);

        accountDetails.accountDetails.click();
        bekle(5);


        //Kullanıcı Biography bölümüne bir metin girer


        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,500)");

        bekle(2);



        Driver.getDriver().switchTo().frame(0);


        accountDetails.biographyText.sendKeys("TestNG Projesi");
        //driver.switchTo().defaultContent();
        bekle(2);
        Driver.closeDriver();


    }

    @Test
    public void paswordTest() {
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));

        AccountDetailsLocates accountDetails = new AccountDetailsLocates();

       accountDetails.signInButonu.click();

        accountDetails.Customer_Username.sendKeys(ConfigReader.getProperty("Customer_Username"), Keys.TAB);

        accountDetails.Customer_Password.sendKeys(ConfigReader.getProperty("Customer_Password"), Keys.ENTER);

        bekle(5);

        scrollEnd();
        bekle(2);

        accountDetails.myAccount.click();
        bekle(2);

        accountDetails.accountDetails.click();
        bekle(5);


        //Kullanıcı Current password leave blank to leave unchanged alanına geçerli password girer
        accountDetails.oldPasword.sendKeys(ConfigReader.getProperty("Customer_Password"), Keys.TAB);


        //Kullanıcı New password leave blank to leave unchanged alanına yeni bir password girer
        accountDetails.newPasword1.sendKeys(ConfigReader.getProperty("Customer_Password"), Keys.TAB);


        //Kullanıcı Confirm password alanına yeni password'u tekrar girer
        accountDetails.newPasword2.sendKeys(ConfigReader.getProperty("Customer_Password"), Keys.TAB);


        //Kullanıcı Account Details sayfasında yer alan SAVE CHANGES butonuna tıklar
        //accountDetails.saveChangesButton.click();
        //Kullanıcı Account Details sayfasında onay mesajı alır
        tumSayfaResmi();
        Driver.closeDriver();
    }






    }

