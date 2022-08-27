package pages;

import constants.Urls;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsPage extends BasePage{

    @FindBy(xpath = "//ul[contains(@class, 'branding-actions')]//a[@title='New']")
    private WebElement newButton;

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open Account Page")
    public AccountsPage openAccountsPage() {
        driver.get(Urls.SALES_FORCE_LOGIN.concat(Urls.ACCOUNTS_URL));
        return this;
    }

    @Step("Open New Account form")
    public NewAccountModalPage openNewAccountModal() {
        newButton.click();
        return new NewAccountModalPage(driver);
    }

}
