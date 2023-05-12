package Team05.test;

import Team05.pages.CustomerRegisterLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import static Team05.utilities.ReusableMethods.fakerInput;

public class US_01 {

        @Test
        public void TC_1 (){

            Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
            CustomerRegisterLocates customerRegesterPage = new CustomerRegisterLocates();

            customerRegesterPage.Register_Button.click();
            customerRegesterPage.User_Name_Input.sendKeys(fakerInput("username"));
            customerRegesterPage.E_Mail_Input.sendKeys(fakerInput("email"));
            customerRegesterPage.Password_Input.sendKeys(fakerInput("password"));

        }



}
