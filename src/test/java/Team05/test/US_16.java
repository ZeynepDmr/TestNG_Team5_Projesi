package Team05.test;

import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import org.testng.annotations.Test;

public class US_16 {

           /*
Kullanici url'e gider
Kullanici sig in butonuna tiklar
Kullanici gecerli email ve password girer
Kullanici my account yazisini goruntuler
Kullanici store manager menusune tiklar
Kullanici store manager sayfasina gider
Kullanici products menusune tiklar
Simple Product default olarak gelmeli
Virtual ve Downloadable seçilebilmeli
Price ve Sale Price yazılabilmeli
US14 ve US15 deki işlemler yapılabilmeli
Ürünün eklendiğini Product kısmında görebilmeli

            */

    @Test
    public void test1() {

        //  Kullanici "https://hubcomfy.com" adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));

    }
}

