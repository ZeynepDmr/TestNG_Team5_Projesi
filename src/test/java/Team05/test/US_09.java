package Team05.test;

import Team05.pages.VendorRegisterLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import org.testng.annotations.Test;

import static Team05.utilities.ReusableMethods.bekle;

public class US_09 {
    @Test
    public void testName() {
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        VendorRegisterLocates vendorRegisterLocates = new VendorRegisterLocates();
        vendorRegisterLocates.VendorRegister.click();
        bekle(3);
        vendorRegisterLocates.BecomeVRegister.click();
        bekle(3);

        Driver.getDriver().get(ConfigReader.getProperty("Fake_Url"));
        bekle(5);
        vendorRegisterLocates.Copy.click();
        vendorRegisterLocates.VendorEmail.click();



    }


        //madde bir git add .
        //git commit -m""
        // git branch: hangi branchte oldugumu gösterir ayrıca branch listemi de gösterir
        //git branch (branch ismi): olusturmak istedigim branchtir
        //git checkout (branch ismi): hangi branche geçmek istersem bunu kullanırız
        //git merge branch ismi: branchimi merge yapmak (birlestirmek) istedigimde kullanırım.
        // master ve maindeyken merge yapmamak gerekli

        //branchte yapılan değişikler için her zaman git add it commit -m yapmak gerek
        //branchte yapılan değişiklikler main'e geçtikten sonra MERGE edilir

        //"değisiklik yaptıktan sonra değişikliği birleştirmek için "git merge "main""














}
