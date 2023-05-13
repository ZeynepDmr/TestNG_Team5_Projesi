package Team05.test;

import Team05.pages.VendorAddressLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

public class US_12 {
    @Test
    public void testName1() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        VendorAddressLocates vendorAddressLocates = new VendorAddressLocates();
        vendorAddressLocates.signIn.click();
        vendorAddressLocates.userName.sendKeys("emily.dontay");
        vendorAddressLocates.passWord.sendKeys("ryfUYEtr3p3fEbw");
        vendorAddressLocates.singInButton.click();
        ReusableMethods.bekle(2);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(vendorAddressLocates.myAccount).click().build().perform();
        String pageTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(pageTitle.contains("My Account"));
        vendorAddressLocates.addresses.click();
        vendorAddressLocates.addBillingAddress.click();
        vendorAddressLocates.billingAddressFirstName.sendKeys("ali");
        vendorAddressLocates.billingAddressLastName.sendKeys("veli");
        Select select = new Select(vendorAddressLocates.billingAddressCountry);
        select.selectByValue("TR");
        vendorAddressLocates.billingAddressAddresLine.sendKeys(".");


        //vendorAddressLocates.myAccount.click();



    }
}
