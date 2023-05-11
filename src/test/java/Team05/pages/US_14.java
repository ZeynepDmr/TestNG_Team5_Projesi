package Team05.pages;

import Team05.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_14 {
    public US_14(){
        PageFactory.initElements(Driver.getDriver(),this);

           @FindBy(xpath = "//*[@id='username']")
                   public WebElement email;
    }
}
