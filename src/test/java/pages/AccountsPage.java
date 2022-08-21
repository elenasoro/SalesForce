package pages;

import constants.Urls;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.CreateAccountTest;

public class AccountsPage extends BasePage{

    @FindBy(xpath = "//ul[contains(@class, 'branding-actions')]//a[@title='New']")
    private WebElement newButton;

    private static final Logger LOGGER = LogManager.getLogger(CreateAccountTest.class.getName());

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    public AccountsPage openAccountsPage() {
        driver.get(Urls.SALES_FORCE_LOGIN.concat(Urls.ACCOUNTS_URL));
        LOGGER.info(String.format("Page %s opened", AccountsPage.class.getName()));
        return this;
    }

    public NewAccountModalPage openNewAccountModal() {
        newButton.click();
        return new NewAccountModalPage(driver);
    }

}
