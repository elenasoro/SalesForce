package pages;

import constants.Credentials;
import constants.Urls;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "Login")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Login to Sales Force")
    public void loginToSalesforce() {
        driver.get(Urls.SALES_FORCE_LOGIN);
        usernameInput.sendKeys(Credentials.USERNAME);
        passwordInput.sendKeys(Credentials.PASSWORD);
        loginButton.click();
    }
}
