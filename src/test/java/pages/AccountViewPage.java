package pages;

import constants.Urls;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountViewPage extends BasePage{

    @FindBy(xpath = "//*[@id='brandBand_2']//lightning-formatted-text")
    private WebElement accountName;

    public AccountViewPage(WebDriver driver) {
        super(driver);
    }

    @Step("Get account name after save")
    public String getAccountName() {
        return accountName.getText();
    }

}
