package Team05.test;

import Team05.pages.VendorAddressLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class US_12 {
    @Test
    public void testCase1() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        VendorAddressLocates vendorAddressLocates = new VendorAddressLocates();
        vendorAddressLocates.signIn.click();
        vendorAddressLocates.userName.sendKeys(ConfigReader.getProperty("Vendor_Username"));
        vendorAddressLocates.passWord.sendKeys(ConfigReader.getProperty("Vendor_Password"));
        vendorAddressLocates.singInButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement submitStatus = wait.until(ExpectedConditions.visibilityOf(vendorAddressLocates.loginSuccessful));
        String actualStatus = submitStatus.getText();
        String expectedStatus = "Wrong username or password.";
        Assert.assertFalse(actualStatus.contains(expectedStatus));
        ReusableMethods.bekle(2);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(vendorAddressLocates.myAccount).click().build().perform();
        String pageTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(pageTitle.contains("My Account"));
        vendorAddressLocates.addresses.click();
        vendorAddressLocates.addBillingAddress.click();
        vendorAddressLocates.clearField(vendorAddressLocates.billingAddressFirstName);
        vendorAddressLocates.billingAddressFirstName.sendKeys("ali");
        vendorAddressLocates.clearField(vendorAddressLocates.billingAddressLastName);
        vendorAddressLocates.billingAddressLastName.sendKeys("veli");
        Select select = new Select(vendorAddressLocates.billingAddressCountry);
        select.selectByValue("TR");
        vendorAddressLocates.clearField(vendorAddressLocates.billingAddressAddresLine);
        vendorAddressLocates.billingAddressAddresLine.sendKeys("Istiklal Caddesi No:10");
        vendorAddressLocates.clearField(vendorAddressLocates.billingAddressPostCode);
        vendorAddressLocates.billingAddressPostCode.sendKeys("55000");
        vendorAddressLocates.clearField(vendorAddressLocates.billingAddressCity);
        vendorAddressLocates.billingAddressCity.sendKeys("Ilkadim");
        Select selectProvince = new Select(vendorAddressLocates.billingAddressProvince);
        selectProvince.selectByVisibleText("Samsun");
        vendorAddressLocates.clearField(vendorAddressLocates.billingAddressPhone);
        vendorAddressLocates.billingAddressPhone.sendKeys("03621234567");
        ReusableMethods.tumSayfaResmi();
        Driver.closeDriver();
    }

    @Test
    public void testCase2() {
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        VendorAddressLocates vendorAddressLocates = new VendorAddressLocates();
        vendorAddressLocates.signIn.click();
        vendorAddressLocates.userName.sendKeys(ConfigReader.getProperty("Vendor_Username"));
        vendorAddressLocates.passWord.sendKeys(ConfigReader.getProperty("Vendor_Password"));
        vendorAddressLocates.singInButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement submitStatus = wait.until(ExpectedConditions.visibilityOf(vendorAddressLocates.loginSuccessful));
        String actualStatus = submitStatus.getText();
        String expectedStatus = "Wrong username or password.";
        Assert.assertFalse(actualStatus.contains(expectedStatus));
        ReusableMethods.bekle(2);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(vendorAddressLocates.myAccount).click().build().perform();
        String pageTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(pageTitle.contains("My Account"));
        vendorAddressLocates.addresses.click();
        vendorAddressLocates.addBillingAddress.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String emailAddress = js.executeScript("return document.getElementById('billing_email').value").toString();
        Assert.assertTrue(emailAddress.contains(ConfigReader.getProperty("Vendor_Username")));
        ReusableMethods.tumSayfaResmi();
        //Driver.closeDriver();

    }

    @Test
    public void testCase3() {
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        VendorAddressLocates vendorAddressLocates = new VendorAddressLocates();
        vendorAddressLocates.signIn.click();
        vendorAddressLocates.userName.sendKeys(ConfigReader.getProperty("Vendor_Username"));
        vendorAddressLocates.passWord.sendKeys(ConfigReader.getProperty("Vendor_Password"));
        vendorAddressLocates.singInButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement submitStatus = wait.until(ExpectedConditions.visibilityOf(vendorAddressLocates.loginSuccessful));
        String actualStatus = submitStatus.getText();
        String expectedStatus = "Wrong username or password.";
        Assert.assertFalse(actualStatus.contains(expectedStatus));
        ReusableMethods.bekle(2);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(vendorAddressLocates.myAccount).click().build().perform();
        String pageTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(pageTitle.contains("My Account"));
        vendorAddressLocates.addresses.click();
        vendorAddressLocates.addBillingAddress.click();
        vendorAddressLocates.clearField(vendorAddressLocates.billingAddressFirstName);
        vendorAddressLocates.billingAddressFirstName.sendKeys("ali");
        vendorAddressLocates.clearField(vendorAddressLocates.billingAddressLastName);
        vendorAddressLocates.billingAddressLastName.sendKeys("veli");
        Select select = new Select(vendorAddressLocates.billingAddressCountry);
        select.selectByValue("TR");
        vendorAddressLocates.clearField(vendorAddressLocates.billingAddressAddresLine);
        vendorAddressLocates.billingAddressAddresLine.sendKeys("Istiklal Caddesi No:10");
        vendorAddressLocates.clearField(vendorAddressLocates.billingAddressPostCode);
        vendorAddressLocates.billingAddressPostCode.sendKeys("55000");
        vendorAddressLocates.clearField(vendorAddressLocates.billingAddressCity);
        vendorAddressLocates.billingAddressCity.sendKeys("Ilkadim");
        Select selectProvince = new Select(vendorAddressLocates.billingAddressProvince);
        selectProvince.selectByVisibleText("Samsun");
        vendorAddressLocates.clearField(vendorAddressLocates.billingAddressPhone);
        vendorAddressLocates.billingAddressPhone.sendKeys("03621234567" + Keys.PAGE_DOWN);
        ReusableMethods.bekle(2);
        actions.moveToElement(vendorAddressLocates.billingAddressSaveAddress).click().build().perform();
        WebElement alertStatus = wait.until(ExpectedConditions.visibilityOf(vendorAddressLocates.addressSaveAlert));
        String actualAlert = alertStatus.getText();
        String expectedAlert = "Address changed successfully.";
        Assert.assertTrue(actualAlert.contains(expectedAlert));
        ReusableMethods.tumSayfaResmi();
        Driver.closeDriver();
    }

}
