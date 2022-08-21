package tests;

import models.NewAccountModel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountViewPage;
import pages.AccountsPage;
import pages.LoginPage;
import testdata.PrepareNewAccountData;

public class CreateAccountTest extends BaseTest{

    private static final Logger LOGGER = LogManager.getLogger(CreateAccountTest.class.getName());

    @Test
    public void createAccountTest() {
        LoginPage loginPage = new LoginPage(driver);
        LOGGER.info(String.format("Page %s initiated", LoginPage.class.getName()));
        loginPage.loginToSalesforce();
        AccountsPage accountsPage = new AccountsPage(driver);
        LOGGER.info(String.format("Page %s initiated", AccountsPage.class.getName()));
        NewAccountModel accountModel = PrepareNewAccountData.getValidData();
        accountsPage
                .openAccountsPage()
                .openNewAccountModal()
                .fillInAccountForm(accountModel);

        String initialAccountName = accountModel.getAccountName();
        LOGGER.debug(String.format("Account Name %s is saved", accountModel.getAccountName()));
        AccountViewPage accountViewPage = new AccountViewPage(driver);
        LOGGER.info(String.format("Page %s initiated", AccountViewPage.class.getName()));
        String resultAccountName = accountViewPage.getAccountName();
        LOGGER.debug(String.format("Result name %s is saved", accountViewPage.getAccountName()));
        Assert.assertEquals(initialAccountName, resultAccountName, "New account has incorrect name");
    }
}
