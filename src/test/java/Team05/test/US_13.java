package Team05.test;

import Team05.pages.VendorAddressLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class US_13 {
    @Test
    public void testCase1() {
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        VendorAddressLocates vendorAddressLocates = new VendorAddressLocates();
        vendorAddressLocates.signIn.click();
        vendorAddressLocates.userName.sendKeys("emily.dontay");
        vendorAddressLocates.passWord.sendKeys("ryfUYEtr3p3fEbw");
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
        vendorAddressLocates.addShippingAddress.click();
        vendorAddressLocates.shippingAddressFirstName.sendKeys("Ali");
        vendorAddressLocates.shippingAddressLastName.sendKeys("Veli");
        Select select = new Select(vendorAddressLocates.shippingAddressCountry);
        select.selectByValue("TR");
        vendorAddressLocates.shippingAddressAddressLine.sendKeys("Istiklal Caddesi No:10");
        vendorAddressLocates.shippingAddressPostcode.sendKeys("55000");
        vendorAddressLocates.shippingAddressCity.sendKeys("Ilkadim");
        Select selectProvince = new Select(vendorAddressLocates.shippingAddressProvince);
        selectProvince.selectByVisibleText("Samsun");
        Driver.closeDriver();

    }

    @Test
    public void testCase2() {
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        VendorAddressLocates vendorAddressLocates = new VendorAddressLocates();
        vendorAddressLocates.signIn.click();
        vendorAddressLocates.userName.sendKeys("emily.dontay");
        vendorAddressLocates.passWord.sendKeys("ryfUYEtr3p3fEbw");
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
        vendorAddressLocates.addShippingAddress.click();
        vendorAddressLocates.shippingAddressFirstName.sendKeys("Ali");
        vendorAddressLocates.shippingAddressLastName.sendKeys("Veli");
        Select select = new Select(vendorAddressLocates.shippingAddressCountry);
        select.selectByValue("TR");
        vendorAddressLocates.shippingAddressAddressLine.sendKeys("Istiklal Caddesi No:10");
        vendorAddressLocates.shippingAddressPostcode.sendKeys("55000");
        vendorAddressLocates.shippingAddressCity.sendKeys("Ilkadim");
        Select selectProvince = new Select(vendorAddressLocates.shippingAddressProvince);
        selectProvince.selectByVisibleText("Samsun");
        actions.moveToElement(vendorAddressLocates.shippingAddressSaveAddress).click().build().perform();
        Driver.closeDriver();

    }
}
