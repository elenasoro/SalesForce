package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountViewPage extends BasePage{

    @FindBy(xpath = "//*[@id='brandBand_2']//lightning-formatted-text")
    private WebElement accountName;

    public AccountViewPage(WebDriver driver) {
        super(driver);
    }

    public String getAccountName() {
        return accountName.getText();
    }

}
