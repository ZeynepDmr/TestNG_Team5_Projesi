package Team05.pages;
import Team05.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class WishListLocates {

    public WishListLocates() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //US_08
    @FindBy(xpath = "/html/body/div[2]/header/div/div/div/div/div/div[9]/div/div/a[1]")

    public WebElement sign_In_Buton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(xpath = "//*[@id=menu-item-3832]/a")
    public WebElement electronics;
    @FindBy(xpath = "//*[@id='main']/div/div/div/div[4]/ul/li[1]/div/figure/div/div/div/a")
    public WebElement addWishList;
    @FindBy(xpath = "//i[@class='w-icon-heart']")
    public WebElement goToWishList;
    @FindBy(xpath = "//*[@id=yith-wcwl-row-13230]/td[5]/div/a")
    public WebElement addToCard;
    @FindBy(xpath = "//a[@class='button wc-forward' and text()='View cart']")
    public WebElement goToCard;
    @FindBy(xpath = "//*[@id=main]/div/div/div/div/div/div[2]/div[2]/div/div/div/div/div/a")
    public WebElement goToPayment;
}







