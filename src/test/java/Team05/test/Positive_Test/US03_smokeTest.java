package Team05.test.Positive_Test;

import Team05.pages.BillingUsLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US03_smokeTest {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        BillingUsLocates billingUs = new BillingUsLocates();
        billingUs.signInButonu.click();
        billingUs.userName.sendKeys(ConfigReader.getProperty("Customer_Username1"), Keys.ENTER);
        ReusableMethods.bekle(2);
        billingUs.password.sendKeys(ConfigReader.getProperty("Customer_Password1"), Keys.ENTER);
        ReusableMethods.bekle(2);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
        Driver.getDriver();
        ReusableMethods.bekle(2);
        billingUs.myAccount.click();


        String billingBilgisi= billingUs.billingscontains.getText();
        Assert.assertTrue(billingBilgisi.contains("Hoofddorp"));
    }
}
