package Team05.test;

import Team05.pages.CustomerRegisterLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Team05.utilities.ReusableMethods.*;

public class US_02  extends ReusableMethods {

    @Test
    public void TC_1 (){
        extentReport();
        extentTest=extentReports.createTest("US_2 (TC_1)","Test Raporu");
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("Hubcomfy a gidildi.");
        CustomerRegisterLocates customerRegesterPage = new CustomerRegisterLocates();
        String username = fakerInput("username");
        String email = fakerInput("email");
        String password = fakerInput("password");



        customerRegesterPage.Register_Button.click();
        extentTest.info("Register butonuna tıklanır olduğu görüldü.");
        bekle(3);

        Assert.assertTrue(customerRegesterPage.User_Name_Input.isEnabled());
        customerRegesterPage.User_Name_Input.sendKeys(username);
        extentTest.info("kullanıcı adı alanının yazılabilir olduğu görüldü.");
        bekle(3);

        extentTest.info("mail adresi alanının yazılabilir olduğu görüldü.");
        Assert.assertTrue(customerRegesterPage.E_Mail_Input.isEnabled());
        customerRegesterPage.E_Mail_Input.sendKeys(email);
        extentTest.info("e-mail alanının yazılabilir olduğu görüldü.");
        bekle(3);
        Assert.assertTrue(customerRegesterPage.Password_Input.isEnabled());
        customerRegesterPage.Password_Input.sendKeys(password);
        extentTest.info("password alanının yazılabilir olduğu görüldü.");
        bekle(3);
        Assert.assertTrue(customerRegesterPage.Register_Policy_Check.isEnabled());
        customerRegesterPage.Register_Policy_Check.click();
        extentTest.info("register alanının tıklanır olduğu görüldü.");
        bekle(5);
        customerRegesterPage.Singup_Button.click();
        extentTest.info("Sing Up butonunun tıklanır olduğu görüldü.");
        bekle(3);
        Driver.closeDriver();
        extentTest.pass("US_2 (TC_1) sonlandı.");
        extentReports.flush();
    }

    @Test
        public void TC_2 (){
        extentReport();
            extentTest=extentReports.createTest("US_2 (TC_2)","Test Raporu");
            Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
            extentTest.info("Hubcomfy a gidildi.");
            CustomerRegisterLocates customerRegesterPage = new CustomerRegisterLocates();


            customerRegesterPage.Register_Button.click();
            extentTest.info("Register butonuna tıklandı.");

            bekle(3);
            customerRegesterPage.User_Name_Input.sendKeys(ConfigReader.getProperty("Customer_Username"));
            extentTest.info("kullanıcı adı properties ile  yazıldı.");
            bekle(3);
            customerRegesterPage.E_Mail_Input.sendKeys(ConfigReader.getProperty("Customer_Mail"));
             extentTest.info("e-mail properties ile yazıldı.");
            bekle(3);
            customerRegesterPage.Password_Input.sendKeys(ConfigReader.getProperty("Customer_Password"));
            extentTest.info("password properties ile yazıldı.");
            bekle(3);
            customerRegesterPage.Register_Policy_Check.click();
            extentTest.info("register policy işaretlendi.");
            bekle(3);
            customerRegesterPage.Singup_Button.click();
            extentTest.info("Sing Up butonuna tıklandı.");
            bekle(6);

            Driver.closeDriver();
            extentTest.pass("US_2 (TC_2) sonlandı.");
            extentReports.flush();
        }


}



