package Team05.test;

import Team05.pages.VendorAddProductLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.List;

public class US_14 {

    VendorAddProductLocates vendorAddProductLocates;
    Actions actions;
    Select select;

    @BeforeMethod
    public void setUp() {

//    Kullanici url'e gider

        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));


//    Kullanici sig in butonuna tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.siginlogin.click();


//    Kullanici gecerli email ve password girer

        vendorAddProductLocates.email.sendKeys(ConfigReader.getProperty("username"), Keys.TAB, ConfigReader.getProperty("password"));
        ReusableMethods.bekle(3);
        vendorAddProductLocates.sigin.click();
//    Kullanici my account yazisini goruntuler
        ReusableMethods.bekle(4);
        // actions.scrollToElement(vendorAddProductLocates.myAccount).perform();
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(10);
        Driver.getDriver();
        vendorAddProductLocates.myAccount.click();
        // ReusableMethods.click(vendorAddProductLocates.myAccount);

        ReusableMethods.bekle(3);
        Assert.assertTrue(vendorAddProductLocates.myAccount.isDisplayed());

//    Kullanici store manager menusune tiklar
        ReusableMethods.bekle(3);
        vendorAddProductLocates.storemanager.click();
//    Kullanici store manager sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.storeManagerText.isDisplayed());


        //    Kullanici products menusune tiklar
        ReusableMethods.bekle(2);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        ReusableMethods.click(vendorAddProductLocates.products);

//        ReusableMethods.bekle(3);
//        Assert.assertTrue(vendorAddProductLocates.productsText.isDisplayed());


    }

    @Test
    public void test01() {

//    Kullanici All Products Types secegine tiklar
        select = new Select(vendorAddProductLocates.allproducttypes);
        List<WebElement> selectList = select.getOptions();
        for (WebElement w : selectList) {
            System.out.println(w.getText());

        }
        selectList.forEach(t -> System.out.println(t.getText()));


//    Kullanici Simple Product, Variable Product, Grouped Product, External - Affiliate Product seçeneklerini görür
        Assert.assertEquals("Simple Product", selectList.get(1).getText());
        Assert.assertEquals("Variable Product", selectList.get(4).getText());
        Assert.assertEquals("Grouped Product", selectList.get(5).getText());
        Assert.assertEquals("External/Affiliate Product", selectList.get(6).getText());


    }

    @Test
    public void test02() {
//        Kullanici add new butonuna tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.addNew.click();


//        Kullanici Add Product sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.addProductText.isDisplayed());
//        Kullanici Choose Image kutucuguna tiklar
        vendorAddProductLocates.image.click();

//        Kullanici select files kısmına  tiklar
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();
        ReusableMethods.click(vendorAddProductLocates.image);

//        Kullanici dosyadan resim secer
        //"C:\Users\CASPER\Downloads\books.png"
        WebElement selectFiles = vendorAddProductLocates.selectFiles;
        selectFiles.sendKeys(System.getProperty("user.home") + "/Downloads/books.png");

    }

    @Test
    public void test03() {

//        Kullanici add new butonuna tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.addNew.click();

//        Kullanici Add Product sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.addProductText.isDisplayed());

//        Kullanici product title alanına bir data girer
        vendorAddProductLocates.productTitle.sendKeys("iphone");

//        Kullanici Short Description alanına bir data girer
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        Driver.getDriver().switchTo().frame(0);
        vendorAddProductLocates.shortDescription.sendKeys("waterproof");

        Driver.getDriver().switchTo().defaultContent();
//        Kullanici  Description alanına bir data girer

        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        Driver.getDriver().switchTo().frame(1);
        vendorAddProductLocates.Description.sendKeys("quality");


    }

    @Test
    public void test04() {
//        Kullanici add new butonuna tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.addNew.click();


//        Kullanici Add Product sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.addProductText.isDisplayed());

//        Kullanici categories menusunden secim yapar
        vendorAddProductLocates.categories.click();
        Driver.closeDriver();

    }

    @Test
    public void test05() {

//        Kullanici add new butonuna tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.addNew.click();

//        Kullanici Add Product sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.addProductText.isDisplayed());

//        Kullanici  Add new category secegine tiklar
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        vendorAddProductLocates.addNewcategory.click();


//        Kullanici category name alanına bir data girer
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        vendorAddProductLocates.Namecategory.sendKeys("Elektronic");

//        Kullanici ADD butonuna tiklar
        ReusableMethods.bekle(3);
        vendorAddProductLocates.categoryAdd.click();


//        Kullanici yeni category ekledigini gorur
        ReusableMethods.bekle(3);

        if (vendorAddProductLocates.categoryVerify.isSelected()) {
            System.out.println("yeni category eklendi");
        }
        System.out.println("yeni category eklenemedi");

        Driver.closeDriver();
    }

    @Test
    public void test06() {
//        Kullanici add new butonuna tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.addNew.click();


//        Kullanici Add Product sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.addProductText.isDisplayed());

//        Kullanici Product brands  menusunden secim yapar
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        vendorAddProductLocates.productBrands.click();

        Driver.closeDriver();

    }

    @Test
    public void test07() {
//        Kullanici add new butonuna tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.addNew.click();


//        Kullanici Add Product sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.addProductText.isDisplayed());

//        Kullanici Add new Product brands secegine tiklar
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        vendorAddProductLocates.productBrands.click();

//        Kullanici Product brands name alanına bir data girer
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        vendorAddProductLocates.productBrandsName.sendKeys("casper");
//        Kullanici ADD butonuna tiklar

        ReusableMethods.bekle(3);
        vendorAddProductLocates.productAdd.click();

        //        Kullanici yeni product brands ekledigini gorur
        ReusableMethods.bekle(3);
        if (vendorAddProductLocates.productBrandsVerify.isSelected()) {
            System.out.println("Yeni product brands eklendi");
        }
        System.out.println("Yeni product brands eklenemedi");


        Driver.closeDriver();

    }

    @Test
    public void test08() {
//        Kullanici add new butonuna tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.addNew.click();

//        Kullanici Add Product sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.addProductText.isDisplayed());
//        Kullanici Choose from the most used tags tiklar
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        vendorAddProductLocates.Choosetags.click();

//        Kullanici seceneklerden ekleme yapar
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN);
        vendorAddProductLocates.secimChooseTags.click();
        //  Driver.getDriver();
    }

    @Test
    public void test09() {
//              Kullanici add new butonuna tiklar
        vendorAddProductLocates = new VendorAddProductLocates();
        vendorAddProductLocates.addNew.click();

//      Kullanici Add Product sayfasina gider
        Assert.assertTrue(vendorAddProductLocates.addProductText.isDisplayed());

//        Kullanici Catalog visibility secenegini gorur
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        ReusableMethods.bekle(3);
        Assert.assertTrue(vendorAddProductLocates.catalogVisibility.isDisplayed());


//        Kullanici shop and search result secenegine tiklar
        ReusableMethods.bekle(3);
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        select = new Select(vendorAddProductLocates.shopResult);
        List<WebElement> selectList = select.getOptions();
        for (WebElement w : selectList) {
            System.out.println(w.getText());

        }
        selectList.forEach(t -> System.out.println(t.getText()));


//        Kullanici Shop and search results, Shop only, Search results only, Hidden seceneklerinden birini secer

        Assert.assertEquals("Shop and search results", selectList.get(0).getText());
        Assert.assertEquals("Shop only", selectList.get(1).getText());
        Assert.assertEquals("Search results only", selectList.get(2).getText());
        Assert.assertEquals("Hidden", selectList.get(3).getText());


    }
}