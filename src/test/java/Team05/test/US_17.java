package Team05.test;

import Team05.pages.VendorAddProductLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;






public class US_17 {


    /*
    Kullanici url'e gider
    Kullanici sign in butonuna tiklar
    Kullanici gecerli email ve password girer
    Kullanici my account yazisini goruntuler
    Kullanici store manager menusune tiklar
    Kullanici store manager sayfasina gider
    Kullanici products menusune tiklar
    Kullanıcı Add New butonuna tıklar
    Variable Product seçilebilmeli
    US14 ve US15 deki işlemler yapılabilmeli
    Ürüne göre Attributes color ve size seçilebilmeli
    Yeni color ve size eklenebilmeli
    Variations'a tıklanarak eklenen Atributes görülebilmeli
    Eklenen Atributes'a göre ürün bilgileri seçilip ürün özellikleri doldurulabilmeli
    Ürünün eklendiğini Product kısmında görebilmeli
     */

    WebDriver driver;
    Actions actions;
    Select select;
    VendorAddProductLocates vendorAddProductLocates;



    @Test
    public void test2() {


        //  Kullanici "https://hubcomfy.com" adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));


        //  Kullanici sign in butonuna tiklar
        VendorAddProductLocates vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.login.click();

        //Kullanici gecerli email ve password girer
        vendorAddProductLocates.userName.sendKeys(ConfigReader.getProperty("Vendor_Username"), Keys.ENTER);
        vendorAddProductLocates.password.sendKeys(ConfigReader.getProperty("Vendor_Password"), Keys.ENTER);


        // Kullanici my account yazisini goruntuler

        ReusableMethods.bekle(5);
        ReusableMethods.scrollEnd();
        Driver.getDriver();
        ReusableMethods.bekle(3);
        vendorAddProductLocates.myAccount.click();


        // Kullanici store manager menusune tiklar
        ReusableMethods.bekle(2);
        vendorAddProductLocates.storeManager.click();


        // Kullanici store manager sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.storeManager.isDisplayed());




            // Kullanici products menusune tiklar

         //   ReusableMethods.bekle(2);
            actions = new Actions(Driver.getDriver());
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.bekle(2);
            Driver.getDriver();
            ReusableMethods.click(vendorAddProductLocates.products);


            //Kullanıcı Add New butonuna tıklar
           // ReusableMethods.bekle(2);
            vendorAddProductLocates.addNew.click();


            // Variable Product seçilebilmeli
            ReusableMethods.bekle(2);

            ReusableMethods.bekle(3);
            actions =new Actions(Driver.getDriver());
            actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN).perform();
            select = new Select(vendorAddProductLocates.dropDown);
            select.selectByIndex(1);
            vendorAddProductLocates.productTitle.sendKeys("Spor ayakkabı");




            // US14 ve US15 deki işlemler yapılabilmeli


          // Ürüne göre Attributes color ve size seçilebilmeli

        ReusableMethods.bekle(2);
        actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).build().perform();
        ReusableMethods.bekle(2);
        Driver.getDriver();
        ReusableMethods.click(vendorAddProductLocates.attributes);




        ReusableMethods.bekle(2);
        actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).build().perform();
        ReusableMethods.click(vendorAddProductLocates.draft);

        ReusableMethods.tumSayfaResmi();





        // Yeni color ve size eklenebilmeli




       // Variations'a tıklanarak eklenen Atributes görülebilmeli
       // Eklenen Atributes'a göre ürün bilgileri seçilip ürün özellikleri doldurulabilmeli
       // Ürünün eklendiğini Product kısmında görebilmeli

        }

    }
