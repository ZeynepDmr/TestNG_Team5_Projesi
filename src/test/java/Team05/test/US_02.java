package Team05.test;

import Team05.pages.CustomerRegisterLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import org.testng.annotations.Test;

import static Team05.utilities.ReusableMethods.*;
import static Team05.utilities.ReusableMethods.tumSayfaResmi;

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
        customerRegesterPage.User_Name_Input.sendKeys(username);
        bekle(2);
        tumSayfaResmi();

        bekle(3);
        customerRegesterPage.E_Mail_Input.sendKeys(email);
        bekle(2);
        tumSayfaResmi();
        bekle(3);
        customerRegesterPage.Password_Input.sendKeys(password);
        bekle(2);
        tumSayfaResmi();
        customerRegesterPage.Register_Policy_Check.click();
        if (customerRegesterPage.Register_Policy_Check.isSelected()){
            System.out.println("tıklandı");
        }
        bekle(2);
        tumSayfaResmi();
        bekle(3);

        customerRegesterPage.Singup_Button.click();
        bekle(1);
        tumSayfaResmi();
        bekle(3);
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

          //  customerRegesterPage.Register_Button.click();
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



