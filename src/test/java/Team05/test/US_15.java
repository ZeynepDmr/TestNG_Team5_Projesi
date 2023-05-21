//package Team05.test;
//
//import Team05.pages.VendorAddProductLocates;
//import Team05.utilities.ConfigReader;
//import Team05.utilities.Driver;
//import Team05.utilities.ReusableMethods;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.util.List;
//
//public class US_15 {
//
//    VendorAddProductLocates vendorAddProductLocates;
//    Actions actions;
//    Select select;
//    @BeforeMethod
//    public void setUp() {
//
//        //      Kullanici url'e gider
//        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
////        Kullanici sig in butonuna tiklar
//        ReusableMethods.bekle(4);
//        vendorAddProductLocates = new VendorAddProductLocates();
//       vendorAddProductLocates.siginlogin1.click();
//
////        Kullanici gecerli email ve password girer
//        vendorAddProductLocates.email.sendKeys(ConfigReader.getProperty("username"));
//        vendorAddProductLocates.password.sendKeys(ConfigReader.getProperty("password"));
//        vendorAddProductLocates.sigin.click();
////        Kullanici my account yazisini gorur
//        ReusableMethods.bekle(4);
//        ReusableMethods.scrollEnd();
//        ReusableMethods.bekle(3);
//        Driver.getDriver();
//        vendorAddProductLocates.myAccount.click();
//        // Assert.assertTrue(vendorAddProductLocates.myAccountText.isDisplayed());
//
////        Kullanici store manager menusune tiklar
//        ReusableMethods.bekle(2);
//        actions = new Actions(Driver.getDriver());
//        actions.sendKeys(Keys.ARROW_DOWN).perform();
//        vendorAddProductLocates.storemanager.click();
////        Kullanici store manager sayfasina gider
//        Assert.assertTrue(vendorAddProductLocates.storeManagerText.isDisplayed());
////        Kullanici products menusune tiklar
//        ReusableMethods.bekle(3);
//        actions =new Actions(Driver.getDriver());
//        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).perform();
//        ReusableMethods.bekle(3);
//        ReusableMethods.click(vendorAddProductLocates.products);
//        // vendorAddProductLocates.products.click();
////        Kullanici products sayfasina gider
//        Assert.assertTrue(vendorAddProductLocates.productsText.isDisplayed());
////        Kullanici products sayfasinda add new butonuna tiklar
//        ReusableMethods.bekle(3);
//        actions.sendKeys(Keys.ARROW_DOWN).perform();
//        vendorAddProductLocates.addNew.click();
//
//
////        Kullanici Add Product sayfasina gider
//        ReusableMethods.bekle(3);
//        Assert.assertTrue(vendorAddProductLocates.addProductText.isDisplayed());
////        Kullanici Inventory, Shipping, Attributes, Linked, Seo, Toptan Ürün Gösterme Ayarları, Advanced menülerini görür
//        ReusableMethods.bekle(3);
//        actions = new Actions(Driver.getDriver());
//        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN);
//        Assert.assertTrue(vendorAddProductLocates.menu.isDisplayed());
//        // ReusableMethods.webElementResmi(vendorAddProductLocates.menu);
//
//    }
//
//    @Test
//    public void test02() {
////        Kullanici Inventory secenegine  tiklar
//        vendorAddProductLocates = new VendorAddProductLocates();
//        ReusableMethods.bekle(3);
//        actions = new Actions(Driver.getDriver());
//        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
//        ReusableMethods.bekle(3);
//        ReusableMethods.click(vendorAddProductLocates.inventory);
//
//
////        Kullanici  SKU alanına bir deger girer
//        ReusableMethods.bekle(2);
//        vendorAddProductLocates.sku.sendKeys("in stock");
//
////        Kullanici Manage Stock secegine tiklar
//        ReusableMethods.bekle(2);
//        vendorAddProductLocates.manageStock.click();
//
//
////      Kullanici Stock Qty alanina bir deger girer
//        ReusableMethods.bekle(2);
//        vendorAddProductLocates.stockqty.sendKeys("2");
//
////     Kullanici Stock status menusune tiklar
//        ReusableMethods.bekle(2);
//        select = new Select(vendorAddProductLocates.stockStatus);
//        List<WebElement> selectList = select.getOptions();
//        for (WebElement w:selectList) {
//            System.out.println(w.getText());
//
//        }
//
//
////     Kullanici Sold Individually secenegine tiklar
//        ReusableMethods.bekle(2);
//        vendorAddProductLocates.soldIndividually.click();
//
//    }
//
//    @Test
//    public void test03() {
////        Kullanici Shipping secenegine  tiklar
//        vendorAddProductLocates = new VendorAddProductLocates();
//        ReusableMethods.bekle(3);
//        actions = new Actions(Driver.getDriver());
//        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
//        ReusableMethods.bekle(2);
//        ReusableMethods.click(vendorAddProductLocates.shipping);
//
//
////        Kullanici Weight (kg) alanina bir deger girer
//        ReusableMethods.bekle(2);
//        vendorAddProductLocates.weight.sendKeys("15");
//
////        Kullanici Dimensions (cm) alanina  deger girer
//        ReusableMethods.bekle(2);
//        vendorAddProductLocates.lenghtDimensions.sendKeys("20",Keys.TAB,"10",Keys.TAB,"45");
////        Kullanici Shipping class secenegine tiklar
//        ReusableMethods.bekle(2);
//        vendorAddProductLocates.shippingClass.click();
////        Kullanici Processing Time secenegine tiklar
//        ReusableMethods.bekle(2);
//        ReusableMethods.ddmVisibleText(vendorAddProductLocates.processingTime,"1-3 business days");
//        Driver.closeDriver();
//    }
//
//    @Test
//    public void test04() {
////        Kullanici Attributes secenegine  tiklar
//        vendorAddProductLocates = new VendorAddProductLocates();
//        ReusableMethods.bekle(3);
//        actions = new Actions(Driver.getDriver());
//        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
//        ReusableMethods.bekle(2);
//        ReusableMethods.click(vendorAddProductLocates.attributes);
//
////        Kullanici color secenegine tiklar
//        ReusableMethods.bekle(3);
//        vendorAddProductLocates.color.click();
////        Kullanici size secenegine tiklar
//        ReusableMethods.bekle(2);
//        vendorAddProductLocates.size.click();
//    }
//
//    @Test
//    public void test05() {
////        Kullanici Linked secenegine  tiklar
//        vendorAddProductLocates = new VendorAddProductLocates();
//        ReusableMethods.bekle(3);
//        actions = new Actions(Driver.getDriver());
//        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
//        ReusableMethods.bekle(2);
//        ReusableMethods.click(vendorAddProductLocates.linked);
//
////        Kullanici Up-sells secenegine tiklar
//        ReusableMethods.bekle(2);
//        vendorAddProductLocates.upsell.click();
//
////        Kullanici Cross-sells secenegine tiklar
//        ReusableMethods.bekle(2);
//        vendorAddProductLocates.crosssels.click();
//    }
//
//    @Test
//    public void test06() {
////        Kullanici SEO secenegine  tiklar
//        vendorAddProductLocates = new VendorAddProductLocates();
//        ReusableMethods.bekle(3);
//        actions = new Actions(Driver.getDriver());
//        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
//        ReusableMethods.bekle(2);
//        ReusableMethods.click(vendorAddProductLocates.seo);
//
////        Kullanici Enter a focus keyword alanina  deger girer
//        ReusableMethods.bekle(2);
//        vendorAddProductLocates.enterfocuskeyword.sendKeys("dijital",Keys.TAB,"good product");
//        ReusableMethods.tumSayfaResmi();
//
//
////        Kullanici Meta description alanina deger girer
//        //KeysTAB ile yukarıda hallettim
//
//    }
//
//    @Test
//    public void test07() {
////        "Kullanici Toptan Ürün Gösterme Ayarları secenegine  tiklar"
//        vendorAddProductLocates = new VendorAddProductLocates();
//        ReusableMethods.bekle(3);
//        actions = new Actions(Driver.getDriver());
//        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
//        ReusableMethods.bekle(2);
//        ReusableMethods.click(vendorAddProductLocates.urunAyarlari);
//
//
//
////        Kullanici Piece Type secenegine  tiklar
//        // select = new Select()
//        Driver.getDriver();
//        ReusableMethods.bekle(2);
//        ReusableMethods.ddmValue(vendorAddProductLocates.pieceType,"Carton");
//        Select select =new Select(vendorAddProductLocates.select1);
//       select.selectByIndex(2);
//
//        // select.selectByVisibleText("Carton");
//        // vendorAddProductLocates.select1.click();
//
////        Kullanici Units Per Piece alanina deger girer
//        ReusableMethods.bekle(2);
//        vendorAddProductLocates.unitsPerPiece.sendKeys("24");
//
//
////        Kullanici Min Order Quantity? alanina deger girer
//        ReusableMethods.bekle(2);
//        vendorAddProductLocates.minOrderQuantity.sendKeys("12");
//
//    }
//
//    @Test
//    public void test08() {
////        Advanced secenegine  tiklar
//        vendorAddProductLocates = new VendorAddProductLocates();
//        ReusableMethods.bekle(3);
//        actions = new Actions(Driver.getDriver());
//        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
//        ReusableMethods.bekle(2);
//        ReusableMethods.click(vendorAddProductLocates.advanced);
//
////        Kullanici  Enable reviews secenegine  tiklar
//        ReusableMethods.bekle(2);
//        vendorAddProductLocates.enablereviews.click();
////        Kullanici Menu Order alanina deger girer
//        ReusableMethods.bekle(2);
//        vendorAddProductLocates.menuOrder.sendKeys("23",Keys.TAB,"56");
////        Kullanici Purchase Note alanina deger girer
//        //KeysTAB ile yazdırdım
//    }
//}
//
//
//
