package Team05.pages;

import Team05.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorAddProductLocates {
    //US_14_18
    public VendorAddProductLocates() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    //AddNew locator(zeynep)
    @FindBy(xpath = "(//*[text()='Add New'])[1]")
    public WebElement addNew;

    //Virtual tıklama(zeynep)
    @FindBy(xpath = "//*[@id='is_virtual']")
    public WebElement virtual;

    //is_downloadable tıklama(zeynep)
    @FindBy(xpath = "//*[@id='is_downloadable']")
    public WebElement is_downloadable;

    //price kutucugu (zeynep)
    @FindBy(xpath = "//*[@id='regular_price']")
    public WebElement price;

    //sale price kutucugu(zeynep)
    @FindBy(xpath = "//*[@id='sale_price']")
    public WebElement salePrice;

    //variableProduct secimi(zeynep)
    @FindBy(xpath = "//*[@id='product_type']")
    public WebElement variableProduct;

    //color secimi(zeynep)
    @FindBy(xpath = "//*[@id='is_virtual']")
    public WebElement color;

    //size secimi(zeynep)
    @FindBy(xpath = "//*[@id='attributes_is_active_2']")
    public WebElement size;

    // Variations'a tıkla(zeynep)
    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[6]")
    public WebElement variations;

    // Any Color tıkla(zeynep)
    @FindBy(xpath = "//*[@data-name='default_attribute_pa_color']")
    public WebElement anyColor;

    // Any size tıkla(zeynep)
    @FindBy(xpath = "//*[@data-name='default_attribute_pa_size']")
    public WebElement anySize;



























































































































































































//Buraya kadar Tuba







































































































































































































//buraya kadar zeynep