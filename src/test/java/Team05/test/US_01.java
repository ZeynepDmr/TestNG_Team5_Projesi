package Team05.test;


import Team05.pages.CustomerRegisterLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


import static Team05.utilities.Driver.driver;
import static Team05.utilities.ReusableMethods.*;

public class US_01 {

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

        customerRegesterPage.Register_Button.click();
        bekle(3);

        customerRegesterPage.E_Mail_Input.sendKeys(fakerInput("email"));
        bekle(3);
        customerRegesterPage.Password_Input.sendKeys(fakerInput("password"));
        bekle(3);
        customerRegesterPage.Register_Policy_Check.click();
        bekle(3);
        customerRegesterPage.Singup_Button.click();
        bekle(5);

        customerRegesterPage.User_Name_Input.sendKeys(fakerInput("username"));

        customerRegesterPage.E_Mail_Input.clear();
        bekle(3);
        customerRegesterPage.Singup_Button.click();
        bekle(3);

        customerRegesterPage.E_Mail_Input.sendKeys(fakerInput("email"));

        customerRegesterPage.Password_Input.clear();
        bekle(3);
        customerRegesterPage.Singup_Button.click();
        bekle(3);


        customerRegesterPage.Password_Input.sendKeys(fakerInput("password"));
        customerRegesterPage.Register_Policy_Check.click();
        bekle(3);
        customerRegesterPage.Singup_Button.click();
        bekle(5);
        Driver.closeDriver();



    }

    @Test
    public void TC_3 (){

        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        CustomerRegisterLocates customerRegesterPage = new CustomerRegisterLocates();

        customerRegesterPage.Register_Button.click();
        bekle(3);
        customerRegesterPage.User_Name_Input.sendKeys(fakerInput("username"));
        bekle(3);
        customerRegesterPage.E_Mail_Input.sendKeys(fakerInput("email"));
        bekle(3);
        customerRegesterPage.Password_Input.sendKeys(fakerInput("password"));
        bekle(3);
        customerRegesterPage.Register_Policy_Check.click();
        bekle(3);
        customerRegesterPage.Singup_Button.click();
        bekle(10);

        Driver.closeDriver();

    }

    @Test
    public void TC_4() {
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        CustomerRegisterLocates customerRegesterPage = new CustomerRegisterLocates();

        customerRegesterPage.Register_Button.click();
        bekle(3);
        customerRegesterPage.User_Name_Input.sendKeys(fakerInput("username"));
        bekle(3);
        customerRegesterPage.E_Mail_Input.sendKeys("asdwre");
        bekle(3);
        customerRegesterPage.Password_Input.sendKeys(fakerInput("password"));
        bekle(3);
        customerRegesterPage.Register_Policy_Check.click();
        bekle(3);
        customerRegesterPage.Singup_Button.click();
        bekle(5);

        customerRegesterPage.E_Mail_Input.clear();
        customerRegesterPage.E_Mail_Input.sendKeys("asdw@");
        bekle(5);


        customerRegesterPage.E_Mail_Input.clear();
        customerRegesterPage.E_Mail_Input.sendKeys("asdw@re");
        customerRegesterPage.Singup_Button.click();
        bekle(6);

        customerRegesterPage.E_Mail_Input.clear();
        customerRegesterPage.E_Mail_Input.sendKeys("as dw@re");
        customerRegesterPage.Singup_Button.click();
        bekle(10);

        customerRegesterPage.E_Mail_Input.clear();
    }

    @Test
    public void TC_5() {
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        CustomerRegisterLocates customerRegesterPage = new CustomerRegisterLocates();

        customerRegesterPage.Register_Button.click();
        bekle(3);
        customerRegesterPage.User_Name_Input.sendKeys(fakerInput("username"));
        bekle(3);
        customerRegesterPage.E_Mail_Input.sendKeys(fakerInput("email"));
        bekle(3);
        customerRegesterPage.Password_Input.sendKeys(fakerInput("password"));
        bekle(3);
        customerRegesterPage.Register_Policy_Check.click();
        bekle(3);
        customerRegesterPage.Singup_Button.click();
        bekle(5);

        Driver.closeDriver();
    }
}
