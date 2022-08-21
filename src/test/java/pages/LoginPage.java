package pages;

import constants.Credentials;
import constants.Urls;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.CreateAccountTest;

public class LoginPage extends BasePage{

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "Login")
    private WebElement loginButton;

    private static final Logger LOGGER = LogManager.getLogger(CreateAccountTest.class.getName());

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginToSalesforce() {
        driver.get(Urls.SALES_FORCE_LOGIN);
        usernameInput.sendKeys(Credentials.USERNAME);
        LOGGER.info(String.format("Username %s is entered", Credentials.USERNAME));
        passwordInput.sendKeys(Credentials.PASSWORD);
        LOGGER.info(String.format("Password %s is entered", Credentials.PASSWORD));
        loginButton.click();
        LOGGER.info(String.format("Login button clicked"));
    }
}
