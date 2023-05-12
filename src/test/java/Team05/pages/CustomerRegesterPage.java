package Team05.pages;

import Team05.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerRegesterPage {
    public CustomerRegesterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement register;
    @FindBy(xpath = "//input[@id='reg_username']")
    public WebElement username;
    @FindBy(xpath = "//*[@id='register-policy']")
    public WebElement registerPolicy;
    @FindBy(xpath = "//*[@id='signup']/form/button")
    public WebElement signupButton;

    Faker faker = new Faker();
    String fakeUsername = faker.name().username();
    String fakeEmail = faker.internet().emailAddress();
    String fakePassword = faker.internet().password();


}
