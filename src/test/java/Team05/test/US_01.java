package Team05.test;


import Team05.pages.CustomerRegisterLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;



public class US_01 extends ReusableMethods {


    @Test
    public void TC_1 (){

        extentReport();
        extentTest=extentReports.createTest("US_1 (TC_1)","Test Raporu");
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
        extentTest.pass("US_1 (TC_1) sonlandı.");
        extentReports.flush();
    }

    @Test
    public void TC_2 (){

        extentReport();
        extentTest=extentReports.createTest("US_1 (TC_2)","Test Raporu");
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("Hubcomfy a gidildi.");
        CustomerRegisterLocates customerRegesterPage = new CustomerRegisterLocates();

        customerRegesterPage.Register_Button.click();
        extentTest.info("Register butonuna tıklandı.");
        bekle(3);

        customerRegesterPage.E_Mail_Input.sendKeys(fakerInput("email"));
        extentTest.info("mail adresi faker methodu ile yazıldı.");
        bekle(3);
        customerRegesterPage.Password_Input.sendKeys(fakerInput("password"));
        extentTest.info("password faker methodu ile yazıldı.");
        bekle(3);
        customerRegesterPage.Register_Policy_Check.click();
        extentTest.info("register policy işaretlendi.");
        bekle(3);
        customerRegesterPage.Singup_Button.click();
        extentTest.info("Sing Up butonuna tıklandı.");
        extentTest.info("Lütfen bu alanı doldurun uyarısı vermeli.");
        bekle(5);

        customerRegesterPage.User_Name_Input.sendKeys(fakerInput("username"));
        extentTest.info("kullanıcı adı faker methodu ile yazıldı.");
        customerRegesterPage.E_Mail_Input.clear();
        extentTest.info("mail adresi silindi.");
        bekle(3);
        customerRegesterPage.Singup_Button.click();
        extentTest.info("Sing Up butonuna tıklandı.");
        extentTest.info("Lütfen bu alanı doldurun uyarısı vermeli.");
        bekle(3);

        customerRegesterPage.E_Mail_Input.sendKeys(fakerInput("email"));
        extentTest.info("mail adresi faker methodu ile yazıldı.");
        customerRegesterPage.Password_Input.clear();
        extentTest.info("password silindi.");
        bekle(3);
        customerRegesterPage.Singup_Button.click();
        extentTest.info("Sing Up butonuna tıklandı.");
        extentTest.info("Lütfen bu alanı doldurun uyarısı vermeli.");
        bekle(3);


        customerRegesterPage.Password_Input.sendKeys(fakerInput("password"));
        extentTest.info("password faker methodu ile yazıldı.");
        customerRegesterPage.Register_Policy_Check.click();
        extentTest.info("register policy işareti kaldırıldı.");
        bekle(3);
        customerRegesterPage.Singup_Button.click();
        extentTest.info("Sing Up butonuna tıklandı.");
        extentTest.info("'İlerlemek istiyorsanız lütfen bu kutuyu işaretleyin.' uyarısı alınır.");

        bekle(5);
        Driver.closeDriver();

        extentTest.pass("US_1 (TC_2) sonlandı.");
        extentReports.flush();


    }

    @Test
    public void TC_3 (){

        extentReport();
        extentTest=extentReports.createTest("US_1 (TC_3)","Test Raporu");
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("Hubcomfy a gidildi");
        CustomerRegisterLocates customerRegesterPage = new CustomerRegisterLocates();

        customerRegesterPage.Register_Button.click();

        bekle(3);
        customerRegesterPage.User_Name_Input.sendKeys(fakerInput("username"));
        extentTest.info("kullanıcı adı faker methodu ile yazıldı.");
        bekle(3);
        customerRegesterPage.E_Mail_Input.sendKeys(fakerInput("email"));
        extentTest.info("mail adresi faker methodu ile yazıldı.");
        bekle(3);
        customerRegesterPage.Password_Input.sendKeys(fakerInput("password"));
        extentTest.info("password faker methodu ile yazıldı.");
        bekle(3);
        customerRegesterPage.Register_Policy_Check.click();
        extentTest.info("register policy işaretlendi.");
        bekle(3);
        customerRegesterPage.Singup_Button.click();
        extentTest.info("Sing Up butonuna tıklandı.");
        bekle(10);

        Driver.closeDriver();
        extentTest.pass("US_1 (TC_3) sonlandı.");
        extentReports.flush();

    }

    @Test
    public void TC_4() {

        extentReport();
        extentTest=extentReports.createTest("US_1 (TC_4)","Test Raporu");
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("Hubcomfy a gidildi");
        CustomerRegisterLocates customerRegesterPage = new CustomerRegisterLocates();

        customerRegesterPage.Register_Button.click();
        extentTest.info("Register butonuna tıklandı.");
        bekle(3);
        customerRegesterPage.User_Name_Input.sendKeys(fakerInput("username"));
        extentTest.info("kullanıcı adı faker methodu ile yazıldı.");
        bekle(3);
        customerRegesterPage.E_Mail_Input.sendKeys("asdwre");
        extentTest.info("mail adresi olarak 'asdwre' yazıldı.");

        bekle(3);
        customerRegesterPage.Password_Input.sendKeys(fakerInput("password"));
        extentTest.info("password faker methodu ile yazıldı.");
        bekle(3);
        customerRegesterPage.Register_Policy_Check.click();
        extentTest.info("register policy işaretlendi.");
        bekle(3);
        customerRegesterPage.Singup_Button.click();
        extentTest.info("Sing Up butonuna tıklandı.");
        extentTest.info("'Lütfen e-posta adresine bir  ' @ ' işareti ekleyin. ' xxxx '  adresinde '@' eksik. ' uyarısı alınır.");
        bekle(5);

        customerRegesterPage.E_Mail_Input.clear();
        extentTest.info("mail adresi silindi.");
        customerRegesterPage.E_Mail_Input.sendKeys("asdw@");
        extentTest.info("mail adresi olarak 'asdw@' yazıldı.");
        customerRegesterPage.Singup_Button.click();
        extentTest.info("Sing Up butonuna tıklandı.");
        extentTest.info("'Lütfen `@' işaretinden sonra gelen kısmı ekleyin. 'xxxxxx@`, tam bir adres değil.' uyarısı alınır.");
        bekle(5);


        customerRegesterPage.E_Mail_Input.clear();
        extentTest.info("mail adresi silindi.");
        customerRegesterPage.E_Mail_Input.sendKeys("asdw@re");
        extentTest.info("mail adresi olarak 'asdw@re' yazıldı.");
        customerRegesterPage.Singup_Button.click();
        extentTest.info("Sing Up butonuna tıklandı.");
        extentTest.info("'Lütfen geçerli bir e-posta adresi girin.' uyarısı alınır.");

        bekle(5);

        customerRegesterPage.E_Mail_Input.clear();
        extentTest.info("mail adresi silindi.");
        customerRegesterPage.E_Mail_Input.sendKeys("as dw@re");
        extentTest.info("mail adresi olarak 'as dw@re' yazıldı.");
        customerRegesterPage.Singup_Button.click();
        extentTest.info("Sing Up butonuna tıklandı.");
        extentTest.info("Başında '@' bulunan kısımda ' ' simgesi bulunmamalıdır. uyarısı alınır.");
        bekle(5);

        Driver.closeDriver();

        extentTest.pass("US_1 (TC_4) sonlandı.");
        extentReports.flush();
    }



    @Test
    public void TC_5() {

        extentReport();
        extentTest=extentReports.createTest("US_1 (TC_5)","Test Raporu");
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        extentTest.info("Hubcomfy a gidildi.");
        CustomerRegisterLocates customerRegesterPage = new CustomerRegisterLocates();

        customerRegesterPage.Register_Button.click();
        extentTest.info("Register butonuna tıklandı.");
        bekle(3);
        customerRegesterPage.User_Name_Input.sendKeys(fakerInput("username"));
        extentTest.info("kullanıcı adı faker methodu ile yazıldı.");
        bekle(3);
        customerRegesterPage.E_Mail_Input.sendKeys(fakerInput("email"));
        extentTest.info("e-mail faker methodu ile yazıldı.");
        bekle(3);
        customerRegesterPage.Password_Input.sendKeys(fakerInput("password"));
        extentTest.info("password faker methodu ile yazıldı.");
        bekle(3);
        customerRegesterPage.Register_Policy_Check.click();
        extentTest.info("register policy işaretlendi.");
        bekle(3);
        customerRegesterPage.Singup_Button.click();
        extentTest.info("Sing Up butonuna tıklandı.");
        bekle(5);

        Driver.closeDriver();

        extentTest.pass("US_1 (TC_5) sonlandı.");
        extentReports.flush();
    }
}
