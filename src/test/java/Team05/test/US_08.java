package Team05.test;

import Team05.pages.WishListLocates;
import Team05.utilities.ConfigReader;
import Team05.utilities.Driver;
import Team05.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class US_08 extends ReusableMethods {
    @Test
    public void wishList() {
        //Kullanici anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("Hubcomfy_Url"));
        WishListLocates wishListLocates = new WishListLocates();

        //Kullanici siteye giris yapar
        wishListLocates.signInButon.click();
        bekle(2);

        wishListLocates.userName.sendKeys(ConfigReader.getProperty("Customer_Username"), Keys.TAB);
        wishListLocates.password.sendKeys(ConfigReader.getProperty("Customer_Password"), Keys.ENTER);
        bekle(3);

        //Kulanici "elektronics" kategorisine tiklar
        wishListLocates.electronics.click();
        bekle(2);

        //Kullanici urunu secer
        wishListLocates.productClick.click();
        bekle(2);

        //Kullanici begendigi urunu "Wish Listesi" ne ekler
        wishListLocates.addWishList.click();
        bekle(3);

        //Kullanici "Wish List" sekmesine gider
        wishListLocates.goToWishList.click();
        bekle(3);

        //Kullanici "Wish List" e ekledigi urunu "Sepete Ek" ler
        wishListLocates.addToCard.click();
        bekle(2);

        //Kullanici "Sepete" gider
        wishListLocates.goToCard.click();
        bekle(2);

        //Kullanici odeme sayfasina gider
        wishListLocates.goToPayment.click();
        bekle(2);
    }
}
