package Team05.test;

import Team05.pages.CustomerRegisterLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Team05.utilities.ReusableMethods.*;

public class US_02 {

    @Test
    public void TC_1 (){

        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        CustomerRegisterLocates customerRegesterPage = new CustomerRegisterLocates();
        String username = fakerInput("username");
        String email = fakerInput("email");

        String password = fakerInput("password");


        customerRegesterPage.Register_Button.click();
        bekle(3);
        Assert.assertTrue(customerRegesterPage.E_Mail_Input.isEnabled());
        customerRegesterPage.User_Name_Input.sendKeys(username);
        bekle(3);
        Assert.assertTrue(customerRegesterPage.E_Mail_Input.isEnabled());
        customerRegesterPage.E_Mail_Input.sendKeys(email);
        bekle(3);
        Assert.assertTrue(customerRegesterPage.Password_Input.isEnabled());
        customerRegesterPage.Password_Input.sendKeys(password);
        bekle(3);
        Assert.assertTrue(customerRegesterPage.Register_Policy_Check.isEnabled());
        customerRegesterPage.Register_Policy_Check.click();
        bekle(3);
        Assert.assertTrue(customerRegesterPage.Singup_Button.isEnabled());
        customerRegesterPage.Singup_Button.click();
        bekle(3);
        Assert.assertTrue(customerRegesterPage.Profile.isEnabled());
        customerRegesterPage.Profile.click();
        bekle(3);

        customerRegesterPage.Sing_Out.click();
        bekle(3);
        Driver.closeDriver();

    }

    @Test
        public void TC_2 (){

            Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
            CustomerRegisterLocates customerRegesterPage = new CustomerRegisterLocates();

            customerRegesterPage.Register_Button.click();
            bekle(3);
            customerRegesterPage.User_Name_Input.sendKeys(ConfigReader.getProperty("Customer_Username"));
            bekle(3);
            customerRegesterPage.E_Mail_Input.sendKeys(ConfigReader.getProperty("Customer_Mail"));
            bekle(3);
            customerRegesterPage.Password_Input.sendKeys(ConfigReader.getProperty("Customer_Password"));
            bekle(3);
            customerRegesterPage.Register_Policy_Check.click();
            bekle(3);
            customerRegesterPage.Singup_Button.click();
            bekle(6);

            Driver.closeDriver();
        }


}



