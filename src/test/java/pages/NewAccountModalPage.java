package pages;

import constants.Credentials;
import elements.DropdownList;
import elements.TextArea;
import elements.TextInput;
import models.NewAccountModel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class NewAccountModalPage extends BasePage{

    @FindBy(xpath = "//div[contains(@class, 'modal-body')]//span[text()='Account Name']//parent::label//following-sibling::div//input")
    private WebElement accountNameInput;

    @FindBy(xpath = "//div[contains(@class, 'modal-body')]//button[@title='Save']")
    private WebElement saveButton;

    private static final Logger LOGGER = LogManager.getLogger(NewAccountModalPage.class.getName());

    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    public void fillInAccountForm(NewAccountModel newAccount) {
        accountNameInput.sendKeys(newAccount.getAccountName());
        new TextInput(driver, "Phone").inputText(newAccount.getPhone());
        new DropdownList(driver, "Type").selectOptionInList(newAccount.getType());
        new TextArea(driver, "Description").inputText(newAccount.getDescription());
        new TextInput(driver, "Website").inputText(newAccount.getWebsite());
        new DropdownList(driver, "Industry").selectOptionInList(newAccount.getIndustry());
        new TextInput(driver, "Employees").inputText(newAccount.getEmployees());
        new TextArea(driver, "Billing Street").inputText(newAccount.getBillingStreet());
        new TextInput(driver, "Billing City").inputText(newAccount.getBillingCity());
        new TextInput(driver, "Billing State/Province").inputText(newAccount.getBillingState());
        new TextInput(driver, "Billing Zip/Postal Code").inputText(newAccount.getBillingZip());
        new TextInput(driver, "Billing Country").inputText(newAccount.getBillingCountry());
        new TextArea(driver, "Shipping Street").inputText(newAccount.getBillingStreet());
        new TextInput(driver, "Shipping City").inputText(newAccount.getBillingCity());
        new TextInput(driver, "Shipping State/Province").inputText(newAccount.getBillingState());
        new TextInput(driver, "Shipping Zip/Postal Code").inputText(newAccount.getBillingZip());
        new TextInput(driver, "Shipping Country").inputText(newAccount.getBillingCountry());
        LOGGER.info("Create account with the following details: " + newAccount.toString());
        saveButton.click();
    }

    public String getAccountName() {
        return accountNameInput.getText();
    }

}
