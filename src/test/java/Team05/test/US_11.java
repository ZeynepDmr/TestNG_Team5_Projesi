package Team05.test;

import Team05.pages.VendorSignInLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import org.testng.annotations.BeforeMethod;

public class US_11 {
VendorSignInLocates vendorSignInLocates;
@BeforeMethod
    public void setUp(){
    //Kullanıcı anasayfayı açar.
    Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));

    //Kullanıcı Sign In butonuna tıklar


}
}







