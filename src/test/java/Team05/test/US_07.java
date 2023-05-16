package Team05.test;

import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import org.testng.annotations.Test;

public class US_07 {
    /*
     1. Kullanici anasayfaya gider
     2. Kullanici listedeki herhangi bir urunu secer
     3. Kullanici sectigi urunu sepete ekler
     4. Adim 2 ve adim 3 islemleri 4 kez tekrarlanir
     5. Kullanici sepet sayfasina gider ve sectigi urunler kontrol eder
   */

    @Test
    public void homePage() {
        //Kullanici anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
    }

    @Test
    public void productSelect() {
        // Ürün seçme işlemi
        // WebElement product = driver.findElement(By.xpath("//div[@class='product-card'][1]"));
        // product.click();
    }
}
