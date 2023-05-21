package Team05.test;

import Team05.pages.VendorAddressLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class US_13 {

    public static ExtentReports extentReports;

    @BeforeTest
    public static void setUpExtentReport() {
        ReusableMethods.extentReport();
        extentReports = ReusableMethods.getExtentReports();
    }

    @Test
    public void testCase1() {
        ExtentTest test = null;
        try {
            test = extentReports.createTest("Test Case 1");
            Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
            test.pass(ConfigReader.getProperty("Hubcomfy_Url") + " adresine gidildi");
            VendorAddressLocates vendorAddressLocates = new VendorAddressLocates();
            vendorAddressLocates.signIn.click();
            test.pass("SignIn linkine tiklandi");
            vendorAddressLocates.userName.sendKeys(ConfigReader.getProperty("Vendor_Username"));
            vendorAddressLocates.passWord.sendKeys(ConfigReader.getProperty("Vendor_Password"));
            vendorAddressLocates.singInButton.click();
            test.pass("Kullanici adi ve sifresi girilip signin butonuna tiklandi");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            WebElement submitStatus = wait.until(ExpectedConditions.visibilityOf(vendorAddressLocates.loginSuccessful));
            String actualStatus = submitStatus.getText();
            String expectedStatus = "Wrong username or password.";
            Assert.assertFalse(actualStatus.contains(expectedStatus));
            test.pass("Giris basarili");
            ReusableMethods.bekle(2);
            ReusableMethods.scrollEnd();
            ReusableMethods.bekle(2);
            Actions actions = new Actions(Driver.getDriver());
            actions.moveToElement(vendorAddressLocates.myAccount).click().build().perform();
            test.pass("My Account linkine tiklandi");
            String pageTitle = Driver.getDriver().getTitle();
            Assert.assertTrue(pageTitle.contains("My Account"));
            test.pass("My Account sayfasi goruntulendi");
            vendorAddressLocates.addresses.click();
            test.pass("Addresses butonuna tikladi");
            vendorAddressLocates.addShippingAddress.click();
            test.pass("Shipping Addresses ADD/EDIT butonuna tiklandi");
            vendorAddressLocates.clearField(vendorAddressLocates.shippingAddressFirstName);
            vendorAddressLocates.shippingAddressFirstName.sendKeys("Ali");
            test.pass("First name bilgisi girildi");
            vendorAddressLocates.clearField(vendorAddressLocates.shippingAddressLastName);
            vendorAddressLocates.shippingAddressLastName.sendKeys("Veli");
            test.pass("Last name bilgisi girildi");
            Select select = new Select(vendorAddressLocates.shippingAddressCountry);
            select.selectByValue("TR");
            test.pass("Country bilgisi girildi");
            vendorAddressLocates.clearField(vendorAddressLocates.shippingAddressAddressLine);
            vendorAddressLocates.shippingAddressAddressLine.sendKeys("Istiklal Caddesi No:10");
            test.pass("Street address bilgisi girildi");
            vendorAddressLocates.clearField(vendorAddressLocates.shippingAddressPostcode);
            vendorAddressLocates.shippingAddressPostcode.sendKeys("55000");
            test.pass("ZIP Code bilgisi girildi");
            vendorAddressLocates.clearField(vendorAddressLocates.shippingAddressCity);
            vendorAddressLocates.shippingAddressCity.sendKeys("Ilkadim");
            test.pass("Town/City bilgisi girildi");
            Select selectProvince = new Select(vendorAddressLocates.shippingAddressProvince);
            selectProvince.selectByVisibleText("Samsun");
            test.pass("Province bilgisi girildi");
            ReusableMethods.tumSayfaResmi();
            test.pass("Test Basarili!");
            Driver.closeDriver();
            extentReports.flush();
        } catch (Exception e) {
            if (test != null) {
                test.fail("Hata oluştu: " + e.getMessage());
            }
            extentReports.flush();
        }

    }

    @Test
    public void testCase2() {
        ExtentTest test = null;
        try {
            test = extentReports.createTest("Test Case 2");
            Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
            test.pass(ConfigReader.getProperty("Hubcomfy_Url") + " adresine gidildi");
            VendorAddressLocates vendorAddressLocates = new VendorAddressLocates();
            vendorAddressLocates.signIn.click();
            test.pass("SignIn linkine tiklandi");
            vendorAddressLocates.userName.sendKeys(ConfigReader.getProperty("Vendor_Username"));
            vendorAddressLocates.passWord.sendKeys(ConfigReader.getProperty("Vendor_Password"));
            vendorAddressLocates.singInButton.click();
            test.pass("Kullanici adi ve sifresi girilip signin butonuna tiklandi");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            WebElement submitStatus = wait.until(ExpectedConditions.visibilityOf(vendorAddressLocates.loginSuccessful));
            String actualStatus = submitStatus.getText();
            String expectedStatus = "Wrong username or password.";
            Assert.assertFalse(actualStatus.contains(expectedStatus));
            test.pass("Giris basarili");
            ReusableMethods.bekle(2);
            ReusableMethods.scrollEnd();
            ReusableMethods.bekle(2);
            Actions actions = new Actions(Driver.getDriver());
            actions.moveToElement(vendorAddressLocates.myAccount).click().build().perform();
            test.pass("My Account linkine tiklandi");
            String pageTitle = Driver.getDriver().getTitle();
            Assert.assertTrue(pageTitle.contains("My Account"));
            test.pass("My Account sayfasi goruntulendi");
            vendorAddressLocates.addresses.click();
            test.pass("Addresses butonuna tikladi");
            vendorAddressLocates.addShippingAddress.click();
            test.pass("Shipping Addresses ADD/EDIT butonuna tiklandi");
            vendorAddressLocates.clearField(vendorAddressLocates.shippingAddressFirstName);
            vendorAddressLocates.shippingAddressFirstName.sendKeys("Ali");
            test.pass("First name bilgisi girildi");
            vendorAddressLocates.clearField(vendorAddressLocates.shippingAddressLastName);
            vendorAddressLocates.shippingAddressLastName.sendKeys("Veli");
            test.pass("Last name bilgisi girildi");
            Select select = new Select(vendorAddressLocates.shippingAddressCountry);
            select.selectByValue("TR");
            test.pass("Country bilgisi girildi");
            vendorAddressLocates.clearField(vendorAddressLocates.shippingAddressAddressLine);
            vendorAddressLocates.shippingAddressAddressLine.sendKeys("Istiklal Caddesi No:10");
            test.pass("Street address bilgisi girildi");
            vendorAddressLocates.clearField(vendorAddressLocates.shippingAddressPostcode);
            vendorAddressLocates.shippingAddressPostcode.sendKeys("55000");
            test.pass("ZIP Code bilgisi girildi");
            vendorAddressLocates.clearField(vendorAddressLocates.shippingAddressCity);
            vendorAddressLocates.shippingAddressCity.sendKeys("Ilkadim");
            test.pass("Town/City bilgisi girildi");
            Select selectProvince = new Select(vendorAddressLocates.shippingAddressProvince);
            selectProvince.selectByVisibleText("Samsun");
            test.pass("Province bilgisi girildi");
            actions.moveToElement(vendorAddressLocates.shippingAddressSaveAddress).click().build().perform();
            test.pass("Save butonuna tiklandi");
            WebElement alertStatus = wait.until(ExpectedConditions.visibilityOf(vendorAddressLocates.addressSaveAlert));
            String actualAlert = alertStatus.getText();
            String expectedAlert = "Address changed successfully.";
            Assert.assertTrue(actualAlert.contains(expectedAlert));
            test.pass("Kayit basarili");
            ReusableMethods.tumSayfaResmi();
            test.pass("Test Basarili!");
            Driver.closeDriver();
            extentReports.flush();
        } catch (Exception e) {
            if (test != null) {
                test.fail("Hata oluştu: " + e.getMessage());
            }
            extentReports.flush();
        }
    }
}


    }
}

