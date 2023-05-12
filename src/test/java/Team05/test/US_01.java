package Team05.test;

import Team05.pages.CustomerRegisterLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import org.testng.annotations.Test;

public class US_01 {

        @Test
        public void TC_1 (){

            Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));

            CustomerRegisterLocates customerRegisterLocates =

        }



}
